package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Base64Utils {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static byte[] m4851a(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static byte[] m4852b(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static String m4853c(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static String m4854d(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public static String m4855e(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
