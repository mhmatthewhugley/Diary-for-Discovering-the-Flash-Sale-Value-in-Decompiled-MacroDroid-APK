package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzacg {

    /* renamed from: d */
    private static volatile int f39644d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f39645e = 0;

    /* renamed from: a */
    int f39646a;

    /* renamed from: b */
    final int f39647b = f39644d;

    /* renamed from: c */
    zzach f39648c;

    /* synthetic */ zzacg(zzacf zzacf) {
    }

    /* renamed from: l */
    public static int m56196l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: m */
    public static long m56197m(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: n */
    static zzacg m56198n(byte[] bArr, int i, int i2, boolean z) {
        zzace zzace = new zzace(bArr, 0, i2, z, (zzacd) null);
        try {
            zzace.mo48910b(i2);
            return zzace;
        } catch (zzadn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo48909a();

    /* renamed from: b */
    public abstract int mo48910b(int i) throws zzadn;

    /* renamed from: c */
    public abstract int mo48911c() throws IOException;

    /* renamed from: d */
    public abstract zzacc mo48912d() throws IOException;

    /* renamed from: e */
    public abstract String mo48913e() throws IOException;

    /* renamed from: f */
    public abstract String mo48914f() throws IOException;

    /* renamed from: g */
    public abstract void mo48915g(int i) throws zzadn;

    /* renamed from: h */
    public abstract void mo48916h(int i);

    /* renamed from: i */
    public abstract boolean mo48917i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo48918j() throws IOException;

    /* renamed from: k */
    public abstract boolean mo48919k(int i) throws IOException;
}
