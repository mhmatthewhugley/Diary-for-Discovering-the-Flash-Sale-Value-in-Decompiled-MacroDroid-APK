package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a:\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, mo71668d2 = {"", "T", "Landroidx/paging/NullPaddedList;", "newList", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/paging/NullPaddedDiffResult;", "computeDiff", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "diffResult", "Lja/u;", "dispatchDiff", "", "oldPosition", "transformAnchorIndex", "paging-runtime_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: NullPaddedListDiffHelper.kt */
public final class NullPaddedListDiffHelperKt {
    public static final <T> NullPaddedDiffResult computeDiff(NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2, DiffUtil.ItemCallback<T> itemCallback) {
        boolean z;
        C13706o.m87929f(nullPaddedList, "<this>");
        C13706o.m87929f(nullPaddedList2, "newList");
        C13706o.m87929f(itemCallback, "diffCallback");
        boolean z2 = true;
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new NullPaddedListDiffHelperKt$computeDiff$diffResult$1(nullPaddedList, nullPaddedList2, itemCallback, nullPaddedList.getStorageCount(), nullPaddedList2.getStorageCount()), true);
        C13706o.m87928e(calculateDiff, "NullPaddedList<T>.comput…    },\n        true\n    )");
        C16788e k = C16792h.m99549k(0, nullPaddedList.getStorageCount());
        if (!(k instanceof Collection) || !((Collection) k).isEmpty()) {
            Iterator it = k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (calculateDiff.convertOldPositionToNew(((C13603n0) it).nextInt()) != -1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return new NullPaddedDiffResult(calculateDiff, z2);
        }
        z2 = false;
        return new NullPaddedDiffResult(calculateDiff, z2);
    }

    public static final <T> void dispatchDiff(NullPaddedList<T> nullPaddedList, ListUpdateCallback listUpdateCallback, NullPaddedList<T> nullPaddedList2, NullPaddedDiffResult nullPaddedDiffResult) {
        C13706o.m87929f(nullPaddedList, "<this>");
        C13706o.m87929f(listUpdateCallback, "callback");
        C13706o.m87929f(nullPaddedList2, "newList");
        C13706o.m87929f(nullPaddedDiffResult, "diffResult");
        if (nullPaddedDiffResult.getHasOverlap()) {
            OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(nullPaddedList, nullPaddedList2, listUpdateCallback, nullPaddedDiffResult);
        } else {
            DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(listUpdateCallback, nullPaddedList, nullPaddedList2);
        }
    }

    public static final int transformAnchorIndex(NullPaddedList<?> nullPaddedList, NullPaddedDiffResult nullPaddedDiffResult, NullPaddedList<?> nullPaddedList2, int i) {
        int convertOldPositionToNew;
        C13706o.m87929f(nullPaddedList, "<this>");
        C13706o.m87929f(nullPaddedDiffResult, "diffResult");
        C13706o.m87929f(nullPaddedList2, "newList");
        if (!nullPaddedDiffResult.getHasOverlap()) {
            return C16792h.m99545g(i, C16792h.m99549k(0, nullPaddedList2.getSize()));
        }
        int placeholdersBefore = i - nullPaddedList.getPlaceholdersBefore();
        if (placeholdersBefore >= 0 && placeholdersBefore < nullPaddedList.getStorageCount()) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + placeholdersBefore;
                if (i4 >= 0 && i4 < nullPaddedList.getStorageCount() && (convertOldPositionToNew = nullPaddedDiffResult.getDiff().convertOldPositionToNew(i4)) != -1) {
                    return convertOldPositionToNew + nullPaddedList2.getPlaceholdersBefore();
                }
                if (i3 > 29) {
                    break;
                }
                i2 = i3;
            }
        }
        return C16792h.m99545g(i, C16792h.m99549k(0, nullPaddedList2.getSize()));
    }
}
