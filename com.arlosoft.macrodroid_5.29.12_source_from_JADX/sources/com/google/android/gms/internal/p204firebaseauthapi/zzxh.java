package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxh {
    @Nullable

    /* renamed from: a */
    private static Boolean f40593a;

    /* renamed from: a */
    public static boolean m58377a(Context context) {
        if (f40593a == null) {
            int j = GoogleApiAvailabilityLight.m3542h().mo21157j(context, GooglePlayServicesUtilLight.f3065a);
            boolean z = true;
            if (!(j == 0 || j == 2)) {
                z = false;
            }
            f40593a = Boolean.valueOf(z);
        }
        return f40593a.booleanValue();
    }
}
