package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zznb {
    @Nullable

    /* renamed from: a */
    private static zzna f43070a;

    /* renamed from: a */
    public static synchronized zzmq m61541a(zzmj zzmj) {
        zzmq zzmq;
        synchronized (zznb.class) {
            if (f43070a == null) {
                f43070a = new zzna((zzmz) null);
            }
            zzmq = (zzmq) f43070a.mo64548b(zzmj);
        }
        return zzmq;
    }

    /* renamed from: b */
    public static synchronized zzmq m61542b(String str) {
        zzmq a;
        synchronized (zznb.class) {
            a = m61541a(zzmj.m61497d("common").mo51971c());
        }
        return a;
    }
}
