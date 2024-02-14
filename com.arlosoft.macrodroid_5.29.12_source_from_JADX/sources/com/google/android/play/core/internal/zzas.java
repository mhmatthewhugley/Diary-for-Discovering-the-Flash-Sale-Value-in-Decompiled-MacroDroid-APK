package com.google.android.play.core.internal;

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
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.zzi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzas {

    /* renamed from: o */
    private static final Map f51671o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f51672a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzag f51673b;

    /* renamed from: c */
    private final String f51674c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List f51675d = new ArrayList();
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: e */
    private final Set f51676e = new HashSet();

    /* renamed from: f */
    private final Object f51677f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f51678g;

    /* renamed from: h */
    private final Intent f51679h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzan f51680i;

    /* renamed from: j */
    private final WeakReference f51681j;

    /* renamed from: k */
    private final IBinder.DeathRecipient f51682k = new zzai(this);
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: l */
    private final AtomicInteger f51683l = new AtomicInteger(0);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: m */
    public ServiceConnection f51684m;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: n */
    public IInterface f51685n;

    public zzas(Context context, zzag zzag, String str, Intent intent, zzan zzan, @Nullable zzam zzam) {
        this.f51672a = context;
        this.f51673b = zzag;
        this.f51674c = str;
        this.f51679h = intent;
        this.f51680i = zzan;
        this.f51681j = new WeakReference((Object) null);
    }

    /* renamed from: i */
    public static /* synthetic */ void m70814i(zzas zzas) {
        zzas.f51673b.mo59808d("reportBinderDeath", new Object[0]);
        zzam zzam = (zzam) zzas.f51681j.get();
        if (zzam != null) {
            zzas.f51673b.mo59808d("calling onBinderDied", new Object[0]);
            zzam.zza();
        } else {
            zzas.f51673b.mo59808d("%s : Binder has died.", zzas.f51674c);
            for (zzah c : zzas.f51675d) {
                c.mo59811c(zzas.m70822t());
            }
            zzas.f51675d.clear();
        }
        zzas.m70823u();
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m70819n(zzas zzas, zzah zzah) {
        if (zzas.f51685n == null && !zzas.f51678g) {
            zzas.f51673b.mo59808d("Initiate binding to the service.", new Object[0]);
            zzas.f51675d.add(zzah);
            zzar zzar = new zzar(zzas, (zzaq) null);
            zzas.f51684m = zzar;
            zzas.f51678g = true;
            if (!zzas.f51672a.bindService(zzas.f51679h, zzar, 1)) {
                zzas.f51673b.mo59808d("Failed to bind to the service.", new Object[0]);
                zzas.f51678g = false;
                for (zzah c : zzas.f51675d) {
                    c.mo59811c(new zzat());
                }
                zzas.f51675d.clear();
            }
        } else if (zzas.f51678g) {
            zzas.f51673b.mo59808d("Waiting to bind to the service.", new Object[0]);
            zzas.f51675d.add(zzah);
        } else {
            zzah.run();
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m70820o(zzas zzas) {
        zzas.f51673b.mo59808d("linkToDeath", new Object[0]);
        try {
            zzas.f51685n.asBinder().linkToDeath(zzas.f51682k, 0);
        } catch (RemoteException e) {
            zzas.f51673b.mo59807c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m70821p(zzas zzas) {
        zzas.f51673b.mo59808d("unlinkToDeath", new Object[0]);
        zzas.f51685n.asBinder().unlinkToDeath(zzas.f51682k, 0);
    }

    /* renamed from: t */
    private final RemoteException m70822t() {
        return new RemoteException(String.valueOf(this.f51674c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m70823u() {
        synchronized (this.f51677f) {
            for (zzi d : this.f51676e) {
                d.mo60033d(m70822t());
            }
            this.f51676e.clear();
        }
    }

    /* renamed from: c */
    public final Handler mo59818c() {
        Handler handler;
        Map map = f51671o;
        synchronized (map) {
            if (!map.containsKey(this.f51674c)) {
                HandlerThread handlerThread = new HandlerThread(this.f51674c, 10);
                handlerThread.start();
                map.put(this.f51674c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f51674c);
        }
        return handler;
    }

    @Nullable
    /* renamed from: e */
    public final IInterface mo59819e() {
        return this.f51685n;
    }

    /* renamed from: q */
    public final void mo59820q(zzah zzah, @Nullable zzi zzi) {
        synchronized (this.f51677f) {
            this.f51676e.add(zzi);
            zzi.mo60030a().mo60015a(new zzaj(this, zzi));
        }
        synchronized (this.f51677f) {
            if (this.f51683l.getAndIncrement() > 0) {
                this.f51673b.mo59805a("Already connected to the service.", new Object[0]);
            }
        }
        mo59818c().post(new zzak(this, zzah.mo59810b(), zzah));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo59821r(zzi zzi, Task task) {
        synchronized (this.f51677f) {
            this.f51676e.remove(zzi);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo59818c().post(new com.google.android.play.core.internal.zzal(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59822s(com.google.android.play.core.tasks.zzi r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f51677f
            monitor-enter(r0)
            java.util.Set r1 = r3.f51676e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f51677f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f51683l     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f51683l     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            com.google.android.play.core.internal.zzag r0 = r3.f51673b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.mo59808d(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            com.google.android.play.core.internal.zzal r4 = new com.google.android.play.core.internal.zzal
            r4.<init>(r3)
            android.os.Handler r0 = r3.mo59818c()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.zzas.mo59822s(com.google.android.play.core.tasks.zzi):void");
    }
}
