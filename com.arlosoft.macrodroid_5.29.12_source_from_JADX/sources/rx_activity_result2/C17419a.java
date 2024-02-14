package rx_activity_result2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import p216ba.C11114e;
import p216ba.C11116g;
import p414v9.C16735i;

/* renamed from: rx_activity_result2.a */
/* compiled from: ActivitiesLifecycleCallbacks */
class C17419a {

    /* renamed from: a */
    final Application f69178a;

    /* renamed from: b */
    volatile Activity f69179b;

    /* renamed from: c */
    Application.ActivityLifecycleCallbacks f69180c;

    /* renamed from: d */
    volatile boolean f69181d = false;

    /* renamed from: rx_activity_result2.a$a */
    /* compiled from: ActivitiesLifecycleCallbacks */
    class C17420a implements Application.ActivityLifecycleCallbacks {
        C17420a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C17419a.this.f69179b = activity;
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C17419a.this.f69179b = null;
        }

        public void onActivityResumed(Activity activity) {
            C17419a.this.f69179b = activity;
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: rx_activity_result2.a$b */
    /* compiled from: ActivitiesLifecycleCallbacks */
    class C17421b implements C11114e<Object, Activity> {
        C17421b() {
        }

        /* renamed from: a */
        public Activity apply(Object obj) throws Exception {
            return (Activity) obj;
        }
    }

    /* renamed from: rx_activity_result2.a$c */
    /* compiled from: ActivitiesLifecycleCallbacks */
    class C17422c implements C11116g<Object> {
        C17422c() {
        }

        public boolean test(Object obj) throws Exception {
            return obj instanceof Activity;
        }
    }

    /* renamed from: rx_activity_result2.a$d */
    /* compiled from: ActivitiesLifecycleCallbacks */
    class C17423d implements C11116g<Object> {
        C17423d() {
        }

        public boolean test(Object obj) throws Exception {
            boolean z = !C17419a.this.f69181d;
            if (obj instanceof Activity) {
                C17419a.this.f69181d = true;
            }
            return z;
        }
    }

    /* renamed from: rx_activity_result2.a$e */
    /* compiled from: ActivitiesLifecycleCallbacks */
    class C17424e implements C11114e<Long, Object> {
        C17424e() {
        }

        /* renamed from: a */
        public Object apply(Long l) throws Exception {
            if (C17419a.this.f69179b == null) {
                return 0;
            }
            return C17419a.this.f69179b;
        }
    }

    public C17419a(Application application) {
        this.f69178a = application;
        m101185c();
    }

    /* renamed from: c */
    private void m101185c() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f69180c;
        if (activityLifecycleCallbacks != null) {
            this.f69178a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        C17420a aVar = new C17420a();
        this.f69180c = aVar;
        this.f69178a.registerActivityLifecycleCallbacks(aVar);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public Activity mo80751a() {
        return this.f69179b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C16735i<Activity> mo80752b() {
        this.f69181d = false;
        return C16735i.m99340D(50, 50, TimeUnit.MILLISECONDS).mo79678G(new C17424e()).mo79691W(new C17423d()).mo79711t(new C17422c()).mo79678G(new C17421b());
    }
}
