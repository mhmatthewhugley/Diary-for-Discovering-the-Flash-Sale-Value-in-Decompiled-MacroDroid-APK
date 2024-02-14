package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhe implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44708a;

    /* renamed from: b */
    public final /* synthetic */ String f44709b;

    /* renamed from: c */
    public final /* synthetic */ ListenerHolder f44710c;

    public /* synthetic */ zzhe(zzih zzih, String str, ListenerHolder listenerHolder) {
        this.f44708a = zzih;
        this.f44709b = str;
        this.f44710c = listenerHolder;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44708a;
        ((zzgy) obj).mo52752z0(new zzif(zzih, (TaskCompletionSource) obj2), this.f44709b, this.f44710c);
    }
}
