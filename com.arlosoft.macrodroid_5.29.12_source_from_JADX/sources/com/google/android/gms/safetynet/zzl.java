package com.google.android.gms.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzl extends TaskApiCall<zzx, Void> {
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo20779d(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzi) ((zzx) anyClient).mo21626I()).mo53759Y3(new zzm(this, taskCompletionSource));
    }
}
