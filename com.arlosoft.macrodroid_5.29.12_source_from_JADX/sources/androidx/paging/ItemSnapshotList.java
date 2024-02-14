package androidx.paging;

import androidx.annotation.IntRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C13570c;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0016"}, mo71668d2 = {"Landroidx/paging/ItemSnapshotList;", "T", "Lkotlin/collections/c;", "", "index", "get", "(I)Ljava/lang/Object;", "placeholdersBefore", "I", "getPlaceholdersBefore", "()I", "placeholdersAfter", "getPlaceholdersAfter", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getSize", "size", "<init>", "(IILjava/util/List;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: ItemSnapshotList.kt */
public final class ItemSnapshotList<T> extends C13570c<T> {
    private final List<T> items;
    private final int placeholdersAfter;
    private final int placeholdersBefore;

    public ItemSnapshotList(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, List<? extends T> list) {
        C13706o.m87929f(list, "items");
        this.placeholdersBefore = i;
        this.placeholdersAfter = i2;
        this.items = list;
    }

    public T get(int i) {
        boolean z = true;
        if (i >= 0 && i < this.placeholdersBefore) {
            return null;
        }
        int i2 = this.placeholdersBefore;
        if (i < this.items.size() + i2 && i2 <= i) {
            return this.items.get(i - this.placeholdersBefore);
        }
        int size = this.placeholdersBefore + this.items.size();
        if (i >= size() || size > i) {
            z = false;
        }
        if (z) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + size());
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public int getSize() {
        return this.placeholdersBefore + this.items.size() + this.placeholdersAfter;
    }
}
