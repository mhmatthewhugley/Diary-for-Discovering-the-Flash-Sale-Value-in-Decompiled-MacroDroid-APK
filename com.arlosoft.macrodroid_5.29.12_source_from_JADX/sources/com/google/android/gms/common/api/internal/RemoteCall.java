package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface RemoteCall<T, U> {
    @KeepForSdk
    /* renamed from: a */
    void mo21401a(@NonNull T t, @NonNull U u) throws RemoteException;
}
