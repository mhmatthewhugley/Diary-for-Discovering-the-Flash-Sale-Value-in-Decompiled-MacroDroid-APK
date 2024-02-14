package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfry {

    /* renamed from: o */
    private static final Map f36315o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f36316a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzfrn f36317b;

    /* renamed from: c */
    private final String f36318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List f36319d = new ArrayList();
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: e */
    private final Set f36320e = new HashSet();

    /* renamed from: f */
    private final Object f36321f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f36322g;

    /* renamed from: h */
    private final Intent f36323h;

    /* renamed from: i */
    private final WeakReference f36324i;

    /* renamed from: j */
    private final IBinder.DeathRecipient f36325j = new zzfrq(this);
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: k */
    private final AtomicInteger f36326k = new AtomicInteger(0);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: l */
    public ServiceConnection f36327l;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: m */
    public IInterface f36328m;

    /* renamed from: n */
    private final zzfqv f36329n;

    public zzfry(Context context, zzfrn zzfrn, String str, Intent intent, zzfqv zzfqv, @Nullable zzfrt zzfrt, byte[] bArr) {
        this.f36316a = context;
        this.f36317b = zzfrn;
        this.f36318c = "OverlayDisplayService";
        this.f36323h = intent;
        this.f36329n = zzfqv;
        this.f36324i = new WeakReference((Object) null);
    }

    /* renamed from: h */
    public static /* synthetic */ void m50894h(zzfry zzfry) {
        zzfry.f36317b.mo46143d("reportBinderDeath", new Object[0]);
        zzfrt zzfrt = (zzfrt) zzfry.f36324i.get();
        if (zzfrt != null) {
            zzfry.f36317b.mo46143d("calling onBinderDied", new Object[0]);
            zzfrt.zza();
        } else {
            zzfry.f36317b.mo46143d("%s : Binder has died.", zzfry.f36318c);
            for (zzfro c : zzfry.f36319d) {
                c.mo46146c(zzfry.m50902s());
            }
            zzfry.f36319d.clear();
        }
        zzfry.m50903t();
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m50899m(zzfry zzfry, zzfro zzfro) {
        if (zzfry.f36328m == null && !zzfry.f36322g) {
            zzfry.f36317b.mo46143d("Initiate binding to the service.", new Object[0]);
            zzfry.f36319d.add(zzfro);
            zzfrx zzfrx = new zzfrx(zzfry, (zzfrw) null);
            zzfry.f36327l = zzfrx;
            zzfry.f36322g = true;
            if (!zzfry.f36316a.bindService(zzfry.f36323h, zzfrx, 1)) {
                zzfry.f36317b.mo46143d("Failed to bind to the service.", new Object[0]);
                zzfry.f36322g = false;
                for (zzfro c : zzfry.f36319d) {
                    c.mo46146c(new zzfrz());
                }
                zzfry.f36319d.clear();
            }
        } else if (zzfry.f36322g) {
            zzfry.f36317b.mo46143d("Waiting to bind to the service.", new Object[0]);
            zzfry.f36319d.add(zzfro);
        } else {
            zzfro.run();
        }
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m50900n(zzfry zzfry) {
        zzfry.f36317b.mo46143d("linkToDeath", new Object[0]);
        try {
            zzfry.f36328m.asBinder().linkToDeath(zzfry.f36325j, 0);
        } catch (RemoteException e) {
            zzfry.f36317b.mo46142c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m50901o(zzfry zzfry) {
        zzfry.f36317b.mo46143d("unlinkToDeath", new Object[0]);
        zzfry.f36328m.asBinder().unlinkToDeath(zzfry.f36325j, 0);
    }

    /* renamed from: s */
    private final RemoteException m50902s() {
        return new RemoteException(String.valueOf(this.f36318c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m50903t() {
        synchronized (this.f36321f) {
            for (TaskCompletionSource d : this.f36320e) {
                d.mo56140d(m50902s());
            }
            this.f36320e.clear();
        }
    }

    /* renamed from: c */
    public final Handler mo46152c() {
        Handler handler;
        Map map = f36315o;
        synchronized (map) {
            if (!map.containsKey(this.f36318c)) {
                HandlerThread handlerThread = new HandlerThread(this.f36318c, 10);
                handlerThread.start();
                map.put(this.f36318c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f36318c);
        }
        return handler;
    }

    @Nullable
    /* renamed from: e */
    public final IInterface mo46153e() {
        return this.f36328m;
    }

    /* renamed from: p */
    public final void mo46154p(zzfro zzfro, @Nullable TaskCompletionSource taskCompletionSource) {
        synchronized (this.f36321f) {
            this.f36320e.add(taskCompletionSource);
            taskCompletionSource.mo56137a().mo23702c(new zzfrp(this, taskCompletionSource));
        }
        synchronized (this.f36321f) {
            if (this.f36326k.getAndIncrement() > 0) {
                this.f36317b.mo46140a("Already connected to the service.", new Object[0]);
            }
        }
        mo46152c().post(new zzfrr(this, zzfro.mo46145b(), zzfro));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo46155q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f36321f) {
            this.f36320e.remove(taskCompletionSource);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        mo46152c().post(new com.google.android.gms.internal.ads.zzfrs(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46156r() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f36321f
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f36326k     // Catch:{ all -> 0x002e }
            int r1 = r1.get()     // Catch:{ all -> 0x002e }
            if (r1 <= 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f36326k     // Catch:{ all -> 0x002e }
            int r1 = r1.decrementAndGet()     // Catch:{ all -> 0x002e }
            if (r1 > 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            com.google.android.gms.internal.ads.zzfrn r1 = r4.f36317b     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "Leaving the connection open for other ongoing calls."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x002e }
            r1.mo46143d(r2, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzfrs r0 = new com.google.android.gms.internal.ads.zzfrs
            r0.<init>(r4)
            android.os.Handler r1 = r4.mo46152c()
            r1.post(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfry.mo46156r():void");
    }
}
