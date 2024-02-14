package com.google.android.gms.auth;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import java.io.IOException;

public final class GoogleAuthUtil extends zzd {

    /* renamed from: f */
    private static final String f2651f = zzd.f2949b;

    /* renamed from: g */
    private static final String f2652g = zzd.f2950c;

    private GoogleAuthUtil() {
    }

    @Deprecated
    /* renamed from: d */
    public static String m3117d(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzd.m3410d(context, str, str2);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: e */
    public static void m3118e(Context context, String str) {
        zzd.m3411e(context, str);
    }
}
