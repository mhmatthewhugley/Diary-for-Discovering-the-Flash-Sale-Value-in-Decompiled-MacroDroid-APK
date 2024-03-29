package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, mo71668d2 = {"Lkotlin/collections/n0;", "", "", "next", "()Ljava/lang/Integer;", "nextInt", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.n0 */
/* compiled from: Iterators.kt */
public abstract class C13603n0 implements Iterator<Integer>, C16368a {
    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
