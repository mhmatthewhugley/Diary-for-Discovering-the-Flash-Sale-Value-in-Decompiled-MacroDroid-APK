package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhh implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44720a;

    /* renamed from: b */
    public final /* synthetic */ List f44721b;

    /* renamed from: c */
    public final /* synthetic */ Payload f44722c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44720a;
        List list = this.f44721b;
        ((zzgy) obj).mo52745H0(new zzif(zzih, (TaskCompletionSource) obj2), (String[]) list.toArray(new String[0]), this.f44722c, false);
    }
}
