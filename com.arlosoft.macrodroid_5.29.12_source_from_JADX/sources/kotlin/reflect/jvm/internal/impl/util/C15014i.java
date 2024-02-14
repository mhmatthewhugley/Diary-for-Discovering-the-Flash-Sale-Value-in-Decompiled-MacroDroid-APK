package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.i */
/* compiled from: ArrayMap.kt */
public final class C15014i extends C14999c {

    /* renamed from: a */
    public static final C15014i f64142a = new C15014i();

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.i$a */
    /* compiled from: ArrayMap.kt */
    public static final class C15015a implements Iterator, C16368a {
        C15015a() {
        }

        /* renamed from: a */
        public Void next() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C15014i() {
        super((C13695i) null);
    }

    /* renamed from: c */
    public int mo74260c() {
        return 0;
    }

    /* renamed from: f */
    public Void get(int i) {
        return null;
    }

    /* renamed from: h */
    public void mo74261d(int i, Void voidR) {
        C13706o.m87929f(voidR, "value");
        throw new IllegalStateException();
    }

    public Iterator iterator() {
        return new C15015a();
    }
}
