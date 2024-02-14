package p280hc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hc.a */
/* compiled from: ConsPStack */
final class C12414a<E> implements Iterable<E> {

    /* renamed from: f */
    private static final C12414a<Object> f59149f = new C12414a<>();

    /* renamed from: a */
    final E f59150a;

    /* renamed from: c */
    final C12414a<E> f59151c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f59152d;

    /* renamed from: hc.a$a */
    /* compiled from: ConsPStack */
    private static class C12415a<E> implements Iterator<E> {

        /* renamed from: a */
        private C12414a<E> f59153a;

        public C12415a(C12414a<E> aVar) {
            this.f59153a = aVar;
        }

        public boolean hasNext() {
            return this.f59153a.f59152d > 0;
        }

        public E next() {
            C12414a<E> aVar = this.f59153a;
            E e = aVar.f59150a;
            this.f59153a = aVar.f59151c;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private C12414a() {
        this.f59152d = 0;
        this.f59150a = null;
        this.f59151c = null;
    }

    /* renamed from: d */
    public static <E> C12414a<E> m83299d() {
        return f59149f;
    }

    /* renamed from: f */
    private Iterator<E> m83300f(int i) {
        return new C12415a(m83302k(i));
    }

    /* renamed from: i */
    private C12414a<E> m83301i(Object obj) {
        if (this.f59152d == 0) {
            return this;
        }
        if (this.f59150a.equals(obj)) {
            return this.f59151c;
        }
        C12414a<E> i = this.f59151c.m83301i(obj);
        if (i == this.f59151c) {
            return this;
        }
        return new C12414a<>(this.f59150a, i);
    }

    /* renamed from: k */
    private C12414a<E> m83302k(int i) {
        if (i < 0 || i > this.f59152d) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.f59151c.m83302k(i - 1);
        }
    }

    public E get(int i) {
        if (i < 0 || i > this.f59152d) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return m83300f(i).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
    }

    /* renamed from: h */
    public C12414a<E> mo68768h(int i) {
        return m83301i(get(i));
    }

    public Iterator<E> iterator() {
        return m83300f(0);
    }

    /* renamed from: j */
    public C12414a<E> mo68770j(E e) {
        return new C12414a<>(e, this);
    }

    public int size() {
        return this.f59152d;
    }

    private C12414a(E e, C12414a<E> aVar) {
        this.f59150a = e;
        this.f59151c = aVar;
        this.f59152d = aVar.f59152d + 1;
    }
}
