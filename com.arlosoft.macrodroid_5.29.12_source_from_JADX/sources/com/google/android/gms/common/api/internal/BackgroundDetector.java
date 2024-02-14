package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: g */
    private static final BackgroundDetector f3150g = new BackgroundDetector();

    /* renamed from: a */
    private final AtomicBoolean f3151a = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f3152c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList f3153d = new ArrayList();

    /* renamed from: f */
    private boolean f3154f = false;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo21320a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static BackgroundDetector m3707b() {
        return f3150g;
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m3708c(@NonNull Application application) {
        BackgroundDetector backgroundDetector = f3150g;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f3154f) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f3154f = true;
            }
        }
    }

    /* renamed from: f */
    private final void m3709f(boolean z) {
        synchronized (f3150g) {
            Iterator it = this.f3153d.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).mo21320a(z);
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21307a(@NonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f3150g) {
            this.f3153d.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean mo21308d() {
        return this.f3151a.get();
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean mo21309e(boolean z) {
        if (!this.f3152c.get()) {
            if (!PlatformVersion.m4897b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f3152c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f3151a.set(true);
            }
        }
        return mo21308d();
    }

    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean compareAndSet = this.f3151a.compareAndSet(true, false);
        this.f3152c.set(true);
        if (compareAndSet) {
            m3709f(false);
        }
    }

    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    public final void onActivityPaused(@NonNull Activity activity) {
    }

    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.f3151a.compareAndSet(true, false);
        this.f3152c.set(true);
        if (compareAndSet) {
            m3709f(false);
        }
    }

    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public final void onActivityStarted(@NonNull Activity activity) {
    }

    public final void onActivityStopped(@NonNull Activity activity) {
    }

    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f3151a.compareAndSet(false, true)) {
            this.f3152c.set(true);
            m3709f(true);
        }
    }
}
