package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzg;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzam {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Logger f4596h = new Logger("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final FirebaseApp f4597a;
    @VisibleForTesting

    /* renamed from: b */
    volatile long f4598b;
    @VisibleForTesting

    /* renamed from: c */
    volatile long f4599c;
    @VisibleForTesting

    /* renamed from: d */
    final long f4600d = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    @VisibleForTesting

    /* renamed from: e */
    final HandlerThread f4601e;
    @VisibleForTesting

    /* renamed from: f */
    final Handler f4602f;
    @VisibleForTesting

    /* renamed from: g */
    final Runnable f4603g;

    public zzam(FirebaseApp firebaseApp) {
        f4596h.mo21843g("Initializing TokenRefresher", new Object[0]);
        FirebaseApp firebaseApp2 = (FirebaseApp) Preconditions.m4488k(firebaseApp);
        this.f4597a = firebaseApp2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f4601e = handlerThread;
        handlerThread.start();
        this.f4602f = new zzg(handlerThread.getLooper());
        this.f4603g = new zzal(this, firebaseApp2.mo61951o());
    }

    /* renamed from: b */
    public final void mo22746b() {
        this.f4602f.removeCallbacks(this.f4603g);
    }

    /* renamed from: c */
    public final void mo22747c() {
        Logger logger = f4596h;
        long j = this.f4598b;
        long j2 = this.f4600d;
        logger.mo21843g("Scheduling refresh for " + (j - j2), new Object[0]);
        mo22746b();
        this.f4599c = Math.max((this.f4598b - DefaultClock.m4871d().mo21950a()) - this.f4600d, 0) / 1000;
        this.f4602f.postDelayed(this.f4603g, this.f4599c * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22748d() {
        long j;
        int i = (int) this.f4599c;
        if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
            long j2 = this.f4599c;
            j = j2 + j2;
        } else {
            j = i != 960 ? 30 : 960;
        }
        this.f4599c = j;
        this.f4598b = DefaultClock.m4871d().mo21950a() + (this.f4599c * 1000);
        Logger logger = f4596h;
        long j3 = this.f4598b;
        logger.mo21843g("Scheduling refresh for " + j3, new Object[0]);
        this.f4602f.postDelayed(this.f4603g, this.f4599c * 1000);
    }
}
