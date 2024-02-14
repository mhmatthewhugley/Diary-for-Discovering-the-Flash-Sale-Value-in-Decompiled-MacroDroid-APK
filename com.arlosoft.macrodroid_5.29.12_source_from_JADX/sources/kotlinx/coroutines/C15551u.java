package kotlinx.coroutines;

import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/t;", "", "cause", "Lja/u;", "D", "", "d", "Lkotlinx/coroutines/v;", "g", "Lkotlinx/coroutines/v;", "childJob", "Lkotlinx/coroutines/w1;", "getParent", "()Lkotlinx/coroutines/w1;", "parent", "<init>", "(Lkotlinx/coroutines/v;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u */
/* compiled from: JobSupport.kt */
public final class C15551u extends C15567x1 implements C15545t {

    /* renamed from: g */
    public final C15555v f64801g;

    public C15551u(C15555v vVar) {
        this.f64801g = vVar;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        this.f64801g.mo74613i(mo74519E());
    }

    /* renamed from: d */
    public boolean mo74833d(Throwable th) {
        return mo74519E().mo74604O(th);
    }

    public C15561w1 getParent() {
        return mo74519E();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
