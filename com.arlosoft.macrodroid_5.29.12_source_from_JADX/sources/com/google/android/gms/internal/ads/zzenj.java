package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenj extends zzbn {

    /* renamed from: a */
    private final Context f34544a;

    /* renamed from: c */
    private final zzcom f34545c;
    @VisibleForTesting

    /* renamed from: d */
    final zzfed f34546d;
    @VisibleForTesting

    /* renamed from: f */
    final zzdoz f34547f = new zzdoz();

    /* renamed from: g */
    private zzbf f34548g;

    public zzenj(zzcom zzcom, Context context, String str) {
        zzfed zzfed = new zzfed();
        this.f34546d = zzfed;
        this.f34545c = zzcom;
        zzfed.mo45606J(str);
        this.f34544a = context;
    }

    /* renamed from: Ab */
    public final void mo19913Ab(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f34546d.mo45604H(adManagerAdViewOptions);
    }

    /* renamed from: M5 */
    public final void mo19914M5(zzbnp zzbnp, zzq zzq) {
        this.f34547f.mo44858e(zzbnp);
        this.f34546d.mo45605I(zzq);
    }

    /* renamed from: M6 */
    public final void mo19915M6(zzbsl zzbsl) {
        this.f34547f.mo44857d(zzbsl);
    }

    /* renamed from: b */
    public final zzbl mo19908b() {
        zzdpb g = this.f34547f.mo44860g();
        this.f34546d.mo45615b(g.mo44870i());
        this.f34546d.mo45616c(g.mo44869h());
        zzfed zzfed = this.f34546d;
        if (zzfed.mo45625x() == null) {
            zzfed.mo45605I(zzq.m2419n2());
        }
        return new zzenk(this.f34544a, this.f34545c, this.f34546d, g, this.f34548g);
    }

    /* renamed from: ba */
    public final void mo19916ba(zzbsc zzbsc) {
        this.f34546d.mo45609M(zzbsc);
    }

    /* renamed from: e7 */
    public final void mo19917e7(zzcd zzcd) {
        this.f34546d.mo45623q(zzcd);
    }

    /* renamed from: i7 */
    public final void mo19909i7(zzbls zzbls) {
        this.f34546d.mo45614a(zzbls);
    }

    /* renamed from: m2 */
    public final void mo19910m2(zzbns zzbns) {
        this.f34547f.mo44859f(zzbns);
    }

    /* renamed from: m7 */
    public final void mo19911m7(zzbf zzbf) {
        this.f34548g = zzbf;
    }

    /* renamed from: ma */
    public final void mo19912ma(String str, zzbnl zzbnl, @Nullable zzbni zzbni) {
        this.f34547f.mo44856c(str, zzbnl, zzbni);
    }

    /* renamed from: o5 */
    public final void mo19918o5(zzbnc zzbnc) {
        this.f34547f.mo44854a(zzbnc);
    }

    /* renamed from: p2 */
    public final void mo19919p2(zzbnf zzbnf) {
        this.f34547f.mo44855b(zzbnf);
    }

    /* renamed from: wb */
    public final void mo19920wb(PublisherAdViewOptions publisherAdViewOptions) {
        this.f34546d.mo45617d(publisherAdViewOptions);
    }
}
