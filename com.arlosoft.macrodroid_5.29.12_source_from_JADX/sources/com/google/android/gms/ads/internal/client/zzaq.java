package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzaq extends zzav {

    /* renamed from: b */
    final /* synthetic */ FrameLayout f1831b;

    /* renamed from: c */
    final /* synthetic */ FrameLayout f1832c;

    /* renamed from: d */
    final /* synthetic */ Context f1833d;

    /* renamed from: e */
    final /* synthetic */ zzau f1834e;

    zzaq(zzau zzau, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f1834e = zzau;
        this.f1831b = frameLayout;
        this.f1832c = frameLayout2;
        this.f1833d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1833d, "native_ad_view_delegate");
        return new zzet();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19856E4(ObjectWrapper.m5051g8(this.f1831b), ObjectWrapper.m5051g8(this.f1832c));
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        zzbjc.m43542c(this.f1833d);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            return this.f1834e.f1847d.mo42862c(this.f1833d, this.f1831b, this.f1832c);
        }
        try {
            return zzbmh.m43714Jb(((zzbml) zzcgt.m45236b(this.f1833d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzap.f1830a)).mo42764R5(ObjectWrapper.m5051g8(this.f1833d), ObjectWrapper.m5051g8(this.f1831b), ObjectWrapper.m5051g8(this.f1832c), 223104000));
        } catch (RemoteException | zzcgs | NullPointerException e) {
            this.f1834e.f1851h = zzcaf.m44757c(this.f1833d);
            this.f1834e.f1851h.mo43253b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
