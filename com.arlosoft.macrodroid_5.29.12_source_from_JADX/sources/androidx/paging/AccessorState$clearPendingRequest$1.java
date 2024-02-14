package androidx.paging;

import androidx.paging.AccessorState;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/AccessorState$PendingRequest;", "it", "", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: RemoteMediatorAccessor.kt */
final class AccessorState$clearPendingRequest$1 extends C13708q implements C16265l<AccessorState.PendingRequest<Key, Value>, Boolean> {
    final /* synthetic */ LoadType $loadType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AccessorState$clearPendingRequest$1(LoadType loadType) {
        super(1);
        this.$loadType = loadType;
    }

    public final Boolean invoke(AccessorState.PendingRequest<Key, Value> pendingRequest) {
        C13706o.m87929f(pendingRequest, "it");
        return Boolean.valueOf(pendingRequest.getLoadType() == this.$loadType);
    }
}
