package kotlinx.coroutines;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13657e;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.internal.C15429a0;
import kotlinx.coroutines.internal.C15441f;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\bz\u0010{J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0016X\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010pR\u0014\u0010s\u001a\u00020a8BX\u0004¢\u0006\u0006\u001a\u0004\br\u0010cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0004¢\u0006\u0006\u001a\u0004\bt\u00108R\u0014\u0010v\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\bR\u001c\u0010y\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x\u0002\u0004\n\u0002\b\u0019¨\u0006|"}, mo71668d2 = {"Lkotlinx/coroutines/o;", "T", "Lkotlinx/coroutines/x0;", "Lkotlinx/coroutines/n;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "D", "()Z", "", "cause", "p", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lja/u;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "n", "(Lqa/l;Ljava/lang/Throwable;)V", "P", "N", "Lkotlinx/coroutines/c1;", "A", "()Lkotlinx/coroutines/c1;", "I", "()V", "", "state", "F", "(Lqa/l;Ljava/lang/Object;)V", "Lkotlinx/coroutines/l;", "E", "(Lqa/l;)Lkotlinx/coroutines/l;", "", "mode", "u", "(I)V", "Lkotlinx/coroutines/k2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "M", "(Lkotlinx/coroutines/k2;Ljava/lang/Object;ILqa/l;Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;ILqa/l;)V", "Lkotlinx/coroutines/internal/a0;", "O", "(Ljava/lang/Object;Ljava/lang/Object;Lqa/l;)Lkotlinx/coroutines/internal/a0;", "", "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "s", "z", "J", "h", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "k", "H", "(Ljava/lang/Throwable;)V", "m", "(Lkotlinx/coroutines/l;Ljava/lang/Throwable;)V", "o", "Lkotlinx/coroutines/w1;", "parent", "v", "(Lkotlinx/coroutines/w1;)Ljava/lang/Throwable;", "w", "Lja/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "l", "(Ljava/lang/Object;Lqa/l;)V", "d", "(Lqa/l;)V", "r", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Ljava/lang/Object;Lqa/l;)Ljava/lang/Object;", "exception", "j", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "B", "Lkotlinx/coroutines/h0;", "q", "(Lkotlinx/coroutines/h0;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "G", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "c", "()Lkotlin/coroutines/d;", "delegate", "Lkotlin/coroutines/g;", "g", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/c1;", "parentHandle", "y", "stateDebugRepresentation", "x", "C", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o */
/* compiled from: CancellableContinuationImpl.kt */
public class C15497o<T> extends C15566x0<T> implements C15492n<T>, C13657e {

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64714p = AtomicIntegerFieldUpdater.newUpdater(C15497o.class, "_decision");

    /* renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64715s = AtomicReferenceFieldUpdater.newUpdater(C15497o.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C15249d.f64459a;

    /* renamed from: f */
    private final C13635d<T> f64716f;

    /* renamed from: g */
    private final C13640g f64717g;

    /* renamed from: o */
    private C15202c1 f64718o;

    public C15497o(C13635d<? super T> dVar, int i) {
        super(i);
        this.f64716f = dVar;
        this.f64717g = dVar.getContext();
    }

    /* renamed from: A */
    private final C15202c1 m94530A() {
        C15561w1 w1Var = (C15561w1) getContext().get(C15561w1.f64808x);
        if (w1Var == null) {
            return null;
        }
        C15202c1 d = C15561w1.C15562a.m94726d(w1Var, true, false, new C15513s(this), 2, (Object) null);
        this.f64718o = d;
        return d;
    }

    /* renamed from: D */
    private final boolean m94531D() {
        return C15570y0.m94746c(this.f64813d) && ((C15441f) this.f64716f).mo74770p();
    }

    /* renamed from: E */
    private final C15481l m94532E(C16265l<? super Throwable, C13339u> lVar) {
        return lVar instanceof C15481l ? (C15481l) lVar : new C15548t1(lVar);
    }

    /* renamed from: F */
    private final void m94533F(C16265l<? super Throwable, C13339u> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: I */
    private final void m94534I() {
        C13635d<T> dVar = this.f64716f;
        Throwable th = null;
        C15441f fVar = dVar instanceof C15441f ? (C15441f) dVar : null;
        if (fVar != null) {
            th = fVar.mo74774u(this);
        }
        if (th != null) {
            mo74860r();
            mo74845k(th);
        }
    }

    /* renamed from: K */
    private final void m94535K(Object obj, int i, C16265l<? super Throwable, C13339u> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C15480k2) {
            } else {
                if (obj2 instanceof C15509r) {
                    C15509r rVar = (C15509r) obj2;
                    if (rVar.mo74868c()) {
                        if (lVar != null) {
                            mo74859o(lVar, rVar.f64404a);
                            return;
                        }
                        return;
                    }
                }
                m94541i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C0320a.m383a(f64715s, this, obj2, m94537M((C15480k2) obj2, obj, i, lVar, (Object) null)));
        m94544s();
        m94545u(i);
    }

    /* renamed from: L */
    static /* synthetic */ void m94536L(C15497o oVar, Object obj, int i, C16265l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            oVar.m94535K(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: M */
    private final Object m94537M(C15480k2 k2Var, Object obj, int i, C16265l<? super Throwable, C13339u> lVar, Object obj2) {
        if (obj instanceof C15196b0) {
            return obj;
        }
        if (!C15570y0.m94745b(i) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(k2Var instanceof C15481l) || (k2Var instanceof C15259e)) && obj2 == null)) {
            return obj;
        }
        return new C15185a0(obj, k2Var instanceof C15481l ? (C15481l) k2Var : null, lVar, obj2, (Throwable) null, 16, (C13695i) null);
    }

    /* renamed from: N */
    private final boolean m94538N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f64714p.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: O */
    private final C15429a0 m94539O(Object obj, Object obj2, C16265l<? super Throwable, C13339u> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C15480k2) {
            } else if (!(obj3 instanceof C15185a0) || obj2 == null || ((C15185a0) obj3).f64387d != obj2) {
                return null;
            } else {
                return C15501p.f64720a;
            }
        } while (!C0320a.m383a(f64715s, this, obj3, m94537M((C15480k2) obj3, obj, this.f64813d, lVar, obj2)));
        m94544s();
        return C15501p.f64720a;
    }

    /* renamed from: P */
    private final boolean m94540P() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f64714p.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: i */
    private final Void m94541i(Object obj) {
        throw new IllegalStateException(C13706o.m87936m("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: n */
    private final void m94542n(C16265l<? super Throwable, C13339u> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C15474j0.m94494a(getContext(), new CompletionHandlerException(C13706o.m87936m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: p */
    private final boolean m94543p(Throwable th) {
        if (!m94531D()) {
            return false;
        }
        return ((C15441f) this.f64716f).mo74771r(th);
    }

    /* renamed from: s */
    private final void m94544s() {
        if (!m94531D()) {
            mo74860r();
        }
    }

    /* renamed from: u */
    private final void m94545u(int i) {
        if (!m94538N()) {
            C15570y0.m94744a(this, i);
        }
    }

    /* renamed from: y */
    private final String m94546y() {
        Object x = mo74863x();
        if (x instanceof C15480k2) {
            return "Active";
        }
        return x instanceof C15509r ? "Cancelled" : "Completed";
    }

    /* renamed from: B */
    public void mo74841B(Object obj) {
        m94545u(this.f64813d);
    }

    /* renamed from: C */
    public boolean mo74853C() {
        return !(mo74863x() instanceof C15480k2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public String mo74629G() {
        return "CancellableContinuation";
    }

    /* renamed from: H */
    public final void mo74854H(Throwable th) {
        if (!m94543p(th)) {
            mo74845k(th);
            m94544s();
        }
    }

    /* renamed from: J */
    public final boolean mo74855J() {
        Object obj = this._state;
        if (!(obj instanceof C15185a0) || ((C15185a0) obj).f64387d == null) {
            this._decision = 0;
            this._state = C15249d.f64459a;
            return true;
        }
        mo74860r();
        return false;
    }

    /* renamed from: a */
    public Object mo74842a(T t, Object obj) {
        return m94539O(t, obj, (C16265l<? super Throwable, C13339u>) null);
    }

    /* renamed from: b */
    public void mo74764b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C15480k2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C15196b0)) {
                if (obj2 instanceof C15185a0) {
                    C15185a0 a0Var = (C15185a0) obj2;
                    if (!a0Var.mo74492c()) {
                        if (C0320a.m383a(f64715s, this, obj2, C15185a0.m93725b(a0Var, (Object) null, (C15481l) null, (C16265l) null, (Object) null, th, 15, (Object) null))) {
                            a0Var.mo74493d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C0320a.m383a(f64715s, this, obj2, new C15185a0(obj2, (C15481l) null, (C16265l) null, (Object) null, th, 14, (C13695i) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C13635d<T> mo74765c() {
        return this.f64716f;
    }

    /* renamed from: d */
    public void mo74843d(C16265l<? super Throwable, C13339u> lVar) {
        C15481l E = m94532E(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C15249d) {
                if (C0320a.m383a(f64715s, this, obj, E)) {
                    return;
                }
            } else if (obj instanceof C15481l) {
                m94533F(lVar, obj);
            } else {
                boolean z = obj instanceof C15196b0;
                if (z) {
                    C15196b0 b0Var = (C15196b0) obj;
                    if (!b0Var.mo74511b()) {
                        m94533F(lVar, obj);
                    }
                    if (obj instanceof C15509r) {
                        Throwable th = null;
                        if (!z) {
                            b0Var = null;
                        }
                        if (b0Var != null) {
                            th = b0Var.f64404a;
                        }
                        m94542n(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C15185a0) {
                    C15185a0 a0Var = (C15185a0) obj;
                    if (a0Var.f64385b != null) {
                        m94533F(lVar, obj);
                    }
                    if (!(E instanceof C15259e)) {
                        if (a0Var.mo74492c()) {
                            m94542n(lVar, a0Var.f64388e);
                            return;
                        }
                        if (C0320a.m383a(f64715s, this, obj, C15185a0.m93725b(a0Var, (Object) null, E, (C16265l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(E instanceof C15259e)) {
                    if (C0320a.m383a(f64715s, this, obj, new C15185a0(obj, E, (C16265l) null, (Object) null, (Throwable) null, 28, (C13695i) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public Throwable mo74856e(Object obj) {
        Throwable e = super.mo74856e(obj);
        if (e == null) {
            return null;
        }
        mo74765c();
        return e;
    }

    /* renamed from: f */
    public <T> T mo74857f(Object obj) {
        return obj instanceof C15185a0 ? ((C15185a0) obj).f64384a : obj;
    }

    public C13657e getCallerFrame() {
        C13635d<T> dVar = this.f64716f;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }

    public C13640g getContext() {
        return this.f64717g;
    }

    /* renamed from: h */
    public Object mo74766h() {
        return mo74863x();
    }

    /* renamed from: j */
    public Object mo74844j(Throwable th) {
        return m94539O(new C15196b0(th, false, 2, (C13695i) null), (Object) null, (C16265l<? super Throwable, C13339u>) null);
    }

    /* renamed from: k */
    public boolean mo74845k(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C15480k2)) {
                return false;
            }
            z = obj instanceof C15481l;
        } while (!C0320a.m383a(f64715s, this, obj, new C15509r(this, th, z)));
        C15481l lVar = z ? (C15481l) obj : null;
        if (lVar != null) {
            mo74858m(lVar, th);
        }
        m94544s();
        m94545u(this.f64813d);
        return true;
    }

    /* renamed from: l */
    public void mo74846l(T t, C16265l<? super Throwable, C13339u> lVar) {
        m94535K(t, this.f64813d, lVar);
    }

    /* renamed from: m */
    public final void mo74858m(C15481l lVar, Throwable th) {
        try {
            lVar.mo74549a(th);
        } catch (Throwable th2) {
            C15474j0.m94494a(getContext(), new CompletionHandlerException(C13706o.m87936m("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: o */
    public final void mo74859o(C16265l<? super Throwable, C13339u> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C15474j0.m94494a(getContext(), new CompletionHandlerException(C13706o.m87936m("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: q */
    public void mo74847q(C15415h0 h0Var, T t) {
        C13635d<T> dVar = this.f64716f;
        C15415h0 h0Var2 = null;
        C15441f fVar = dVar instanceof C15441f ? (C15441f) dVar : null;
        if (fVar != null) {
            h0Var2 = fVar.f64650f;
        }
        m94536L(this, t, h0Var2 == h0Var ? 4 : this.f64813d, (C16265l) null, 4, (Object) null);
    }

    /* renamed from: r */
    public final void mo74860r() {
        C15202c1 c1Var = this.f64718o;
        if (c1Var != null) {
            c1Var.dispose();
            this.f64718o = C15476j2.f64699a;
        }
    }

    public void resumeWith(Object obj) {
        m94536L(this, C15260e0.m94020b(obj, this), this.f64813d, (C16265l) null, 4, (Object) null);
    }

    /* renamed from: t */
    public Object mo74848t(T t, Object obj, C16265l<? super Throwable, C13339u> lVar) {
        return m94539O(t, obj, lVar);
    }

    public String toString() {
        return mo74629G() + '(' + C15498o0.m94573c(this.f64716f) + "){" + m94546y() + "}@" + C15498o0.m94572b(this);
    }

    /* renamed from: v */
    public Throwable mo74630v(C15561w1 w1Var) {
        return w1Var.mo74612g();
    }

    /* renamed from: w */
    public final Object mo74862w() {
        C15561w1 w1Var;
        boolean D = m94531D();
        if (m94540P()) {
            if (this.f64718o == null) {
                m94530A();
            }
            if (D) {
                m94534I();
            }
            return C13652d.m87832c();
        }
        if (D) {
            m94534I();
        }
        Object x = mo74863x();
        if (x instanceof C15196b0) {
            throw ((C15196b0) x).f64404a;
        } else if (!C15570y0.m94745b(this.f64813d) || (w1Var = (C15561w1) getContext().get(C15561w1.f64808x)) == null || w1Var.mo74487b()) {
            return mo74857f(x);
        } else {
            CancellationException g = w1Var.mo74612g();
            mo74764b(x, g);
            throw g;
        }
    }

    /* renamed from: x */
    public final Object mo74863x() {
        return this._state;
    }

    /* renamed from: z */
    public void mo74864z() {
        C15202c1 A = m94530A();
        if (A != null && mo74853C()) {
            A.dispose();
            this.f64718o = C15476j2.f64699a;
        }
    }
}
