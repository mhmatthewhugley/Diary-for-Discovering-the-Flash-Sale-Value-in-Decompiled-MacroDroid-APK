package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/AccessorState;", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$launchRefresh$1$1$1$1 extends C13708q implements C16265l<AccessorState<Key, Value>, Boolean> {
    final /* synthetic */ RemoteMediator.MediatorResult $loadResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchRefresh$1$1$1$1(RemoteMediator.MediatorResult mediatorResult) {
        super(1);
        this.$loadResult = mediatorResult;
    }

    public final Boolean invoke(AccessorState<Key, Value> accessorState) {
        C13706o.m87929f(accessorState, "it");
        LoadType loadType = LoadType.REFRESH;
        accessorState.clearPendingRequest(loadType);
        if (((RemoteMediator.MediatorResult.Success) this.$loadResult).endOfPaginationReached()) {
            AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
            accessorState.setBlockState(loadType, blockState);
            accessorState.setBlockState(LoadType.PREPEND, blockState);
            accessorState.setBlockState(LoadType.APPEND, blockState);
            accessorState.clearPendingRequests();
        } else {
            LoadType loadType2 = LoadType.PREPEND;
            AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
            accessorState.setBlockState(loadType2, blockState2);
            accessorState.setBlockState(LoadType.APPEND, blockState2);
        }
        accessorState.setError(LoadType.PREPEND, (LoadState.Error) null);
        accessorState.setError(LoadType.APPEND, (LoadState.Error) null);
        return Boolean.valueOf(accessorState.getPendingBoundary() != null);
    }
}
