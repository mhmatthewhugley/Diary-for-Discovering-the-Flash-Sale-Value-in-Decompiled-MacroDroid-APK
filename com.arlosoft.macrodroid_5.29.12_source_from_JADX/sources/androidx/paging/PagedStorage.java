package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b'\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001\\B\t\b\u0016¢\u0006\u0004\bW\u0010XB+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\bW\u0010YB\u0017\b\u0012\u0012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bW\u0010[J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002JD\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00062$\b\u0004\u0010\u0013\u001a\u001e\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00010\u0012H\b¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000JD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fJ\u001a\u0010$\u001a\u0004\u0018\u00018\u00002\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u001eJ\u0016\u0010%\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010&\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u001e\u0010(\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006J/\u0010,\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b*\u0010+J/\u0010.\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b-\u0010+J-\u00101\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b/\u00100J-\u00103\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b2\u00100J\b\u00105\u001a\u000204H\u0016R$\u00107\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010>\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R$\u0010\u000b\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b@\u0010=R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010AR$\u0010B\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u0016\u0010D\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010G\u001a\u00028\u00008@X\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00028\u00008@X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR$\u0010N\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0016\u0010R\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010FR\u0016\u0010T\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\bS\u0010FR\u0014\u0010V\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010=¨\u0006]"}, mo71668d2 = {"Landroidx/paging/PagedStorage;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/NullPaddedList;", "", "leadingNulls", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "trailingNulls", "positionOffset", "", "counted", "Lja/u;", "init", "V", "localIndex", "Lkotlin/Function2;", "onLastPage", "traversePages", "(ILqa/p;)Ljava/lang/Object;", "maxSize", "requiredRemaining", "localPageIndex", "needsTrim", "snapshot", "Landroidx/paging/PagedStorage$Callback;", "callback", "getFromStorage", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingState;", "getRefreshKeyInfo", "index", "get", "needsTrimFromFront", "needsTrimFromEnd", "countToBeAdded", "shouldPreTrimNewPage", "insertNulls", "trimFromFront$paging_common", "(ZIILandroidx/paging/PagedStorage$Callback;)Z", "trimFromFront", "trimFromEnd$paging_common", "trimFromEnd", "prependPage$paging_common", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedStorage$Callback;)V", "prependPage", "appendPage$paging_common", "appendPage", "", "toString", "", "pages", "Ljava/util/List;", "<set-?>", "placeholdersBefore", "I", "getPlaceholdersBefore", "()I", "placeholdersAfter", "getPlaceholdersAfter", "getPositionOffset", "Z", "storageCount", "getStorageCount", "lastLoadAroundLocalIndex", "getFirstLoadedItem$paging_common", "()Ljava/lang/Object;", "firstLoadedItem", "getLastLoadedItem$paging_common", "lastLoadedItem", "value", "getLastLoadAroundIndex", "setLastLoadAroundIndex", "(I)V", "lastLoadAroundIndex", "getMiddleOfLoadedRange", "middleOfLoadedRange", "getPrevKey", "prevKey", "getNextKey", "nextKey", "getSize", "size", "<init>", "()V", "(ILandroidx/paging/PagingSource$LoadResult$Page;I)V", "other", "(Landroidx/paging/PagedStorage;)V", "Callback", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagedStorage.kt */
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, NullPaddedList<T> {
    private boolean counted;
    private int lastLoadAroundLocalIndex;
    /* access modifiers changed from: private */
    public final List<PagingSource.LoadResult.Page<?, T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int positionOffset;
    private int storageCount;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000f"}, mo71668d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "", "count", "Lja/u;", "onInitialized", "leadingNulls", "changed", "added", "onPagePrepended", "endPosition", "onPageAppended", "startOfDrops", "onPagesRemoved", "onPagesSwappedToPlaceholder", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PagedStorage.kt */
    public interface Callback {
        void onInitialized(int i);

        void onPageAppended(int i, int i2, int i3);

        void onPagePrepended(int i, int i2, int i3);

        void onPagesRemoved(int i, int i2);

        void onPagesSwappedToPlaceholder(int i, int i2);
    }

    public PagedStorage() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    public static /* synthetic */ void appendPage$paging_common$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            callback = null;
        }
        pagedStorage.appendPage$paging_common(page, callback);
    }

    private final void init(int i, PagingSource.LoadResult.Page<?, T> page, int i2, int i3, boolean z) {
        this.placeholdersBefore = i;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = i2;
        this.positionOffset = i3;
        this.storageCount = page.getData().size();
        this.counted = z;
        this.lastLoadAroundLocalIndex = page.getData().size() / 2;
    }

    public static /* synthetic */ void init$default(PagedStorage pagedStorage, int i, PagingSource.LoadResult.Page page, int i2, int i3, Callback callback, boolean z, int i4, Object obj) {
        pagedStorage.init(i, page, i2, i3, callback, (i4 & 32) != 0 ? true : z);
    }

    private final boolean needsTrim(int i, int i2, int i3) {
        return getStorageCount() > i && this.pages.size() > 2 && getStorageCount() - this.pages.get(i3).getData().size() >= i2;
    }

    public static /* synthetic */ void prependPage$paging_common$default(PagedStorage pagedStorage, PagingSource.LoadResult.Page page, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            callback = null;
        }
        pagedStorage.prependPage$paging_common(page, callback);
    }

    private final <V> V traversePages(int i, C16269p<? super PagingSource.LoadResult.Page<?, T>, ? super Integer, ? extends V> pVar) {
        int size = this.pages.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((PagingSource.LoadResult.Page) this.pages.get(i2)).getData().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return pVar.invoke(this.pages.get(i2), Integer.valueOf(i));
    }

    public final void appendPage$paging_common(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        C13706o.m87929f(page, "page");
        int size = page.getData().size();
        if (size != 0) {
            this.pages.add(page);
            this.storageCount = getStorageCount() + size;
            int min = Math.min(getPlaceholdersAfter(), size);
            int i = size - min;
            if (min != 0) {
                this.placeholdersAfter = getPlaceholdersAfter() - min;
            }
            if (callback != null) {
                callback.onPageAppended((getPlaceholdersBefore() + getStorageCount()) - size, min, i);
            }
        }
    }

    public T get(int i) {
        int placeholdersBefore2 = i - getPlaceholdersBefore();
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        } else if (placeholdersBefore2 < 0 || placeholdersBefore2 >= getStorageCount()) {
            return null;
        } else {
            return getFromStorage(placeholdersBefore2);
        }
    }

    public final T getFirstLoadedItem$paging_common() {
        return C13566b0.m87422W(((PagingSource.LoadResult.Page) C13566b0.m87422W(this.pages)).getData());
    }

    public T getFromStorage(int i) {
        int size = this.pages.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((PagingSource.LoadResult.Page) this.pages.get(i2)).getData().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((PagingSource.LoadResult.Page) this.pages.get(i2)).getData().get(i);
    }

    public final int getLastLoadAroundIndex() {
        return getPlaceholdersBefore() + this.lastLoadAroundLocalIndex;
    }

    public final T getLastLoadedItem$paging_common() {
        return C13566b0.m87434i0(((PagingSource.LoadResult.Page) C13566b0.m87434i0(this.pages)).getData());
    }

    public final int getMiddleOfLoadedRange() {
        return getPlaceholdersBefore() + (getStorageCount() / 2);
    }

    public Object getNextKey() {
        if (!this.counted || getPlaceholdersAfter() > 0) {
            return ((PagingSource.LoadResult.Page) C13566b0.m87434i0(this.pages)).getNextKey();
        }
        return null;
    }

    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final int getPositionOffset() {
        return this.positionOffset;
    }

    public Object getPrevKey() {
        if (!this.counted || getPlaceholdersBefore() + this.positionOffset > 0) {
            return ((PagingSource.LoadResult.Page) C13566b0.m87422W(this.pages)).getPrevKey();
        }
        return null;
    }

    public final PagingState<?, T> getRefreshKeyInfo(PagedList.Config config) {
        C13706o.m87929f(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        return new PagingState<>(C13566b0.m87402F0(this.pages), Integer.valueOf(getLastLoadAroundIndex()), new PagingConfig(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, (C13695i) null), getPlaceholdersBefore());
    }

    public int getSize() {
        return getPlaceholdersBefore() + getStorageCount() + getPlaceholdersAfter();
    }

    public int getStorageCount() {
        return this.storageCount;
    }

    public final boolean needsTrimFromEnd(int i, int i2) {
        return needsTrim(i, i2, this.pages.size() - 1);
    }

    public final boolean needsTrimFromFront(int i, int i2) {
        return needsTrim(i, i2, 0);
    }

    public final void prependPage$paging_common(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        C13706o.m87929f(page, "page");
        int size = page.getData().size();
        if (size != 0) {
            this.pages.add(0, page);
            this.storageCount = getStorageCount() + size;
            int min = Math.min(getPlaceholdersBefore(), size);
            int i = size - min;
            if (min != 0) {
                this.placeholdersBefore = getPlaceholdersBefore() - min;
            }
            this.positionOffset -= i;
            if (callback != null) {
                callback.onPagePrepended(getPlaceholdersBefore(), min, i);
            }
        }
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void setLastLoadAroundIndex(int i) {
        this.lastLoadAroundLocalIndex = C16792h.m99544f(i - getPlaceholdersBefore(), 0, getStorageCount() - 1);
    }

    public final boolean shouldPreTrimNewPage(int i, int i2, int i3) {
        if (getStorageCount() + i3 <= i || this.pages.size() <= 1 || getStorageCount() < i2) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final PagedStorage<T> snapshot() {
        return new PagedStorage<>(this);
    }

    public String toString() {
        return "leading " + getPlaceholdersBefore() + ", storage " + getStorageCount() + ", trailing " + getPlaceholdersAfter() + ' ' + C13566b0.m87432g0(this.pages, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
    }

    public final boolean trimFromEnd$paging_common(boolean z, int i, int i2, Callback callback) {
        C13706o.m87929f(callback, "callback");
        int i3 = 0;
        while (needsTrimFromEnd(i, i2)) {
            List<PagingSource.LoadResult.Page<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).getData().size();
            i3 += size;
            this.storageCount = getStorageCount() - size;
        }
        this.lastLoadAroundLocalIndex = C16792h.m99542d(this.lastLoadAroundLocalIndex, getStorageCount() - 1);
        if (i3 > 0) {
            int placeholdersBefore2 = getPlaceholdersBefore() + getStorageCount();
            if (z) {
                this.placeholdersAfter = getPlaceholdersAfter() + i3;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore2, i3);
            } else {
                callback.onPagesRemoved(placeholdersBefore2, i3);
            }
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    public final boolean trimFromFront$paging_common(boolean z, int i, int i2, Callback callback) {
        C13706o.m87929f(callback, "callback");
        int i3 = 0;
        while (needsTrimFromFront(i, i2)) {
            int size = this.pages.remove(0).getData().size();
            i3 += size;
            this.storageCount = getStorageCount() - size;
        }
        this.lastLoadAroundLocalIndex = C16792h.m99540b(this.lastLoadAroundLocalIndex - i3, 0);
        if (i3 > 0) {
            if (z) {
                int placeholdersBefore2 = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i3;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore2, i3);
            } else {
                this.positionOffset += i3;
                callback.onPagesRemoved(getPlaceholdersBefore(), i3);
            }
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PagedStorage(int i, PagingSource.LoadResult.Page<?, T> page, int i2) {
        this();
        C13706o.m87929f(page, "page");
        init(i, page, i2, 0, true);
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        ArrayList arrayList = new ArrayList();
        this.pages = arrayList;
        this.counted = true;
        arrayList.addAll(pagedStorage.pages);
        this.placeholdersBefore = pagedStorage.getPlaceholdersBefore();
        this.placeholdersAfter = pagedStorage.getPlaceholdersAfter();
        this.positionOffset = pagedStorage.positionOffset;
        this.counted = pagedStorage.counted;
        this.storageCount = pagedStorage.getStorageCount();
        this.lastLoadAroundLocalIndex = pagedStorage.lastLoadAroundLocalIndex;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void init(int i, PagingSource.LoadResult.Page<?, T> page, int i2, int i3, Callback callback, boolean z) {
        C13706o.m87929f(page, "page");
        C13706o.m87929f(callback, "callback");
        init(i, page, i2, i3, z);
        callback.onInitialized(size());
    }
}
