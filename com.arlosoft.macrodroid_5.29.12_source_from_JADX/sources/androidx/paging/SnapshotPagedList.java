package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\n\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo71668d2 = {"Landroidx/paging/SnapshotPagedList;", "", "T", "Landroidx/paging/PagedList;", "Lja/u;", "detach", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "callback", "dispatchCurrentLoadState", "", "index", "loadAroundInternal", "pagedList", "Landroidx/paging/PagedList;", "", "isImmutable", "Z", "()Z", "isDetached", "getLastKey", "()Ljava/lang/Object;", "lastKey", "<init>", "(Landroidx/paging/PagedList;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SnapshotPagedList.kt */
public final class SnapshotPagedList<T> extends PagedList<T> {
    private final boolean isDetached = true;
    private final boolean isImmutable = true;
    private final PagedList<T> pagedList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotPagedList(PagedList<T> pagedList2) {
        super(pagedList2.getPagingSource(), pagedList2.getCoroutineScope$paging_common(), pagedList2.getNotifyDispatcher$paging_common(), pagedList2.getStorage$paging_common().snapshot(), pagedList2.getConfig());
        C13706o.m87929f(pagedList2, "pagedList");
        this.pagedList = pagedList2;
    }

    public void detach() {
    }

    public void dispatchCurrentLoadState(C16269p<? super LoadType, ? super LoadState, C13339u> pVar) {
        C13706o.m87929f(pVar, "callback");
    }

    public Object getLastKey() {
        return this.pagedList.getLastKey();
    }

    public boolean isDetached() {
        return this.isDetached;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void loadAroundInternal(int i) {
    }
}
