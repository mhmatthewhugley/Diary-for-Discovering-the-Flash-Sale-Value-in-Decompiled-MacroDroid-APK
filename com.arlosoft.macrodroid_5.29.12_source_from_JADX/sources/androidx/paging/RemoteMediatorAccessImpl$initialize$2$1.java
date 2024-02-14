package androidx.paging;

import androidx.paging.AccessorState;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/AccessorState;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class RemoteMediatorAccessImpl$initialize$2$1 extends C13708q implements C16265l<AccessorState<Key, Value>, C13339u> {
    public static final RemoteMediatorAccessImpl$initialize$2$1 INSTANCE = new RemoteMediatorAccessImpl$initialize$2$1();

    RemoteMediatorAccessImpl$initialize$2$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AccessorState) obj);
        return C13339u.f61331a;
    }

    public final void invoke(AccessorState<Key, Value> accessorState) {
        C13706o.m87929f(accessorState, "it");
        LoadType loadType = LoadType.APPEND;
        AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
        accessorState.setBlockState(loadType, blockState);
        accessorState.setBlockState(LoadType.PREPEND, blockState);
    }
}
