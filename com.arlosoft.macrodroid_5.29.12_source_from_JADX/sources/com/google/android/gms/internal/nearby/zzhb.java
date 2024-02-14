package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhb implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44698a;

    /* renamed from: b */
    public final /* synthetic */ String f44699b;

    /* renamed from: c */
    public final /* synthetic */ String f44700c;

    /* renamed from: d */
    public final /* synthetic */ ListenerHolder f44701d;

    /* renamed from: e */
    public final /* synthetic */ AdvertisingOptions f44702e;

    public /* synthetic */ zzhb(zzih zzih, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        this.f44698a = zzih;
        this.f44699b = str;
        this.f44700c = str2;
        this.f44701d = listenerHolder;
        this.f44702e = advertisingOptions;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44698a;
        ((zzgy) obj).mo52746I0(new zzif(zzih, (TaskCompletionSource) obj2), this.f44699b, this.f44700c, this.f44701d, this.f44702e);
    }
}
