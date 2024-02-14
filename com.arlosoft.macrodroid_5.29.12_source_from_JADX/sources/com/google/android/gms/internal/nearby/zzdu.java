package com.google.android.gms.internal.nearby;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public interface zzdu extends IInterface {
    /* renamed from: z6 */
    void mo52527z6(Status status, @Nullable PackageConfiguration packageConfiguration) throws RemoteException;
}