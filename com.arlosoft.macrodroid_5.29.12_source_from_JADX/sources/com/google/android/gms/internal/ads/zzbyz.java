package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyz extends RemoteCreator {
    public zzbyz() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbzf ? (zzbzf) queryLocalInterface : new zzbzd(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzbzc mo43230c(Activity activity) {
        try {
            IBinder zze = ((zzbzf) mo22049b(activity)).zze(ObjectWrapper.m5051g8(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbzc ? (zzbzc) queryLocalInterface : new zzbza(zze);
        } catch (RemoteException e) {
            zzcgp.m45230h("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcgp.m45230h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
