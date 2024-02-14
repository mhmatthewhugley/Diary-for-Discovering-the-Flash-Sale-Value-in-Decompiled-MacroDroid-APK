package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzath {

    /* renamed from: a */
    public static final zzath f25543a = new zzate();

    /* renamed from: a */
    public abstract int mo41985a(Object obj);

    /* renamed from: b */
    public abstract int mo41986b();

    /* renamed from: c */
    public abstract int mo41987c();

    /* renamed from: d */
    public abstract zzatf mo41988d(int i, zzatf zzatf, boolean z);

    /* renamed from: e */
    public abstract zzatg mo41989e(int i, zzatg zzatg, boolean z, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo41987c() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41990f(int r3, com.google.android.gms.internal.ads.zzatf r4, com.google.android.gms.internal.ads.zzatg r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo41988d(r3, r4, r0)
            r2.mo41991g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo41987c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo41987c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo41991g(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzath.mo41990f(int, com.google.android.gms.internal.ads.zzatf, com.google.android.gms.internal.ads.zzatg, int):int");
    }

    /* renamed from: g */
    public final zzatg mo41991g(int i, zzatg zzatg, boolean z) {
        return mo41989e(i, zzatg, false, 0);
    }

    /* renamed from: h */
    public final boolean mo41992h() {
        return mo41987c() == 0;
    }
}
