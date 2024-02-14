package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxd {

    /* renamed from: a */
    private zzxc f38849a = new zzxc();

    /* renamed from: b */
    private zzxc f38850b = new zzxc();

    /* renamed from: c */
    private boolean f38851c;

    /* renamed from: d */
    private long f38852d = -9223372036854775807L;

    /* renamed from: e */
    private int f38853e;

    /* renamed from: a */
    public final float mo48377a() {
        if (this.f38849a.mo48376f()) {
            return (float) (1.0E9d / ((double) this.f38849a.mo48371a()));
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int mo48378b() {
        return this.f38853e;
    }

    /* renamed from: c */
    public final long mo48379c() {
        if (this.f38849a.mo48376f()) {
            return this.f38849a.mo48371a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long mo48380d() {
        if (this.f38849a.mo48376f()) {
            return this.f38849a.mo48372b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void mo48381e(long j) {
        this.f38849a.mo48373c(j);
        int i = 0;
        if (this.f38849a.mo48376f()) {
            this.f38851c = false;
        } else if (this.f38852d != -9223372036854775807L) {
            if (!this.f38851c || this.f38850b.mo48375e()) {
                this.f38850b.mo48374d();
                this.f38850b.mo48373c(this.f38852d);
            }
            this.f38851c = true;
            this.f38850b.mo48373c(j);
        }
        if (this.f38851c && this.f38850b.mo48376f()) {
            zzxc zzxc = this.f38849a;
            this.f38849a = this.f38850b;
            this.f38850b = zzxc;
            this.f38851c = false;
        }
        this.f38852d = j;
        if (!this.f38849a.mo48376f()) {
            i = this.f38853e + 1;
        }
        this.f38853e = i;
    }

    /* renamed from: f */
    public final void mo48382f() {
        this.f38849a.mo48374d();
        this.f38850b.mo48374d();
        this.f38851c = false;
        this.f38852d = -9223372036854775807L;
        this.f38853e = 0;
    }

    /* renamed from: g */
    public final boolean mo48383g() {
        return this.f38849a.mo48376f();
    }
}
