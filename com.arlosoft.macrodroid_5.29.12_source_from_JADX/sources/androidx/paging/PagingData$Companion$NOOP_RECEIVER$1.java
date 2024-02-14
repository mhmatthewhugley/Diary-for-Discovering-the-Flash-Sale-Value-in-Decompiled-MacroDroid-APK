package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo71668d2 = {"androidx/paging/PagingData$Companion$NOOP_RECEIVER$1", "Landroidx/paging/UiReceiver;", "Landroidx/paging/ViewportHint;", "viewportHint", "Lja/u;", "accessHint", "retry", "refresh", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagingData.kt */
public final class PagingData$Companion$NOOP_RECEIVER$1 implements UiReceiver {
    PagingData$Companion$NOOP_RECEIVER$1() {
    }

    public void accessHint(ViewportHint viewportHint) {
        C13706o.m87929f(viewportHint, "viewportHint");
    }

    public void refresh() {
    }

    public void retry() {
    }
}
