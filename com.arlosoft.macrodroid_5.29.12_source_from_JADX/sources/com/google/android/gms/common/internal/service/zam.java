package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zam implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ TelemetryData f3691a;

    public /* synthetic */ zam(TelemetryData telemetryData) {
        this.f3691a = telemetryData;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        TelemetryData telemetryData = this.f3691a;
        int i = zao.f3695n;
        ((zai) ((zap) obj).mo21626I()).mo21744Z8(telemetryData);
        ((TaskCompletionSource) obj2).mo56139c(null);
    }
}
