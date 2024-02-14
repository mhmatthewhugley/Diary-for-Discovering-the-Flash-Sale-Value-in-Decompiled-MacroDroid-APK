package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.flow.C15299i0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001$B#\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\"\u0010#J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J$\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016J\u001c\u0010\r\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016J\u0013\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo71668d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "", "Key", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "Lja/u;", "launchRefresh", "launchBoundary", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/PagingState;", "pagingState", "requestLoad", "retryFailed", "Landroidx/paging/RemoteMediator$InitializeAction;", "initialize", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k0;", "scope", "Lkotlinx/coroutines/k0;", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "Landroidx/paging/AccessorStateHolder;", "accessorState", "Landroidx/paging/AccessorStateHolder;", "Landroidx/paging/SingleRunner;", "isolationRunner", "Landroidx/paging/SingleRunner;", "Lkotlinx/coroutines/flow/i0;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/i0;", "state", "<init>", "(Lkotlinx/coroutines/k0;Landroidx/paging/RemoteMediator;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;
    /* access modifiers changed from: private */
    public final AccessorStateHolder<Key, Value> accessorState = new AccessorStateHolder<>();
    /* access modifiers changed from: private */
    public final SingleRunner isolationRunner = new SingleRunner(false);
    /* access modifiers changed from: private */
    public final RemoteMediator<Key, Value> remoteMediator;
    private final C15478k0 scope;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/RemoteMediatorAccessImpl$Companion;", "", "()V", "PRIORITY_APPEND_PREPEND", "", "PRIORITY_REFRESH", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediatorAccessor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediatorAccessor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RemoteMediatorAccessImpl(C15478k0 k0Var, RemoteMediator<Key, Value> remoteMediator2) {
        C13706o.m87929f(k0Var, "scope");
        C13706o.m87929f(remoteMediator2, "remoteMediator");
        this.scope = k0Var;
        this.remoteMediator = remoteMediator2;
    }

    /* access modifiers changed from: private */
    public final void launchBoundary() {
        C15561w1 unused = C15473j.m94492d(this.scope, (C13640g) null, (C15486m0) null, new RemoteMediatorAccessImpl$launchBoundary$1(this, (C13635d<? super RemoteMediatorAccessImpl$launchBoundary$1>) null), 3, (Object) null);
    }

    private final void launchRefresh() {
        C15561w1 unused = C15473j.m94492d(this.scope, (C13640g) null, (C15486m0) null, new RemoteMediatorAccessImpl$launchRefresh$1(this, (C13635d<? super RemoteMediatorAccessImpl$launchRefresh$1>) null), 3, (Object) null);
    }

    public C15299i0<LoadStates> getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object initialize(kotlin.coroutines.C13635d<? super androidx.paging.RemoteMediator.InitializeAction> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.RemoteMediatorAccessImpl$initialize$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = (androidx.paging.RemoteMediatorAccessImpl$initialize$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$initialize$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.paging.RemoteMediatorAccessImpl r0 = (androidx.paging.RemoteMediatorAccessImpl) r0
            p297ja.C13332o.m85685b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p297ja.C13332o.m85685b(r5)
            androidx.paging.RemoteMediator<Key, Value> r5 = r4.remoteMediator
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.initialize(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            r1 = r5
            androidx.paging.RemoteMediator$InitializeAction r1 = (androidx.paging.RemoteMediator.InitializeAction) r1
            androidx.paging.RemoteMediator$InitializeAction r2 = androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH
            if (r1 != r2) goto L_0x0054
            androidx.paging.AccessorStateHolder<Key, Value> r0 = r0.accessorState
            androidx.paging.RemoteMediatorAccessImpl$initialize$2$1 r1 = androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.INSTANCE
            r0.use(r1)
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.initialize(kotlin.coroutines.d):java.lang.Object");
    }

    public void requestLoad(LoadType loadType, PagingState<Key, Value> pagingState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(pagingState, "pagingState");
        if (!((Boolean) this.accessorState.use(new RemoteMediatorAccessImpl$requestLoad$newRequest$1(loadType, pagingState))).booleanValue()) {
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            launchRefresh();
        } else {
            launchBoundary();
        }
    }

    public void retryFailed(PagingState<Key, Value> pagingState) {
        C13706o.m87929f(pagingState, "pagingState");
        ArrayList<LoadType> arrayList = new ArrayList<>();
        this.accessorState.use(new RemoteMediatorAccessImpl$retryFailed$1(arrayList));
        for (LoadType requestLoad : arrayList) {
            requestLoad(requestLoad, pagingState);
        }
    }
}
