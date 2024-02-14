package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzam extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1823b;

    /* renamed from: c */
    final /* synthetic */ String f1824c;

    /* renamed from: d */
    final /* synthetic */ zzbvk f1825d;

    /* renamed from: e */
    final /* synthetic */ zzau f1826e;

    zzam(zzau zzau, Context context, String str, zzbvk zzbvk) {
        this.f1826e = zzau;
        this.f1823b = context;
        this.f1824c = str;
        this.f1825d = zzbvk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1823b, "native_ad");
        return new zzeo();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19867yb(ObjectWrapper.m5051g8(this.f1823b), this.f1824c, this.f1825d, 223104000);
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        zzbjc.m43542c(this.f1823b);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            return this.f1826e.f1845b.mo20144c(this.f1823b, this.f1824c, this.f1825d);
        }
        try {
            IBinder Z8 = ((zzbp) zzcgt.m45236b(this.f1823b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzal.f1822a)).mo19921Z8(ObjectWrapper.m5051g8(this.f1823b), this.f1824c, this.f1825d, 223104000);
            if (Z8 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(Z8);
        } catch (RemoteException | zzcgs | NullPointerException e) {
            this.f1826e.f1851h = zzcaf.m44757c(this.f1823b);
            this.f1826e.f1851h.mo43253b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
