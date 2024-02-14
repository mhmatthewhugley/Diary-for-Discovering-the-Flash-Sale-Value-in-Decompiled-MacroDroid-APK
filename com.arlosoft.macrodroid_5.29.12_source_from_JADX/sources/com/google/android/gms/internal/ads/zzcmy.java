package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcmy implements zzfym {

    /* renamed from: a */
    public final /* synthetic */ Context f29054a;

    /* renamed from: b */
    public final /* synthetic */ zzape f29055b;

    /* renamed from: c */
    public final /* synthetic */ zzcgv f29056c;

    /* renamed from: d */
    public final /* synthetic */ zza f29057d;

    /* renamed from: e */
    public final /* synthetic */ String f29058e;

    public /* synthetic */ zzcmy(Context context, zzape zzape, zzcgv zzcgv, zza zza, String str) {
        this.f29054a = context;
        this.f29055b = zzape;
        this.f29056c = zzcgv;
        this.f29057d = zza;
        this.f29058e = str;
    }

    public final zzfzp zza() {
        Context context = this.f29054a;
        zzape zzape = this.f29055b;
        zzcgv zzcgv = this.f29056c;
        zza zza = this.f29057d;
        String str = this.f29058e;
        zzt.m2887B();
        zzcmp a = zzcnb.m45940a(context, zzcoe.m46199a(), "", false, false, zzape, (zzbkb) null, zzcgv, (zzbjr) null, (zzl) null, zza, zzbep.m43241a(), (zzfdk) null, (zzfdn) null);
        zzchg e = zzchg.m45246e(a);
        a.mo44044e0().mo44085I(new zzcmz(e));
        a.loadUrl(str);
        return e;
    }
}
