package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfpz;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbv {

    /* renamed from: a */
    private HandlerThread f2227a = null;

    /* renamed from: b */
    private Handler f2228b = null;

    /* renamed from: c */
    private int f2229c = 0;

    /* renamed from: d */
    private final Object f2230d = new Object();

    /* renamed from: a */
    public final Handler mo20333a() {
        return this.f2228b;
    }

    /* renamed from: b */
    public final Looper mo20334b() {
        Looper looper;
        synchronized (this.f2230d) {
            if (this.f2229c != 0) {
                Preconditions.m4489l(this.f2227a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f2227a == null) {
                zze.m2645k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f2227a = handlerThread;
                handlerThread.start();
                this.f2228b = new zzfpz(this.f2227a.getLooper());
                zze.m2645k("Looper thread started.");
            } else {
                zze.m2645k("Resuming the looper thread");
                this.f2230d.notifyAll();
            }
            this.f2229c++;
            looper = this.f2227a.getLooper();
        }
        return looper;
    }
}
