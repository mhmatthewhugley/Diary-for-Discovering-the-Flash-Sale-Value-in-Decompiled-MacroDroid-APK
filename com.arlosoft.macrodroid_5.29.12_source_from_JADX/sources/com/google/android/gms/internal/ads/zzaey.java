package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaey {

    /* renamed from: a */
    public final int f24181a;

    /* renamed from: b */
    public int f24182b;

    /* renamed from: c */
    public int f24183c;

    /* renamed from: d */
    public long f24184d;

    /* renamed from: e */
    private final boolean f24185e;

    /* renamed from: f */
    private final zzef f24186f;

    /* renamed from: g */
    private final zzef f24187g;

    /* renamed from: h */
    private int f24188h;

    /* renamed from: i */
    private int f24189i;

    public zzaey(zzef zzef, zzef zzef2, boolean z) throws zzbu {
        this.f24187g = zzef;
        this.f24186f = zzef2;
        this.f24185e = z;
        zzef2.mo45230f(12);
        this.f24181a = zzef2.mo45246v();
        zzef.mo45230f(12);
        this.f24189i = zzef.mo45246v();
        zzzm.m55540b(zzef.mo45237m() != 1 ? false : true, "first_chunk must be 1");
        this.f24182b = -1;
    }

    /* renamed from: a */
    public final boolean mo41420a() {
        long j;
        int i = this.f24182b + 1;
        this.f24182b = i;
        if (i == this.f24181a) {
            return false;
        }
        if (this.f24185e) {
            j = this.f24186f.mo45218B();
        } else {
            j = this.f24186f.mo45217A();
        }
        this.f24184d = j;
        if (this.f24182b == this.f24188h) {
            this.f24183c = this.f24187g.mo45246v();
            this.f24187g.mo45231g(4);
            int i2 = -1;
            int i3 = this.f24189i - 1;
            this.f24189i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f24187g.mo45246v();
            }
            this.f24188h = i2;
        }
        return true;
    }
}
