package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13681c;
import kotlin.jvm.internal.C13693h;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\u0017\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/collections/g;", "T", "", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "", "iterator", "", "", "toArray", "()[Ljava/lang/Object;", "a", "[Ljava/lang/Object;", "getValues", "values", "c", "Z", "isVarargs", "()Z", "", "()I", "size", "<init>", "([Ljava/lang/Object;Z)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.g */
/* compiled from: Collections.kt */
final class C13582g<T> implements Collection<T>, C16368a {

    /* renamed from: a */
    private final T[] f61874a;

    /* renamed from: c */
    private final boolean f61875c;

    public C13582g(T[] tArr, boolean z) {
        C13706o.m87929f(tArr, "values");
        this.f61874a = tArr;
        this.f61875c = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int mo71809c() {
        return this.f61874a.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C13596m.m87628w(this.f61874a, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f61874a.length == 0;
    }

    public Iterator<T> iterator() {
        return C13681c.m87864a(this.f61874a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo71809c();
    }

    public final Object[] toArray() {
        return C13612s.m87733b(this.f61874a, this.f61875c);
    }

    public <T> T[] toArray(T[] tArr) {
        C13706o.m87929f(tArr, "array");
        return C13693h.m87896b(this, tArr);
    }
}
