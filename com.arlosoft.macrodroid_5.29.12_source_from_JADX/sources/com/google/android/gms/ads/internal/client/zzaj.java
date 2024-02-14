package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzaj extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1813b;

    /* renamed from: c */
    final /* synthetic */ zzq f1814c;

    /* renamed from: d */
    final /* synthetic */ String f1815d;

    /* renamed from: e */
    final /* synthetic */ zzau f1816e;

    zzaj(zzau zzau, Context context, zzq zzq, String str) {
        this.f1816e = zzau;
        this.f1813b = context;
        this.f1814c = zzq;
        this.f1815d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1813b, "search");
        return new zzeq();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19857F9(ObjectWrapper.m5051g8(this.f1813b), this.f1814c, this.f1815d, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        return this.f1816e.f1844a.mo20145c(this.f1813b, this.f1814c, this.f1815d, (zzbvk) null, 3);
    }
}
