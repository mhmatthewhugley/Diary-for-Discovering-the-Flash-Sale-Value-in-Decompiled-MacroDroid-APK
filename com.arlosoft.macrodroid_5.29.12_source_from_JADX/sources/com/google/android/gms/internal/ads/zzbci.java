package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbci implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A */
    private long f26582A;
    @Nullable

    /* renamed from: a */
    private Activity f26583a;

    /* renamed from: c */
    private Context f26584c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f26585d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f26586f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f26587g = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final List f26588o = new ArrayList();

    /* renamed from: p */
    private final List f26589p = new ArrayList();

    /* renamed from: s */
    private Runnable f26590s;

    /* renamed from: z */
    private boolean f26591z = false;

    zzbci() {
    }

    /* renamed from: k */
    private final void m43115k(Activity activity) {
        synchronized (this.f26585d) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f26583a = activity;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo42447a() {
        return this.f26583a;
    }

    @Nullable
    /* renamed from: b */
    public final Context mo42448b() {
        return this.f26584c;
    }

    /* renamed from: f */
    public final void mo42449f(zzbcj zzbcj) {
        synchronized (this.f26585d) {
            this.f26588o.add(zzbcj);
        }
    }

    /* renamed from: g */
    public final void mo42450g(Application application, Context context) {
        if (!this.f26591z) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m43115k((Activity) context);
            }
            this.f26584c = application;
            this.f26582A = ((Long) zzay.m1924c().mo42663b(zzbjc.f26927M0)).longValue();
            this.f26591z = true;
        }
    }

    /* renamed from: h */
    public final void mo42451h(zzbcj zzbcj) {
        synchronized (this.f26585d) {
            this.f26588o.remove(zzbcj);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f26585d) {
            Activity activity2 = this.f26583a;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f26583a = null;
                }
                Iterator it = this.f26589p.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbcx) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzt.m2904q().mo43503t(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcgp.m45227e("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m43115k(activity);
        synchronized (this.f26585d) {
            for (zzbcx zzb : this.f26589p) {
                try {
                    zzb.zzb();
                } catch (Exception e) {
                    zzt.m2904q().mo43503t(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcgp.m45227e("", e);
                }
            }
        }
        this.f26587g = true;
        Runnable runnable = this.f26590s;
        if (runnable != null) {
            zzs.f2304i.removeCallbacks(runnable);
        }
        zzfpz zzfpz = zzs.f2304i;
        zzbch zzbch = new zzbch(this);
        this.f26590s = zzbch;
        zzfpz.postDelayed(zzbch, this.f26582A);
    }

    public final void onActivityResumed(Activity activity) {
        m43115k(activity);
        this.f26587g = false;
        boolean z = !this.f26586f;
        this.f26586f = true;
        Runnable runnable = this.f26590s;
        if (runnable != null) {
            zzs.f2304i.removeCallbacks(runnable);
        }
        synchronized (this.f26585d) {
            for (zzbcx a : this.f26589p) {
                try {
                    a.mo42487a();
                } catch (Exception e) {
                    zzt.m2904q().mo43503t(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcgp.m45227e("", e);
                }
            }
            if (z) {
                for (zzbcj O : this.f26588o) {
                    try {
                        O.mo42459O(true);
                    } catch (Exception e2) {
                        zzcgp.m45227e("", e2);
                    }
                }
            } else {
                zzcgp.m45224b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m43115k(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
