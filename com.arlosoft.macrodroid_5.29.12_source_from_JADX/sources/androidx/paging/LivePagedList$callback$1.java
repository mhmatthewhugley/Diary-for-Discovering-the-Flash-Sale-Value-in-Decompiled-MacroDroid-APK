package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n"}, mo71668d2 = {"", "Key", "Value", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: LivePagedList.kt */
final class LivePagedList$callback$1 extends C13708q implements C16254a<C13339u> {
    final /* synthetic */ LivePagedList<Key, Value> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LivePagedList$callback$1(LivePagedList<Key, Value> livePagedList) {
        super(0);
        this.this$0 = livePagedList;
    }

    public final void invoke() {
        this.this$0.invalidate(true);
    }
}
