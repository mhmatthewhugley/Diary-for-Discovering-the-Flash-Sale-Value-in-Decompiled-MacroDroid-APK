package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import p424wa.C16783b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001c\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, mo71668d2 = {"androidx/core/util/RangeKt$toClosedRange$1", "Lwa/b;", "kotlin.jvm.PlatformType", "getEndInclusive", "()Ljava/lang/Comparable;", "endInclusive", "getStart", "start", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Range.kt */
public final class RangeKt$toClosedRange$1 implements C16783b<T> {
    final /* synthetic */ Range<T> $this_toClosedRange;

    RangeKt$toClosedRange$1(Range<T> range) {
        this.$this_toClosedRange = range;
    }

    public boolean contains(T t) {
        return C16783b.C16784a.m99518a(this, t);
    }

    public T getEndInclusive() {
        return this.$this_toClosedRange.getUpper();
    }

    public T getStart() {
        return this.$this_toClosedRange.getLower();
    }

    public boolean isEmpty() {
        return C16783b.C16784a.m99519b(this);
    }
}
