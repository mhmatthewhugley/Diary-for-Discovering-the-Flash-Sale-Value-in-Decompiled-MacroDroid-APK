package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzai extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1808b;

    /* renamed from: c */
    final /* synthetic */ zzq f1809c;

    /* renamed from: d */
    final /* synthetic */ String f1810d;

    /* renamed from: e */
    final /* synthetic */ zzbvk f1811e;

    /* renamed from: f */
    final /* synthetic */ zzau f1812f;

    zzai(zzau zzau, Context context, zzq zzq, String str, zzbvk zzbvk) {
        this.f1812f = zzau;
        this.f1808b = context;
        this.f1809c = zzq;
        this.f1810d = str;
        this.f1811e = zzbvk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1808b, "app_open");
        return new zzeq();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19858G8(ObjectWrapper.m5051g8(this.f1808b), this.f1809c, this.f1810d, this.f1811e, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        return this.f1812f.f1844a.mo20145c(this.f1808b, this.f1809c, this.f1810d, this.f1811e, 4);
    }
}
