package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"R", "Lkotlinx/coroutines/k0;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.CoroutinesRoom$Companion$execute$2", mo71894f = "CoroutinesRoom.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$2 extends C13665l implements C16269p<C15478k0, C13635d<? super R>, Object> {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$2(Callable<R> callable, C13635d<? super CoroutinesRoom$Companion$execute$2> dVar) {
        super(2, dVar);
        this.$callable = callable;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super R> dVar) {
        return ((CoroutinesRoom$Companion$execute$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            return this.$callable.call();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
