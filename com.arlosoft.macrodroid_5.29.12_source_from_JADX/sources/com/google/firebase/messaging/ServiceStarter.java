package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
public class ServiceStarter {

    /* renamed from: e */
    private static ServiceStarter f55019e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: a */
    private String f55020a = null;

    /* renamed from: b */
    private Boolean f55021b = null;

    /* renamed from: c */
    private Boolean f55022c = null;

    /* renamed from: d */
    private final Queue<Intent> f55023d = new ArrayDeque();

    private ServiceStarter() {
    }

    /* renamed from: a */
    private int m77002a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m77004f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Restricting intent to a specific service: ");
                sb.append(f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo63403e(context)) {
                componentName = WakeLockHolder.m77085h(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
            return 402;
        }
    }

    /* renamed from: b */
    static synchronized ServiceStarter m77003b() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (f55019e == null) {
                f55019e = new ServiceStarter();
            }
            serviceStarter = f55019e;
        }
        return serviceStarter;
    }

    @Nullable
    /* renamed from: f */
    private synchronized String m77004f(Context context, Intent intent) {
        String str = this.f55020a;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str2 = serviceInfo.name;
                    if (str2 != null) {
                        if (str2.startsWith(".")) {
                            this.f55020a = context.getPackageName() + serviceInfo.name;
                        } else {
                            this.f55020a = serviceInfo.name;
                        }
                        return this.f55020a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    @MainThread
    /* renamed from: c */
    public Intent mo63401c() {
        return this.f55023d.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo63402d(Context context) {
        if (this.f55022c == null) {
            this.f55022c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f55021b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f55022c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo63403e(Context context) {
        if (this.f55021b == null) {
            this.f55021b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f55021b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f55021b.booleanValue();
    }

    @MainThread
    /* renamed from: g */
    public int mo63404g(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        this.f55023d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m77002a(context, intent2);
    }
}
