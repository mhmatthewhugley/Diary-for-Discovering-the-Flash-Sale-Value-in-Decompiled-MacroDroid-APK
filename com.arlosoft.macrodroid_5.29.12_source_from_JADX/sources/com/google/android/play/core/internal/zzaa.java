package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzaa extends zzk implements zzac {
    zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: C6 */
    public final void mo59801C6(String str, Bundle bundle, zzae zzae) throws RemoteException {
        Parcel y = mo59893y();
        y.writeString(str);
        zzm.m70975b(y, bundle);
        zzm.m70976c(y, zzae);
        mo59892t1(2, y);
    }
}
