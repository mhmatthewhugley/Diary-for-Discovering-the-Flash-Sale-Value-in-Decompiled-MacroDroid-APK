package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zziq implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ zzev f48404a;

    public /* synthetic */ zziq(zzev zzev, byte[] bArr) {
        this.f48404a = zzev;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        zzev zzev = this.f48404a;
        if (task.mo23719t()) {
            zzit.m67161Mb(zzev, true, (byte[]) task.mo23715p());
            return;
        }
        Log.e("WearableListenerStub", "Failed to resolve future, sending null response", task.mo23714o());
        zzit.m67161Mb(zzev, false, (byte[]) null);
    }
}
