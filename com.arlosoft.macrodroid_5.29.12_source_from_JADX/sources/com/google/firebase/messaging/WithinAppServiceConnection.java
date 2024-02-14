package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class WithinAppServiceConnection implements ServiceConnection {

    /* renamed from: a */
    private final Context f55071a;

    /* renamed from: c */
    private final Intent f55072c;

    /* renamed from: d */
    private final ScheduledExecutorService f55073d;

    /* renamed from: f */
    private final Queue<BindRequest> f55074f;
    @Nullable

    /* renamed from: g */
    private WithinAppServiceBinder f55075g;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f55076o;

    static class BindRequest {

        /* renamed from: a */
        final Intent f55077a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f55078b = new TaskCompletionSource<>();

        BindRequest(Intent intent) {
            this.f55077a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m77096f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f55077a.getAction() + " Releasing WakeLock.");
            mo63447d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo63446c(ScheduledExecutorService scheduledExecutorService) {
            mo63448e().mo23703d(scheduledExecutorService, new C11300b0(scheduledExecutorService.schedule(new C11302c0(this), (this.f55077a.getFlags() & 268435456) != 0 ? WakeLockHolder.f55067a : 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo63447d() {
            this.f55078b.mo56141e(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Task<Void> mo63448e() {
            return this.f55078b.mo56137a();
        }
    }

    WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy("this")
    /* renamed from: a */
    private void m77090a() {
        while (!this.f55074f.isEmpty()) {
            this.f55074f.poll().mo63447d();
        }
    }

    /* renamed from: b */
    private synchronized void m77091b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        while (!this.f55074f.isEmpty()) {
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
            WithinAppServiceBinder withinAppServiceBinder = this.f55075g;
            if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                m77092d();
                return;
            }
            boolean isLoggable3 = Log.isLoggable("FirebaseMessaging", 3);
            this.f55075g.mo63442c(this.f55074f.poll());
        }
    }

    @GuardedBy("this")
    /* renamed from: d */
    private void m77092d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f55076o);
        }
        if (!this.f55076o) {
            this.f55076o = true;
            try {
                if (!ConnectionTracker.m4827b().mo21938a(this.f55071a, this.f55072c, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f55076o = false;
                    m77090a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Task<Void> mo63443c(Intent intent) {
        BindRequest bindRequest;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        bindRequest = new BindRequest(intent);
        bindRequest.mo63446c(this.f55073d);
        this.f55074f.add(bindRequest);
        m77091b();
        return bindRequest.mo63448e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceConnected: ");
            sb.append(componentName);
        }
        this.f55076o = false;
        if (!(iBinder instanceof WithinAppServiceBinder)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m77090a();
            return;
        }
        this.f55075g = (WithinAppServiceBinder) iBinder;
        m77091b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceDisconnected: ");
            sb.append(componentName);
        }
        m77091b();
    }

    @VisibleForTesting
    WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f55074f = new ArrayDeque();
        this.f55076o = false;
        Context applicationContext = context.getApplicationContext();
        this.f55071a = applicationContext;
        this.f55072c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f55073d = scheduledExecutorService;
    }
}
