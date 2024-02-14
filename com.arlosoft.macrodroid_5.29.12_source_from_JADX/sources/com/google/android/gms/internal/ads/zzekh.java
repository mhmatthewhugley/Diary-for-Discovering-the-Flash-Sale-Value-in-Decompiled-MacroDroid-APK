package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzekh extends zzekg {

    /* renamed from: a */
    private final zzcom f34256a;

    /* renamed from: b */
    private final zzdck f34257b;

    /* renamed from: c */
    private final zzemp f34258c;

    /* renamed from: d */
    private final zzdim f34259d;

    /* renamed from: e */
    private final zzdmy f34260e;

    /* renamed from: f */
    private final zzdfp f34261f;

    /* renamed from: g */
    private final ViewGroup f34262g;

    /* renamed from: h */
    private final zzdhv f34263h;

    public zzekh(zzcom zzcom, zzdck zzdck, zzemp zzemp, zzdim zzdim, zzdmy zzdmy, zzdfp zzdfp, @Nullable ViewGroup viewGroup, @Nullable zzdhv zzdhv) {
        this.f34256a = zzcom;
        this.f34257b = zzdck;
        this.f34258c = zzemp;
        this.f34259d = zzdim;
        this.f34260e = zzdmy;
        this.f34261f = zzdfp;
        this.f34262g = viewGroup;
        this.f34263h = zzdhv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final zzfzp mo45348c(zzfef zzfef, Bundle bundle) {
        zzcxy i = this.f34256a.mo44199i();
        zzdck zzdck = this.f34257b;
        zzdck.mo44557f(zzfef);
        zzdck.mo44555d(bundle);
        i.mo44290t(zzdck.mo44558g());
        i.mo44287k(this.f34259d);
        i.mo44288o(this.f34258c);
        i.mo44284g(this.f34260e);
        i.mo44289s(new zzcyw(this.f34261f, this.f34263h));
        i.mo44286i(new zzcwz(this.f34262g));
        zzdah d = i.mo44285h().mo44294d();
        return d.mo44530h(d.mo44531i());
    }
}
