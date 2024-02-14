package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.ViewportHint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0017\b\u0000\u0018\u0000 :*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002:;B\u0015\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b8\u00109J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0015\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001c\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020!J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0004R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048\u0016@RX\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010-\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048\u0016@RX\u000e¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R$\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048\u0016@RX\u000e¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0014\u00102\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0014\u00104\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010,R\u0014\u00106\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,¨\u0006<"}, mo71668d2 = {"Landroidx/paging/PagePresenter;", "", "T", "Landroidx/paging/NullPaddedList;", "", "index", "Lja/u;", "checkIndex", "", "Landroidx/paging/TransformablePage;", "fullCount", "Landroidx/paging/PageEvent$Insert;", "insert", "Landroidx/paging/PagePresenter$ProcessPageEventCallback;", "callback", "insertPage", "Lwa/e;", "pageOffsetsToDrop", "dropPagesWithOffsets", "Landroidx/paging/PageEvent$Drop;", "drop", "dropPages", "", "toString", "get", "(I)Ljava/lang/Object;", "Landroidx/paging/ItemSnapshotList;", "snapshot", "localIndex", "getFromStorage", "Landroidx/paging/PageEvent;", "pageEvent", "processEvent", "Landroidx/paging/ViewportHint$Initial;", "initializeHint", "Landroidx/paging/ViewportHint$Access;", "accessHintForPresenterIndex", "", "pages", "Ljava/util/List;", "<set-?>", "storageCount", "I", "getStorageCount", "()I", "placeholdersBefore", "getPlaceholdersBefore", "placeholdersAfter", "getPlaceholdersAfter", "getOriginalPageOffsetFirst", "originalPageOffsetFirst", "getOriginalPageOffsetLast", "originalPageOffsetLast", "getSize", "size", "insertEvent", "<init>", "(Landroidx/paging/PageEvent$Insert;)V", "Companion", "ProcessPageEventCallback", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagePresenter.kt */
public final class PagePresenter<T> implements NullPaddedList<T> {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final PagePresenter<Object> INITIAL = new PagePresenter<>(PageEvent.Insert.Companion.getEMPTY_REFRESH_LOCAL());
    private final List<TransformablePage<T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int storageCount;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0001H\u0000¢\u0006\u0002\b\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo71668d2 = {"Landroidx/paging/PagePresenter$Companion;", "", "()V", "INITIAL", "Landroidx/paging/PagePresenter;", "initial", "T", "initial$paging_common", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PagePresenter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final <T> PagePresenter<T> initial$paging_common() {
            return PagePresenter.INITIAL;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H&¨\u0006\u0013"}, mo71668d2 = {"Landroidx/paging/PagePresenter$ProcessPageEventCallback;", "", "", "position", "count", "Lja/u;", "onChanged", "onInserted", "onRemoved", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Landroidx/paging/LoadState;", "loadState", "onStateUpdate", "Landroidx/paging/LoadStates;", "source", "mediator", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagePresenter.kt */
    public interface ProcessPageEventCallback {
        void onChanged(int i, int i2);

        void onInserted(int i, int i2);

        void onRemoved(int i, int i2);

        void onStateUpdate(LoadStates loadStates, LoadStates loadStates2);

        void onStateUpdate(LoadType loadType, boolean z, LoadState loadState);
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PagePresenter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PagePresenter(PageEvent.Insert<T> insert) {
        C13706o.m87929f(insert, "insertEvent");
        this.pages = C13566b0.m87405I0(insert.getPages());
        this.storageCount = fullCount(insert.getPages());
        this.placeholdersBefore = insert.getPlaceholdersBefore();
        this.placeholdersAfter = insert.getPlaceholdersAfter();
    }

    private final void checkIndex(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + getSize());
        }
    }

    private final void dropPages(PageEvent.Drop<T> drop, ProcessPageEventCallback processPageEventCallback) {
        int size = getSize();
        LoadType loadType = drop.getLoadType();
        LoadType loadType2 = LoadType.PREPEND;
        if (loadType == loadType2) {
            int placeholdersBefore2 = getPlaceholdersBefore();
            this.storageCount = getStorageCount() - dropPagesWithOffsets(new C16788e(drop.getMinPageOffset(), drop.getMaxPageOffset()));
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            int size2 = getSize() - size;
            if (size2 > 0) {
                processPageEventCallback.onInserted(0, size2);
            } else if (size2 < 0) {
                processPageEventCallback.onRemoved(0, -size2);
            }
            int max = Math.max(0, placeholdersBefore2 + size2);
            int placeholdersRemaining = drop.getPlaceholdersRemaining() - max;
            if (placeholdersRemaining > 0) {
                processPageEventCallback.onChanged(max, placeholdersRemaining);
            }
            processPageEventCallback.onStateUpdate(loadType2, false, LoadState.NotLoading.Companion.getIncomplete$paging_common());
            return;
        }
        int placeholdersAfter2 = getPlaceholdersAfter();
        this.storageCount = getStorageCount() - dropPagesWithOffsets(new C16788e(drop.getMinPageOffset(), drop.getMaxPageOffset()));
        this.placeholdersAfter = drop.getPlaceholdersRemaining();
        int size3 = getSize() - size;
        if (size3 > 0) {
            processPageEventCallback.onInserted(size, size3);
        } else if (size3 < 0) {
            processPageEventCallback.onRemoved(size + size3, -size3);
        }
        int placeholdersRemaining2 = drop.getPlaceholdersRemaining() - (placeholdersAfter2 - (size3 < 0 ? Math.min(placeholdersAfter2, -size3) : 0));
        if (placeholdersRemaining2 > 0) {
            processPageEventCallback.onChanged(getSize() - drop.getPlaceholdersRemaining(), placeholdersRemaining2);
        }
        processPageEventCallback.onStateUpdate(LoadType.APPEND, false, LoadState.NotLoading.Companion.getIncomplete$paging_common());
    }

    private final int dropPagesWithOffsets(C16788e eVar) {
        boolean z;
        Iterator<TransformablePage<T>> it = this.pages.iterator();
        int i = 0;
        while (it.hasNext()) {
            TransformablePage next = it.next();
            int[] originalPageOffsets = next.getOriginalPageOffsets();
            int length = originalPageOffsets.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (eVar.mo79775k(originalPageOffsets[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                i += next.getData().size();
                it.remove();
            }
        }
        return i;
    }

    private final int fullCount(List<TransformablePage<T>> list) {
        int i = 0;
        for (TransformablePage data : list) {
            i += data.getData().size();
        }
        return i;
    }

    private final int getOriginalPageOffsetFirst() {
        Integer T = C13596m.m87595T(((TransformablePage) C13566b0.m87422W(this.pages)).getOriginalPageOffsets());
        C13706o.m87926c(T);
        return T.intValue();
    }

    private final int getOriginalPageOffsetLast() {
        Integer S = C13596m.m87594S(((TransformablePage) C13566b0.m87434i0(this.pages)).getOriginalPageOffsets());
        C13706o.m87926c(S);
        return S.intValue();
    }

    private final void insertPage(PageEvent.Insert<T> insert, ProcessPageEventCallback processPageEventCallback) {
        int fullCount = fullCount(insert.getPages());
        int size = getSize();
        int i = WhenMappings.$EnumSwitchMapping$0[insert.getLoadType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int min = Math.min(getPlaceholdersBefore(), fullCount);
                int i2 = fullCount - min;
                this.pages.addAll(0, insert.getPages());
                this.storageCount = getStorageCount() + fullCount;
                this.placeholdersBefore = insert.getPlaceholdersBefore();
                processPageEventCallback.onChanged(getPlaceholdersBefore() - min, min);
                processPageEventCallback.onInserted(0, i2);
                int size2 = (getSize() - size) - i2;
                if (size2 > 0) {
                    processPageEventCallback.onInserted(0, size2);
                } else if (size2 < 0) {
                    processPageEventCallback.onRemoved(0, -size2);
                }
            } else if (i == 3) {
                int min2 = Math.min(getPlaceholdersAfter(), fullCount);
                int placeholdersBefore2 = getPlaceholdersBefore() + getStorageCount();
                int i3 = fullCount - min2;
                List<TransformablePage<T>> list = this.pages;
                list.addAll(list.size(), insert.getPages());
                this.storageCount = getStorageCount() + fullCount;
                this.placeholdersAfter = insert.getPlaceholdersAfter();
                processPageEventCallback.onChanged(placeholdersBefore2, min2);
                processPageEventCallback.onInserted(placeholdersBefore2 + min2, i3);
                int size3 = (getSize() - size) - i3;
                if (size3 > 0) {
                    processPageEventCallback.onInserted(getSize() - size3, size3);
                } else if (size3 < 0) {
                    processPageEventCallback.onRemoved(getSize(), -size3);
                }
            }
            processPageEventCallback.onStateUpdate(insert.getSourceLoadStates(), insert.getMediatorLoadStates());
            return;
        }
        throw new IllegalArgumentException();
    }

    public final ViewportHint.Access accessHintForPresenterIndex(int i) {
        int i2 = 0;
        int placeholdersBefore2 = i - getPlaceholdersBefore();
        while (placeholdersBefore2 >= this.pages.get(i2).getData().size() && i2 < C13614t.m87750l(this.pages)) {
            placeholdersBefore2 -= this.pages.get(i2).getData().size();
            i2++;
        }
        return this.pages.get(i2).viewportHintFor(placeholdersBefore2, i - getPlaceholdersBefore(), ((getSize() - i) - getPlaceholdersAfter()) - 1, getOriginalPageOffsetFirst(), getOriginalPageOffsetLast());
    }

    public final T get(int i) {
        checkIndex(i);
        int placeholdersBefore2 = i - getPlaceholdersBefore();
        if (placeholdersBefore2 < 0 || placeholdersBefore2 >= getStorageCount()) {
            return null;
        }
        return getFromStorage(placeholdersBefore2);
    }

    public T getFromStorage(int i) {
        int size = this.pages.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.pages.get(i2).getData().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.pages.get(i2).getData().get(i);
    }

    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public int getSize() {
        return getPlaceholdersBefore() + getStorageCount() + getPlaceholdersAfter();
    }

    public int getStorageCount() {
        return this.storageCount;
    }

    public final ViewportHint.Initial initializeHint() {
        int storageCount2 = getStorageCount() / 2;
        return new ViewportHint.Initial(storageCount2, storageCount2, getOriginalPageOffsetFirst(), getOriginalPageOffsetLast());
    }

    public final void processEvent(PageEvent<T> pageEvent, ProcessPageEventCallback processPageEventCallback) {
        C13706o.m87929f(pageEvent, "pageEvent");
        C13706o.m87929f(processPageEventCallback, "callback");
        if (pageEvent instanceof PageEvent.Insert) {
            insertPage((PageEvent.Insert) pageEvent, processPageEventCallback);
        } else if (pageEvent instanceof PageEvent.Drop) {
            dropPages((PageEvent.Drop) pageEvent, processPageEventCallback);
        } else if (pageEvent instanceof PageEvent.LoadStateUpdate) {
            PageEvent.LoadStateUpdate loadStateUpdate = (PageEvent.LoadStateUpdate) pageEvent;
            processPageEventCallback.onStateUpdate(loadStateUpdate.getSource(), loadStateUpdate.getMediator());
        }
    }

    public final ItemSnapshotList<T> snapshot() {
        int placeholdersBefore2 = getPlaceholdersBefore();
        int placeholdersAfter2 = getPlaceholdersAfter();
        List<TransformablePage<T>> list = this.pages;
        ArrayList arrayList = new ArrayList();
        for (TransformablePage data : list) {
            boolean unused = C13624y.m87797z(arrayList, data.getData());
        }
        return new ItemSnapshotList<>(placeholdersBefore2, placeholdersAfter2, arrayList);
    }

    public String toString() {
        int storageCount2 = getStorageCount();
        ArrayList arrayList = new ArrayList(storageCount2);
        for (int i = 0; i < storageCount2; i++) {
            arrayList.add(getFromStorage(i));
        }
        String g0 = C13566b0.m87432g0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null);
        return "[(" + getPlaceholdersBefore() + " placeholders), " + g0 + ", (" + getPlaceholdersAfter() + " placeholders)]";
    }
}
