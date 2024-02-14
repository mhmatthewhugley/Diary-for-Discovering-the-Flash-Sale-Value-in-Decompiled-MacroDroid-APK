package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagx implements zzzi {

    /* renamed from: j */
    public static final zzzp f24477j = zzagw.f24476b;

    /* renamed from: a */
    private final zzagy f24478a;

    /* renamed from: b */
    private final zzef f24479b;

    /* renamed from: c */
    private final zzef f24480c;

    /* renamed from: d */
    private final zzee f24481d;

    /* renamed from: e */
    private zzzl f24482e;

    /* renamed from: f */
    private long f24483f;

    /* renamed from: g */
    private long f24484g;

    /* renamed from: h */
    private boolean f24485h;

    /* renamed from: i */
    private boolean f24486i;

    public zzagx() {
        this(0);
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        int i = 0;
        while (true) {
            zzyy zzyy = (zzyy) zzzj;
            zzyy.mo48454j(this.f24480c.mo45232h(), 0, 10, false);
            this.f24480c.mo45230f(0);
            if (this.f24480c.mo45245u() != 4801587) {
                break;
            }
            this.f24480c.mo45231g(3);
            int r = this.f24480c.mo45242r();
            i += r + 10;
            zzyy.mo48458o(r, false);
        }
        zzzj.mo48452h();
        zzyy zzyy2 = (zzyy) zzzj;
        zzyy2.mo48458o(i, false);
        if (this.f24484g == -1) {
            this.f24484g = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzyy2.mo48454j(this.f24480c.mo45232h(), 0, 2, false);
            this.f24480c.mo45230f(0);
            if (!zzagy.m41385f(this.f24480c.mo45247w())) {
                i2++;
                zzzj.mo48452h();
                zzyy2.mo48458o(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzyy2.mo48454j(this.f24480c.mo45232h(), 0, 4, false);
                this.f24481d.mo45203h(14);
                int c = this.f24481d.mo45198c(13);
                if (c <= 6) {
                    i2++;
                    zzzj.mo48452h();
                    zzyy2.mo48458o(i2, false);
                } else {
                    zzyy2.mo48458o(c - 6, false);
                    i4 += c;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24482e = zzzl;
        this.f24478a.mo41469d(zzzl, new zzaio(Integer.MIN_VALUE, 0, 1));
        zzzl.mo41255j0();
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24485h = false;
        this.f24478a.mo41467b();
        this.f24483f = j2;
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        zzdd.m47208b(this.f24482e);
        int e = zzzj.mo43927e(this.f24479b.mo45232h(), 0, 2048);
        if (!this.f24486i) {
            this.f24482e.mo41254h(new zzaak(-9223372036854775807L, 0));
            this.f24486i = true;
        }
        if (e == -1) {
            return -1;
        }
        this.f24479b.mo45230f(0);
        this.f24479b.mo45229e(e);
        if (!this.f24485h) {
            this.f24478a.mo41470e(this.f24483f, 4);
            this.f24485h = true;
        }
        this.f24478a.mo41468c(this.f24479b);
        return 0;
    }

    public zzagx(int i) {
        this.f24478a = new zzagy(true, (String) null);
        this.f24479b = new zzef(2048);
        this.f24484g = -1;
        zzef zzef = new zzef(10);
        this.f24480c = zzef;
        byte[] h = zzef.mo45232h();
        this.f24481d = new zzee(h, h.length);
    }
}
