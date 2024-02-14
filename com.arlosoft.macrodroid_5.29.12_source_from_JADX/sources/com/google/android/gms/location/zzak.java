package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzak extends zzap {

    /* renamed from: b */
    final /* synthetic */ ListenerHolder f46074b;

    /* renamed from: c */
    final /* synthetic */ FusedLocationProviderClient f46075c;

    zzak(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.f46075c = fusedLocationProviderClient;
        this.f46074b = listenerHolder;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21401a(Object obj, Object obj2) throws RemoteException {
        zzaz zzaz = (zzaz) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (mo54383b()) {
            zzal zzal = new zzal(this.f46075c, taskCompletionSource);
            try {
                ListenerHolder.ListenerKey b = this.f46074b.mo21376b();
                if (b != null) {
                    zzaz.mo50574z0(b, zzal);
                }
            } catch (RuntimeException e) {
                taskCompletionSource.mo56140d(e);
            }
        }
    }
}
