package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public interface zzr extends IInterface {
    /* renamed from: N7 */
    void mo21024N7(Status status) throws RemoteException;

    /* renamed from: d7 */
    void mo21025d7(Status status) throws RemoteException;

    /* renamed from: z8 */
    void mo21026z8(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
