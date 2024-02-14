package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

public class AppData {

    /* renamed from: a */
    public final String f4866a;

    /* renamed from: b */
    public final String f4867b;

    /* renamed from: c */
    public final String f4868c;

    /* renamed from: d */
    public final String f4869d;

    /* renamed from: e */
    public final String f4870e;

    /* renamed from: f */
    public final String f4871f;

    /* renamed from: g */
    public final DevelopmentPlatformProvider f4872g;

    public AppData(String str, String str2, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.f4866a = str;
        this.f4867b = str2;
        this.f4868c = str3;
        this.f4869d = str4;
        this.f4870e = str5;
        this.f4871f = str6;
        this.f4872g = developmentPlatformProvider;
    }

    /* renamed from: a */
    public static AppData m6556a(Context context, IdManager idManager, String str, String str2, DevelopmentPlatformProvider developmentPlatformProvider) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = idManager.mo23051g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, g, packageName, num, str3, developmentPlatformProvider);
    }
}
