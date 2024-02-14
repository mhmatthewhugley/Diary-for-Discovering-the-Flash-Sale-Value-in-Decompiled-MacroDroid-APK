package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C13693h;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0011\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0016\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0016R\u0014\u0010\"\u001a\u00020!8\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, mo71668d2 = {"Lkotlin/collections/d0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "readResolve", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "element", "c", "", "elements", "containsAll", "index", "d", "h", "i", "", "iterator", "", "listIterator", "fromIndex", "toIndex", "subList", "", "serialVersionUID", "J", "f", "()I", "size", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.d0 */
/* compiled from: Collections.kt */
public final class C13577d0 implements List, Serializable, RandomAccess, C16368a {

    /* renamed from: a */
    public static final C13577d0 f61871a = new C13577d0();
    private static final long serialVersionUID = -7390468764508069838L;

    private C13577d0() {
    }

    private final Object readResolve() {
        return f61871a;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public boolean mo71737c(Void voidR) {
        C13706o.m87929f(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo71737c((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C13706o.m87929f(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: f */
    public int mo71743f() {
        return 0;
    }

    /* renamed from: h */
    public int mo71745h(Void voidR) {
        C13706o.m87929f(voidR, "element");
        return -1;
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public int mo71747i(Void voidR) {
        C13706o.m87929f(voidR, "element");
        return -1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo71745h((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C13575c0.f61870a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo71747i((Void) obj);
    }

    public ListIterator listIterator() {
        return C13575c0.f61870a;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo71743f();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return C13693h.m87895a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C13706o.m87929f(tArr, "array");
        return C13693h.m87896b(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C13575c0.f61870a;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }
}
