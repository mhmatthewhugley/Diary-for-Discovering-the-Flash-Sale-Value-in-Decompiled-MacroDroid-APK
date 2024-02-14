package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbka {
    @Nullable

    /* renamed from: a */
    private CustomTabsSession f27371a;
    @Nullable

    /* renamed from: b */
    private CustomTabsClient f27372b;
    @Nullable

    /* renamed from: c */
    private CustomTabsServiceConnection f27373c;
    @Nullable

    /* renamed from: d */
    private zzbjy f27374d;

    /* renamed from: g */
    public static boolean m43635g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgxw.m53666a(context));
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final CustomTabsSession mo42720a() {
        CustomTabsClient customTabsClient = this.f27372b;
        if (customTabsClient == null) {
            this.f27371a = null;
        } else if (this.f27371a == null) {
            this.f27371a = customTabsClient.newSession((CustomTabsCallback) null);
        }
        return this.f27371a;
    }

    /* renamed from: b */
    public final void mo42721b(Activity activity) {
        String a;
        if (this.f27372b == null && (a = zzgxw.m53666a(activity)) != null) {
            zzgxx zzgxx = new zzgxx(this, (byte[]) null);
            this.f27373c = zzgxx;
            CustomTabsClient.bindCustomTabsService(activity, a, zzgxx);
        }
    }

    /* renamed from: c */
    public final void mo42722c(CustomTabsClient customTabsClient) {
        this.f27372b = customTabsClient;
        customTabsClient.warmup(0);
        zzbjy zzbjy = this.f27374d;
        if (zzbjy != null) {
            zzbjy.zza();
        }
    }

    /* renamed from: d */
    public final void mo42723d() {
        this.f27372b = null;
        this.f27371a = null;
    }

    /* renamed from: e */
    public final void mo42724e(zzbjy zzbjy) {
        this.f27374d = zzbjy;
    }

    /* renamed from: f */
    public final void mo42725f(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.f27373c;
        if (customTabsServiceConnection != null) {
            activity.unbindService(customTabsServiceConnection);
            this.f27372b = null;
            this.f27371a = null;
            this.f27373c = null;
        }
    }
}
