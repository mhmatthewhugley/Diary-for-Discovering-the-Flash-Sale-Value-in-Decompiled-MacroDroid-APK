package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzo {

    /* renamed from: a */
    private final zzn f39428a;

    /* renamed from: b */
    private final Activity f39429b;

    /* renamed from: c */
    private final ConsentDebugSettings f39430c;

    /* renamed from: d */
    private final ConsentRequestParameters f39431d;

    /* synthetic */ zzo(zzn zzn, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzm) {
        this.f39428a = zzn;
        this.f39429b = activity;
        this.f39430c = consentDebugSettings;
        this.f39431d = consentRequestParameters;
    }

    /* renamed from: a */
    static /* synthetic */ zzbu m55980a(zzo zzo) throws zzj {
        List<zzbp> list;
        List<zzbr> list2;
        PackageInfo packageInfo;
        long j;
        Window window;
        View view;
        WindowInsets windowInsets;
        DisplayCutout displayCutout;
        Bundle bundle;
        zzbu zzbu = new zzbu();
        String c = zzo.f39431d.mo60050c();
        String str = null;
        if (TextUtils.isEmpty(c)) {
            try {
                bundle = zzo.f39428a.f39425a.getPackageManager().getApplicationInfo(zzo.f39428a.f39425a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c)) {
                throw new zzj(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzbu.f39383a = c;
        zza a = zzo.f39428a.f39426b.mo48694a();
        if (a != null) {
            zzbu.f39385c = a.f39315a;
            zzbu.f39384b = Boolean.valueOf(a.f39316b);
        }
        if (!zzo.f39430c.mo60043b()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList<>();
            int a2 = zzo.f39430c.mo60042a();
            if (a2 == 1) {
                list.add(zzbp.GEO_OVERRIDE_EEA);
            } else if (a2 == 2) {
                list.add(zzbp.GEO_OVERRIDE_NON_EEA);
            }
            list.add(zzbp.PREVIEWING_DEBUG_MESSAGES);
        }
        zzbu.f39393k = list;
        zzbu.f39389g = zzo.f39428a.f39427c.mo48674a();
        zzbu.f39388f = Boolean.valueOf(zzo.f39431d.mo60049b());
        int i = Build.VERSION.SDK_INT;
        zzbu.f39387e = Locale.getDefault().toLanguageTag();
        zzbq zzbq = new zzbq();
        zzbq.f39372b = Integer.valueOf(i);
        zzbq.f39371a = Build.MODEL;
        zzbq.f39373c = 2;
        zzbu.f39386d = zzbq;
        Configuration configuration = zzo.f39428a.f39425a.getResources().getConfiguration();
        zzo.f39428a.f39425a.getResources().getConfiguration();
        zzbs zzbs = new zzbs();
        zzbs.f39378a = Integer.valueOf(configuration.screenWidthDp);
        zzbs.f39379b = Integer.valueOf(configuration.screenHeightDp);
        zzbs.f39380c = Double.valueOf((double) zzo.f39428a.f39425a.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzo.f39429b;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                view = null;
            } else {
                view = window.getDecorView();
            }
            if (view == null) {
                windowInsets = null;
            } else {
                windowInsets = view.getRootWindowInsets();
            }
            if (windowInsets == null) {
                displayCutout = null;
            } else {
                displayCutout = windowInsets.getDisplayCutout();
            }
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList = new ArrayList();
                for (Rect next : displayCutout.getBoundingRects()) {
                    if (next != null) {
                        zzbr zzbr = new zzbr();
                        zzbr.f39375b = Integer.valueOf(next.left);
                        zzbr.f39376c = Integer.valueOf(next.right);
                        zzbr.f39374a = Integer.valueOf(next.top);
                        zzbr.f39377d = Integer.valueOf(next.bottom);
                        arrayList.add(zzbr);
                    }
                }
                list2 = arrayList;
            }
        }
        zzbs.f39381d = list2;
        zzbu.f39390h = zzbs;
        Application a3 = zzo.f39428a.f39425a;
        try {
            packageInfo = zzo.f39428a.f39425a.getPackageManager().getPackageInfo(a3.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbo zzbo = new zzbo();
        zzbo.f39362a = a3.getPackageName();
        CharSequence applicationLabel = zzo.f39428a.f39425a.getPackageManager().getApplicationLabel(zzo.f39428a.f39425a.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        zzbo.f39363b = str;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            zzbo.f39364c = Long.toString(j);
        }
        zzbu.f39391i = zzbo;
        zzbt zzbt = new zzbt();
        zzbt.f39382a = "2.0.0";
        zzbu.f39392j = zzbt;
        return zzbu;
    }
}
