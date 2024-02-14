package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;

final class ProxyNotificationPreferences {
    private ProxyNotificationPreferences() {
    }

    /* renamed from: a */
    private static SharedPreferences m76990a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @WorkerThread
    /* renamed from: b */
    static boolean m76991b(Context context) {
        return m76990a(context).getBoolean("proxy_notification_initialized", false);
    }

    @WorkerThread
    /* renamed from: c */
    static void m76992c(Context context, boolean z) {
        SharedPreferences.Editor edit = m76990a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
