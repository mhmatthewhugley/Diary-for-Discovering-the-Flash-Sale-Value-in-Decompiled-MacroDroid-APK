package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "T", "Landroidx/paging/NullPaddedList;", "oldList", "newList", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "Landroidx/paging/NullPaddedDiffResult;", "diffResult", "Lja/u;", "dispatchDiff", "<init>", "()V", "PlaceholderUsingUpdateCallback", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: NullPaddedListDiffHelper.kt */
public final class OverlappingListsDiffDispatcher {
    public static final OverlappingListsDiffDispatcher INSTANCE = new OverlappingListsDiffDispatcher();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B+\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001f¨\u0006'"}, mo71668d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback;", "T", "Landroidx/recyclerview/widget/ListUpdateCallback;", "", "offsetForDispatch", "Lja/u;", "fixTrailingPlaceholders", "fixLeadingPlaceholders", "position", "count", "", "dispatchInsertAsPlaceholderBefore", "dispatchInsertAsPlaceholderAfter", "dispatchRemovalAsPlaceholdersBefore", "dispatchRemovalAsPlaceholdersAfter", "fixPlaceholders", "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", "payload", "onChanged", "Landroidx/paging/NullPaddedList;", "oldList", "Landroidx/paging/NullPaddedList;", "newList", "callback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "placeholdersBefore", "I", "placeholdersAfter", "storageCount", "placeholdersBeforeState", "placeholdersAfterState", "<init>", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;)V", "Companion", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: NullPaddedListDiffHelper.kt */
    private static final class PlaceholderUsingUpdateCallback<T> implements ListUpdateCallback {
        public static final Companion Companion = new Companion((C13695i) null);
        private static final int UNUSED = 1;
        private static final int USED_FOR_ADDITION = 3;
        private static final int USED_FOR_REMOVAL = 2;
        private final ListUpdateCallback callback;
        private final NullPaddedList<T> newList;
        private final NullPaddedList<T> oldList;
        private int placeholdersAfter;
        private int placeholdersAfterState = 1;
        /* access modifiers changed from: private */
        public int placeholdersBefore;
        private int placeholdersBeforeState = 1;
        private int storageCount;

        @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo71668d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback$Companion;", "", "()V", "UNUSED", "", "USED_FOR_ADDITION", "USED_FOR_REMOVAL", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: NullPaddedListDiffHelper.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C13695i iVar) {
                this();
            }
        }

        public PlaceholderUsingUpdateCallback(NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2, ListUpdateCallback listUpdateCallback) {
            C13706o.m87929f(nullPaddedList, "oldList");
            C13706o.m87929f(nullPaddedList2, "newList");
            C13706o.m87929f(listUpdateCallback, "callback");
            this.oldList = nullPaddedList;
            this.newList = nullPaddedList2;
            this.callback = listUpdateCallback;
            this.placeholdersBefore = nullPaddedList.getPlaceholdersBefore();
            this.placeholdersAfter = nullPaddedList.getPlaceholdersAfter();
            this.storageCount = nullPaddedList.getStorageCount();
        }

        private final boolean dispatchInsertAsPlaceholderAfter(int i, int i2) {
            if (i < this.storageCount || this.placeholdersAfterState == 2) {
                return false;
            }
            int min = Math.min(i2, this.placeholdersAfter);
            if (min > 0) {
                this.placeholdersAfterState = 3;
                this.callback.onChanged(this.placeholdersBefore + i, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersAfter -= min;
            }
            int i3 = i2 - min;
            if (i3 <= 0) {
                return true;
            }
            this.callback.onInserted(i + min + this.placeholdersBefore, i3);
            return true;
        }

        private final boolean dispatchInsertAsPlaceholderBefore(int i, int i2) {
            if (i > 0 || this.placeholdersBeforeState == 2) {
                return false;
            }
            int min = Math.min(i2, this.placeholdersBefore);
            if (min > 0) {
                this.placeholdersBeforeState = 3;
                this.callback.onChanged((0 - min) + this.placeholdersBefore, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersBefore -= min;
            }
            int i3 = i2 - min;
            if (i3 <= 0) {
                return true;
            }
            this.callback.onInserted(this.placeholdersBefore + 0, i3);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersAfter(int i, int i2) {
            if (i + i2 < this.storageCount || this.placeholdersAfterState == 3) {
                return false;
            }
            int b = C16792h.m99540b(Math.min(this.newList.getPlaceholdersAfter() - this.placeholdersAfter, i2), 0);
            int i3 = i2 - b;
            if (b > 0) {
                this.placeholdersAfterState = 2;
                this.callback.onChanged(this.placeholdersBefore + i, b, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.placeholdersAfter += b;
            }
            if (i3 <= 0) {
                return true;
            }
            this.callback.onRemoved(i + b + this.placeholdersBefore, i3);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersBefore(int i, int i2) {
            if (i > 0 || this.placeholdersBeforeState == 3) {
                return false;
            }
            int b = C16792h.m99540b(Math.min(this.newList.getPlaceholdersBefore() - this.placeholdersBefore, i2), 0);
            int i3 = i2 - b;
            if (i3 > 0) {
                this.callback.onRemoved(this.placeholdersBefore + 0, i3);
            }
            if (b <= 0) {
                return true;
            }
            this.placeholdersBeforeState = 2;
            this.callback.onChanged(this.placeholdersBefore + 0, b, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.placeholdersBefore += b;
            return true;
        }

        private final void fixLeadingPlaceholders() {
            int min = Math.min(this.oldList.getPlaceholdersBefore(), this.placeholdersBefore);
            int placeholdersBefore2 = this.newList.getPlaceholdersBefore() - this.placeholdersBefore;
            if (placeholdersBefore2 > 0) {
                if (min > 0) {
                    this.callback.onChanged(0, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.callback.onInserted(0, placeholdersBefore2);
            } else if (placeholdersBefore2 < 0) {
                this.callback.onRemoved(0, -placeholdersBefore2);
                int i = min + placeholdersBefore2;
                if (i > 0) {
                    this.callback.onChanged(0, i, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.placeholdersBefore = this.newList.getPlaceholdersBefore();
        }

        private final void fixTrailingPlaceholders() {
            int min = Math.min(this.oldList.getPlaceholdersAfter(), this.placeholdersAfter);
            int placeholdersAfter2 = this.newList.getPlaceholdersAfter();
            int i = this.placeholdersAfter;
            int i2 = placeholdersAfter2 - i;
            int i3 = this.placeholdersBefore + this.storageCount + i;
            int i4 = i3 - min;
            boolean z = i4 != this.oldList.getSize() - min;
            if (i2 > 0) {
                this.callback.onInserted(i3, i2);
            } else if (i2 < 0) {
                this.callback.onRemoved(i3 + i2, -i2);
                min += i2;
            }
            if (min > 0 && z) {
                this.callback.onChanged(i4, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.placeholdersAfter = this.newList.getPlaceholdersAfter();
        }

        private final int offsetForDispatch(int i) {
            return i + this.placeholdersBefore;
        }

        public final void fixPlaceholders() {
            fixLeadingPlaceholders();
            fixTrailingPlaceholders();
        }

        public void onChanged(int i, int i2, Object obj) {
            this.callback.onChanged(i + this.placeholdersBefore, i2, obj);
        }

        public void onInserted(int i, int i2) {
            if (!dispatchInsertAsPlaceholderAfter(i, i2) && !dispatchInsertAsPlaceholderBefore(i, i2)) {
                this.callback.onInserted(i + this.placeholdersBefore, i2);
            }
            this.storageCount += i2;
        }

        public void onMoved(int i, int i2) {
            this.callback.onMoved(i + this.placeholdersBefore, i2 + this.placeholdersBefore);
        }

        public void onRemoved(int i, int i2) {
            if (!dispatchRemovalAsPlaceholdersAfter(i, i2) && !dispatchRemovalAsPlaceholdersBefore(i, i2)) {
                this.callback.onRemoved(i + this.placeholdersBefore, i2);
            }
            this.storageCount -= i2;
        }
    }

    private OverlappingListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(NullPaddedList<T> nullPaddedList, NullPaddedList<T> nullPaddedList2, ListUpdateCallback listUpdateCallback, NullPaddedDiffResult nullPaddedDiffResult) {
        C13706o.m87929f(nullPaddedList, "oldList");
        C13706o.m87929f(nullPaddedList2, "newList");
        C13706o.m87929f(listUpdateCallback, "callback");
        C13706o.m87929f(nullPaddedDiffResult, "diffResult");
        PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new PlaceholderUsingUpdateCallback(nullPaddedList, nullPaddedList2, listUpdateCallback);
        nullPaddedDiffResult.getDiff().dispatchUpdatesTo((ListUpdateCallback) placeholderUsingUpdateCallback);
        placeholderUsingUpdateCallback.fixPlaceholders();
    }
}
