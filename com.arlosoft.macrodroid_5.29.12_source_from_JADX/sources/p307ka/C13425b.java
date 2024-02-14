package p307ka;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C13570c;
import kotlin.collections.C13578e;
import kotlin.collections.C13584h;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001VBO\b\u0002\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0010L\u001a\u00020\n\u0012\u0006\u0010M\u001a\u00020\n\u0012\u0006\u0010N\u001a\u00020\u0013\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bQ\u0010RB\t\b\u0016¢\u0006\u0004\bQ\u0010SB\u0011\b\u0016\u0012\u0006\u0010T\u001a\u00020\n¢\u0006\u0004\bQ\u0010UJ\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0014\u0010\u000f\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J.\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010!\u001a\u00020\u0013H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010$\u001a\u00020\u0013H\u0016J\u0018\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u001dJ \u0010'\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010%\u001a\u00020\nH\u0016J\u0017\u00100\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\f2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u0018J\u0016\u00102\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u00102\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u00103\u001a\u00020\fH\u0016J\u0017\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u001dJ\u0017\u00105\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00101J\u0016\u00106\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u00107\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0016J)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010<\"\u0004\b\u0001\u0010;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0<H\u0016¢\u0006\u0004\b>\u0010@J\u0013\u0010A\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010B\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020CH\u0016R\u0014\u0010G\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006W"}, mo71668d2 = {"Lka/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "minCapacity", "Lja/u;", "p", "m", "n", "q", "", "other", "", "i", "t", "element", "k", "(ILjava/lang/Object;)V", "", "elements", "j", "w", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "z", "retain", "B", "l", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "d", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "u", "()Z", "isEffectivelyReadOnly", "c", "()I", "size", "array", "offset", "length", "isReadOnly", "backing", "root", "<init>", "([Ljava/lang/Object;IIZLka/b;Lka/b;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.b */
/* compiled from: ListBuilder.kt */
public final class C13425b<E> extends C13578e<E> implements RandomAccess, Serializable {
    /* access modifiers changed from: private */
    public E[] array;
    private final C13425b<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    private final C13425b<E> root;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016¨\u0006\u0017"}, mo71668d2 = {"Lka/b$a;", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "Lja/u;", "set", "(Ljava/lang/Object;)V", "add", "remove", "Lka/b;", "list", "index", "<init>", "(Lka/b;I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.b$a */
    /* compiled from: ListBuilder.kt */
    private static final class C13426a<E> implements ListIterator<E>, C16368a {

        /* renamed from: a */
        private final C13425b<E> f61502a;

        /* renamed from: c */
        private int f61503c;

        /* renamed from: d */
        private int f61504d = -1;

        public C13426a(C13425b<E> bVar, int i) {
            C13706o.m87929f(bVar, "list");
            this.f61502a = bVar;
            this.f61503c = i;
        }

        public void add(E e) {
            C13425b<E> bVar = this.f61502a;
            int i = this.f61503c;
            this.f61503c = i + 1;
            bVar.add(i, e);
            this.f61504d = -1;
        }

        public boolean hasNext() {
            return this.f61503c < this.f61502a.length;
        }

        public boolean hasPrevious() {
            return this.f61503c > 0;
        }

        public E next() {
            if (this.f61503c < this.f61502a.length) {
                int i = this.f61503c;
                this.f61503c = i + 1;
                this.f61504d = i;
                return this.f61502a.array[this.f61502a.offset + this.f61504d];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f61503c;
        }

        public E previous() {
            int i = this.f61503c;
            if (i > 0) {
                int i2 = i - 1;
                this.f61503c = i2;
                this.f61504d = i2;
                return this.f61502a.array[this.f61502a.offset + this.f61504d];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f61503c - 1;
        }

        public void remove() {
            int i = this.f61504d;
            if (i != -1) {
                this.f61502a.remove(i);
                this.f61503c = this.f61504d;
                this.f61504d = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            int i = this.f61504d;
            if (i != -1) {
                this.f61502a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private C13425b(E[] eArr, int i, int i2, boolean z, C13425b<E> bVar, C13425b<E> bVar2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = bVar;
        this.root = bVar2;
    }

    /* renamed from: B */
    private final int m85873B(int i, int i2, Collection<? extends E> collection, boolean z) {
        C13425b<E> bVar = this.backing;
        if (bVar != null) {
            int B = bVar.m85873B(i, i2, collection, z);
            this.length -= B;
            return B;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        Object[] unused = C13593l.m87559f(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C13427c.m85896g(eArr3, i7 - i6, i7);
        this.length -= i6;
        return i6;
    }

    /* renamed from: j */
    private final void m85877j(int i, Collection<? extends E> collection, int i2) {
        C13425b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.m85877j(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        m85883t(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    /* renamed from: k */
    private final void m85878k(int i, E e) {
        C13425b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.m85878k(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        m85883t(i, 1);
        this.array[i] = e;
    }

    /* renamed from: m */
    private final void m85879m() {
        if (m85884u()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    private final boolean m85880n(List<?> list) {
        return C13427c.m85897h(this.array, this.offset, this.length, list);
    }

    /* renamed from: p */
    private final void m85881p(int i) {
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.array;
            if (i > eArr.length) {
                this.array = C13427c.m85894e(this.array, C13584h.f61876f.mo71841a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: q */
    private final void m85882q(int i) {
        m85881p(this.length + i);
    }

    /* renamed from: t */
    private final void m85883t(int i, int i2) {
        m85882q(i2);
        E[] eArr = this.array;
        Object[] unused = C13593l.m87559f(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.root;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m85884u() {
        /*
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L_0x000f
            ka.b<E> r0 = r1.root
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p307ka.C13425b.m85884u():boolean");
    }

    /* renamed from: w */
    private final E m85885w(int i) {
        C13425b<E> bVar = this.backing;
        if (bVar != null) {
            this.length--;
            return bVar.m85885w(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        Object[] unused = C13593l.m87559f(eArr, eArr, i, i + 1, this.offset + this.length);
        C13427c.m85895f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    private final Object writeReplace() {
        if (m85884u()) {
            return new C13438h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: z */
    private final void m85886z(int i, int i2) {
        C13425b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.m85886z(i, i2);
        } else {
            E[] eArr = this.array;
            Object[] unused = C13593l.m87559f(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C13427c.m85896g(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    public boolean add(E e) {
        m85879m();
        m85878k(this.offset + this.length, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        m85879m();
        int size = collection.size();
        m85877j(this.offset + this.length, collection, size);
        return size > 0;
    }

    /* renamed from: c */
    public int mo70884c() {
        return this.length;
    }

    public void clear() {
        m85879m();
        m85886z(this.offset, this.length);
    }

    /* renamed from: d */
    public E mo70886d(int i) {
        m85879m();
        C13570c.Companion.mo71705b(i, this.length);
        return m85885w(this.offset + i);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m85880n((List) obj));
    }

    public E get(int i) {
        C13570c.Companion.mo71705b(i, this.length);
        return this.array[this.offset + i];
    }

    public int hashCode() {
        return C13427c.m85898i(this.array, this.offset, this.length);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C13706o.m87924a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public Iterator<E> iterator() {
        return new C13426a(this, 0);
    }

    /* renamed from: l */
    public final List<E> mo70893l() {
        if (this.backing == null) {
            m85879m();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (C13706o.m87924a(this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C13426a(this, 0);
    }

    public boolean remove(Object obj) {
        m85879m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        m85879m();
        return m85873B(this.offset, this.length, collection, false) > 0;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        m85879m();
        return m85873B(this.offset, this.length, collection, true) > 0;
    }

    public E set(int i, E e) {
        m85879m();
        C13570c.Companion.mo71705b(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    public List<E> subList(int i, int i2) {
        C13570c.Companion.mo71707d(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        C13425b<E> bVar = this.root;
        return new C13425b(eArr, i3, i4, z, this, bVar == null ? this : bVar);
    }

    public <T> T[] toArray(T[] tArr) {
        C13706o.m87929f(tArr, "destination");
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C13706o.m87928e(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        C13706o.m87927d(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.offset;
        Object[] unused = C13593l.m87559f(eArr2, tArr, 0, i3, this.length + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public String toString() {
        return C13427c.m85899j(this.array, this.offset, this.length);
    }

    public ListIterator<E> listIterator(int i) {
        C13570c.Companion.mo71706c(i, this.length);
        return new C13426a(this, i);
    }

    public void add(int i, E e) {
        m85879m();
        C13570c.Companion.mo71706c(i, this.length);
        m85878k(this.offset + i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        m85879m();
        C13570c.Companion.mo71706c(i, this.length);
        int size = collection.size();
        m85877j(this.offset + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        Object[] j = C13593l.m87563j(eArr, i, this.length + i);
        C13706o.m87927d(j, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return j;
    }

    public C13425b() {
        this(10);
    }

    public C13425b(int i) {
        this(C13427c.m85893d(i), 0, 0, false, (C13425b) null, (C13425b) null);
    }
}
