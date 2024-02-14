package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzad extends zzl implements zzae {
    public zzad() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo59802y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo59803x0((Bundle) zzm.m70974a(parcel, Bundle.CREATOR));
        return true;
    }
}
