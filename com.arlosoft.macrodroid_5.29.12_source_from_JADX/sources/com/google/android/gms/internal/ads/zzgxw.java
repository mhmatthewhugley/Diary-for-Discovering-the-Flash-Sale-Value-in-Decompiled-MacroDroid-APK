package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxw {

    /* renamed from: a */
    private static String f37427a;

    /* renamed from: a */
    public static String m53666a(Context context) {
        String str = f37427a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f37427a = null;
        } else if (arrayList.size() == 1) {
            f37427a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null) {
                        if (queryIntentActivities2.size() != 0) {
                            Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ResolveInfo next2 = it.next();
                                IntentFilter intentFilter = next2.filter;
                                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next2.activityInfo != null) {
                                    break;
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    f37427a = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f37427a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f37427a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f37427a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f37427a = "com.google.android.apps.chrome";
            }
        }
        return f37427a;
    }
}
