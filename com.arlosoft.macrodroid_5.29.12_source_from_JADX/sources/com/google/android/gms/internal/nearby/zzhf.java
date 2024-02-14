package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhf implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44711a;

    /* renamed from: b */
    public final /* synthetic */ String f44712b;

    /* renamed from: c */
    public final /* synthetic */ String f44713c;

    /* renamed from: d */
    public final /* synthetic */ ListenerHolder f44714d;

    public /* synthetic */ zzhf(zzih zzih, String str, String str2, ListenerHolder listenerHolder) {
        this.f44711a = zzih;
        this.f44712b = str;
        this.f44713c = str2;
        this.f44714d = listenerHolder;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44711a;
        ((zzgy) obj).mo52741D0(new zzif(zzih, (TaskCompletionSource) obj2), this.f44712b, this.f44713c, this.f44714d);
    }
}
