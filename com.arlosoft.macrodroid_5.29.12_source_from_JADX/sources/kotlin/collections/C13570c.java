package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001e\u001f !B\t\b\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, mo71668d2 = {"Lkotlin/collections/c;", "E", "Lkotlin/collections/a;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", "hashCode", "getSize", "()I", "size", "<init>", "()V", "Companion", "a", "b", "c", "d", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.c */
/* compiled from: AbstractList.kt */
public abstract class C13570c<E> extends C13560a<E> implements List<E> {
    public static final C13571a Companion = new C13571a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo71668d2 = {"Lkotlin/collections/c$a;", "", "", "index", "size", "Lja/u;", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "", "f", "(Ljava/util/Collection;)I", "other", "", "e", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.c$a */
    /* compiled from: AbstractList.kt */
    public static final class C13571a {
        private C13571a() {
        }

        public /* synthetic */ C13571a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo71704a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo71705b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo71706c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void mo71707d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean mo71708e(Collection<?> collection, Collection<?> collection2) {
            C13706o.m87929f(collection, "c");
            C13706o.m87929f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!C13706o.m87924a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo71709f(Collection<?> collection) {
            C13706o.m87929f(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/collections/c$b;", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "a", "I", "()I", "b", "(I)V", "index", "<init>", "(Lkotlin/collections/c;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.c$b */
    /* compiled from: AbstractList.kt */
    private class C13572b implements Iterator<E>, C16368a {

        /* renamed from: a */
        private int f61864a;

        public C13572b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo71710a() {
            return this.f61864a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo71711b(int i) {
            this.f61864a = i;
        }

        public boolean hasNext() {
            return this.f61864a < C13570c.this.size();
        }

        public E next() {
            if (hasNext()) {
                C13570c<E> cVar = C13570c.this;
                int i = this.f61864a;
                this.f61864a = i + 1;
                return cVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/collections/c$c;", "Lkotlin/collections/c$b;", "Lkotlin/collections/c;", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "index", "<init>", "(Lkotlin/collections/c;I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.c$c */
    /* compiled from: AbstractList.kt */
    private class C13573c extends C13570c<E>.b implements ListIterator<E> {
        public C13573c(int i) {
            super();
            C13570c.Companion.mo71706c(i, C13570c.this.size());
            mo71711b(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo71710a() > 0;
        }

        public int nextIndex() {
            return mo71710a();
        }

        public E previous() {
            if (hasPrevious()) {
                C13570c<E> cVar = C13570c.this;
                mo71711b(mo71710a() - 1);
                return cVar.get(mo71710a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo71710a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo71668d2 = {"Lkotlin/collections/c$d;", "E", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "a", "Lkotlin/collections/c;", "list", "c", "I", "fromIndex", "d", "_size", "getSize", "()I", "size", "toIndex", "<init>", "(Lkotlin/collections/c;II)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.c$d */
    /* compiled from: AbstractList.kt */
    private static final class C13574d<E> extends C13570c<E> implements RandomAccess {

        /* renamed from: a */
        private final C13570c<E> f61867a;

        /* renamed from: c */
        private final int f61868c;

        /* renamed from: d */
        private int f61869d;

        public C13574d(C13570c<? extends E> cVar, int i, int i2) {
            C13706o.m87929f(cVar, "list");
            this.f61867a = cVar;
            this.f61868c = i;
            C13570c.Companion.mo71707d(i, i2, cVar.size());
            this.f61869d = i2 - i;
        }

        public E get(int i) {
            C13570c.Companion.mo71705b(i, this.f61869d);
            return this.f61867a.get(this.f61868c + i);
        }

        public int getSize() {
            return this.f61869d;
        }
    }

    protected C13570c() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.mo71708e(this, (Collection) obj);
    }

    public abstract E get(int i);

    public abstract int getSize();

    public int hashCode() {
        return Companion.mo71709f(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object a : this) {
            if (C13706o.m87924a(a, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C13572b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C13706o.m87924a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C13573c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C13574d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C13573c(i);
    }
}
