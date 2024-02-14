package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapp implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25264a;

    zzapp(zzapu zzapu, Activity activity) {
        this.f25264a = activity;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f25264a);
    }
}
