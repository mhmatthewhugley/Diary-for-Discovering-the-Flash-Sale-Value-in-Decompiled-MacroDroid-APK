package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zza */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zza {
    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    /* renamed from: a */
    static boolean m55988a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
