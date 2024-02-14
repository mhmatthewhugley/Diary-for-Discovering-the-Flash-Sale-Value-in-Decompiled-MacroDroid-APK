package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcgt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzk extends RemoteCreator {

    /* renamed from: c */
    private zzcah f1981c;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbt(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzbs mo20145c(Context context, zzq zzq, String str, zzbvk zzbvk, int i) {
        zzbjc.m43542c(context);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27250s8)).booleanValue()) {
            try {
                IBinder Z8 = ((zzbt) zzcgt.m45236b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.f1980a)).mo19962Z8(ObjectWrapper.m5051g8(context), zzq, str, zzbvk, 223104000, i);
                if (Z8 == null) {
                    return null;
                }
                IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(Z8);
            } catch (RemoteException | zzcgs | NullPointerException e) {
                zzcah c = zzcaf.m44757c(context);
                this.f1981c = c;
                c.mo43253b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcgp.m45231i("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder Z82 = ((zzbt) mo22049b(context)).mo19962Z8(ObjectWrapper.m5051g8(context), zzq, str, zzbvk, 223104000, i);
                if (Z82 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = Z82.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof zzbs ? (zzbs) queryLocalInterface2 : new zzbq(Z82);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
                zzcgp.m45225c("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
