package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbod extends RemoteCreator {
    @VisibleForTesting
    public zzbod() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbml ? (zzbml) queryLocalInterface : new zzbmj(iBinder);
    }

    @Nullable
    /* renamed from: c */
    public final zzbmi mo42862c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder R5 = ((zzbml) mo22049b(context)).mo42764R5(ObjectWrapper.m5051g8(context), ObjectWrapper.m5051g8(frameLayout), ObjectWrapper.m5051g8(frameLayout2), 223104000);
            if (R5 == null) {
                return null;
            }
            IInterface queryLocalInterface = R5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbmi ? (zzbmi) queryLocalInterface : new zzbmg(R5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgp.m45230h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
