package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* renamed from: k */
    private static final Api.ClientKey f3692k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder f3693l;

    /* renamed from: m */
    private static final Api f3694m;

    /* renamed from: n */
    public static final /* synthetic */ int f3695n = 0;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f3692k = clientKey;
        zan zan = new zan();
        f3693l = zan;
        f3694m = new Api("ClientTelemetry.API", zan, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, f3694m, telemetryLoggingOptions, GoogleApi.Settings.f3103c);
    }

    /* renamed from: a */
    public final Task<Void> mo21735a(TelemetryData telemetryData) {
        TaskApiCall.Builder c = TaskApiCall.m3866c();
        c.mo21408d(zaf.f39251a);
        c.mo21407c(false);
        c.mo21406b(new zam(telemetryData));
        return mo21228n(c.mo21405a());
    }
}
