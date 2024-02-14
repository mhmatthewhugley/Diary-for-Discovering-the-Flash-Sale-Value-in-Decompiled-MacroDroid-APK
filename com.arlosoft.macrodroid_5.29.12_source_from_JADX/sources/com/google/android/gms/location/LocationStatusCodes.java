package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

@Deprecated
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class LocationStatusCodes {
    private LocationStatusCodes() {
    }

    /* renamed from: a */
    public static int m64689a(int i) {
        if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
            return 1;
        }
        return i;
    }

    @NonNull
    /* renamed from: b */
    public static Status m64690b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
