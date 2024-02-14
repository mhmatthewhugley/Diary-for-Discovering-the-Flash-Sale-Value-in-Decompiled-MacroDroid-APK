package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@ExperimentalPagingApi
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"Landroidx/paging/RemoteMediator;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/PagingState;", "state", "Landroidx/paging/RemoteMediator$MediatorResult;", "load", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/RemoteMediator$InitializeAction;", "initialize", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "InitializeAction", "MediatorResult", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediator.kt */
public abstract class RemoteMediator<Key, Value> {

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo71668d2 = {"Landroidx/paging/RemoteMediator$InitializeAction;", "", "(Ljava/lang/String;I)V", "LAUNCH_INITIAL_REFRESH", "SKIP_INITIAL_REFRESH", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediator.kt */
    public enum InitializeAction {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    @Metadata(mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo71668d2 = {"Landroidx/paging/RemoteMediator$MediatorResult;", "", "()V", "Error", "Success", "Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult$Success;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediator.kt */
    public static abstract class MediatorResult {

        @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Error;", "Landroidx/paging/RemoteMediator$MediatorResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: RemoteMediator.kt */
        public static final class Error extends MediatorResult {
            private final Throwable throwable;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(Throwable th) {
                super((C13695i) null);
                C13706o.m87929f(th, "throwable");
                this.throwable = th;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/RemoteMediator$MediatorResult$Success;", "Landroidx/paging/RemoteMediator$MediatorResult;", "endOfPaginationReached", "", "(Z)V", "()Z", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: RemoteMediator.kt */
        public static final class Success extends MediatorResult {
            private final boolean endOfPaginationReached;

            public Success(boolean z) {
                super((C13695i) null);
                this.endOfPaginationReached = z;
            }

            public final boolean endOfPaginationReached() {
                return this.endOfPaginationReached;
            }
        }

        private MediatorResult() {
        }

        public /* synthetic */ MediatorResult(C13695i iVar) {
            this();
        }
    }

    public Object initialize(C13635d<? super InitializeAction> dVar) {
        return InitializeAction.LAUNCH_INITIAL_REFRESH;
    }

    public abstract Object load(LoadType loadType, PagingState<Key, Value> pagingState, C13635d<? super MediatorResult> dVar);
}
