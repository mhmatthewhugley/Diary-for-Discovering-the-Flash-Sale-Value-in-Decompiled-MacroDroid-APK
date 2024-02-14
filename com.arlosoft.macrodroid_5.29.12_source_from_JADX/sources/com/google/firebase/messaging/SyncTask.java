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
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class SyncTask implements Runnable {

    /* renamed from: a */
    private final long f55035a;

    /* renamed from: c */
    private final PowerManager.WakeLock f55036c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final FirebaseMessaging f55037d;
    @VisibleForTesting

    /* renamed from: f */
    ExecutorService f55038f = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    @VisibleForTesting
    static class ConnectivityChangeReceiver extends BroadcastReceiver {
        @Nullable

        /* renamed from: a */
        private SyncTask f55039a;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.f55039a = syncTask;
        }

        /* renamed from: a */
        public void mo63418a() {
            SyncTask.m77029c();
            this.f55039a.mo63414b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.f55039a;
            if (syncTask != null && syncTask.mo63415d()) {
                SyncTask.m77029c();
                this.f55039a.f55037d.mo63349l(this.f55039a, 0);
                this.f55039a.mo63414b().unregisterReceiver(this);
                this.f55039a = null;
            }
        }
    }

    @VisibleForTesting
    public SyncTask(FirebaseMessaging firebaseMessaging, long j) {
        this.f55037d = firebaseMessaging;
        this.f55035a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo63414b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f55036c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m77029c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo63414b() {
        return this.f55037d.mo63350m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo63415d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo63414b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public boolean mo63416e() throws IOException {
        try {
            if (this.f55037d.mo63348k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            if (GmsRpc.m76906g(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (ServiceStarter.m77003b().mo63403e(mo63414b())) {
            this.f55036c.acquire();
        }
        try {
            this.f55037d.mo63343E(true);
            if (!this.f55037d.mo63354v()) {
                this.f55037d.mo63343E(false);
                if (ServiceStarter.m77003b().mo63403e(mo63414b())) {
                    this.f55036c.release();
                }
            } else if (!ServiceStarter.m77003b().mo63402d(mo63414b()) || mo63415d()) {
                if (mo63416e()) {
                    this.f55037d.mo63343E(false);
                } else {
                    this.f55037d.mo63345I(this.f55035a);
                }
                if (!ServiceStarter.m77003b().mo63403e(mo63414b())) {
                    return;
                }
                this.f55036c.release();
            } else {
                new ConnectivityChangeReceiver(this).mo63418a();
                if (ServiceStarter.m77003b().mo63403e(mo63414b())) {
                    this.f55036c.release();
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.f55037d.mo63343E(false);
            if (!ServiceStarter.m77003b().mo63403e(mo63414b())) {
            }
        } catch (Throwable th) {
            if (ServiceStarter.m77003b().mo63403e(mo63414b())) {
                this.f55036c.release();
            }
            throw th;
        }
    }
}
