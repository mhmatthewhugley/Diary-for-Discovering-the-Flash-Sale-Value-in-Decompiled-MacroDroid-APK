package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbbc {

    /* renamed from: a */
    private final zzbbb f26482a;

    /* renamed from: b */
    private final boolean f26483b;

    /* renamed from: c */
    private final long f26484c;

    /* renamed from: d */
    private final long f26485d;

    /* renamed from: e */
    private long f26486e;

    /* renamed from: f */
    private long f26487f;

    /* renamed from: g */
    private long f26488g;

    /* renamed from: h */
    private boolean f26489h;

    /* renamed from: i */
    private long f26490i;

    /* renamed from: j */
    private long f26491j;

    /* renamed from: k */
    private long f26492k;

    public zzbbc() {
        this(-1.0d);
    }

    /* renamed from: d */
    private final boolean m43041d(long j, long j2) {
        return Math.abs((j2 - this.f26490i) - (j - this.f26491j)) > 20000000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo42368a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f26489h
            if (r2 == 0) goto L_0x0042
            long r2 = r11.f26486e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.f26492k
            r4 = 1
            long r2 = r2 + r4
            r11.f26492k = r2
            long r2 = r11.f26488g
            r11.f26487f = r2
        L_0x0019:
            long r2 = r11.f26492k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r11.f26491j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f26487f
            long r2 = r2 + r4
            boolean r4 = r11.m43041d(r2, r14)
            if (r4 == 0) goto L_0x0033
            r11.f26489h = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r11.f26490i
            long r4 = r4 + r2
            long r6 = r11.f26491j
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r11.m43041d(r0, r14)
            if (r2 == 0) goto L_0x0042
            r11.f26489h = r6
        L_0x0042:
            r4 = r14
            r2 = r0
        L_0x0044:
            boolean r6 = r11.f26489h
            r7 = 0
            if (r6 != 0) goto L_0x0053
            r11.f26491j = r0
            r11.f26490i = r14
            r11.f26492k = r7
            r14 = 1
            r11.f26489h = r14
        L_0x0053:
            r11.f26486e = r12
            r11.f26488g = r2
            com.google.android.gms.internal.ads.zzbbb r12 = r11.f26482a
            if (r12 == 0) goto L_0x0086
            long r12 = r12.f26477a
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0062
            goto L_0x0086
        L_0x0062:
            com.google.android.gms.internal.ads.zzbbb r12 = r11.f26482a
            long r12 = r12.f26477a
            long r14 = r11.f26484c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            long r14 = r12 - r14
            goto L_0x0079
        L_0x0075:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0079:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r12 = r14
        L_0x0082:
            long r14 = r11.f26485d
            long r12 = r12 - r14
            return r12
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbc.mo42368a(long, long):long");
    }

    /* renamed from: b */
    public final void mo42369b() {
        if (this.f26483b) {
            this.f26482a.mo42365c();
        }
    }

    /* renamed from: c */
    public final void mo42370c() {
        this.f26489h = false;
        if (this.f26483b) {
            this.f26482a.mo42364b();
        }
    }

    private zzbbc(double d) {
        long j;
        boolean z = d != -1.0d;
        this.f26483b = z;
        if (z) {
            this.f26482a = zzbbb.m43038a();
            long j2 = (long) (1.0E9d / d);
            this.f26484c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.f26482a = null;
            j = -1;
            this.f26484c = -1;
        }
        this.f26485d = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbbc(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbc.<init>(android.content.Context):void");
    }
}
