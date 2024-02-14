package com.google.android.gms.internal.p203authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zzai */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface zzai extends IInterface {
    /* renamed from: b4 */
    void mo48512b4(IStatusCallback iStatusCallback, String str) throws RemoteException;

    /* renamed from: f8 */
    void mo48513f8(zzae zzae, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException;

    /* renamed from: rb */
    void mo48514rb(zzaa zzaa, BeginSignInRequest beginSignInRequest) throws RemoteException;
}
