package androidx.paging;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001a\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010'\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0005J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0016J;\u0010\u0019\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00142\u0006\u0010\t\u001a\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00020\u0015H\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0002\u0007\n\u0005\b20\u0001¨\u0006+"}, mo71668d2 = {"Landroidx/paging/PagingState;", "", "Key", "Value", "other", "", "equals", "", "hashCode", "anchorPosition", "closestItemToPosition", "(I)Ljava/lang/Object;", "Landroidx/paging/PagingSource$LoadResult$Page;", "closestPageToPosition", "isEmpty", "firstItemOrNull", "()Ljava/lang/Object;", "lastItemOrNull", "", "toString", "T", "Lkotlin/Function2;", "block", "anchorPositionToPagedIndices$paging_common", "(ILqa/p;)Ljava/lang/Object;", "anchorPositionToPagedIndices", "", "pages", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/Integer;", "getAnchorPosition", "()Ljava/lang/Integer;", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/PagingConfig;", "getConfig", "()Landroidx/paging/PagingConfig;", "leadingPlaceholderCount", "I", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/PagingConfig;I)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PagingState.kt */
public final class PagingState<Key, Value> {
    private final Integer anchorPosition;
    private final PagingConfig config;
    /* access modifiers changed from: private */
    public final int leadingPlaceholderCount;
    private final List<PagingSource.LoadResult.Page<Key, Value>> pages;

    public PagingState(List<PagingSource.LoadResult.Page<Key, Value>> list, Integer num, PagingConfig pagingConfig, @IntRange(from = 0) int i) {
        C13706o.m87929f(list, "pages");
        C13706o.m87929f(pagingConfig, "config");
        this.pages = list;
        this.anchorPosition = num;
        this.config = pagingConfig;
        this.leadingPlaceholderCount = i;
    }

    public final <T> T anchorPositionToPagedIndices$paging_common(int i, C16269p<? super Integer, ? super Integer, ? extends T> pVar) {
        C13706o.m87929f(pVar, "block");
        int access$getLeadingPlaceholderCount$p = i - this.leadingPlaceholderCount;
        int i2 = 0;
        while (i2 < C13614t.m87750l(getPages()) && access$getLeadingPlaceholderCount$p > C13614t.m87750l(((PagingSource.LoadResult.Page) getPages().get(i2)).getData())) {
            access$getLeadingPlaceholderCount$p -= ((PagingSource.LoadResult.Page) getPages().get(i2)).getData().size();
            i2++;
        }
        return pVar.invoke(Integer.valueOf(i2), Integer.valueOf(access$getLeadingPlaceholderCount$p));
    }

    public final Value closestItemToPosition(int i) {
        boolean z;
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        int access$getLeadingPlaceholderCount$p = i - this.leadingPlaceholderCount;
        while (i2 < C13614t.m87750l(getPages()) && access$getLeadingPlaceholderCount$p > C13614t.m87750l(((PagingSource.LoadResult.Page) getPages().get(i2)).getData())) {
            access$getLeadingPlaceholderCount$p -= ((PagingSource.LoadResult.Page) getPages().get(i2)).getData().size();
            i2++;
        }
        for (PagingSource.LoadResult.Page page : getPages()) {
            if (!page.getData().isEmpty()) {
                List pages2 = getPages();
                ListIterator listIterator = pages2.listIterator(pages2.size());
                while (listIterator.hasPrevious()) {
                    PagingSource.LoadResult.Page page2 = (PagingSource.LoadResult.Page) listIterator.previous();
                    if (!page2.getData().isEmpty()) {
                        if (access$getLeadingPlaceholderCount$p < 0) {
                            return C13566b0.m87422W(page.getData());
                        }
                        if (i2 != C13614t.m87750l(getPages()) || access$getLeadingPlaceholderCount$p <= C13614t.m87750l(((PagingSource.LoadResult.Page) C13566b0.m87434i0(getPages())).getData())) {
                            return ((PagingSource.LoadResult.Page) getPages().get(i2)).getData().get(access$getLeadingPlaceholderCount$p);
                        }
                        return C13566b0.m87434i0(page2.getData());
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PagingSource.LoadResult.Page<Key, Value> closestPageToPosition(int i) {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        int i2 = 0;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((PagingSource.LoadResult.Page) it.next()).getData().isEmpty()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        int access$getLeadingPlaceholderCount$p = i - this.leadingPlaceholderCount;
        while (i2 < C13614t.m87750l(getPages()) && access$getLeadingPlaceholderCount$p > C13614t.m87750l(((PagingSource.LoadResult.Page) getPages().get(i2)).getData())) {
            access$getLeadingPlaceholderCount$p -= ((PagingSource.LoadResult.Page) getPages().get(i2)).getData().size();
            i2++;
        }
        if (access$getLeadingPlaceholderCount$p < 0) {
            return (PagingSource.LoadResult.Page) C13566b0.m87422W(getPages());
        }
        return (PagingSource.LoadResult.Page) getPages().get(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PagingState) {
            PagingState pagingState = (PagingState) obj;
            return C13706o.m87924a(this.pages, pagingState.pages) && C13706o.m87924a(this.anchorPosition, pagingState.anchorPosition) && C13706o.m87924a(this.config, pagingState.config) && this.leadingPlaceholderCount == pagingState.leadingPlaceholderCount;
        }
    }

    public final Value firstItemOrNull() {
        T t;
        List data;
        Iterator<T> it = this.pages.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((PagingSource.LoadResult.Page) t).getData().isEmpty()) {
                break;
            }
        }
        PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) t;
        if (page == null || (data = page.getData()) == null) {
            return null;
        }
        return C13566b0.m87424Y(data);
    }

    public final Integer getAnchorPosition() {
        return this.anchorPosition;
    }

    public final PagingConfig getConfig() {
        return this.config;
    }

    public final List<PagingSource.LoadResult.Page<Key, Value>> getPages() {
        return this.pages;
    }

    public int hashCode() {
        int hashCode = this.pages.hashCode();
        Integer num = this.anchorPosition;
        return hashCode + (num != null ? num.hashCode() : 0) + this.config.hashCode() + this.leadingPlaceholderCount;
    }

    public final boolean isEmpty() {
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (PagingSource.LoadResult.Page data : list) {
            if (!data.getData().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final Value lastItemOrNull() {
        PagingSource.LoadResult.Page<Key, Value> page;
        List data;
        List<PagingSource.LoadResult.Page<Key, Value>> list = this.pages;
        ListIterator<PagingSource.LoadResult.Page<Key, Value>> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                page = null;
                break;
            }
            page = listIterator.previous();
            if (!page.getData().isEmpty()) {
                break;
            }
        }
        PagingSource.LoadResult.Page page2 = page;
        if (page2 == null || (data = page2.getData()) == null) {
            return null;
        }
        return C13566b0.m87436k0(data);
    }

    public String toString() {
        return "PagingState(pages=" + this.pages + ", anchorPosition=" + this.anchorPosition + ", config=" + this.config + ", leadingPlaceholderCount=" + this.leadingPlaceholderCount + ')';
    }
}
