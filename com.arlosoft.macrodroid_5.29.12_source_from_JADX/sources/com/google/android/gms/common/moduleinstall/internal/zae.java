package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface zae extends IInterface {
    /* renamed from: D9 */
    void mo21864D9(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    /* renamed from: I9 */
    void mo21865I9(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;

    /* renamed from: Oa */
    void mo21866Oa(Status status) throws RemoteException;

    /* renamed from: X2 */
    void mo21867X2(Status status, @Nullable ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;
}
