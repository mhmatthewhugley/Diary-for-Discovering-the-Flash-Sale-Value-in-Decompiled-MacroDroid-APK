package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzah extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1803b;

    /* renamed from: c */
    final /* synthetic */ zzq f1804c;

    /* renamed from: d */
    final /* synthetic */ String f1805d;

    /* renamed from: e */
    final /* synthetic */ zzbvk f1806e;

    /* renamed from: f */
    final /* synthetic */ zzau f1807f;

    zzah(zzau zzau, Context context, zzq zzq, String str, zzbvk zzbvk) {
        this.f1807f = zzau;
        this.f1803b = context;
        this.f1804c = zzq;
        this.f1805d = str;
        this.f1806e = zzbvk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1803b, "banner");
        return new zzeq();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19863Y7(ObjectWrapper.m5051g8(this.f1803b), this.f1804c, this.f1805d, this.f1806e, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        return this.f1807f.f1844a.mo20145c(this.f1803b, this.f1804c, this.f1805d, this.f1806e, 1);
    }
}
