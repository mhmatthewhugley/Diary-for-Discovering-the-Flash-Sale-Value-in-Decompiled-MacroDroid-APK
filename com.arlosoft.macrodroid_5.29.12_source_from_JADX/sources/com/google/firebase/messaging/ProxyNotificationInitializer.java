package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

final class ProxyNotificationInitializer {
    private ProxyNotificationInitializer() {
    }

    /* renamed from: b */
    private static boolean m76985b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @WorkerThread
    /* renamed from: c */
    static void m76986c(Context context) {
        if (!ProxyNotificationPreferences.m76991b(context)) {
            m76988e(C0271a.f317a, context, m76989f(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m76987d(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            if (!m76985b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            ProxyNotificationPreferences.m76992c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            taskCompletionSource.mo56141e(null);
        } finally {
            taskCompletionSource.mo56141e(null);
        }
    }

    /* renamed from: e */
    static Task<Void> m76988e(Executor executor, Context context, boolean z) {
        if (!PlatformVersion.m4906k()) {
            return Tasks.m66667f(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new C11321v(context, z, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: f */
    private static boolean m76989f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
