package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo71668d2 = {"Lkotlin/jvm/internal/b;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "a", "[Ljava/lang/Object;", "getArray", "()[Ljava/lang/Object;", "array", "", "c", "I", "index", "<init>", "([Ljava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.b */
/* compiled from: ArrayIterator.kt */
final class C13679b<T> implements Iterator<T>, C16368a {

    /* renamed from: a */
    private final T[] f61917a;

    /* renamed from: c */
    private int f61918c;

    public C13679b(T[] tArr) {
        C13706o.m87929f(tArr, "array");
        this.f61917a = tArr;
    }

    public boolean hasNext() {
        return this.f61918c < this.f61917a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f61917a;
            int i = this.f61918c;
            this.f61918c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f61918c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
