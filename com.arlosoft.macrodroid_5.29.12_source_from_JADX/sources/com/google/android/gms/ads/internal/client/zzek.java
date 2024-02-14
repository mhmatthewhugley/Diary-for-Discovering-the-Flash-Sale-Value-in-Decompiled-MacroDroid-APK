package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzek extends RemoteCreator {
    public zzek() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzcn ? (zzcn) queryLocalInterface : new zzcn(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzcm mo20097c(Context context) {
        try {
            IBinder Z8 = ((zzcn) mo22049b(context)).mo19982Z8(ObjectWrapper.m5051g8(context), 223104000);
            if (Z8 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(Z8);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgp.m45230h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
