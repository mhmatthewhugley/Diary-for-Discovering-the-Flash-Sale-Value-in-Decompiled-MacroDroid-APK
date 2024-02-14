package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;
import com.google.android.gms.internal.nearby.zzc;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzae zzae = (zzae) zzc.m62336a(parcel, zzae.CREATOR);
            zzc.m62338c(parcel);
        } else if (i == 2) {
            zzae zzae2 = (zzae) zzc.m62336a(parcel, zzae.CREATOR);
            zzc.m62338c(parcel);
        } else if (i != 4) {
            return false;
        } else {
            ArrayList<Update> createTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
            zzc.m62338c(parcel);
            mo53031b1(createTypedArrayList);
        }
        return true;
    }
}
