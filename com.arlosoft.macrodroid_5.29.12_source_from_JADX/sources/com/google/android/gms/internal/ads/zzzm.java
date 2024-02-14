package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzm {
    /* renamed from: a */
    public static int m55539a(zzzj zzzj, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int l = zzzj.mo48455l(bArr, i + i3, i2 - i3);
            if (l == -1) {
                break;
            }
            i3 += l;
        }
        return i3;
    }

    /* renamed from: b */
    public static void m55540b(boolean z, @Nullable String str) throws zzbu {
        if (!z) {
            throw zzbu.m44135a(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m55541c(zzzj zzzj, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzzj.mo48454j(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m55542d(zzzj zzzj, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzyy) zzzj).mo48453i(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m55543e(zzzj zzzj, int i) throws IOException {
        try {
            ((zzyy) zzzj).mo48459p(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
