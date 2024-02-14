package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzu extends zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo55965d();
        return true;
    }
}
