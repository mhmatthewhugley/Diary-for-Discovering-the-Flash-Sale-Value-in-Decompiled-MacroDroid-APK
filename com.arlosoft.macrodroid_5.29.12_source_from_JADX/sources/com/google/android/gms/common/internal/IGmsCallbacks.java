package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface IGmsCallbacks extends IInterface {
    /* renamed from: R9 */
    void mo21712R9(int i, IBinder iBinder, zzj zzj) throws RemoteException;

    /* renamed from: S3 */
    void mo21713S3(int i, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    /* renamed from: t0 */
    void mo21714t0(int i, @NonNull Bundle bundle) throws RemoteException;
}
