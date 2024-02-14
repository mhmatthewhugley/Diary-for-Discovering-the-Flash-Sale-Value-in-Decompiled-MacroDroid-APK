package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzci;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzm<ResultT> extends Task<ResultT> {

    /* renamed from: a */
    private final Object f51977a = new Object();

    /* renamed from: b */
    private final zzh f51978b = new zzh();
    @GuardedBy("lock")

    /* renamed from: c */
    private boolean f51979c;
    @GuardedBy("lock")

    /* renamed from: d */
    private Object f51980d;
    @GuardedBy("lock")

    /* renamed from: e */
    private Exception f51981e;

    zzm() {
    }

    @GuardedBy("lock")
    /* renamed from: n */
    private final void m71271n() {
        zzci.m70930b(this.f51979c, "Task is not yet complete");
    }

    @GuardedBy("lock")
    /* renamed from: o */
    private final void m71272o() {
        zzci.m70930b(!this.f51979c, "Task is already complete");
    }

    /* renamed from: p */
    private final void m71273p() {
        synchronized (this.f51977a) {
            if (this.f51979c) {
                this.f51978b.mo60029b(this);
            }
        }
    }

    /* renamed from: a */
    public final Task<ResultT> mo60015a(OnCompleteListener<ResultT> onCompleteListener) {
        this.f51978b.mo60028a(new zzb(TaskExecutors.f51955a, onCompleteListener));
        m71273p();
        return this;
    }

    /* renamed from: b */
    public final Task<ResultT> mo60016b(OnFailureListener onFailureListener) {
        mo60017c(TaskExecutors.f51955a, onFailureListener);
        return this;
    }

    /* renamed from: c */
    public final Task<ResultT> mo60017c(Executor executor, OnFailureListener onFailureListener) {
        this.f51978b.mo60028a(new zzd(executor, onFailureListener));
        m71273p();
        return this;
    }

    /* renamed from: d */
    public final Task<ResultT> mo60018d(OnSuccessListener<? super ResultT> onSuccessListener) {
        mo60019e(TaskExecutors.f51955a, onSuccessListener);
        return this;
    }

    /* renamed from: e */
    public final Task<ResultT> mo60019e(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f51978b.mo60028a(new zzf(executor, onSuccessListener));
        m71273p();
        return this;
    }

    @Nullable
    /* renamed from: f */
    public final Exception mo60020f() {
        Exception exc;
        synchronized (this.f51977a) {
            exc = this.f51981e;
        }
        return exc;
    }

    /* renamed from: g */
    public final ResultT mo60021g() {
        ResultT resultt;
        synchronized (this.f51977a) {
            m71271n();
            Exception exc = this.f51981e;
            if (exc == null) {
                resultt = this.f51980d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    /* renamed from: h */
    public final boolean mo60022h() {
        boolean z;
        synchronized (this.f51977a) {
            z = this.f51979c;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo60023i() {
        boolean z;
        synchronized (this.f51977a) {
            z = false;
            if (this.f51979c && this.f51981e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void mo60037j(Exception exc) {
        synchronized (this.f51977a) {
            m71272o();
            this.f51979c = true;
            this.f51981e = exc;
        }
        this.f51978b.mo60029b(this);
    }

    /* renamed from: k */
    public final void mo60038k(Object obj) {
        synchronized (this.f51977a) {
            m71272o();
            this.f51979c = true;
            this.f51980d = obj;
        }
        this.f51978b.mo60029b(this);
    }

    /* renamed from: l */
    public final boolean mo60039l(Exception exc) {
        synchronized (this.f51977a) {
            if (this.f51979c) {
                return false;
            }
            this.f51979c = true;
            this.f51981e = exc;
            this.f51978b.mo60029b(this);
            return true;
        }
    }

    /* renamed from: m */
    public final boolean mo60040m(Object obj) {
        synchronized (this.f51977a) {
            if (this.f51979c) {
                return false;
            }
            this.f51979c = true;
            this.f51980d = obj;
            this.f51978b.mo60029b(this);
            return true;
        }
    }
}
