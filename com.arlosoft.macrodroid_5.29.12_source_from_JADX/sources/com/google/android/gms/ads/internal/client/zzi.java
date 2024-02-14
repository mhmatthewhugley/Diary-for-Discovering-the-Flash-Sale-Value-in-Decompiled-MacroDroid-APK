package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbp ? (zzbp) queryLocalInterface : new zzbp(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzbo mo20144c(Context context, String str, zzbvk zzbvk) {
        try {
            IBinder Z8 = ((zzbp) mo22049b(context)).mo19921Z8(ObjectWrapper.m5051g8(context), str, zzbvk, 223104000);
            if (Z8 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(Z8);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgp.m45230h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
