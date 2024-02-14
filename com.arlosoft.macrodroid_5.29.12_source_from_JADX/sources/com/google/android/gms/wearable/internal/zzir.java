package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzir implements ListenerHolder.Notifier {

    /* renamed from: a */
    final /* synthetic */ zzfx f48405a;

    /* renamed from: b */
    final /* synthetic */ zzev f48406b;

    zzir(zzfx zzfx, zzev zzev, byte[] bArr) {
        this.f48405a = zzfx;
        this.f48406b = zzev;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        Task<byte[]> b = ((MessageClient.RpcService) obj).mo56213b(this.f48405a.mo56453l2(), this.f48405a.getPath(), this.f48405a.getData());
        if (b == null) {
            zzit.m67161Mb(this.f48406b, false, (byte[]) null);
        } else {
            b.mo23702c(new zziq(this.f48406b, (byte[]) null));
        }
    }

    /* renamed from: b */
    public final void mo21338b() {
        Log.e("WearableListenerStub", "Failed to notify listener, sending null response");
        zzit.m67161Mb(this.f48406b, false, (byte[]) null);
    }
}
