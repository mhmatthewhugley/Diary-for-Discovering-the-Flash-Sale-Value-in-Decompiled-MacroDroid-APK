package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002J4\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\f*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u0013"}, mo71668d2 = {"Landroidx/paging/DistinctListsDiffDispatcher;", "", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "", "startBoundary", "endBoundary", "start", "end", "payload", "Lja/u;", "dispatchChange", "T", "Landroidx/paging/NullPaddedList;", "oldList", "newList", "dispatchDiff", "<init>", "()V", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: NullPaddedListDiffHelper.kt */
public final class DistinctListsDiffDispatcher {
    public static final DistinctListsDiffDispatcher INSTANCE = new DistinctListsDiffDispatcher();

    private DistinctListsDiffDispatcher() {
    }

    private final void dispatchChange(ListUpdateCallback listUpdateCallback, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            listUpdateCallback.onChanged(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            listUpdateCallback.onChanged(i2, i6, obj);
        }
    }

    public final <T> void dispatchDiff(ListUpdateCallback listUpdateCallback, NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2) {
        C13706o.m87929f(listUpdateCallback, "callback");
        C13706o.m87929f(nullPaddedList, "oldList");
        C13706o.m87929f(nullPaddedList2, "newList");
        int max = Math.max(nullPaddedList.getPlaceholdersBefore(), nullPaddedList2.getPlaceholdersBefore());
        int min = Math.min(nullPaddedList.getPlaceholdersBefore() + nullPaddedList.getStorageCount(), nullPaddedList2.getPlaceholdersBefore() + nullPaddedList2.getStorageCount());
        int i = min - max;
        if (i > 0) {
            listUpdateCallback.onRemoved(max, i);
            listUpdateCallback.onInserted(max, i);
        }
        int min2 = Math.min(max, min);
        ListUpdateCallback listUpdateCallback2 = listUpdateCallback;
        int i2 = min2;
        int max2 = Math.max(max, min);
        dispatchChange(listUpdateCallback2, i2, max2, C16792h.m99542d(nullPaddedList.getPlaceholdersBefore(), nullPaddedList2.getSize()), C16792h.m99542d(nullPaddedList.getPlaceholdersBefore() + nullPaddedList.getStorageCount(), nullPaddedList2.getSize()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        dispatchChange(listUpdateCallback2, i2, max2, C16792h.m99542d(nullPaddedList2.getPlaceholdersBefore(), nullPaddedList.getSize()), C16792h.m99542d(nullPaddedList2.getPlaceholdersBefore() + nullPaddedList2.getStorageCount(), nullPaddedList.getSize()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int size = nullPaddedList2.getSize() - nullPaddedList.getSize();
        if (size > 0) {
            listUpdateCallback.onInserted(nullPaddedList.getSize(), size);
        } else if (size < 0) {
            listUpdateCallback.onRemoved(nullPaddedList.getSize() + size, -size);
        }
    }
}
