package androidx.paging;

import androidx.paging.ViewportHint;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, mo71668d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/ViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: HintHandler.kt */
public final class HintHandlerKt {
    public static final boolean shouldPrioritizeOver(ViewportHint viewportHint, ViewportHint viewportHint2, LoadType loadType) {
        C13706o.m87929f(viewportHint, "<this>");
        C13706o.m87929f(loadType, "loadType");
        if (viewportHint2 != null && (!(viewportHint2 instanceof ViewportHint.Initial) || !(viewportHint instanceof ViewportHint.Access))) {
            if ((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) {
                return false;
            }
            if (viewportHint.getOriginalPageOffsetFirst() == viewportHint2.getOriginalPageOffsetFirst() && viewportHint.getOriginalPageOffsetLast() == viewportHint2.getOriginalPageOffsetLast() && viewportHint2.presentedItemsBeyondAnchor$paging_common(loadType) <= viewportHint.presentedItemsBeyondAnchor$paging_common(loadType)) {
                return false;
            }
        }
        return true;
    }
}
