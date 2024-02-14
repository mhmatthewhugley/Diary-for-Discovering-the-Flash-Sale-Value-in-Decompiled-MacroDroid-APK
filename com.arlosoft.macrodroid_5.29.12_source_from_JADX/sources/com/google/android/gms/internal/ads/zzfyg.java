package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfyg extends zzfyl {

    /* renamed from: F */
    private static final Logger f36584F = Logger.getLogger(zzfyg.class.getName());

    /* renamed from: C */
    private zzfvi f36585C;

    /* renamed from: D */
    private final boolean f36586D;

    /* renamed from: E */
    private final boolean f36587E;

    zzfyg(zzfvi zzfvi, boolean z, boolean z2) {
        super(zzfvi.size());
        this.f36585C = zzfvi;
        this.f36586D = z;
        this.f36587E = z2;
    }

    /* renamed from: J */
    private final void m51343J(int i, Future future) {
        try {
            mo46592O(i, zzfzg.m51421p(future));
        } catch (ExecutionException e) {
            m51345L(e.getCause());
        } catch (Error | RuntimeException e2) {
            m51345L(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void mo46596S(zzfvi zzfvi) {
        int D = mo46600D();
        int i = 0;
        zzfsx.m50944i(D >= 0, "Less than 0 remaining futures");
        if (D == 0) {
            if (zzfvi != null) {
                zzfxm i2 = zzfvi.iterator();
                while (i2.hasNext()) {
                    Future future = (Future) i2.next();
                    if (!future.isCancelled()) {
                        m51343J(i, future);
                    }
                    i++;
                }
            }
            mo46602H();
            mo46593P();
            mo46597T(2);
        }
    }

    /* renamed from: L */
    private final void m51345L(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f36586D && !mo46081g(th) && m51347N(mo46601G(), th)) {
            m51346M(th);
        } else if (th instanceof Error) {
            m51346M(th);
        }
    }

    /* renamed from: M */
    private static void m51346M(Throwable th) {
        f36584F.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* renamed from: N */
    private static boolean m51347N(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo46591I(Set set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable a = mo46555a();
            a.getClass();
            m51347N(set, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract void mo46592O(int i, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract void mo46593P();

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo46594Q() {
        zzfvi zzfvi = this.f36585C;
        zzfvi.getClass();
        if (zzfvi.isEmpty()) {
            mo46593P();
        } else if (this.f36586D) {
            zzfxm i = this.f36585C.iterator();
            int i2 = 0;
            while (i.hasNext()) {
                zzfzp zzfzp = (zzfzp) i.next();
                zzfzp.mo43580q(new zzfye(this, zzfzp, i2), zzfyu.INSTANCE);
                i2++;
            }
        } else {
            zzfyf zzfyf = new zzfyf(this, this.f36587E ? this.f36585C : null);
            zzfxm i3 = this.f36585C.iterator();
            while (i3.hasNext()) {
                ((zzfzp) i3.next()).mo43580q(zzfyf, zzfyu.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final /* synthetic */ void mo46595R(zzfzp zzfzp, int i) {
        try {
            if (zzfzp.isCancelled()) {
                this.f36585C = null;
                cancel(false);
            } else {
                m51343J(i, zzfzp);
            }
        } finally {
            mo46596S((zzfvi) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo46597T(int i) {
        this.f36585C = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        zzfvi zzfvi = this.f36585C;
        if (zzfvi == null) {
            return super.mo46078d();
        }
        zzfvi.toString();
        return "futures=".concat(zzfvi.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo46079e() {
        zzfvi zzfvi = this.f36585C;
        boolean z = true;
        mo46597T(1);
        boolean isCancelled = isCancelled();
        if (zzfvi == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean w = mo46565w();
            zzfxm i = zzfvi.iterator();
            while (i.hasNext()) {
                ((Future) i.next()).cancel(w);
            }
        }
    }
}
