#include "argc/types.h"
#include "argc/functions.h"
namespace argennon::ascee::argc {

static const long_id balance_chunk = 0;
static const int32 size_of_balance = 8;





bool create_normal_account(long_id address, publickey_c& pk, signature_c& proof) {
    if (!argc::validate_pk(pk, proof)) return false;
    argc::load_account_chunk(address, 0);
    if (!argc::invalid(0, 2)) return false;
    argc::resize_chunk(2 + sizeof(pk));
    argc::store_int16(0, 8);
    argc::store_pk(0, 2, pk);
    return true;
}

void transfer(long_id from, long_id to, int64 amount, signature_c& sig) {
    
    if (amount < 0) argc::revert("negative amount");

    int32 sender_balance_offset = -1;

    message_c msg = {};
    argc::append_str(msg, "{\"to\":");
    argc::append_long_id(msg, to);
    argc::append_str(msg, ",\"amount\":");
    argc::append_int64(msg, amount);
    
    if (!argc::verify_by_acc_once(from, msg, sig, sender_balance_offset)) argc::revert("invalid address or signature");

    
    argc::load_account_chunk(from, 0);
    
    if (argc::invalid(sender_balance_offset, size_of_balance)) argc::revert("zero balance");
    int64 balance = argc::load_int64(sender_balance_offset);
    if (balance < amount) argc::revert("not enough balance");
    balance -= amount;
    argc::store_int64(sender_balance_offset, balance);
    if (balance == 0) argc::resize_chunk(sender_balance_offset);

    message_c empty = {};
    int32 recipient_offset = -1;
    if (!argc::verify_by_acc_once(to, empty, sig, recipient_offset)) argc::revert("invalid recipient account");

    
    argc::load_account_chunk(to, 0);
    if (argc::invalid(recipient_offset, size_of_balance)) argc::resize_chunk(recipient_offset + size_of_balance);
    argc::add_int64_to(recipient_offset, amount);
}

dispatcher {
    int32 position = 0;
    string_view_c method = argc::p_scan_str(request, "", " ", position);
    if (method == "PATCH") {
        long_id account = argc::p_scan_long_id(request, "/balances/", "/", position);
        long_id to = argc::p_scan_long_id(request, "{\"to\":", ",", position);
        int64 amount = argc::p_scan_int64(request, "\"amount\":", ",", position);
        signature_c sig = argc::p_scan_sig(request, "\"sig\":", "\"", position);
        argc::transfer(account, to, amount, sig);
        argc::append_str(response, "success and a good response!");
        return HTTP_OK;
    } else if (method == "PUT") {
        long_id address = argc::p_scan_long_id(request, "/balances/", "/", position);
        publickey_c pk = argc::p_scan_pk(request, "{\"pk\":", "\"", position);
        signature_c proof = argc::p_scan_sig(request, "\"sig\":", "\"", position);
        if (argc::create_normal_account(address, pk, proof)) {
            return HTTP_OK;
        } else {
            return 300;
        }
    }
    return HTTP_OK;
}

}
