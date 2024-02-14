package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

final class WakeLockHolder {

    /* renamed from: a */
    static final long f55067a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f55068b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static WakeLock f55069c;

    WakeLockHolder() {
    }

    @GuardedBy("WakeLockHolder.syncObject")
    /* renamed from: b */
    private static void m77079b(Context context) {
        if (f55069c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f55069c = wakeLock;
            wakeLock.mo56130d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m77080c(@NonNull Intent intent) {
        synchronized (f55068b) {
            if (f55069c != null && m77081d(intent)) {
                m77084g(intent, false);
                f55069c.mo56129c();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static boolean m77081d(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    static void m77083f(Context context, WithinAppServiceConnection withinAppServiceConnection, Intent intent) {
        synchronized (f55068b) {
            m77079b(context);
            boolean d = m77081d(intent);
            m77084g(intent, true);
            if (!d) {
                f55069c.mo56127a(f55067a);
            }
            withinAppServiceConnection.mo63443c(intent).mo23703d(C0271a.f317a, new C11325z(intent));
        }
    }

    /* renamed from: g */
    private static void m77084g(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName m77085h(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.Intent r4) {
        /*
            java.lang.Object r0 = f55068b
            monitor-enter(r0)
            m77079b(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m77081d(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m77084g(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            com.google.android.gms.stats.WakeLock r4 = f55069c     // Catch:{ all -> 0x0022 }
            long r1 = f55067a     // Catch:{ all -> 0x0022 }
            r4.mo56127a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.WakeLockHolder.m77085h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
