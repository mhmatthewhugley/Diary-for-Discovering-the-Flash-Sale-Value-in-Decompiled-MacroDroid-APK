package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class WearableStatusCodes extends CommonStatusCodes {
    private WearableStatusCodes() {
    }

    @NonNull
    /* renamed from: a */
    public static String m66846a(int i) {
        switch (i) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case 4001:
                return "DUPLICATE_LISTENER";
            case 4002:
                return "UNKNOWN_LISTENER";
            case 4003:
                return "DATA_ITEM_TOO_LARGE";
            case 4004:
                return "INVALID_TARGET_NODE";
            case 4005:
                return "ASSET_UNAVAILABLE";
            case 4006:
                return "DUPLICATE_CAPABILITY";
            case 4007:
                return "UNKNOWN_CAPABILITY";
            case 4008:
                return "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
            case 4009:
                return "UNSUPPORTED_BY_TARGET";
            case 4010:
                return "ACCOUNT_KEY_CREATION_FAILED";
            default:
                return CommonStatusCodes.m3624a(i);
        }
    }
}
