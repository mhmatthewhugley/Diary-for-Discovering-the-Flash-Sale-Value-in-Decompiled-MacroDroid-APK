package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzezg implements zzddd, zzdez, zzfaw, zzo, zzdfl, zzddq, zzdkn {

    /* renamed from: a */
    private final zzffm f35232a;

    /* renamed from: c */
    private final AtomicReference f35233c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f35234d = new AtomicReference();

    /* renamed from: f */
    private final AtomicReference f35235f = new AtomicReference();

    /* renamed from: g */
    private final AtomicReference f35236g = new AtomicReference();

    /* renamed from: o */
    private final AtomicReference f35237o = new AtomicReference();

    /* renamed from: p */
    private final AtomicReference f35238p = new AtomicReference();

    /* renamed from: s */
    private zzezg f35239s = null;

    public zzezg(zzffm zzffm) {
        this.f35232a = zzffm;
    }

    /* renamed from: f */
    public static zzezg m49666f(zzezg zzezg) {
        zzezg zzezg2 = new zzezg(zzezg.f35232a);
        zzezg2.f35239s = zzezg;
        return zzezg2;
    }

    /* renamed from: E */
    public final void mo45523E(zzbdn zzbdn) {
        this.f35234d.set(zzbdn);
    }

    /* renamed from: M0 */
    public final void mo44388M0(zze zze) {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo44388M0(zze);
        } else {
            zzfan.m49791a(this.f35235f, new zzezc(zze));
        }
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
    }

    /* renamed from: a */
    public final void mo44605a(@NonNull zzs zzs) {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo44605a(zzs);
        } else {
            zzfan.m49791a(this.f35238p, new zzeyu(zzs));
        }
    }

    /* renamed from: b */
    public final void mo20217b() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo20217b();
        } else {
            zzfan.m49791a(this.f35237o, zzezd.f35229a);
        }
    }

    /* renamed from: c */
    public final void mo45524c(zzfaw zzfaw) {
        this.f35239s = (zzezg) zzfaw;
    }

    /* renamed from: e */
    public final void mo44603e() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo44603e();
        } else {
            zzfan.m49791a(this.f35236g, zzezf.f35231a);
        }
    }

    /* renamed from: g */
    public final void mo45525g(zzbdj zzbdj) {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo45525g(zzbdj);
        } else {
            zzfan.m49791a(this.f35233c, new zzeyy(zzbdj));
        }
    }

    /* renamed from: h */
    public final void mo45526h() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo45526h();
            return;
        }
        this.f35232a.mo45677a();
        zzfan.m49791a(this.f35234d, zzeys.f35218a);
        zzfan.m49791a(this.f35235f, zzeyt.f35219a);
    }

    /* renamed from: n */
    public final void mo45527n(zzdez zzdez) {
        this.f35236g.set(zzdez);
    }

    /* renamed from: o */
    public final void mo45528o(zzo zzo) {
        this.f35237o.set(zzo);
    }

    /* renamed from: q */
    public final void mo45529q(zzde zzde) {
        this.f35238p.set(zzde);
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo44382r(zze);
            return;
        }
        zzfan.m49791a(this.f35233c, new zzeyr(zze));
        zzfan.m49791a(this.f35233c, new zzeyx(zze));
    }

    /* renamed from: s */
    public final void mo44113s() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo44113s();
        } else {
            zzfan.m49791a(this.f35235f, zzeze.f35230a);
        }
    }

    /* renamed from: sb */
    public final void mo20218sb() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo20218sb();
        } else {
            zzfan.m49791a(this.f35237o, zzeyw.f35222a);
        }
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
    }

    /* renamed from: u */
    public final void mo45530u(zzbdm zzbdm) {
        this.f35233c.set(zzbdm);
    }

    /* renamed from: x */
    public final void mo45531x(zzbdq zzbdq) {
        this.f35235f.set(zzbdq);
    }

    /* renamed from: y */
    public final void mo20220y(int i) {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.mo20220y(i);
        } else {
            zzfan.m49791a(this.f35237o, new zzeyv(i));
        }
    }

    public final void zzb() {
        zzezg zzezg = this.f35239s;
        if (zzezg != null) {
            zzezg.zzb();
            return;
        }
        zzfan.m49791a(this.f35237o, zzeyz.f35225a);
        zzfan.m49791a(this.f35235f, zzeza.f35226a);
        zzfan.m49791a(this.f35235f, zzezb.f35227a);
    }
}
