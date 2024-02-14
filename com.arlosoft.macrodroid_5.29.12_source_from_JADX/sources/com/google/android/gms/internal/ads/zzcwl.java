package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcwl extends zzcze {

    /* renamed from: i */
    private final View f31735i;
    @Nullable

    /* renamed from: j */
    private final zzcmp f31736j;

    /* renamed from: k */
    private final zzfdl f31737k;

    /* renamed from: l */
    private final int f31738l;

    /* renamed from: m */
    private final boolean f31739m;

    /* renamed from: n */
    private final boolean f31740n;

    /* renamed from: o */
    private final zzcwd f31741o;
    @Nullable

    /* renamed from: p */
    private zzbdn f31742p;

    zzcwl(zzczd zzczd, View view, @Nullable zzcmp zzcmp, zzfdl zzfdl, int i, boolean z, boolean z2, zzcwd zzcwd) {
        super(zzczd);
        this.f31735i = view;
        this.f31736j = zzcmp;
        this.f31737k = zzfdl;
        this.f31738l = i;
        this.f31739m = z;
        this.f31740n = z2;
        this.f31741o = zzcwd;
    }

    /* renamed from: h */
    public final int mo44427h() {
        return this.f31738l;
    }

    /* renamed from: i */
    public final View mo44428i() {
        return this.f31735i;
    }

    /* renamed from: j */
    public final zzfdl mo44429j() {
        return zzfej.m50011b(this.f31896b.f35553s, this.f31737k);
    }

    /* renamed from: k */
    public final void mo44430k(zzbdd zzbdd) {
        this.f31736j.mo44034U0(zzbdd);
    }

    /* renamed from: l */
    public final boolean mo44431l() {
        return this.f31739m;
    }

    /* renamed from: m */
    public final boolean mo44432m() {
        return this.f31740n;
    }

    /* renamed from: n */
    public final boolean mo44433n() {
        return this.f31736j.mo44076z();
    }

    /* renamed from: o */
    public final boolean mo44434o() {
        return this.f31736j.mo44044e0() != null && this.f31736j.mo44044e0().mo44088Q();
    }

    /* renamed from: p */
    public final void mo44435p(long j, int i) {
        this.f31741o.mo44426a(j, i);
    }

    @Nullable
    /* renamed from: q */
    public final zzbdn mo44436q() {
        return this.f31742p;
    }

    /* renamed from: r */
    public final void mo44437r(zzbdn zzbdn) {
        this.f31742p = zzbdn;
    }
}
