package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, mo71668d2 = {"Lkotlinx/coroutines/c0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "result", "Lkotlin/Function1;", "", "Lja/u;", "onCancellation", "<init>", "(Ljava/lang/Object;Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c0 */
/* compiled from: CompletionState.kt */
public final class C15201c0 {

    /* renamed from: a */
    public final Object f64407a;

    /* renamed from: b */
    public final C16265l<Throwable, C13339u> f64408b;

    public C15201c0(Object obj, C16265l<? super Throwable, C13339u> lVar) {
        this.f64407a = obj;
        this.f64408b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15201c0)) {
            return false;
        }
        C15201c0 c0Var = (C15201c0) obj;
        return C13706o.m87924a(this.f64407a, c0Var.f64407a) && C13706o.m87924a(this.f64408b, c0Var.f64408b);
    }

    public int hashCode() {
        Object obj = this.f64407a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f64408b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f64407a + ", onCancellation=" + this.f64408b + ')';
    }
}
