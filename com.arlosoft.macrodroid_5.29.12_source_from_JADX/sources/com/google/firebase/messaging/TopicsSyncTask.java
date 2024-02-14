package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

class TopicsSyncTask implements Runnable {

    /* renamed from: o */
    private static final Object f55057o = new Object();
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: p */
    private static Boolean f55058p;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: s */
    private static Boolean f55059s;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f55060a;

    /* renamed from: c */
    private final Metadata f55061c;

    /* renamed from: d */
    private final PowerManager.WakeLock f55062d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TopicsSubscriber f55063f;

    /* renamed from: g */
    private final long f55064g;

    @VisibleForTesting
    class ConnectivityChangeReceiver extends BroadcastReceiver {
        @GuardedBy("this")
        @Nullable

        /* renamed from: a */
        private TopicsSyncTask f55065a;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.f55065a = topicsSyncTask;
        }

        /* renamed from: a */
        public void mo63440a() {
            boolean unused = TopicsSyncTask.m77076j();
            TopicsSyncTask.this.f55060a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.f55065a;
            if (topicsSyncTask != null) {
                if (topicsSyncTask.m77075i()) {
                    boolean b = TopicsSyncTask.m77076j();
                    this.f55065a.f55063f.mo63431m(this.f55065a, 0);
                    context.unregisterReceiver(this);
                    this.f55065a = null;
                }
            }
        }
    }

    TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.f55063f = topicsSubscriber;
        this.f55060a = context;
        this.f55064g = j;
        this.f55061c = metadata;
        this.f55062d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m77071e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m77072f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f55057o) {
            Boolean bool = f55059s;
            if (bool == null) {
                z = m77073g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f55059s = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m77073g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            m77071e(str);
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m77074h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f55057o) {
            Boolean bool = f55058p;
            if (bool == null) {
                z = m77073g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f55058p = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m77075i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f55060a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m77076j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m77074h(this.f55060a)) {
            this.f55062d.acquire(Constants.f54960a);
        }
        try {
            this.f55063f.mo63433o(true);
            if (!this.f55061c.mo63371g()) {
                this.f55063f.mo63433o(false);
                if (m77074h(this.f55060a)) {
                    try {
                        this.f55062d.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m77072f(this.f55060a) || m77075i()) {
                if (this.f55063f.mo63436s()) {
                    this.f55063f.mo63433o(false);
                } else {
                    this.f55063f.mo63437t(this.f55064g);
                }
                if (m77074h(this.f55060a)) {
                    try {
                        wakeLock = this.f55062d;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new ConnectivityChangeReceiver(this).mo63440a();
                if (m77074h(this.f55060a)) {
                    try {
                        this.f55062d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            this.f55063f.mo63433o(false);
            if (m77074h(this.f55060a)) {
                wakeLock = this.f55062d;
            }
        } catch (Throwable th) {
            if (m77074h(this.f55060a)) {
                try {
                    this.f55062d.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
