package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapr implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25266a;

    /* renamed from: b */
    final /* synthetic */ Bundle f25267b;

    zzapr(zzapu zzapu, Activity activity, Bundle bundle) {
        this.f25266a = activity;
        this.f25267b = bundle;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f25266a, this.f25267b);
    }
}
