package com.github.javiersantos.piracychecker.activities;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\b"}, mo71668d2 = {"Landroid/content/Context;", "", "a", "Landroid/view/View;", "", "enable", "Lja/u;", "b", "library_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: ActivityUtils.kt */
public final class ActivityUtilsKt {
    /* renamed from: a */
    public static final String m26233a(Context context) {
        String str;
        String string;
        CharSequence charSequence;
        CharSequence charSequence2;
        C13706o.m87930g(context, "$this$getAppName");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (charSequence2 = packageManager.getApplicationLabel(context.getApplicationInfo())) == null) {
                charSequence2 = "";
            }
            str = charSequence2.toString();
        } catch (Exception unused) {
            str = "";
        }
        boolean z = true;
        int i = 0;
        if (!C15176v.m93643x(str)) {
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                return str;
            }
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            i = applicationInfo.labelRes;
        }
        if (i == 0) {
            ApplicationInfo applicationInfo2 = context.getApplicationInfo();
            if (applicationInfo2 == null || (charSequence = applicationInfo2.nonLocalizedLabel) == null || (string = charSequence.toString()) == null) {
                return "";
            }
        } else {
            try {
                string = context.getString(i);
            } catch (Exception unused2) {
                return "";
            }
        }
        return string;
    }

    /* renamed from: b */
    public static final void m26234b(View view, boolean z) {
        C13706o.m87930g(view, "$this$setupLightStatusBar");
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }
}
