package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

public interface zzg extends IInterface {
    /* renamed from: Q0 */
    void mo53745Q0(Status status) throws RemoteException;

    /* renamed from: U3 */
    void mo53746U3(Status status, zzf zzf) throws RemoteException;

    /* renamed from: W0 */
    void mo53747W0(Status status, boolean z) throws RemoteException;

    /* renamed from: Z0 */
    void mo53748Z0(Status status, boolean z) throws RemoteException;

    /* renamed from: j3 */
    void mo53749j3(Status status, SafeBrowsingData safeBrowsingData) throws RemoteException;

    /* renamed from: o */
    void mo53750o(String str) throws RemoteException;

    /* renamed from: p5 */
    void mo53751p5(Status status, zzd zzd) throws RemoteException;

    /* renamed from: u7 */
    void mo53752u7(Status status, zza zza) throws RemoteException;

    /* renamed from: v5 */
    void mo53753v5(Status status, zzh zzh) throws RemoteException;
}
