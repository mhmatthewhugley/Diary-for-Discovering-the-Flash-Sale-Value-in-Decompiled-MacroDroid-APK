package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"R", "Lkotlinx/coroutines/k0;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.RoomDatabaseKt$withTransaction$2", mo71894f = "RoomDatabase.kt", mo71895l = {58}, mo71896m = "invokeSuspend")
/* compiled from: RoomDatabase.kt */
final class RoomDatabaseKt$withTransaction$2 extends C13665l implements C16269p<C15478k0, C13635d<? super R>, Object> {
    final /* synthetic */ C16265l<C13635d<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, C16265l<? super C13635d<? super R>, ? extends Object> lVar, C13635d<? super RoomDatabaseKt$withTransaction$2> dVar) {
        super(2, dVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = lVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.$this_withTransaction, this.$block, dVar);
        roomDatabaseKt$withTransaction$2.L$0 = obj;
        return roomDatabaseKt$withTransaction$2;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super R> dVar) {
        return ((RoomDatabaseKt$withTransaction$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        TransactionElement transactionElement;
        Throwable th;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C13640g.C13643b bVar = ((C15478k0) this.L$0).getCoroutineContext().get(TransactionElement.Key);
            C13706o.m87926c(bVar);
            TransactionElement transactionElement2 = (TransactionElement) bVar;
            transactionElement2.acquire();
            try {
                this.$this_withTransaction.beginTransaction();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                transactionElement = transactionElement2;
                th = th3;
                transactionElement.release();
                throw th;
            }
            try {
                C16265l<C13635d<? super R>, Object> lVar = this.$block;
                this.L$0 = transactionElement2;
                this.label = 1;
                Object invoke = lVar.invoke(this);
                if (invoke == c) {
                    return c;
                }
                transactionElement = transactionElement2;
                obj = invoke;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                transactionElement = transactionElement2;
                th = th5;
                this.$this_withTransaction.endTransaction();
                throw th;
            }
        } else if (i == 1) {
            transactionElement = (TransactionElement) this.L$0;
            try {
                C13332o.m85685b(obj);
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$this_withTransaction.setTransactionSuccessful();
        try {
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th7) {
            th = th7;
            transactionElement.release();
            throw th;
        }
    }
}
