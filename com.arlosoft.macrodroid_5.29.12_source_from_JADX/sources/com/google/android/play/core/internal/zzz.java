package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzz extends zzk {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: R6 */
    public final void mo59908R6(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel y = mo59893y();
        zzm.m70975b(y, bundle);
        zzm.m70975b(y, bundle2);
        mo59892t1(2, y);
    }

    /* renamed from: g0 */
    public final void mo59909g0(Bundle bundle) throws RemoteException {
        Parcel y = mo59893y();
        zzm.m70975b(y, bundle);
        mo59892t1(3, y);
    }

    /* renamed from: v0 */
    public final void mo59910v0(Bundle bundle) throws RemoteException {
        Parcel y = mo59893y();
        zzm.m70975b(y, bundle);
        mo59892t1(4, y);
    }
}
