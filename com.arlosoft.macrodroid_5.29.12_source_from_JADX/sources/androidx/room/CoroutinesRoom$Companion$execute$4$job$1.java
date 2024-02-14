package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15492n;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"R", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", mo71894f = "CoroutinesRoom.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$4$job$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ C15492n<R> $continuation;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, C15492n<? super R> nVar, C13635d<? super CoroutinesRoom$Companion$execute$4$job$1> dVar) {
        super(2, dVar);
        this.$callable = callable;
        this.$continuation = nVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            try {
                R call = this.$callable.call();
                C15492n<R> nVar = this.$continuation;
                C13329n.C13330a aVar = C13329n.f61327a;
                nVar.resumeWith(C13329n.m85676a(call));
            } catch (Throwable th) {
                C15492n<R> nVar2 = this.$continuation;
                C13329n.C13330a aVar2 = C13329n.f61327a;
                nVar2.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
            }
            return C13339u.f61331a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
