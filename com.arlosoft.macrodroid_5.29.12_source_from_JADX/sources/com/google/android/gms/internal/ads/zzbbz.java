package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbbz implements zzbcc {

    /* renamed from: a */
    final /* synthetic */ Activity f26553a;

    zzbbz(zzbcd zzbcd, Activity activity) {
        this.f26553a = activity;
    }

    /* renamed from: a */
    public final void mo42414a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f26553a);
    }
}
