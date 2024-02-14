package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzjq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzjt f47189a;

    /* renamed from: c */
    public final /* synthetic */ int f47190c;

    /* renamed from: d */
    public final /* synthetic */ zzeh f47191d;

    /* renamed from: f */
    public final /* synthetic */ Intent f47192f;

    public /* synthetic */ zzjq(zzjt zzjt, int i, zzeh zzeh, Intent intent) {
        this.f47189a = zzjt;
        this.f47190c = i;
        this.f47191d = zzeh;
        this.f47192f = intent;
    }

    public final void run() {
        this.f47189a.mo55476c(this.f47190c, this.f47191d, this.f47192f);
    }
}
