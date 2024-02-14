package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/v2;", "", "Lkotlinx/coroutines/g1;", "a", "()Lkotlinx/coroutines/g1;", "Lja/u;", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/g1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v2 */
/* compiled from: EventLoop.common.kt */
public final class C15558v2 {

    /* renamed from: a */
    public static final C15558v2 f64805a = new C15558v2();

    /* renamed from: b */
    private static final ThreadLocal<C15412g1> f64806b = new ThreadLocal<>();

    private C15558v2() {
    }

    /* renamed from: a */
    public final C15412g1 mo74920a() {
        return f64806b.get();
    }

    /* renamed from: b */
    public final C15412g1 mo74921b() {
        ThreadLocal<C15412g1> threadLocal = f64806b;
        C15412g1 g1Var = threadLocal.get();
        if (g1Var != null) {
            return g1Var;
        }
        C15412g1 a = C15475j1.m94496a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo74922c() {
        f64806b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo74923d(C15412g1 g1Var) {
        f64806b.set(g1Var);
    }
}
