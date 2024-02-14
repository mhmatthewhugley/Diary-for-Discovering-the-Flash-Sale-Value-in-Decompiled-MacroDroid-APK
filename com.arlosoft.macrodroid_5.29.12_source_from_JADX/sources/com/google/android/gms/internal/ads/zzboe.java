package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzboe extends RemoteCreator {
    @VisibleForTesting
    public zzboe() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbmr ? (zzbmr) queryLocalInterface : new zzbmp(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzbmo mo42863c(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder W1 = ((zzbmr) mo22049b(view.getContext())).mo42765W1(ObjectWrapper.m5051g8(view), ObjectWrapper.m5051g8(hashMap), ObjectWrapper.m5051g8(hashMap2));
            if (W1 == null) {
                return null;
            }
            IInterface queryLocalInterface = W1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(W1);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgp.m45230h("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
