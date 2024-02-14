package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzao extends zzav {

    /* renamed from: b */
    final /* synthetic */ Context f1828b;

    /* renamed from: c */
    final /* synthetic */ zzau f1829c;

    zzao(zzau zzau, Context context) {
        this.f1829c = zzau;
        this.f1828b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19871a() {
        zzau.m1900r(this.f1828b, "mobile_ads_settings");
        return new zzes();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo19872b(zzcc zzcc) throws RemoteException {
        return zzcc.mo19861L0(ObjectWrapper.m5051g8(this.f1828b), 223104000);
    }

    @Nullable
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo19873c() throws RemoteException {
        zzbjc.m43542c(this.f1828b);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            return this.f1829c.f1846c.mo20097c(this.f1828b);
        }
        try {
            IBinder Z8 = ((zzcn) zzcgt.m45236b(this.f1828b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzan.f1827a)).mo19982Z8(ObjectWrapper.m5051g8(this.f1828b), 223104000);
            if (Z8 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(Z8);
        } catch (RemoteException | zzcgs | NullPointerException e) {
            this.f1829c.f1851h = zzcaf.m44757c(this.f1828b);
            this.f1829c.f1851h.mo43253b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
