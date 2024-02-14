package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzccx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzat extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1840b;

    /* renamed from: c */
    final /* synthetic */ String f1841c;

    /* renamed from: d */
    final /* synthetic */ zzbvk f1842d;

    /* renamed from: e */
    final /* synthetic */ zzau f1843e;

    zzat(zzau zzau, Context context, String str, zzbvk zzbvk) {
        this.f1843e = zzau;
        this.f1840b = context;
        this.f1841c = str;
        this.f1842d = zzbvk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1840b, "rewarded");
        return new zzew();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19854B3(ObjectWrapper.m5051g8(this.f1840b), this.f1841c, this.f1842d, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        return zzccx.m44927a(this.f1840b, this.f1841c, this.f1842d);
    }
}
