package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m74412e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m74413f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m74414g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m74415h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m74416i(installerPackageName) : "";
    }

    /* renamed from: i */
    private static String m74416i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.m77159c());
        arrayList.add(DefaultHeartBeatController.m76544h());
        arrayList.add(LibraryVersionComponent.m77170b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.m77170b("fire-core", "20.2.0"));
        arrayList.add(LibraryVersionComponent.m77170b("device-name", m74416i(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.m77170b("device-model", m74416i(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.m77170b("device-brand", m74416i(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.m77171c("android-target-sdk", C11055d.f53890a));
        arrayList.add(LibraryVersionComponent.m77171c("android-min-sdk", C11056e.f53891a));
        arrayList.add(LibraryVersionComponent.m77171c("android-platform", C11057f.f53892a));
        arrayList.add(LibraryVersionComponent.m77171c("android-installer", C11054c.f53889a));
        String a = KotlinDetector.m77165a();
        if (a != null) {
            arrayList.add(LibraryVersionComponent.m77170b("kotlin", a));
        }
        return arrayList;
    }
}
