package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.C13605o0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, mo71668d2 = {"androidx/core/util/SparseLongArrayKt$valueIterator$1", "Lkotlin/collections/o0;", "", "hasNext", "", "nextLong", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SparseLongArray.kt */
public final class SparseLongArrayKt$valueIterator$1 extends C13605o0 {
    final /* synthetic */ SparseLongArray $this_valueIterator;
    private int index;

    SparseLongArrayKt$valueIterator$1(SparseLongArray sparseLongArray) {
        this.$this_valueIterator = sparseLongArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    public long nextLong() {
        SparseLongArray sparseLongArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseLongArray.valueAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
