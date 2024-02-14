package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.firebase.events.Publisher;

public class DataCollectionConfigStorage {

    /* renamed from: a */
    private final Context f54927a;

    /* renamed from: b */
    private final SharedPreferences f54928b;

    /* renamed from: c */
    private final Publisher f54929c;

    /* renamed from: d */
    private boolean f54930d = m76776c();

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context a = m76775a(context);
        this.f54927a = a;
        this.f54928b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f54929c = publisher;
    }

    /* renamed from: a */
    private static Context m76775a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: c */
    private boolean m76776c() {
        if (this.f54928b.contains("firebase_data_collection_default_enabled")) {
            return this.f54928b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m76777d();
    }

    /* renamed from: d */
    private boolean m76777d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f54927a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f54927a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo63312b() {
        return this.f54930d;
    }
}
