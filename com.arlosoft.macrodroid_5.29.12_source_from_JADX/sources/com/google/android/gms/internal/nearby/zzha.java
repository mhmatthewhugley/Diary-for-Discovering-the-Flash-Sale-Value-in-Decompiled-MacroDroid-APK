package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzha implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44693a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f44694b;

    /* renamed from: c */
    public final /* synthetic */ String f44695c;

    /* renamed from: d */
    public final /* synthetic */ ListenerHolder f44696d;

    /* renamed from: e */
    public final /* synthetic */ ConnectionOptions f44697e;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44693a;
        ((zzgy) obj).mo52744G0(new zzif(zzih, (TaskCompletionSource) obj2), this.f44694b, this.f44695c, this.f44696d, this.f44697e);
    }
}
