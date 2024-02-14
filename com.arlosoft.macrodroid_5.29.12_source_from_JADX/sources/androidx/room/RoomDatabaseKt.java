package androidx.room;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.C15561w1;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo71668d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lqa/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "createTransactionContext", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/w1;", "controlJob", "Lkotlin/coroutines/e;", "acquireTransactionThread", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/w1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "room-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: RoomDatabase.kt */
public final class RoomDatabaseKt {
    /* access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, C15561w1 w1Var, C13635d<? super C13636e> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        oVar.mo74843d(new RoomDatabaseKt$acquireTransactionThread$2$1(w1Var));
        try {
            executor.execute(new RoomDatabaseKt$acquireTransactionThread$2$2(oVar, w1Var));
        } catch (RejectedExecutionException e) {
            oVar.mo74845k(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createTransactionContext(androidx.room.RoomDatabase r6, kotlin.coroutines.C13635d<? super kotlin.coroutines.C13640g> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$createTransactionContext$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = (androidx.room.RoomDatabaseKt$createTransactionContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = new androidx.room.RoomDatabaseKt$createTransactionContext$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.z r6 = (kotlinx.coroutines.C15573z) r6
            java.lang.Object r0 = r0.L$0
            androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
            p297ja.C13332o.m85685b(r7)
            goto L_0x0072
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            p297ja.C13332o.m85685b(r7)
            r7 = 0
            kotlinx.coroutines.z r7 = kotlinx.coroutines.C15198b2.m93746b(r7, r3, r7)
            kotlin.coroutines.g r2 = r0.getContext()
            kotlinx.coroutines.w1$b r4 = kotlinx.coroutines.C15561w1.f64808x
            kotlin.coroutines.g$b r2 = r2.get(r4)
            kotlinx.coroutines.w1 r2 = (kotlinx.coroutines.C15561w1) r2
            if (r2 == 0) goto L_0x0057
            androidx.room.RoomDatabaseKt$createTransactionContext$2 r4 = new androidx.room.RoomDatabaseKt$createTransactionContext$2
            r4.<init>(r7)
            r2.mo74617p(r4)
        L_0x0057:
            java.util.concurrent.Executor r2 = r6.getTransactionExecutor()
            java.lang.String r4 = "transactionExecutor"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = acquireTransactionThread(r2, r7, r0)
            if (r0 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x0072:
            kotlin.coroutines.e r7 = (kotlin.coroutines.C13636e) r7
            androidx.room.TransactionElement r1 = new androidx.room.TransactionElement
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.getSuspendingTransactionId()
            java.lang.String r2 = "suspendingTransactionId"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r6)
            kotlinx.coroutines.t2 r6 = kotlinx.coroutines.C15554u2.m94702a(r0, r6)
            kotlin.coroutines.g r7 = r7.plus(r1)
            kotlin.coroutines.g r6 = r7.plus(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.createTransactionContext(androidx.room.RoomDatabase, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: qa.l<? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:23:0x0078, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase r5, p370qa.C16265l<? super kotlin.coroutines.C13635d<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.C13635d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$withTransaction$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = (androidx.room.RoomDatabaseKt$withTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = new androidx.room.RoomDatabaseKt$withTransaction$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p297ja.C13332o.m85685b(r7)
            goto L_0x007b
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            qa.l r6 = (p370qa.C16265l) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            p297ja.C13332o.m85685b(r7)
            goto L_0x0066
        L_0x0041:
            p297ja.C13332o.m85685b(r7)
            kotlin.coroutines.g r7 = r0.getContext()
            androidx.room.TransactionElement$Key r2 = androidx.room.TransactionElement.Key
            kotlin.coroutines.g$b r7 = r7.get(r2)
            androidx.room.TransactionElement r7 = (androidx.room.TransactionElement) r7
            if (r7 == 0) goto L_0x0059
            kotlin.coroutines.e r7 = r7.getTransactionDispatcher$room_ktx_release()
            if (r7 == 0) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = createTransactionContext(r5, r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            kotlin.coroutines.g r7 = (kotlin.coroutines.C13640g) r7
        L_0x0068:
            androidx.room.RoomDatabaseKt$withTransaction$2 r2 = new androidx.room.RoomDatabaseKt$withTransaction$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.C15414h.m94298g(r7, r2, r0)
            if (r7 != r1) goto L_0x007b
            return r1
        L_0x007b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.withTransaction(androidx.room.RoomDatabase, qa.l, kotlin.coroutines.d):java.lang.Object");
    }
}
