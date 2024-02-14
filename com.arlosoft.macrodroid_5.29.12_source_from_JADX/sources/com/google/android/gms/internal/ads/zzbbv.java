package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbbv implements zzbcc {

    /* renamed from: a */
    final /* synthetic */ Activity f26548a;

    /* renamed from: b */
    final /* synthetic */ Bundle f26549b;

    zzbbv(zzbcd zzbcd, Activity activity, Bundle bundle) {
        this.f26548a = activity;
        this.f26549b = bundle;
    }

    /* renamed from: a */
    public final void mo42414a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f26548a, this.f26549b);
    }
}
