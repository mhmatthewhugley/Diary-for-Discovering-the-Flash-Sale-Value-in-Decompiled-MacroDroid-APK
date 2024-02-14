package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020%\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00101\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo71668d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/w1;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/k0;", "value", "Lja/u;", "I0", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "H0", "", "N", "", "state", "q0", "Lja/n;", "result", "resumeWith", "G0", "exception", "c0", "(Ljava/lang/Throwable;)V", "l0", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/m0;", "start", "receiver", "Lkotlin/Function2;", "block", "J0", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;Lqa/p;)V", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "b", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;ZZ)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a */
/* compiled from: AbstractCoroutine.kt */
public abstract class C15184a<T> extends C15252d2 implements C13635d<T>, C15478k0 {

    /* renamed from: c */
    private final C13640g f64383c;

    public C15184a(C13640g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo74610d0((C15561w1) gVar.get(C15561w1.f64808x));
        }
        this.f64383c = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo74482G0(Object obj) {
        mo74600F(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo74483H0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo74484I0(T t) {
    }

    /* renamed from: J0 */
    public final <R> void mo74485J0(C15486m0 m0Var, R r, C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar) {
        m0Var.mo74837d(pVar, r, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public String mo74486N() {
        return C13706o.m87936m(C15498o0.m94571a(this), " was cancelled");
    }

    /* renamed from: b */
    public boolean mo74487b() {
        return super.mo74487b();
    }

    /* renamed from: c0 */
    public final void mo74488c0(Throwable th) {
        C15474j0.m94494a(this.f64383c, th);
    }

    public final C13640g getContext() {
        return this.f64383c;
    }

    public C13640g getCoroutineContext() {
        return this.f64383c;
    }

    /* renamed from: l0 */
    public String mo74489l0() {
        String b = C15408g0.m94270b(this.f64383c);
        if (b == null) {
            return super.mo74489l0();
        }
        return '\"' + b + "\":" + super.mo74489l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final void mo74490q0(Object obj) {
        if (obj instanceof C15196b0) {
            C15196b0 b0Var = (C15196b0) obj;
            mo74483H0(b0Var.f64404a, b0Var.mo74510a());
            return;
        }
        mo74484I0(obj);
    }

    public final void resumeWith(Object obj) {
        Object j0 = mo74616j0(C15260e0.m94022d(obj, (C16265l) null, 1, (Object) null));
        if (j0 != C15262e2.f64475b) {
            mo74482G0(j0);
        }
    }
}
