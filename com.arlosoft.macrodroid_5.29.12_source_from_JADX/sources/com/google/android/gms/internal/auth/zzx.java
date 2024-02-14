package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public interface zzx extends IInterface {
    /* renamed from: G5 */
    void mo20777G5(Status status) throws RemoteException;

    /* renamed from: I1 */
    void mo48568I1(Status status, zzt zzt) throws RemoteException;

    /* renamed from: X */
    void mo20786X(byte[] bArr) throws RemoteException;

    /* renamed from: d */
    void mo20788d() throws RemoteException;

    /* renamed from: e0 */
    void mo48569e0(Status status) throws RemoteException;

    /* renamed from: f7 */
    void mo48570f7(Status status, zzl zzl) throws RemoteException;

    /* renamed from: l3 */
    void mo20787l3(DeviceMetaData deviceMetaData) throws RemoteException;
}
