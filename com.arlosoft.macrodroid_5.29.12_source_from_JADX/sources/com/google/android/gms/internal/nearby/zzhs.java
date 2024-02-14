package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhs implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44737a;

    /* renamed from: b */
    public final /* synthetic */ String f44738b;

    /* renamed from: c */
    public final /* synthetic */ Payload f44739c;

    public /* synthetic */ zzhs(zzih zzih, String str, Payload payload) {
        this.f44737a = zzih;
        this.f44738b = str;
        this.f44739c = payload;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44737a;
        String str = this.f44738b;
        Payload payload = this.f44739c;
        ((zzgy) obj).mo52745H0(new zzif(zzih, (TaskCompletionSource) obj2), new String[]{str}, payload, false);
    }
}
