package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxv implements zzazy {

    /* renamed from: a */
    private final Uri f26186a;

    /* renamed from: b */
    private final zzazm f26187b;

    /* renamed from: c */
    private final zzaxw f26188c;

    /* renamed from: d */
    private final zzbae f26189d;

    /* renamed from: e */
    private final zzave f26190e = new zzave();

    /* renamed from: f */
    private volatile boolean f26191f;

    /* renamed from: g */
    private boolean f26192g = true;

    /* renamed from: h */
    private long f26193h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f26194i = -1;

    /* renamed from: j */
    final /* synthetic */ zzaxy f26195j;

    public zzaxv(zzaxy zzaxy, Uri uri, zzazm zzazm, zzaxw zzaxw, zzbae zzbae) {
        this.f26195j = zzaxy;
        Objects.requireNonNull(uri);
        this.f26186a = uri;
        Objects.requireNonNull(zzazm);
        this.f26187b = zzazm;
        Objects.requireNonNull(zzaxw);
        this.f26188c = zzaxw;
        this.f26189d = zzbae;
    }

    /* renamed from: a */
    public final void mo42196a() throws IOException, InterruptedException {
        zzauy zzauy;
        long j;
        while (!this.f26191f) {
            int i = 0;
            try {
                long j2 = this.f26190e.f25735a;
                zzazm zzazm = this.f26187b;
                zzazo zzazo = r4;
                long j3 = j2;
                zzazo zzazo2 = new zzazo(this.f26186a, (byte[]) null, j2, j2, -1, (String) null, 0);
                long f = zzazm.mo42284f(zzazo);
                this.f26194i = f;
                if (f != -1) {
                    j = j3;
                    f += j;
                    this.f26194i = f;
                } else {
                    j = j3;
                }
                zzauy = new zzauy(this.f26187b, j, f);
                try {
                    zzauz b = this.f26188c.mo42201b(zzauy, this.f26187b.mo42281a());
                    if (this.f26192g) {
                        b.mo42103d(j, this.f26193h);
                        this.f26192g = false;
                    }
                    long j4 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f26191f) {
                                i2 = 0;
                                break;
                            }
                            this.f26189d.mo42308a();
                            i2 = b.mo42102b(zzauy, this.f26190e);
                            if (zzauy.mo42096d() > this.f26195j.f26231p + j4) {
                                j4 = zzauy.mo42096d();
                                this.f26189d.mo42309b();
                                zzaxy zzaxy = this.f26195j;
                                zzaxy.f26204D.post(zzaxy.f26203C);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || zzauy == null)) {
                                this.f26190e.f25735a = zzauy.mo42096d();
                            }
                            zzbar.m42997m(this.f26187b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f26190e.f25735a = zzauy.mo42096d();
                        i = i2;
                    }
                    zzbar.m42997m(this.f26187b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f26190e.f25735a = zzauy.mo42096d();
                    zzbar.m42997m(this.f26187b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zzauy = null;
                this.f26190e.f25735a = zzauy.mo42096d();
                zzbar.m42997m(this.f26187b);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo42197b() {
        return this.f26191f;
    }

    /* renamed from: d */
    public final void mo42198d(long j, long j2) {
        this.f26190e.f25735a = j;
        this.f26193h = j2;
        this.f26192g = true;
    }

    public final void zzb() {
        this.f26191f = true;
    }
}
