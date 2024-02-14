package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/AccessorState;", "accessorState", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$retryFailed$1 extends C13708q implements C16265l<AccessorState<Key, Value>, C13339u> {
    final /* synthetic */ List<LoadType> $toBeStarted;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$retryFailed$1(List<LoadType> list) {
        super(1);
        this.$toBeStarted = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AccessorState) obj);
        return C13339u.f61331a;
    }

    public final void invoke(AccessorState<Key, Value> accessorState) {
        C13706o.m87929f(accessorState, "accessorState");
        LoadStates computeLoadStates = accessorState.computeLoadStates();
        boolean z = computeLoadStates.getRefresh() instanceof LoadState.Error;
        accessorState.clearErrors();
        if (z) {
            List<LoadType> list = this.$toBeStarted;
            LoadType loadType = LoadType.REFRESH;
            list.add(loadType);
            accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
        }
        if (computeLoadStates.getAppend() instanceof LoadState.Error) {
            if (!z) {
                this.$toBeStarted.add(LoadType.APPEND);
            }
            accessorState.clearPendingRequest(LoadType.APPEND);
        }
        if (computeLoadStates.getPrepend() instanceof LoadState.Error) {
            if (!z) {
                this.$toBeStarted.add(LoadType.PREPEND);
            }
            accessorState.clearPendingRequest(LoadType.PREPEND);
        }
    }
}
