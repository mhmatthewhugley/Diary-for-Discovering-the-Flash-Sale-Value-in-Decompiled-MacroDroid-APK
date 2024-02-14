package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzflh implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private static final zzflh f36050f = new zzflh();

    /* renamed from: a */
    private boolean f36051a;

    /* renamed from: c */
    private boolean f36052c;

    /* renamed from: d */
    private zzflm f36053d;

    private zzflh() {
    }

    /* renamed from: a */
    public static zzflh m50465a() {
        return f36050f;
    }

    /* renamed from: e */
    private final void m50466e() {
        boolean z = this.f36052c;
        for (zzfkv g : zzflg.m50458a().mo45893c()) {
            zzfls g2 = g.mo45880g();
            if (g2.mo45941k()) {
                zzfll.m50478a().mo45915b(g2.mo45931a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: f */
    private final void m50467f(boolean z) {
        if (this.f36052c != z) {
            this.f36052c = z;
            if (this.f36051a) {
                m50466e();
                if (this.f36053d == null) {
                    return;
                }
                if (!z) {
                    zzfmi.m50552d().mo45968i();
                } else {
                    zzfmi.m50552d().mo45967h();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo45898b() {
        this.f36051a = true;
        this.f36052c = false;
        m50466e();
    }

    /* renamed from: c */
    public final void mo45899c() {
        this.f36051a = false;
        this.f36052c = false;
        this.f36053d = null;
    }

    /* renamed from: d */
    public final void mo45900d(zzflm zzflm) {
        this.f36053d = zzflm;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m50467f(false);
    }

    public final void onActivityStopped(Activity activity) {
        View f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (zzfkv zzfkv : zzflg.m50458a().mo45892b()) {
            if (zzfkv.mo45883j() && (f = zzfkv.mo45879f()) != null && f.hasWindowFocus()) {
                z2 = false;
            }
        }
        if (i == 100 || !z2) {
            z = false;
        }
        m50467f(z);
    }
}
