package androidx.core.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, mo71668d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: LongSparseArray.kt */
public final class LongSparseArrayKt$valueIterator$1 implements Iterator<T>, C16368a {
    final /* synthetic */ LongSparseArray<T> $this_valueIterator;
    private int index;

    LongSparseArrayKt$valueIterator$1(LongSparseArray<T> longSparseArray) {
        this.$this_valueIterator = longSparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    public T next() {
        LongSparseArray<T> longSparseArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return longSparseArray.valueAt(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
