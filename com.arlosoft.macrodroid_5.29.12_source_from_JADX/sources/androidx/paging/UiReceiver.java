package androidx.paging;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/UiReceiver;", "", "Landroidx/paging/ViewportHint;", "viewportHint", "Lja/u;", "accessHint", "retry", "refresh", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: UiReceiver.kt */
public interface UiReceiver {
    void accessHint(ViewportHint viewportHint);

    void refresh();

    void retry();
}
