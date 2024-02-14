package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaps implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25268a;

    zzaps(zzapu zzapu, Activity activity) {
        this.f25268a = activity;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f25268a);
    }
}
