package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfyl extends zzfxx.zzi {

    /* renamed from: A */
    private static final zzfyi f36590A;

    /* renamed from: B */
    private static final Logger f36591B = Logger.getLogger(zzfyl.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile Set<Throwable> f36592s = null;

    /* renamed from: z */
    private volatile int f36593z;

    static {
        Throwable th;
        zzfyi zzfyi;
        try {
            zzfyi = new zzfyj(AtomicReferenceFieldUpdater.newUpdater(zzfyl.class, Set.class, "s"), AtomicIntegerFieldUpdater.newUpdater(zzfyl.class, "z"));
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            zzfyi = new zzfyk((zzfyh) null);
        }
        f36590A = zzfyi;
        if (th != null) {
            f36591B.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfyl(int i) {
        this.f36593z = i;
    }

    /* renamed from: C */
    static /* synthetic */ int m51363C(zzfyl zzfyl) {
        int i = zzfyl.f36593z - 1;
        zzfyl.f36593z = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final int mo46600D() {
        return f36590A.mo46598a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final Set mo46601G() {
        Set<Throwable> set = this.f36592s;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        mo46591I(newSetFromMap);
        f36590A.mo46599b(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.f36592s;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo46602H() {
        this.f36592s = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract void mo46591I(Set set);
}
