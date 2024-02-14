package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapm implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25260a;

    /* renamed from: b */
    final /* synthetic */ Bundle f25261b;

    zzapm(zzapu zzapu, Activity activity, Bundle bundle) {
        this.f25260a = activity;
        this.f25261b = bundle;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f25260a, this.f25261b);
    }
}
