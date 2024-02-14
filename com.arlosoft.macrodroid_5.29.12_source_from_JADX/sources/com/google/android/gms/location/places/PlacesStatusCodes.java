package com.google.android.gms.location.places;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

@Deprecated
public class PlacesStatusCodes extends CommonStatusCodes {
    private PlacesStatusCodes() {
    }

    /* renamed from: a */
    public static String m64716a(int i) {
        if (i == 9051) {
            return "PLACE_ALIAS_NOT_FOUND";
        }
        if (i == 9150) {
            return "PLACEFENCING_NOT_AVAILABLE";
        }
        if (i == 9101) {
            return "PLACE_PROXIMITY_UNKNOWN";
        }
        if (i == 9102) {
            return "NEARBY_ALERTS_NOT_AVAILABLE";
        }
        if (i == 9201) {
            return "PLACES_API_PERSONALIZED_DATA_ACCESS_APPROVED";
        }
        if (i == 9202) {
            return "PLACES_API_PERSONALIZED_DATA_ACCESS_REJECTED";
        }
        switch (i) {
            case 9000:
                return "PLACES_API_QUOTA_FAILED";
            case 9001:
                return "PLACES_API_USAGE_LIMIT_EXCEEDED";
            case 9002:
                return "PLACES_API_KEY_INVALID";
            case 9003:
                return "PLACES_API_ACCESS_NOT_CONFIGURED";
            case 9004:
                return "PLACES_API_INVALID_ARGUMENT";
            case 9005:
                return "PLACES_API_RATE_LIMIT_EXCEEDED";
            case 9006:
                return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
            case 9007:
                return "PLACES_API_KEY_EXPIRED";
            case 9008:
                return "PLACES_API_INVALID_APP";
            case 9009:
                return "INSUFFICIENT_LOCATION_PERMISSION_FOR_BACKGROUND_PLACES";
            default:
                return CommonStatusCodes.m3624a(i);
        }
    }

    /* renamed from: b */
    public static Status m64717b(int i) {
        String a = m64716a(i);
        Preconditions.m4488k(a);
        return new Status(i, a);
    }
}
