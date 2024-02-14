package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfyd extends zzfyw implements Runnable {

    /* renamed from: A */
    public static final /* synthetic */ int f36576A = 0;

    /* renamed from: s */
    zzfzp f36577s;

    /* renamed from: z */
    Object f36578z;

    zzfyd(zzfzp zzfzp, Object obj) {
        Objects.requireNonNull(zzfzp);
        this.f36577s = zzfzp;
        Objects.requireNonNull(obj);
        this.f36578z = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract Object mo46586D(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract void mo46587E(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        String str;
        zzfzp zzfzp = this.f36577s;
        Object obj = this.f36578z;
        String d = super.mo46078d();
        if (zzfzp != null) {
            str = "inputFuture=[" + zzfzp + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (d != null) {
            return str.concat(d);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo46079e() {
        mo46563u(this.f36577s);
        this.f36577s = null;
        this.f36578z = null;
    }

    public final void run() {
        zzfzp zzfzp = this.f36577s;
        Object obj = this.f36578z;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzfzp == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f36577s = null;
            if (zzfzp.isCancelled()) {
                mo46564v(zzfzp);
                return;
            }
            try {
                try {
                    Object D = mo46586D(obj, zzfzg.m51421p(zzfzp));
                    this.f36578z = null;
                    mo46587E(D);
                } catch (Throwable th) {
                    this.f36578z = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo46081g(e.getCause());
            } catch (RuntimeException e2) {
                mo46081g(e2);
            } catch (Error e3) {
                mo46081g(e3);
            }
        }
    }
}
