package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15561w1;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: RoomDatabase.kt */
final class RoomDatabaseKt$acquireTransactionThread$2$2 implements Runnable {
    final /* synthetic */ C15492n<C13636e> $continuation;
    final /* synthetic */ C15561w1 $controlJob;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", mo71894f = "RoomDatabase.kt", mo71895l = {124}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1 */
    /* compiled from: RoomDatabase.kt */
    static final class C10941 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C10941 r0 = new C10941(nVar, w1Var, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C10941) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15492n<C13636e> nVar = nVar;
                C13329n.C13330a aVar = C13329n.f61327a;
                C13640g.C13643b bVar = ((C15478k0) this.L$0).getCoroutineContext().get(C13636e.f61896u);
                C13706o.m87926c(bVar);
                nVar.resumeWith(C13329n.m85676a(bVar));
                C15561w1 w1Var = w1Var;
                this.label = 1;
                if (w1Var.mo74626x(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    RoomDatabaseKt$acquireTransactionThread$2$2(C15492n<? super C13636e> nVar, C15561w1 w1Var) {
        this.$continuation = nVar;
        this.$controlJob = w1Var;
    }

    public final void run() {
        final C15492n<C13636e> nVar = this.$continuation;
        final C15561w1 w1Var = this.$controlJob;
        Object unused = C15424i.m94328b((C13640g) null, new C10941((C13635d<? super C10941>) null), 1, (Object) null);
    }
}
