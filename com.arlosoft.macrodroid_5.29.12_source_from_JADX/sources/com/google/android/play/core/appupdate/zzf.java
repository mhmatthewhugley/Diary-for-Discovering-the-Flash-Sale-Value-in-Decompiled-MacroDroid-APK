package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.tasks.Task;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzf implements AppUpdateManager {

    /* renamed from: a */
    private final zzq f51132a;

    /* renamed from: b */
    private final zzb f51133b;

    /* renamed from: c */
    private final Context f51134c;

    /* renamed from: d */
    private final Handler f51135d = new Handler(Looper.getMainLooper());

    zzf(zzq zzq, zzb zzb, Context context) {
        this.f51132a = zzq;
        this.f51133b = zzb;
        this.f51134c = context;
    }

    /* renamed from: a */
    public final Task<AppUpdateInfo> mo59541a() {
        return this.f51132a.mo59559f(this.f51134c.getPackageName());
    }

    /* renamed from: b */
    public final boolean mo59542b(AppUpdateInfo appUpdateInfo, @AppUpdateType int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        AppUpdateOptions c = AppUpdateOptions.m70405c(i);
        if (activity == null) {
            return false;
        }
        return mo59552c(appUpdateInfo, new zze(this, activity), c, i2);
    }

    /* renamed from: c */
    public final boolean mo59552c(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        if (appUpdateInfo == null || intentSenderForResultStarter == null || appUpdateOptions == null || !appUpdateInfo.mo59536b(appUpdateOptions) || appUpdateInfo.mo59540g()) {
            return false;
        }
        appUpdateInfo.mo59539f();
        intentSenderForResultStarter.mo59551a(appUpdateInfo.mo59538d(appUpdateOptions).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
