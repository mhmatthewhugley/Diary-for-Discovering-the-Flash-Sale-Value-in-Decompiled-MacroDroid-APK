package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.flow.internal.C15302c;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo71668d2 = {"Lkotlinx/coroutines/flow/c0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/a0;", "flow", "", "c", "", "Lkotlin/coroutines/d;", "Lja/u;", "d", "(Lkotlinx/coroutines/flow/a0;)[Lkotlin/coroutines/d;", "", "a", "J", "index", "b", "Lkotlin/coroutines/d;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.c0 */
/* compiled from: SharedFlow.kt */
public final class C15278c0 extends C15302c<C15270a0<?>> {

    /* renamed from: a */
    public long f64503a = -1;

    /* renamed from: b */
    public C13635d<? super C13339u> f64504b;

    /* renamed from: c */
    public boolean mo74661a(C15270a0<?> a0Var) {
        if (this.f64503a >= 0) {
            return false;
        }
        this.f64503a = a0Var.mo74650W();
        return true;
    }

    /* renamed from: d */
    public C13635d<C13339u>[] mo74662b(C15270a0<?> a0Var) {
        long j = this.f64503a;
        this.f64503a = -1;
        this.f64504b = null;
        return a0Var.mo74649V(j);
    }
}
