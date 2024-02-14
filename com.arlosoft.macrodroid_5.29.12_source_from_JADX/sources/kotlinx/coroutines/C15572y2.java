package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.internal.C15471y;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/y2;", "U", "T", "Lkotlinx/coroutines/internal/y;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lja/u;", "run", "", "l0", "()Ljava/lang/String;", "", "f", "J", "time", "Lkotlin/coroutines/d;", "uCont", "<init>", "(JLkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y2 */
/* compiled from: Timeout.kt */
final class C15572y2<U, T extends U> extends C15471y<T> implements Runnable {

    /* renamed from: f */
    public final long f64815f;

    public C15572y2(long j, C13635d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f64815f = j;
    }

    /* renamed from: l0 */
    public String mo74489l0() {
        return super.mo74489l0() + "(timeMillis=" + this.f64815f + ')';
    }

    public void run() {
        mo74602I(C15576z2.m94761a(this.f64815f, this));
    }
}
