package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zad extends zaa {

    /* renamed from: a */
    private final BaseImplementation.ResultHolder f3690a;

    public zad(BaseImplementation.ResultHolder resultHolder) {
        this.f3690a = resultHolder;
    }

    /* renamed from: K8 */
    public final void mo21742K8(int i) throws RemoteException {
        this.f3690a.mo21038a(new Status(i));
    }
}
