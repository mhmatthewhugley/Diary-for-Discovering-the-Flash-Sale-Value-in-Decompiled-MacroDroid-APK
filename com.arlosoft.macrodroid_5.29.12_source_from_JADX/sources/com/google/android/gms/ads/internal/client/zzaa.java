package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzaa extends zzav {

    /* renamed from: b */
    final /* synthetic */ Activity f1791b;

    /* renamed from: c */
    final /* synthetic */ zzau f1792c;

    zzaa(zzau zzau, Activity activity) {
        this.f1792c = zzau;
        this.f1791b = activity;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1791b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19855D1(ObjectWrapper.m5051g8(this.f1791b));
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        zzbjc.m43542c(this.f1791b);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            return this.f1792c.f1849f.mo43230c(this.f1791b);
        }
        try {
            return zzbzb.m44712Jb(((zzbzf) zzcgt.m45236b(this.f1791b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzz.f2049a)).zze(ObjectWrapper.m5051g8(this.f1791b)));
        } catch (RemoteException | zzcgs | NullPointerException e) {
            this.f1792c.f1851h = zzcaf.m44757c(this.f1791b.getApplicationContext());
            this.f1792c.f1851h.mo43253b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
