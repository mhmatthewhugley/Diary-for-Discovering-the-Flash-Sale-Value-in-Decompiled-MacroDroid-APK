package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak implements Handler.Callback {

    /* renamed from: a */
    private final zaj f3710a;

    /* renamed from: c */
    private final ArrayList f3711c = new ArrayList();
    @VisibleForTesting

    /* renamed from: d */
    final ArrayList f3712d = new ArrayList();

    /* renamed from: f */
    private final ArrayList f3713f = new ArrayList();

    /* renamed from: g */
    private volatile boolean f3714g = false;

    /* renamed from: o */
    private final AtomicInteger f3715o = new AtomicInteger(0);

    /* renamed from: p */
    private boolean f3716p = false;

    /* renamed from: s */
    private final Handler f3717s;

    /* renamed from: z */
    private final Object f3718z = new Object();

    public zak(Looper looper, zaj zaj) {
        this.f3710a = zaj;
        this.f3717s = new zau(looper, this);
    }

    /* renamed from: a */
    public final void mo21753a() {
        this.f3714g = false;
        this.f3715o.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo21754b() {
        this.f3714g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21755c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f3717s
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.m4482e(r0, r1)
            android.os.Handler r0 = r5.f3717s
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f3718z
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f3713f     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f3715o     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f3714g     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f3715o     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f3713f     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo21388A1(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zak.mo21755c(com.google.android.gms.common.ConnectionResult):void");
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void mo21756d(@Nullable Bundle bundle) {
        Preconditions.m4482e(this.f3717s, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f3718z) {
            Preconditions.m4493p(!this.f3716p);
            this.f3717s.removeMessages(1);
            this.f3716p = true;
            Preconditions.m4493p(this.f3712d.isEmpty());
            ArrayList arrayList = new ArrayList(this.f3711c);
            int i = this.f3715o.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f3714g || !this.f3710a.mo21448c()) {
                    break;
                } else if (this.f3715o.get() != i) {
                    break;
                } else if (!this.f3712d.contains(connectionCallbacks)) {
                    connectionCallbacks.mo21336y(bundle);
                }
            }
            this.f3712d.clear();
            this.f3716p = false;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final void mo21757e(int i) {
        Preconditions.m4482e(this.f3717s, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f3717s.removeMessages(1);
        synchronized (this.f3718z) {
            this.f3716p = true;
            ArrayList arrayList = new ArrayList(this.f3711c);
            int i2 = this.f3715o.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                if (!this.f3714g) {
                    break;
                } else if (this.f3715o.get() != i2) {
                    break;
                } else if (this.f3711c.contains(connectionCallbacks)) {
                    connectionCallbacks.mo21335t1(i);
                }
            }
            this.f3712d.clear();
            this.f3716p = false;
        }
    }

    /* renamed from: f */
    public final void mo21758f(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.m4488k(connectionCallbacks);
        synchronized (this.f3718z) {
            if (this.f3711c.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + valueOf + " is already registered");
            } else {
                this.f3711c.add(connectionCallbacks);
            }
        }
        if (this.f3710a.mo21448c()) {
            Handler handler = this.f3717s;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    /* renamed from: g */
    public final void mo21759g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m4488k(onConnectionFailedListener);
        synchronized (this.f3718z) {
            if (this.f3713f.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
            } else {
                this.f3713f.add(onConnectionFailedListener);
            }
        }
    }

    /* renamed from: h */
    public final void mo21760h(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m4488k(onConnectionFailedListener);
        synchronized (this.f3718z) {
            if (!this.f3713f.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + valueOf + " not found");
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f3718z) {
                if (this.f3714g && this.f3710a.mo21448c() && this.f3711c.contains(connectionCallbacks)) {
                    connectionCallbacks.mo21336y((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }
}
