package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzas extends zzav {

    /* renamed from: b */
    final /* synthetic */ View f1836b;

    /* renamed from: c */
    final /* synthetic */ HashMap f1837c;

    /* renamed from: d */
    final /* synthetic */ HashMap f1838d;

    /* renamed from: e */
    final /* synthetic */ zzau f1839e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1836b.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19865lb(ObjectWrapper.m5051g8(this.f1836b), ObjectWrapper.m5051g8(this.f1837c), ObjectWrapper.m5051g8(this.f1838d));
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        zzbjc.m43542c(this.f1836b.getContext());
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            return this.f1839e.f1850g.mo42863c(this.f1836b, this.f1837c, this.f1838d);
        }
        try {
            return zzbmn.m43728Jb(((zzbmr) zzcgt.m45236b(this.f1836b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzar.f1835a)).mo42765W1(ObjectWrapper.m5051g8(this.f1836b), ObjectWrapper.m5051g8(this.f1837c), ObjectWrapper.m5051g8(this.f1838d)));
        } catch (RemoteException | zzcgs | NullPointerException e) {
            this.f1839e.f1851h = zzcaf.m44757c(this.f1836b.getContext());
            this.f1839e.f1851h.mo43253b(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
