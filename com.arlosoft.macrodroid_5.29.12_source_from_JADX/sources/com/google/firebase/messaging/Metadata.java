package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

class Metadata {

    /* renamed from: a */
    private final Context f55008a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f55009b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f55010c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f55011d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f55012e = 0;

    Metadata(Context context) {
        this.f55008a = context;
    }

    /* renamed from: c */
    static String m76948c(FirebaseApp firebaseApp) {
        String d = firebaseApp.mo61952p().mo61963d();
        if (d != null) {
            return d;
        }
        String c = firebaseApp.mo61952p().mo61962c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m76949f(String str) {
        try {
            return this.f55008a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m76950h() {
        PackageInfo f = m76949f(this.f55008a.getPackageName());
        if (f != null) {
            this.f55009b = Integer.toString(f.versionCode);
            this.f55010c = f.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo63367a() {
        if (this.f55009b == null) {
            m76950h();
        }
        return this.f55009b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String mo63368b() {
        if (this.f55010c == null) {
            m76950h();
        }
        return this.f55010c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int mo63369d() {
        PackageInfo f;
        if (this.f55011d == 0 && (f = m76949f("com.google.android.gms")) != null) {
            this.f55011d = f.versionCode;
        }
        return this.f55011d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int mo63370e() {
        int i = this.f55012e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f55008a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.m4904i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f55012e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.m4904i()) {
                this.f55012e = 2;
            } else {
                this.f55012e = 1;
            }
            return this.f55012e;
        }
        this.f55012e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo63371g() {
        return mo63370e() != 0;
    }
}
