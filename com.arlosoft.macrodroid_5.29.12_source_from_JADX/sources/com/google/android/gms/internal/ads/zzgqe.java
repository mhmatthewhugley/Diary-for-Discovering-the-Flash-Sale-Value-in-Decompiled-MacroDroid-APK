package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgqe {

    /* renamed from: d */
    private static volatile int f37046d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f37047e = 0;

    /* renamed from: a */
    int f37048a;

    /* renamed from: b */
    final int f37049b = f37046d;

    /* renamed from: c */
    zzgqf f37050c;

    /* synthetic */ zzgqe(zzgqd zzgqd) {
    }

    /* renamed from: e */
    public static int m52703e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m52704f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static zzgqe m52705g(InputStream inputStream, int i) {
        return new zzgqc(inputStream, 4096, (zzgqb) null);
    }

    /* renamed from: h */
    static zzgqe m52706h(byte[] bArr, int i, int i2, boolean z) {
        zzgpy zzgpy = new zzgpy(bArr, i, i2, z, (zzgpx) null);
        try {
            zzgpy.mo47128l(i2);
            return zzgpy;
        } catch (zzgrq e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo47112A() throws IOException;

    /* renamed from: B */
    public abstract void mo47113B(int i) throws zzgrq;

    /* renamed from: a */
    public abstract void mo47121a(int i);

    /* renamed from: b */
    public abstract boolean mo47122b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo47123c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo47124d(int i) throws IOException;

    /* renamed from: i */
    public abstract double mo47125i() throws IOException;

    /* renamed from: j */
    public abstract float mo47126j() throws IOException;

    /* renamed from: k */
    public abstract int mo47127k();

    /* renamed from: l */
    public abstract int mo47128l(int i) throws zzgrq;

    /* renamed from: m */
    public abstract int mo47129m() throws IOException;

    /* renamed from: n */
    public abstract int mo47130n() throws IOException;

    /* renamed from: o */
    public abstract int mo47131o() throws IOException;

    /* renamed from: p */
    public abstract int mo47132p() throws IOException;

    /* renamed from: q */
    public abstract int mo47133q() throws IOException;

    /* renamed from: r */
    public abstract int mo47134r() throws IOException;

    /* renamed from: s */
    public abstract int mo47135s() throws IOException;

    /* renamed from: t */
    public abstract long mo47136t() throws IOException;

    /* renamed from: u */
    public abstract long mo47137u() throws IOException;

    /* renamed from: v */
    public abstract long mo47138v() throws IOException;

    /* renamed from: w */
    public abstract long mo47139w() throws IOException;

    /* renamed from: x */
    public abstract long mo47140x() throws IOException;

    /* renamed from: y */
    public abstract zzgpw mo47141y() throws IOException;

    /* renamed from: z */
    public abstract String mo47142z() throws IOException;
}
