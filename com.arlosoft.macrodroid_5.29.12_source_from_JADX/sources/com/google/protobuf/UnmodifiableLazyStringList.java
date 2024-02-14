package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final LazyStringList f57124a;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f57124a = lazyStringList;
    }

    /* renamed from: L */
    public LazyStringList mo65271L() {
        return this;
    }

    /* renamed from: Z */
    public void mo65272Z(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public String get(int i) {
        return (String) this.f57124a.get(i);
    }

    /* renamed from: d2 */
    public Object mo65273d2(int i) {
        return this.f57124a.mo65273d2(i);
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {

            /* renamed from: a */
            Iterator<String> f57128a;

            {
                this.f57128a = UnmodifiableLazyStringList.this.f57124a.iterator();
            }

            /* renamed from: a */
            public String next() {
                return this.f57128a.next();
            }

            public boolean hasNext() {
                return this.f57128a.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) {

            /* renamed from: a */
            ListIterator<String> f57125a;

            /* renamed from: c */
            final /* synthetic */ int f57126c;

            {
                this.f57126c = r2;
                this.f57125a = UnmodifiableLazyStringList.this.f57124a.listIterator(r2);
            }

            /* renamed from: a */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: b */
            public String next() {
                return this.f57125a.next();
            }

            /* renamed from: c */
            public String previous() {
                return this.f57125a.previous();
            }

            /* renamed from: d */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                return this.f57125a.hasNext();
            }

            public boolean hasPrevious() {
                return this.f57125a.hasPrevious();
            }

            public int nextIndex() {
                return this.f57125a.nextIndex();
            }

            public int previousIndex() {
                return this.f57125a.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: r */
    public List<?> mo65276r() {
        return this.f57124a.mo65276r();
    }

    public int size() {
        return this.f57124a.size();
    }
}
