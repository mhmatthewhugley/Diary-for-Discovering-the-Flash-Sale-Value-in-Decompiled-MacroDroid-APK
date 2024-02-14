package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzex extends zzda {
    @Nullable

    /* renamed from: a */
    private final OnAdMetadataChangedListener f1967a;

    /* renamed from: b */
    public final void mo19988b() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f1967a;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.mo20710a();
        }
    }
}
