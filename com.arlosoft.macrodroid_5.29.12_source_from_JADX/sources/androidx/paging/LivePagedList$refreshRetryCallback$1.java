package androidx.paging;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n"}, mo71668d2 = {"", "Key", "Value", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: LivePagedList.kt */
final class LivePagedList$refreshRetryCallback$1 implements Runnable {
    final /* synthetic */ LivePagedList<Key, Value> this$0;

    LivePagedList$refreshRetryCallback$1(LivePagedList<Key, Value> livePagedList) {
        this.this$0 = livePagedList;
    }

    public final void run() {
        this.this$0.invalidate(true);
    }
}
