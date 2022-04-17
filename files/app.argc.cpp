#include "argc/types.h"
#include "argc/functions.h"
namespace argennon::ascee::argc {




bool create_normal_account(long_id argc_0_address, publickey_c& argc_0_pk, signature_c& argc_0_proof) {
    if (!argc::validate_pk(argc_0_pk, argc_0_proof)) return false;
    argc::load_account_chunk(argc_0_address, 0);
    if (!argc::invalid(0, 2)) return false;
    argc::resize_chunk(2 + sizeof(argc_0_pk));
    argc::store_int16(0, 8);
    argc::store_pk(0, 2, argc_0_pk);
    return true;
}

struct Point {
    int32 argc_0_x = 0;
    int32 argc_0_y = 0;
};


void syntaxTest() {
    struct Point argc_0_p = {2, 5};
    int64 argc_0_x = argc_0_p.argc_0_x;
    array_c<array_c<array_c<int64,50>,5>,10> argc_0_multi_array = {};
    int32 argc_0_z = argc_0_x;
    
}

void transfer(long_id argc_0_from, long_id argc_0_to, int64 argc_0_amount, int16 argc_0_sig_index) {
    
    if (argc_0_amount < 0) argc::revert(string_view_c("negative amount"));

    int32 argc_0_sender_balance_offset = -1;

    message_c argc_0_msg = {};
    argc::append_str(argc_0_msg, string_view_c("{\"to\":"));
    argc::append_long_id(argc_0_msg, argc_0_to);
    argc::append_str(argc_0_msg, string_view_c(",\"amount\":"));
    argc::append_int64(argc_0_msg, argc_0_amount);
    
    if (!argc::verify_by_acc_once(argc_0_from, argc_0_msg, argc_0_sig_index, argc_0_sender_balance_offset)) argc::revert(string_view_c("invalid address or signature"));

    
    argc::load_account_chunk(argc_0_from, 0);
    
    if (argc::invalid(argc_0_sender_balance_offset, 8)) argc::revert(string_view_c("zero balance"));
    int64 argc_0_balance = argc::load_int64(argc_0_sender_balance_offset);
    if (argc_0_balance < argc_0_amount) argc::revert(string_view_c("not enough balance"));
    argc_0_balance -= argc_0_amount;
    argc::store_int64(argc_0_sender_balance_offset, argc_0_balance);
    if (argc_0_balance == 0) argc::resize_chunk(argc_0_sender_balance_offset);

    message_c argc_0_empty = {};
    int32 argc_0_recipient_offset = -1;
    if (!argc::verify_by_acc_once(argc_0_to, argc_0_empty, argc_0_sig_index, argc_0_recipient_offset)) argc::revert(string_view_c("invalid recipient account"));

    
    argc::load_account_chunk(argc_0_to, 0);
    if (argc::invalid(argc_0_recipient_offset, 8)) argc::resize_chunk(argc_0_recipient_offset + 8);
    argc::add_int64_to(argc_0_recipient_offset, argc_0_amount);
}

dispatcher {
    int32 argc_0_position = 0;
    string_view_c argc_0_method = argc::p_scan_str(argc_0_request, string_view_c(""), string_view_c(" "), argc_0_position);
    if (argc_0_method == string_view_c("PATCH")) {
        long_id argc_0_account = argc::p_scan_long_id(argc_0_request, string_view_c("/balances/"), string_view_c("/"), argc_0_position);
        long_id argc_0_to = argc::p_scan_long_id(argc_0_request, string_view_c("{\"to\":"), string_view_c(","), argc_0_position);
        int64 argc_0_amount = argc::p_scan_int64(argc_0_request, string_view_c("\"amount\":"), string_view_c(","), argc_0_position);
        int16 argc_0_sig_index = argc::p_scan_int16(argc_0_request, string_view_c("\"sig\":"), string_view_c("}"), argc_0_position);
        argc::transfer(argc_0_account, argc_0_to, argc_0_amount, argc_0_sig_index);
        argc::append_str(argc_0_response, string_view_c("success and a good response!"));
        return 200;
    } else if (argc_0_method == string_view_c("PUT")) {
        long_id argc_0_address = argc::p_scan_long_id(argc_0_request, string_view_c("/balances/"), string_view_c("/"), argc_0_position);
        publickey_c argc_0_pk = argc::p_scan_pk(argc_0_request, string_view_c("{\"pk\":\""), string_view_c("\""), argc_0_position);
        signature_c argc_0_proof = argc::p_scan_sig(argc_0_request, string_view_c("\"sig\":\""), string_view_c("\""), argc_0_position);
        if (argc::create_normal_account(argc_0_address, argc_0_pk, argc_0_proof)) {
            return argc_0_HTTP_OK;
        } else {
            return argc_0_NOT_ACCEPTED;
        }
    }
    return argc_0_HTTP_OK;
}
}
