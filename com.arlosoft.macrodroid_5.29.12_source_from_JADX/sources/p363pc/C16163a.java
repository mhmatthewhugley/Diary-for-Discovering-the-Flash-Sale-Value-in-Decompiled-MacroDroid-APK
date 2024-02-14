package p363pc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: pc.a */
/* compiled from: AutoActivityLifecycleCallback */
public abstract class C16163a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f66399a;

    C16163a(Activity activity) {
        this.f66399a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo78603a();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.f66399a;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            mo78603a();
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
