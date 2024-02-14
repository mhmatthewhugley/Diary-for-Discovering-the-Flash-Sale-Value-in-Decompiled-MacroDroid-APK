package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzasi extends Exception {
    private zzasi(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    /* renamed from: a */
    public static zzasi m42275a(Exception exc, int i) {
        return new zzasi(1, (String) null, exc, i);
    }

    /* renamed from: b */
    public static zzasi m42276b(IOException iOException) {
        return new zzasi(0, (String) null, iOException, -1);
    }

    /* renamed from: c */
    static zzasi m42277c(RuntimeException runtimeException) {
        return new zzasi(2, (String) null, runtimeException, -1);
    }
}
