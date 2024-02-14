package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo71668d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/g$b;", "Lja/u;", "acquire", "release", "Lkotlinx/coroutines/w1;", "transactionThreadControlJob", "Lkotlinx/coroutines/w1;", "Lkotlin/coroutines/e;", "transactionDispatcher", "Lkotlin/coroutines/e;", "getTransactionDispatcher$room_ktx_release", "()Lkotlin/coroutines/e;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "(Lkotlinx/coroutines/w1;Lkotlin/coroutines/e;)V", "Key", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* compiled from: RoomDatabase.kt */
public final class TransactionElement implements C13640g.C13643b {
    public static final Key Key = new Key((C13695i) null);
    private final AtomicInteger referenceCount = new AtomicInteger(0);
    private final C13636e transactionDispatcher;
    private final C15561w1 transactionThreadControlJob;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/room/TransactionElement;", "<init>", "()V", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: RoomDatabase.kt */
    public static final class Key implements C13640g.C13645c<TransactionElement> {
        private Key() {
        }

        public /* synthetic */ Key(C13695i iVar) {
            this();
        }
    }

    public TransactionElement(C15561w1 w1Var, C13636e eVar) {
        C13706o.m87929f(w1Var, "transactionThreadControlJob");
        C13706o.m87929f(eVar, "transactionDispatcher");
        this.transactionThreadControlJob = w1Var;
        this.transactionDispatcher = eVar;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return C13640g.C13643b.C13644a.m87822a(this, r, pVar);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return C13640g.C13643b.C13644a.m87823b(this, cVar);
    }

    public C13640g.C13645c<TransactionElement> getKey() {
        return Key;
    }

    public final C13636e getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C13640g.C13643b.C13644a.m87824c(this, cVar);
    }

    public C13640g plus(C13640g gVar) {
        return C13640g.C13643b.C13644a.m87825d(this, gVar);
    }

    public final void release() {
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        } else if (decrementAndGet == 0) {
            C15561w1.C15562a.m94723a(this.transactionThreadControlJob, (CancellationException) null, 1, (Object) null);
        }
    }
}
