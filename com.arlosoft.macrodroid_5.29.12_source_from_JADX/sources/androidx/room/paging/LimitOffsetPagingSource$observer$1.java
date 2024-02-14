package androidx.room.paging;

import androidx.room.InvalidationTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"androidx/room/paging/LimitOffsetPagingSource$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "Lja/u;", "onInvalidated", "room-paging_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: LimitOffsetPagingSource.kt */
public final class LimitOffsetPagingSource$observer$1 extends InvalidationTracker.Observer {
    final /* synthetic */ LimitOffsetPagingSource<Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LimitOffsetPagingSource$observer$1(String[] strArr, LimitOffsetPagingSource<Value> limitOffsetPagingSource) {
        super(strArr);
        this.this$0 = limitOffsetPagingSource;
    }

    public void onInvalidated(Set<String> set) {
        C13706o.m87929f(set, "tables");
        this.this$0.invalidate();
    }
}
