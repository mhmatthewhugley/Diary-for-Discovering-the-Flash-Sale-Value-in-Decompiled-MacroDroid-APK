package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzak extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1817b;

    /* renamed from: c */
    final /* synthetic */ zzq f1818c;

    /* renamed from: d */
    final /* synthetic */ String f1819d;

    /* renamed from: e */
    final /* synthetic */ zzbvk f1820e;

    /* renamed from: f */
    final /* synthetic */ zzau f1821f;

    zzak(zzau zzau, Context context, zzq zzq, String str, zzbvk zzbvk) {
        this.f1821f = zzau;
        this.f1817b = context;
        this.f1818c = zzq;
        this.f1819d = str;
        this.f1820e = zzbvk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1817b, "interstitial");
        return new zzeq();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19866p7(ObjectWrapper.m5051g8(this.f1817b), this.f1818c, this.f1819d, this.f1820e, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        return this.f1821f.f1844a.mo20145c(this.f1817b, this.f1818c, this.f1819d, this.f1820e, 2);
    }
}
