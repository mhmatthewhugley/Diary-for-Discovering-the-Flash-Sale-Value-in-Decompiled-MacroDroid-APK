package androidx.paging;

import androidx.paging.LoadState;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C13584h;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;
import p297ja.C13337s;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nJ \u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0018\u00010\u0013J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0010J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, mo71668d2 = {"Landroidx/paging/AccessorState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/LoadState;", "computeLoadTypeState", "Landroidx/paging/LoadStates;", "computeLoadStates", "Landroidx/paging/PagingState;", "pagingState", "", "add", "Landroidx/paging/AccessorState$BlockState;", "state", "Lja/u;", "setBlockState", "getPendingRefresh", "Lja/m;", "getPendingBoundary", "clearPendingRequests", "clearPendingRequest", "clearErrors", "Landroidx/paging/LoadState$Error;", "errorState", "setError", "", "blockStates", "[Landroidx/paging/AccessorState$BlockState;", "errors", "[Landroidx/paging/LoadState$Error;", "Lkotlin/collections/h;", "Landroidx/paging/AccessorState$PendingRequest;", "pendingRequests", "Lkotlin/collections/h;", "<init>", "()V", "BlockState", "PendingRequest", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class AccessorState<Key, Value> {
    private final BlockState[] blockStates;
    private final LoadState.Error[] errors;
    private final C13584h<PendingRequest<Key, Value>> pendingRequests;

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Landroidx/paging/AccessorState$BlockState;", "", "(Ljava/lang/String;I)V", "UNBLOCKED", "COMPLETED", "REQUIRES_REFRESH", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediatorAccessor.kt */
    public enum BlockState {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    @Metadata(mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/AccessorState$PendingRequest;", "Key", "", "Value", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V", "getLoadType", "()Landroidx/paging/LoadType;", "getPagingState", "()Landroidx/paging/PagingState;", "setPagingState", "(Landroidx/paging/PagingState;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediatorAccessor.kt */
    public static final class PendingRequest<Key, Value> {
        private final LoadType loadType;
        private PagingState<Key, Value> pagingState;

        public PendingRequest(LoadType loadType2, PagingState<Key, Value> pagingState2) {
            C13706o.m87929f(loadType2, "loadType");
            C13706o.m87929f(pagingState2, "pagingState");
            this.loadType = loadType2;
            this.pagingState = pagingState2;
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final PagingState<Key, Value> getPagingState() {
            return this.pagingState;
        }

        public final void setPagingState(PagingState<Key, Value> pagingState2) {
            C13706o.m87929f(pagingState2, "<set-?>");
            this.pagingState = pagingState2;
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RemoteMediatorAccessor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BlockState.values().length];
            iArr[BlockState.COMPLETED.ordinal()] = 1;
            iArr[BlockState.REQUIRES_REFRESH.ordinal()] = 2;
            iArr[BlockState.UNBLOCKED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoadType.values().length];
            iArr2[LoadType.REFRESH.ordinal()] = 1;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AccessorState() {
        int length = LoadType.values().length;
        BlockState[] blockStateArr = new BlockState[length];
        for (int i = 0; i < length; i++) {
            blockStateArr[i] = BlockState.UNBLOCKED;
        }
        this.blockStates = blockStateArr;
        int length2 = LoadType.values().length;
        LoadState.Error[] errorArr = new LoadState.Error[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            errorArr[i2] = null;
        }
        this.errors = errorArr;
        this.pendingRequests = new C13584h<>();
    }

    private final LoadState computeLoadTypeState(LoadType loadType) {
        boolean z;
        BlockState blockState = this.blockStates[loadType.ordinal()];
        C13584h<PendingRequest<Key, Value>> hVar = this.pendingRequests;
        boolean z2 = false;
        if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
            Iterator<T> it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((PendingRequest) it.next()).getLoadType() == loadType) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 && blockState != BlockState.REQUIRES_REFRESH) {
            return LoadState.Loading.INSTANCE;
        }
        LoadState.Error error = this.errors[loadType.ordinal()];
        if (error != null) {
            return error;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[blockState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LoadState.NotLoading.Companion.getIncomplete$paging_common();
            }
            if (i == 3) {
                return LoadState.NotLoading.Companion.getIncomplete$paging_common();
            }
            throw new NoWhenBranchMatchedException();
        } else if (WhenMappings.$EnumSwitchMapping$1[loadType.ordinal()] == 1) {
            return LoadState.NotLoading.Companion.getIncomplete$paging_common();
        } else {
            return LoadState.NotLoading.Companion.getComplete$paging_common();
        }
    }

    public final boolean add(LoadType loadType, PagingState<Key, Value> pagingState) {
        T t;
        boolean z;
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(pagingState, "pagingState");
        Iterator<T> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((PendingRequest) t).getLoadType() == loadType) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        PendingRequest pendingRequest = (PendingRequest) t;
        if (pendingRequest != null) {
            pendingRequest.setPagingState(pagingState);
            return false;
        }
        BlockState blockState = this.blockStates[loadType.ordinal()];
        if (blockState == BlockState.REQUIRES_REFRESH && loadType != LoadType.REFRESH) {
            this.pendingRequests.add(new PendingRequest(loadType, pagingState));
            return false;
        } else if (blockState != BlockState.UNBLOCKED && loadType != LoadType.REFRESH) {
            return false;
        } else {
            LoadType loadType2 = LoadType.REFRESH;
            if (loadType == loadType2) {
                setError(loadType2, (LoadState.Error) null);
            }
            if (this.errors[loadType.ordinal()] == null) {
                return this.pendingRequests.add(new PendingRequest(loadType, pagingState));
            }
            return false;
        }
    }

    public final void clearErrors() {
        int length = this.errors.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.errors[i] = null;
                if (i2 <= length) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final void clearPendingRequest(LoadType loadType) {
        C13706o.m87929f(loadType, "loadType");
        boolean unused = C13624y.m87795D(this.pendingRequests, new AccessorState$clearPendingRequest$1(loadType));
    }

    public final void clearPendingRequests() {
        this.pendingRequests.clear();
    }

    public final LoadStates computeLoadStates() {
        return new LoadStates(computeLoadTypeState(LoadType.REFRESH), computeLoadTypeState(LoadType.PREPEND), computeLoadTypeState(LoadType.APPEND));
    }

    public final C13328m<LoadType, PagingState<Key, Value>> getPendingBoundary() {
        T t;
        boolean z;
        Iterator<T> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            PendingRequest pendingRequest = (PendingRequest) t;
            if (pendingRequest.getLoadType() == LoadType.REFRESH || this.blockStates[pendingRequest.getLoadType().ordinal()] != BlockState.UNBLOCKED) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        PendingRequest pendingRequest2 = (PendingRequest) t;
        if (pendingRequest2 == null) {
            return null;
        }
        return C13337s.m85692a(pendingRequest2.getLoadType(), pendingRequest2.getPagingState());
    }

    public final PagingState<Key, Value> getPendingRefresh() {
        T t;
        boolean z;
        Iterator<T> it = this.pendingRequests.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((PendingRequest) t).getLoadType() == LoadType.REFRESH) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        PendingRequest pendingRequest = (PendingRequest) t;
        if (pendingRequest == null) {
            return null;
        }
        return pendingRequest.getPagingState();
    }

    public final void setBlockState(LoadType loadType, BlockState blockState) {
        C13706o.m87929f(loadType, "loadType");
        C13706o.m87929f(blockState, "state");
        this.blockStates[loadType.ordinal()] = blockState;
    }

    public final void setError(LoadType loadType, LoadState.Error error) {
        C13706o.m87929f(loadType, "loadType");
        this.errors[loadType.ordinal()] = error;
    }
}
