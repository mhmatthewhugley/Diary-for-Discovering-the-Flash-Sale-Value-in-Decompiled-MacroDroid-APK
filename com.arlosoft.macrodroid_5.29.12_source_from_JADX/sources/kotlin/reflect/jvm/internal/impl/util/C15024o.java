package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.o */
/* compiled from: ArrayMap.kt */
public final class C15024o<T> extends C14999c<T> {

    /* renamed from: a */
    private final T f64151a;

    /* renamed from: c */
    private final int f64152c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.o$a */
    /* compiled from: ArrayMap.kt */
    public static final class C15025a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private boolean f64153a = true;

        /* renamed from: c */
        final /* synthetic */ C15024o<T> f64154c;

        C15025a(C15024o<T> oVar) {
            this.f64154c = oVar;
        }

        public boolean hasNext() {
            return this.f64153a;
        }

        public T next() {
            if (this.f64153a) {
                this.f64153a = false;
                return this.f64154c.mo74283h();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15024o(T t, int i) {
        super((C13695i) null);
        C13706o.m87929f(t, "value");
        this.f64151a = t;
        this.f64152c = i;
    }

    /* renamed from: c */
    public int mo74260c() {
        return 1;
    }

    /* renamed from: d */
    public void mo74261d(int i, T t) {
        C13706o.m87929f(t, "value");
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final int mo74282f() {
        return this.f64152c;
    }

    public T get(int i) {
        if (i == this.f64152c) {
            return this.f64151a;
        }
        return null;
    }

    /* renamed from: h */
    public final T mo74283h() {
        return this.f64151a;
    }

    public Iterator<T> iterator() {
        return new C15025a(this);
    }
}
