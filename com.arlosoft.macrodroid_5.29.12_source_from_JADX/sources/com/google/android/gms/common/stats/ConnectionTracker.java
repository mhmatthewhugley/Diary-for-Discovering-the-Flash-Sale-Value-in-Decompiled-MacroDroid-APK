package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ConnectionTracker {

    /* renamed from: b */
    private static final Object f3909b = new Object();

    /* renamed from: c */
    private static volatile ConnectionTracker f3910c;
    @NonNull
    @VisibleForTesting

    /* renamed from: a */
    public ConcurrentHashMap f3911a = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static ConnectionTracker m4827b() {
        if (f3910c == null) {
            synchronized (f3909b) {
                if (f3910c == null) {
                    f3910c = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = f3910c;
        Preconditions.m4488k(connectionTracker);
        return connectionTracker;
    }

    /* renamed from: e */
    private static void m4828e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m4829f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.m4929a(context).mo21960c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m4830g(serviceConnection)) {
            return m4831h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f3911a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m4831h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f3911a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m4830g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzs);
    }

    /* renamed from: h */
    private static final boolean m4831h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!PlatformVersion.m4906k() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo21938a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return m4829f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo21939c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!m4830g(serviceConnection) || !this.f3911a.containsKey(serviceConnection)) {
            m4828e(context, serviceConnection);
            return;
        }
        try {
            m4828e(context, (ServiceConnection) this.f3911a.get(serviceConnection));
        } finally {
            this.f3911a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo21940d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, Executor executor) {
        return m4829f(context, str, intent, serviceConnection, i, true, executor);
    }
}
