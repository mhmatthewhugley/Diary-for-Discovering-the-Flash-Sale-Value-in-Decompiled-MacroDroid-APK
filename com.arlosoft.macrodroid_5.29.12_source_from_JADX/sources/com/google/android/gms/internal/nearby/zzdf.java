package com.google.android.gms.internal.nearby;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public interface zzdf extends IInterface {
    /* renamed from: f3 */
    void mo52533f3(Status status, @Nullable ExposureSummary exposureSummary) throws RemoteException;
}
