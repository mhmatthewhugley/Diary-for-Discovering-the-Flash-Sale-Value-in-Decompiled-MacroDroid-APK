package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* renamed from: a */
    private final CrashlyticsOriginAnalyticsEventLogger f4854a;

    /* renamed from: b */
    private final int f4855b;

    /* renamed from: c */
    private final TimeUnit f4856c;

    /* renamed from: d */
    private final Object f4857d = new Object();

    /* renamed from: e */
    private CountDownLatch f4858e;

    /* renamed from: f */
    private boolean f4859f = false;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.f4854a = crashlyticsOriginAnalyticsEventLogger;
        this.f4855b = i;
        this.f4856c = timeUnit;
    }

    /* renamed from: E1 */
    public void mo22964E1(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f4858e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.google.firebase.crashlytics.internal.Logger.m6525f().mo22956d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22940a(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4857d
            monitor-enter(r0)
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo22960i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f4858e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f4859f = r1     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger r1 = r5.f4854a     // Catch:{ all -> 0x006d }
            r1.mo22940a(r6, r7)     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo22960i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f4858e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f4855b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f4856c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f4859f = r2     // Catch:{ InterruptedException -> 0x005f }
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo22960i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo22962k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.m6525f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo22956d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f4858e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger.mo22940a(java.lang.String, android.os.Bundle):void");
    }
}
