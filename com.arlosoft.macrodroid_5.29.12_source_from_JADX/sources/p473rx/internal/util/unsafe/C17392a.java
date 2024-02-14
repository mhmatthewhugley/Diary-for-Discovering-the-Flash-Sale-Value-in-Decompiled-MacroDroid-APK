package p473rx.internal.util.unsafe;

import java.util.Iterator;
import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.a */
/* compiled from: ConcurrentCircularArrayQueue */
public abstract class C17392a<E> extends C17393b<E> {

    /* renamed from: d */
    protected static final int f69151d;

    /* renamed from: f */
    private static final long f69152f;

    /* renamed from: g */
    private static final int f69153g;

    /* renamed from: a */
    protected final long f69154a;

    /* renamed from: c */
    protected final E[] f69155c;

    static {
        Class<Object[]> cls = Object[].class;
        int intValue = Integer.getInteger("sparse.shift", 0).intValue();
        f69151d = intValue;
        Unsafe unsafe = C17417z.f69168a;
        int arrayIndexScale = unsafe.arrayIndexScale(cls);
        if (4 == arrayIndexScale) {
            f69153g = intValue + 2;
        } else if (8 == arrayIndexScale) {
            f69153g = intValue + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        f69152f = (long) (unsafe.arrayBaseOffset(cls) + (32 << (f69153g - intValue)));
    }

    public C17392a(int i) {
        int a = C17401j.m101169a(i);
        this.f69154a = (long) (a - 1);
        this.f69155c = new Object[((a << f69151d) + 64)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo80711c(long j) {
        return mo80713d(j, this.f69154a);
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
    public final long mo80713d(long j, long j2) {
        return f69152f + ((j & j2) << f69153g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final E mo80714f(long j) {
        return mo80715h(this.f69155c, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final E mo80715h(E[] eArr, long j) {
        return C17417z.f69168a.getObject(eArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final E mo80716i(long j) {
        return mo80718j(this.f69155c, j);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final E mo80718j(E[] eArr, long j) {
        return C17417z.f69168a.getObjectVolatile(eArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo80719k(E[] eArr, long j, E e) {
        C17417z.f69168a.putOrderedObject(eArr, j, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo80720l(long j, E e) {
        mo80721m(this.f69155c, j, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo80721m(E[] eArr, long j, E e) {
        C17417z.f69168a.putObject(eArr, j, e);
    }
}
