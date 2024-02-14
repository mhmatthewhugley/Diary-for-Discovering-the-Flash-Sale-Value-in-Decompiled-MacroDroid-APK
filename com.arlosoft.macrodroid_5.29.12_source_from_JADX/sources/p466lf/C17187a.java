package p466lf;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p473rx.internal.util.unsafe.C17401j;

/* renamed from: lf.a */
/* compiled from: AtomicReferenceArrayQueue */
abstract class C17187a<E> extends AbstractQueue<E> {

    /* renamed from: a */
    protected final AtomicReferenceArray<E> f68730a;

    /* renamed from: c */
    protected final int f68731c;

    public C17187a(int i) {
        int a = C17401j.m101169a(i);
        this.f68731c = a - 1;
        this.f68730a = new AtomicReferenceArray<>(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo80464c(long j) {
        return this.f68731c & ((int) j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo80466d(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final E mo80467f(int i) {
        return mo80468h(this.f68730a, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final E mo80468h(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo80469i(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}
