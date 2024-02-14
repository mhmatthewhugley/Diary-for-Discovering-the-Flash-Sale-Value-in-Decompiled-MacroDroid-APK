package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15290h;

@Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo71668d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", "Companion", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion((C13695i) null);

    private CoroutinesRoom() {
    }

    public static final <R> C15285f<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, C13635d<? super R> dVar) {
        return Companion.execute(roomDatabase, z, cancellationSignal, callable, dVar);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, C13635d<? super R> dVar) {
        return Companion.execute(roomDatabase, z, callable, dVar);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\rJG\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo71668d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/f;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/f;", "<init>", "()V", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: CoroutinesRoom.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final <R> C15285f<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
            C13706o.m87929f(roomDatabase, "db");
            C13706o.m87929f(strArr, "tableNames");
            C13706o.m87929f(callable, "callable");
            return C15290h.m94132r(new CoroutinesRoom$Companion$createFlow$1(z, roomDatabase, strArr, callable, (C13635d<? super CoroutinesRoom$Companion$createFlow$1>) null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, C13635d<? super R> dVar) {
            C13636e eVar;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (eVar = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                eVar = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return C15414h.m94298g(eVar, new CoroutinesRoom$Companion$execute$2(callable, (C13635d<? super CoroutinesRoom$Companion$execute$2>) null), dVar);
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, C13635d<? super R> dVar) {
            C13636e transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            C13636e eVar = transactionDispatcher;
            C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
            oVar.mo74864z();
            oVar.mo74843d(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, C15473j.m94492d(C15503p1.f64723a, eVar, (C15486m0) null, new CoroutinesRoom$Companion$execute$4$job$1(callable, oVar, (C13635d<? super CoroutinesRoom$Companion$execute$4$job$1>) null), 2, (Object) null)));
            Object w = oVar.mo74862w();
            if (w == C13652d.m87832c()) {
                C13660h.m87847c(dVar);
            }
            return w;
        }
    }
}
