package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavx {

    /* renamed from: a */
    public final int f25949a;

    /* renamed from: b */
    public int f25950b;

    /* renamed from: c */
    public int f25951c;

    /* renamed from: d */
    public long f25952d;

    /* renamed from: e */
    private final boolean f25953e;

    /* renamed from: f */
    private final zzbak f25954f;

    /* renamed from: g */
    private final zzbak f25955g;

    /* renamed from: h */
    private int f25956h;

    /* renamed from: i */
    private int f25957i;

    public zzavx(zzbak zzbak, zzbak zzbak2, boolean z) {
        this.f25955g = zzbak;
        this.f25954f = zzbak2;
        this.f25953e = z;
        zzbak2.mo42336v(12);
        this.f25949a = zzbak2.mo42323i();
        zzbak.mo42336v(12);
        this.f25957i = zzbak.mo42323i();
        zzbac.m42927f(zzbak.mo42319e() != 1 ? false : true, "first_chunk must be 1");
        this.f25950b = -1;
    }

    /* renamed from: a */
    public final boolean mo42137a() {
        long j;
        int i = this.f25950b + 1;
        this.f25950b = i;
        if (i == this.f25949a) {
            return false;
        }
        if (this.f25953e) {
            j = this.f25954f.mo42328n();
        } else {
            j = this.f25954f.mo42327m();
        }
        this.f25952d = j;
        if (this.f25950b == this.f25956h) {
            this.f25951c = this.f25955g.mo42323i();
            this.f25955g.mo42337w(4);
            int i2 = -1;
            int i3 = this.f25957i - 1;
            this.f25957i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f25955g.mo42323i();
            }
            this.f25956h = i2;
        }
        return true;
    }
}
