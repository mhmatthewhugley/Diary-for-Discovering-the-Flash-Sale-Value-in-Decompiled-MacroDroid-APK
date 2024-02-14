package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapq implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25265a;

    zzapq(zzapu zzapu, Activity activity) {
        this.f25265a = activity;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f25265a);
    }
}
