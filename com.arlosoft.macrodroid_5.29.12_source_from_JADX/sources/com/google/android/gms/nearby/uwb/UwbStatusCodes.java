package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class UwbStatusCodes extends CommonStatusCodes {
    private UwbStatusCodes() {
    }

    @NonNull
    /* renamed from: b */
    public static String m66558b(int i) {
        switch (i) {
            case 42000:
                return "SERVICE_NOT_AVAILABLE";
            case 42001:
                return "NULL_RANGING_DEVICE";
            case 42002:
                return "INVALID_API_CALL";
            case 42003:
                return "RANGING_ALREADY_STARTED";
            case 42004:
                return "MISSING_PERMISSION_UWB_RANGING";
            case 42005:
                return "UWB_SYSTEM_CALLBACK_FAILURE";
            default:
                return CommonStatusCodes.m3624a(i);
        }
    }
}
