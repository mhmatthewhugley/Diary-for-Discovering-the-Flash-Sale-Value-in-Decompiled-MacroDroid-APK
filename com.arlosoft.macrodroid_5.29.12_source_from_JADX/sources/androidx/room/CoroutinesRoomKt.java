package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import kotlinx.coroutines.C15499o1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo71668d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/h0;", "getQueryDispatcher", "getTransactionDispatcher", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/h0;", "transactionDispatcher", "room-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoomKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final C15415h0 getQueryDispatcher(RoomDatabase roomDatabase) {
        C13706o.m87929f(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        C13706o.m87928e(backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            Executor queryExecutor = roomDatabase.getQueryExecutor();
            C13706o.m87928e(queryExecutor, "queryExecutor");
            obj = C15499o1.m94574a(queryExecutor);
            backingFieldMap.put("QueryDispatcher", obj);
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C15415h0) obj;
    }

    public static final C15415h0 getTransactionDispatcher(RoomDatabase roomDatabase) {
        C13706o.m87929f(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        C13706o.m87928e(backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            Executor transactionExecutor = roomDatabase.getTransactionExecutor();
            C13706o.m87928e(transactionExecutor, "transactionExecutor");
            obj = C15499o1.m94574a(transactionExecutor);
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C15415h0) obj;
    }
}
