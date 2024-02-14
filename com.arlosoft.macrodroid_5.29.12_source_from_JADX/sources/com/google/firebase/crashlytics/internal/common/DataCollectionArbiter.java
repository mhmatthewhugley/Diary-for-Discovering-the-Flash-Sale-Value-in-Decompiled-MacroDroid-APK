package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;

public class DataCollectionArbiter {

    /* renamed from: a */
    private final SharedPreferences f4989a;

    /* renamed from: b */
    private final FirebaseApp f4990b;

    /* renamed from: c */
    private final Object f4991c;

    /* renamed from: d */
    TaskCompletionSource<Void> f4992d = new TaskCompletionSource<>();

    /* renamed from: e */
    boolean f4993e = false;

    /* renamed from: f */
    private boolean f4994f = false;
    @Nullable

    /* renamed from: g */
    private Boolean f4995g;

    /* renamed from: h */
    private final TaskCompletionSource<Void> f4996h = new TaskCompletionSource<>();

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.f4991c = obj;
        Context l = firebaseApp.mo61950l();
        this.f4990b = firebaseApp;
        this.f4989a = CommonUtils.m6595r(l);
        Boolean b = m6733b();
        this.f4995g = b == null ? m6732a(l) : b;
        synchronized (obj) {
            if (mo23043d()) {
                this.f4992d.mo56141e(null);
                this.f4993e = true;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private Boolean m6732a(Context context) {
        Boolean f = m6735f(context);
        if (f == null) {
            this.f4994f = false;
            return null;
        }
        this.f4994f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @Nullable
    /* renamed from: b */
    private Boolean m6733b() {
        if (!this.f4989a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f4994f = false;
        return Boolean.valueOf(this.f4989a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private void m6734e(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f4995g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f4994f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.m6525f().mo22954b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str2, str}));
    }

    @Nullable
    /* renamed from: f */
    private static Boolean m6735f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m6525f().mo22957e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo23042c(boolean z) {
        if (z) {
            this.f4996h.mo56141e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo23043d() {
        boolean z;
        Boolean bool = this.f4995g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f4990b.mo61955v();
        }
        m6734e(z);
        return z;
    }

    /* renamed from: g */
    public Task<Void> mo23044g() {
        Task<Void> a;
        synchronized (this.f4991c) {
            a = this.f4992d.mo56137a();
        }
        return a;
    }

    /* renamed from: h */
    public Task<Void> mo23045h(Executor executor) {
        return Utils.m6811k(executor, this.f4996h.mo56137a(), mo23044g());
    }
}
