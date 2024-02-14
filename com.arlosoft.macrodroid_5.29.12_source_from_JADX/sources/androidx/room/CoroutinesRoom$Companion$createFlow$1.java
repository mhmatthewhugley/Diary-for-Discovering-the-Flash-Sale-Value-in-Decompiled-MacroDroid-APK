package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15221f;
import kotlinx.coroutines.channels.C15225i;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"R", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", mo71894f = "CoroutinesRoom.kt", mo71895l = {110}, mo71896m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$createFlow$1 extends C13665l implements C16269p<C15288g<R>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"R", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", mo71894f = "CoroutinesRoom.kt", mo71895l = {136}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    /* compiled from: CoroutinesRoom.kt */
    static final class C10821 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C10821 r0 = new C10821(z, roomDatabase, gVar, strArr, callable, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C10821) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            C13640g gVar;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15478k0 k0Var = (C15478k0) this.L$0;
                final C15221f d = C15225i.m93852d(-1, (C15220e) null, (C16265l) null, 6, (Object) null);
                final CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1 = new CoroutinesRoom$Companion$createFlow$1$1$observer$1(strArr, d);
                d.m101371trySendJP2dKIU(C13339u.f61331a);
                TransactionElement transactionElement = (TransactionElement) k0Var.getCoroutineContext().get(TransactionElement.Key);
                if (transactionElement == null || (gVar = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    gVar = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
                }
                C15221f d2 = C15225i.m93852d(0, (C15220e) null, (C16265l) null, 7, (Object) null);
                final RoomDatabase roomDatabase = roomDatabase;
                final Callable<R> callable = callable;
                final C15221f fVar = d2;
                C15561w1 unused = C15473j.m94492d(k0Var, gVar, (C15486m0) null, new C16269p<C15478k0, C13635d<? super C13339u>, Object>((C13635d<? super C10831>) null) {
                    Object L$0;
                    int label;

                    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, C13635d<? super CoroutinesRoom$Companion$createFlow$1> dVar) {
                            super(2, dVar);
                            this.$inTransaction = z;
                            this.$db = roomDatabase;
                            this.$tableNames = strArr;
                            this.$callable = callable;
                        }

                        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                            CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, dVar);
                            coroutinesRoom$Companion$createFlow$1.L$0 = obj;
                            return coroutinesRoom$Companion$createFlow$1;
                        }

                        public final Object invoke(C15288g<R> gVar, C13635d<? super C13339u> dVar) {
                            return ((CoroutinesRoom$Companion$createFlow$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C13652d.m87832c();
                            int i = this.label;
                            if (i == 0) {
                                C13332o.m85685b(obj);
                                final C15288g gVar = (C15288g) this.L$0;
                                final boolean z = this.$inTransaction;
                                final RoomDatabase roomDatabase = this.$db;
                                final String[] strArr = this.$tableNames;
                                final Callable<R> callable = this.$callable;
                                C10821 r3 = new C10821((C13635d<? super C10821>) null);
                                this.label = 1;
                                if (C15482l0.m94505d(r3, this) == c) {
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
