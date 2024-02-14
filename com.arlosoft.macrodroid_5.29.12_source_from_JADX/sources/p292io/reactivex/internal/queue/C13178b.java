package p292io.reactivex.internal.queue;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p251ea.C12184h;
import p292io.reactivex.internal.util.C13229k;

/* renamed from: io.reactivex.internal.queue.b */
/* compiled from: SpscLinkedArrayQueue */
public final class C13178b<T> implements C12184h<T> {

    /* renamed from: A */
    private static final Object f61015A = new Object();

    /* renamed from: z */
    static final int f61016z = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: a */
    final AtomicLong f61017a = new AtomicLong();

    /* renamed from: c */
    int f61018c;

    /* renamed from: d */
    long f61019d;

    /* renamed from: f */
    final int f61020f;

    /* renamed from: g */
    AtomicReferenceArray<Object> f61021g;

    /* renamed from: o */
    final int f61022o;

    /* renamed from: p */
    AtomicReferenceArray<Object> f61023p;

    /* renamed from: s */
    final AtomicLong f61024s = new AtomicLong();

    public C13178b(int i) {
        int a = C13229k.m85567a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f61021g = atomicReferenceArray;
        this.f61020f = i2;
        m85445a(a);
        this.f61023p = atomicReferenceArray;
        this.f61022o = i2;
        this.f61019d = (long) (i2 - 1);
        m85459p(0);
    }

    /* renamed from: a */
    private void m85445a(int i) {
        this.f61018c = Math.min(i / 4, f61016z);
    }

    /* renamed from: b */
    private static int m85446b(int i) {
        return i;
    }

    /* renamed from: c */
    private static int m85447c(long j, int i) {
        return m85446b(((int) j) & i);
    }

    /* renamed from: e */
    private long m85448e() {
        return this.f61024s.get();
    }

    /* renamed from: f */
    private long m85449f() {
        return this.f61017a.get();
    }

    /* renamed from: g */
    private long m85450g() {
        return this.f61024s.get();
    }

    /* renamed from: h */
    private static <E> Object m85451h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: i */
    private AtomicReferenceArray<Object> m85452i(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m85446b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m85451h(atomicReferenceArray, b);
        m85457n(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: j */
    private long m85453j() {
        return this.f61017a.get();
    }

    /* renamed from: k */
    private T m85454k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f61023p = atomicReferenceArray;
        int c = m85447c(j, i);
        T h = m85451h(atomicReferenceArray, c);
        if (h != null) {
            m85457n(atomicReferenceArray, c, (Object) null);
            m85456m(j + 1);
        }
        return h;
    }

    /* renamed from: l */
    private void m85455l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f61021g = atomicReferenceArray2;
        this.f61019d = (j2 + j) - 1;
        m85457n(atomicReferenceArray2, i, t);
        m85458o(atomicReferenceArray, atomicReferenceArray2);
        m85457n(atomicReferenceArray, i, f61015A);
        m85459p(j + 1);
    }

    /* renamed from: m */
    private void m85456m(long j) {
        this.f61024s.lazySet(j);
    }

    /* renamed from: n */
    private static void m85457n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: o */
    private void m85458o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m85457n(atomicReferenceArray, m85446b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m85459p(long j) {
        this.f61017a.lazySet(j);
    }

    /* renamed from: q */
    private boolean m85460q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m85457n(atomicReferenceArray, i, t);
        m85459p(j + 1);
        return true;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m85453j() == m85450g();
    }

    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f61021g;
        long f = m85449f();
        int i = this.f61020f;
        int c = m85447c(f, i);
        if (f < this.f61019d) {
            return m85460q(atomicReferenceArray, t, f, c);
        }
        long j = ((long) this.f61018c) + f;
        if (m85451h(atomicReferenceArray, m85447c(j, i)) == null) {
            this.f61019d = j - 1;
            return m85460q(atomicReferenceArray, t, f, c);
        } else if (m85451h(atomicReferenceArray, m85447c(1 + f, i)) == null) {
            return m85460q(atomicReferenceArray, t, f, c);
        } else {
            m85455l(atomicReferenceArray, f, c, t, (long) i);
            return true;
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f61023p;
        long e = m85448e();
        int i = this.f61022o;
        int c = m85447c(e, i);
        T h = m85451h(atomicReferenceArray, c);
        boolean z = h == f61015A;
        if (h != null && !z) {
            m85457n(atomicReferenceArray, c, (Object) null);
            m85456m(e + 1);
            return h;
        } else if (z) {
            return m85454k(m85452i(atomicReferenceArray, i + 1), e, i);
        } else {
            return null;
        }
    }
}
