package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4913a(@NonNull Context context, int i) {
        if (!m4914b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.m3573a(context).mo21178b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m4914b(@NonNull Context context, int i, @NonNull String str) {
        return Wrappers.m4929a(context).mo21965h(i, str);
    }
}
