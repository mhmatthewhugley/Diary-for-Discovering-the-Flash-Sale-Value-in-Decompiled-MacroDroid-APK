package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdrc implements Callable {

    /* renamed from: A */
    public final /* synthetic */ zzfzp f32853A;

    /* renamed from: B */
    public final /* synthetic */ zzfzp f32854B;

    /* renamed from: a */
    public final /* synthetic */ zzdrd f32855a;

    /* renamed from: c */
    public final /* synthetic */ zzfzp f32856c;

    /* renamed from: d */
    public final /* synthetic */ zzfzp f32857d;

    /* renamed from: f */
    public final /* synthetic */ zzfzp f32858f;

    /* renamed from: g */
    public final /* synthetic */ zzfzp f32859g;

    /* renamed from: o */
    public final /* synthetic */ zzfzp f32860o;

    /* renamed from: p */
    public final /* synthetic */ JSONObject f32861p;

    /* renamed from: s */
    public final /* synthetic */ zzfzp f32862s;

    /* renamed from: z */
    public final /* synthetic */ zzfzp f32863z;

    public /* synthetic */ zzdrc(zzdrd zzdrd, zzfzp zzfzp, zzfzp zzfzp2, zzfzp zzfzp3, zzfzp zzfzp4, zzfzp zzfzp5, JSONObject jSONObject, zzfzp zzfzp6, zzfzp zzfzp7, zzfzp zzfzp8, zzfzp zzfzp9) {
        this.f32855a = zzdrd;
        this.f32856c = zzfzp;
        this.f32857d = zzfzp2;
        this.f32858f = zzfzp3;
        this.f32859g = zzfzp4;
        this.f32860o = zzfzp5;
        this.f32861p = jSONObject;
        this.f32862s = zzfzp6;
        this.f32863z = zzfzp7;
        this.f32853A = zzfzp8;
        this.f32854B = zzfzp9;
    }

    public final Object call() {
        zzfzp zzfzp = this.f32856c;
        zzfzp zzfzp2 = this.f32857d;
        zzfzp zzfzp3 = this.f32858f;
        zzfzp zzfzp4 = this.f32859g;
        zzfzp zzfzp5 = this.f32860o;
        JSONObject jSONObject = this.f32861p;
        zzfzp zzfzp6 = this.f32862s;
        zzfzp zzfzp7 = this.f32863z;
        zzfzp zzfzp8 = this.f32853A;
        zzfzp zzfzp9 = this.f32854B;
        zzdoq zzdoq = (zzdoq) zzfzp.get();
        zzdoq.mo44834n((List) zzfzp2.get());
        zzdoq.mo44831k((zzbme) zzfzp3.get());
        zzdoq.mo44835o((zzbme) zzfzp4.get());
        zzdoq.mo44827h((zzblw) zzfzp5.get());
        zzdoq.mo44837q(zzdrq.m47972j(jSONObject));
        zzdoq.mo44830j(zzdrq.m47971i(jSONObject));
        zzcmp zzcmp = (zzcmp) zzfzp6.get();
        if (zzcmp != null) {
            zzdoq.mo44845y(zzcmp);
            zzdoq.mo44844x(zzcmp.mo44027R());
            zzdoq.mo44843w(zzcmp.mo43761p());
        }
        zzcmp zzcmp2 = (zzcmp) zzfzp7.get();
        if (zzcmp2 != null) {
            zzdoq.mo44833m(zzcmp2);
            zzdoq.mo44846z(zzcmp2.mo44027R());
        }
        zzcmp zzcmp3 = (zzcmp) zzfzp8.get();
        if (zzcmp3 != null) {
            zzdoq.mo44838r(zzcmp3);
        }
        for (zzdru zzdru : (List) zzfzp9.get()) {
            if (zzdru.f32924a != 1) {
                zzdoq.mo44832l(zzdru.f32925b, zzdru.f32927d);
            } else {
                zzdoq.mo44841u(zzdru.f32925b, zzdru.f32926c);
            }
        }
        return zzdoq;
    }
}
