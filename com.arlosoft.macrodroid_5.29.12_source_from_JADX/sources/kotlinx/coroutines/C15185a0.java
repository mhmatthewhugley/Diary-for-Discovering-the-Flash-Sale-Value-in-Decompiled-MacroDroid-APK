package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo71668d2 = {"Lkotlinx/coroutines/a0;", "", "Lkotlinx/coroutines/o;", "cont", "", "cause", "Lja/u;", "d", "result", "Lkotlinx/coroutines/l;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/l;", "e", "Ljava/lang/Throwable;", "c", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/l;Lqa/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a0 */
/* compiled from: CancellableContinuationImpl.kt */
final class C15185a0 {

    /* renamed from: a */
    public final Object f64384a;

    /* renamed from: b */
    public final C15481l f64385b;

    /* renamed from: c */
    public final C16265l<Throwable, C13339u> f64386c;

    /* renamed from: d */
    public final Object f64387d;

    /* renamed from: e */
    public final Throwable f64388e;

    public C15185a0(Object obj, C15481l lVar, C16265l<? super Throwable, C13339u> lVar2, Object obj2, Throwable th) {
        this.f64384a = obj;
        this.f64385b = lVar;
        this.f64386c = lVar2;
        this.f64387d = obj2;
        this.f64388e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C15185a0 m93725b(C15185a0 a0Var, Object obj, C15481l lVar, C16265l<Throwable, C13339u> lVar2, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = a0Var.f64384a;
        }
        if ((i & 2) != 0) {
            lVar = a0Var.f64385b;
        }
        C15481l lVar3 = lVar;
        if ((i & 4) != 0) {
            lVar2 = a0Var.f64386c;
        }
        C16265l<Throwable, C13339u> lVar4 = lVar2;
        if ((i & 8) != 0) {
            obj2 = a0Var.f64387d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = a0Var.f64388e;
        }
        return a0Var.mo74491a(obj, lVar3, lVar4, obj4, th);
    }

    /* renamed from: a */
    public final C15185a0 mo74491a(Object obj, C15481l lVar, C16265l<? super Throwable, C13339u> lVar2, Object obj2, Throwable th) {
        return new C15185a0(obj, lVar, lVar2, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo74492c() {
        return this.f64388e != null;
    }

    /* renamed from: d */
    public final void mo74493d(C15497o<?> oVar, Throwable th) {
        C15481l lVar = this.f64385b;
        if (lVar != null) {
            oVar.mo74858m(lVar, th);
        }
        C16265l<Throwable, C13339u> lVar2 = this.f64386c;
        if (lVar2 != null) {
            oVar.mo74859o(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15185a0)) {
            return false;
        }
        C15185a0 a0Var = (C15185a0) obj;
        return C13706o.m87924a(this.f64384a, a0Var.f64384a) && C13706o.m87924a(this.f64385b, a0Var.f64385b) && C13706o.m87924a(this.f64386c, a0Var.f64386c) && C13706o.m87924a(this.f64387d, a0Var.f64387d) && C13706o.m87924a(this.f64388e, a0Var.f64388e);
    }

    public int hashCode() {
        Object obj = this.f64384a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C15481l lVar = this.f64385b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C16265l<Throwable, C13339u> lVar2 = this.f64386c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.f64387d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f64388e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f64384a + ", cancelHandler=" + this.f64385b + ", onCancellation=" + this.f64386c + ", idempotentResume=" + this.f64387d + ", cancelCause=" + this.f64388e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15185a0(Object obj, C15481l lVar, C16265l lVar2, Object obj2, Throwable th, int i, C13695i iVar) {
        this(obj, (i & 2) != 0 ? null : lVar, (i & 4) != 0 ? null : lVar2, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
