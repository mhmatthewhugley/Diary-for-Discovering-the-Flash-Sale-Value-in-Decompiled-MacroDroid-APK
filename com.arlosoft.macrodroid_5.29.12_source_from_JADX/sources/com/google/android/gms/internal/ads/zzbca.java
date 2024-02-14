package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbca implements zzbcc {

    /* renamed from: a */
    final /* synthetic */ Activity f26554a;

    /* renamed from: b */
    final /* synthetic */ Bundle f26555b;

    zzbca(zzbcd zzbcd, Activity activity, Bundle bundle) {
        this.f26554a = activity;
        this.f26555b = bundle;
    }

    /* renamed from: a */
    public final void mo42414a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f26554a, this.f26555b);
    }
}
