package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, mo71668d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/GenerationalViewportHint;", "previous", "loadType", "Landroidx/paging/LoadType;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, LoadType loadType) {
        C13706o.m87929f(generationalViewportHint, "<this>");
        C13706o.m87929f(generationalViewportHint2, "previous");
        C13706o.m87929f(loadType, "loadType");
        if (generationalViewportHint.getGenerationId() > generationalViewportHint2.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < generationalViewportHint2.getGenerationId()) {
            return false;
        }
        return HintHandlerKt.shouldPrioritizeOver(generationalViewportHint.getHint(), generationalViewportHint2.getHint(), loadType);
    }
}
