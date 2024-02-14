package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zacg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NonGmsServiceBrokerClient f3410a;

    /* renamed from: c */
    public final /* synthetic */ IBinder f3411c;

    public /* synthetic */ zacg(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.f3410a = nonGmsServiceBrokerClient;
        this.f3411c = iBinder;
    }

    public final void run() {
        this.f3410a.mo21386v(this.f3411c);
    }
}
