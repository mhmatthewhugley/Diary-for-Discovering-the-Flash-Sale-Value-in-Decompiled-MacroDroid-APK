package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo71668d2 = {"Lkotlinx/coroutines/u1;", "Lkotlinx/coroutines/x1;", "", "cause", "Lja/u;", "D", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lqa/l;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u1 */
/* compiled from: JobSupport.kt */
final class C15553u1 extends C15567x1 {

    /* renamed from: o */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f64802o = AtomicIntegerFieldUpdater.newUpdater(C15553u1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: g */
    private final C16265l<Throwable, C13339u> f64803g;

    public C15553u1(C16265l<? super Throwable, C13339u> lVar) {
        this.f64803g = lVar;
    }

    /* renamed from: D */
    public void mo74596D(Throwable th) {
        if (f64802o.compareAndSet(this, 0, 1)) {
            this.f64803g.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74596D((Throwable) obj);
        return C13339u.f61331a;
    }
}
