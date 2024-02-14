package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class zzee implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ zzef f41425a;

    zzee(zzef zzef) {
        this.f41425a = zzef;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f41425a.m59627m(new zzdx(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f41425a.m59627m(new zzed(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f41425a.m59627m(new zzea(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f41425a.m59627m(new zzdz(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbz zzbz = new zzbz();
        this.f41425a.m59627m(new zzec(this, activity, zzbz));
        Bundle t1 = zzbz.mo50780t1(50);
        if (t1 != null) {
            bundle.putAll(t1);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f41425a.m59627m(new zzdy(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f41425a.m59627m(new zzeb(this, activity));
    }
}
