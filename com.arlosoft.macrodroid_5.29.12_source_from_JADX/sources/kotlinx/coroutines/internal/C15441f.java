package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13657e;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15201c0;
import kotlinx.coroutines.C15260e0;
import kotlinx.coroutines.C15412g1;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15498o0;
import kotlinx.coroutines.C15558v2;
import kotlinx.coroutines.C15566x0;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010-\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b>\u0010?J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0006X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u0010\u000bR\u0014\u00104\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001a\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010:\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, mo71668d2 = {"Lkotlinx/coroutines/internal/f;", "T", "Lkotlinx/coroutines/x0;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "", "p", "()Z", "Lja/u;", "i", "()V", "s", "Lkotlinx/coroutines/o;", "m", "()Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/n;", "continuation", "", "u", "(Lkotlinx/coroutines/n;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "h", "()Ljava/lang/Object;", "Lja/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/g;", "context", "value", "n", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/h0;", "f", "Lkotlinx/coroutines/h0;", "dispatcher", "g", "Lkotlin/coroutines/d;", "o", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "c", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlinx/coroutines/h0;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.f */
/* compiled from: DispatchedContinuation.kt */
public final class C15441f<T> extends C15566x0<T> implements C13657e, C13635d<T> {

    /* renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64649s = AtomicReferenceFieldUpdater.newUpdater(C15441f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: f */
    public final C15415h0 f64650f;

    /* renamed from: g */
    public final C13635d<T> f64651g;

    /* renamed from: o */
    public Object f64652o = C15443g.f64657a;

    /* renamed from: p */
    public final Object f64653p = C15437e0.m94361b(getContext());

    public C15441f(C15415h0 h0Var, C13635d<? super T> dVar) {
        super(-1);
        this.f64650f = h0Var;
        this.f64651g = dVar;
    }

    /* renamed from: o */
    private final C15497o<?> m94366o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C15497o) {
            return (C15497o) obj;
        }
        return null;
    }

    /* renamed from: b */
    public void mo74764b(Object obj, Throwable th) {
        if (obj instanceof C15201c0) {
            ((C15201c0) obj).f64408b.invoke(th);
        }
    }

    /* renamed from: c */
    public C13635d<T> mo74765c() {
        return this;
    }

    public C13657e getCallerFrame() {
        C13635d<T> dVar = this.f64651g;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }

    public C13640g getContext() {
        return this.f64651g.getContext();
    }

    /* renamed from: h */
    public Object mo74766h() {
        Object obj = this.f64652o;
        this.f64652o = C15443g.f64657a;
        return obj;
    }

    /* renamed from: i */
    public final void mo74767i() {
        do {
        } while (this._reusableCancellableContinuation == C15443g.f64658b);
    }

    /* renamed from: m */
    public final C15497o<T> mo74768m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C15443g.f64658b;
                return null;
            } else if (obj instanceof C15497o) {
                if (C0320a.m383a(f64649s, this, obj, C15443g.f64658b)) {
                    return (C15497o) obj;
                }
            } else if (obj != C15443g.f64658b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(C13706o.m87936m("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: n */
    public final void mo74769n(C13640g gVar, T t) {
        this.f64652o = t;
        this.f64813d = 1;
        this.f64650f.dispatchYield(gVar, this);
    }

    /* renamed from: p */
    public final boolean mo74770p() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: r */
    public final boolean mo74771r(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C15429a0 a0Var = C15443g.f64658b;
            if (C13706o.m87924a(obj, a0Var)) {
                if (C0320a.m383a(f64649s, this, a0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C0320a.m383a(f64649s, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public void resumeWith(Object obj) {
        C13640g context;
        Object c;
        C13640g context2 = this.f64651g.getContext();
        Object d = C15260e0.m94022d(obj, (C16265l) null, 1, (Object) null);
        if (this.f64650f.isDispatchNeeded(context2)) {
            this.f64652o = d;
            this.f64813d = 0;
            this.f64650f.dispatch(context2, this);
            return;
        }
        C15412g1 b = C15558v2.f64805a.mo74921b();
        if (b.mo74722H()) {
            this.f64652o = d;
            this.f64813d = 0;
            b.mo74719C(this);
            return;
        }
        b.mo74721E(true);
        try {
            context = getContext();
            c = C15437e0.m94362c(context, this.f64653p);
            this.f64651g.resumeWith(obj);
            C13339u uVar = C13339u.f61331a;
            C15437e0.m94360a(context, c);
            do {
            } while (b.mo74725L());
        } catch (Throwable th) {
            try {
                mo74927g(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo74727o(true);
                throw th2;
            }
        }
        b.mo74727o(true);
    }

    /* renamed from: s */
    public final void mo74772s() {
        mo74767i();
        C15497o<?> o = m94366o();
        if (o != null) {
            o.mo74860r();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f64650f + ", " + C15498o0.m94573c(this.f64651g) + ']';
    }

    /* renamed from: u */
    public final Throwable mo74774u(C15492n<?> nVar) {
        C15429a0 a0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            a0Var = C15443g.f64658b;
            if (obj != a0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C13706o.m87936m("Inconsistent state ", obj).toString());
                } else if (C0320a.m383a(f64649s, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C0320a.m383a(f64649s, this, a0Var, nVar));
        return null;
    }
}
