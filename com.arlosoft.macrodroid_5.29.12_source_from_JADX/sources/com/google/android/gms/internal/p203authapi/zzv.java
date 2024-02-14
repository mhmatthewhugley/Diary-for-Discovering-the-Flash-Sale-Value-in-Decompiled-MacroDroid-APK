package com.google.android.gms.internal.p203authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzv */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface zzv extends IInterface {
    /* renamed from: O3 */
    void mo48520O3(Status status, Credential credential) throws RemoteException;

    /* renamed from: e1 */
    void mo48521e1(Status status) throws RemoteException;

    /* renamed from: ub */
    void mo48522ub(Status status, String str) throws RemoteException;
}
