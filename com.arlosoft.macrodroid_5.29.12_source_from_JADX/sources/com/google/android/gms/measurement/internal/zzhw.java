package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;

@MainThread
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ zzhx f47031a;

    /* synthetic */ zzhw(zzhx zzhx, zzhv zzhv) {
        this.f47031a = zzhx;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfr zzfr;
        try {
            this.f47031a.f46899a.mo55221z().mo55102t().mo55091a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzfr = this.f47031a.f46899a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f47031a.f46899a.mo55196N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f47031a.f46899a.mo55185B().mo55181x(new zzhu(this, z, data, str, queryParameter));
                        zzfr = this.f47031a.f46899a;
                    }
                }
                zzfr = this.f47031a.f46899a;
            }
        } catch (RuntimeException e) {
            this.f47031a.f46899a.mo55221z().mo55098p().mo55092b("Throwable caught in onActivityCreated", e);
            zzfr = this.f47031a.f46899a;
        } catch (Throwable th) {
            this.f47031a.f46899a.mo55193K().mo55412w(activity, bundle);
            throw th;
        }
        zzfr.mo55193K().mo55412w(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f47031a.f46899a.mo55193K().mo55413x(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f47031a.f46899a.mo55193K().mo55414y(activity);
        zzkc M = this.f47031a.f46899a.mo55195M();
        M.f46899a.mo55185B().mo55181x(new zzjv(M, M.f46899a.mo55201a().mo21952c()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzkc M = this.f47031a.f46899a.mo55195M();
        M.f46899a.mo55185B().mo55181x(new zzju(M, M.f46899a.mo55201a().mo21952c()));
        this.f47031a.f46899a.mo55193K().mo55405A(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f47031a.f46899a.mo55193K().mo55406C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
