package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzm implements ServiceConnection {

    /* renamed from: a */
    int f2992a = 0;

    /* renamed from: c */
    final Messenger f2993c = new Messenger(new zzf(Looper.getMainLooper(), new zzf(this)));

    /* renamed from: d */
    zzn f2994d;

    /* renamed from: f */
    final Queue<zzp<?>> f2995f = new ArrayDeque();

    /* renamed from: g */
    final SparseArray<zzp<?>> f2996g = new SparseArray<>();

    /* renamed from: o */
    final /* synthetic */ zzs f2997o;

    /* synthetic */ zzm(zzs zzs, zzl zzl) {
        this.f2997o = zzs;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo21100a(int i, @Nullable String str) {
        mo21101b(i, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo21101b(int i, @Nullable String str, @Nullable Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.f2992a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f2992a = 4;
            ConnectionTracker.m4827b().mo21939c(this.f2997o.f3005a, this);
            zzq zzq = new zzq(i, str, th);
            for (zzp c : this.f2995f) {
                c.mo21112c(zzq);
            }
            this.f2995f.clear();
            for (int i3 = 0; i3 < this.f2996g.size(); i3++) {
                this.f2996g.valueAt(i3).mo21112c(zzq);
            }
            this.f2996g.clear();
        } else if (i2 == 3) {
            this.f2992a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21102c() {
        this.f2997o.f3006b.execute(new zzh(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo21103d() {
        if (this.f2992a == 1) {
            mo21100a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo21104e(int i) {
        zzp zzp = this.f2996g.get(i);
        if (zzp != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f2996g.remove(i);
            zzp.mo21112c(new zzq(3, "Timed out waiting for response", (Throwable) null));
            mo21105f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21105f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f2992a     // Catch:{ all -> 0x0030 }
            r1 = 2
            if (r0 != r1) goto L_0x002e
            java.util.Queue<com.google.android.gms.cloudmessaging.zzp<?>> r0 = r2.f2995f     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r0 = r2.f2996g     // Catch:{ all -> 0x0030 }
            int r0 = r0.size()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0030 }
            r0 = 3
            r2.f2992a = r0     // Catch:{ all -> 0x0030 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.m4827b()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.cloudmessaging.zzs r1 = r2.f2997o     // Catch:{ all -> 0x0030 }
            android.content.Context r1 = r1.f3005a     // Catch:{ all -> 0x0030 }
            r0.mo21939c(r1, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzm.mo21105f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo21106g(zzp<?> zzp) {
        int i = this.f2992a;
        if (i == 0) {
            this.f2995f.add(zzp);
            Preconditions.m4493p(this.f2992a == 0);
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f2992a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!ConnectionTracker.m4827b().mo21938a(this.f2997o.f3005a, intent, this, 1)) {
                    mo21100a(0, "Unable to bind to service");
                } else {
                    this.f2997o.f3006b.schedule(new zzi(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo21101b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f2995f.add(zzp);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f2995f.add(zzp);
            mo21102c();
            return true;
        }
        return true;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f2997o.f3006b.execute(new zzj(this, iBinder));
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f2997o.f3006b.execute(new zzg(this));
    }
}
