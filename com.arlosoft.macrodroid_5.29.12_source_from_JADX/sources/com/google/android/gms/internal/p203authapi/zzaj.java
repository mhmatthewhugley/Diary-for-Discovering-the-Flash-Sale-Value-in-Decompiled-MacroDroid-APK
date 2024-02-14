package com.google.android.gms.internal.p203authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzaj */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class zzaj extends zzc implements zzag {
    public zzaj() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21043y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo48511v9((Status) zzf.m55710a(parcel, Status.CREATOR), (SavePasswordResult) zzf.m55710a(parcel, SavePasswordResult.CREATOR));
        return true;
    }
}
