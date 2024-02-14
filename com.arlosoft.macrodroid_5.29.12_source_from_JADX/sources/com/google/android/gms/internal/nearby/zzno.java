package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.internal.zzq;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzno extends zzq {

    /* renamed from: a */
    private final ListenerHolder f44973a;

    /* renamed from: c */
    private boolean f44974c = false;

    public zzno(ListenerHolder listenerHolder) {
        this.f44973a = listenerHolder;
    }

    /* renamed from: e1 */
    public final synchronized void mo53032e1(Status status) throws RemoteException {
        if (!this.f44974c) {
            this.f44973a.mo21377c(new zznn(this, status));
            this.f44974c = true;
            return;
        }
        String valueOf = String.valueOf(status);
        Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(valueOf), new Exception());
    }
}
