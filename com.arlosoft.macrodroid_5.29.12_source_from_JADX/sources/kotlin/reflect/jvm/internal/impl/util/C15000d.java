package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C13564b;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.d */
/* compiled from: ArrayMap.kt */
public final class C15000d<T> extends C14999c<T> {

    /* renamed from: d */
    public static final C15001a f64124d = new C15001a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object[] f64125a;

    /* renamed from: c */
    private int f64126c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.d$a */
    /* compiled from: ArrayMap.kt */
    public static final class C15001a {
        private C15001a() {
        }

        public /* synthetic */ C15001a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.d$b */
    /* compiled from: ArrayMap.kt */
    public static final class C15002b extends C13564b<T> {

        /* renamed from: d */
        private int f64127d = -1;

        /* renamed from: f */
        final /* synthetic */ C15000d<T> f64128f;

        C15002b(C15000d<T> dVar) {
            this.f64128f = dVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo71688a() {
            /*
                r2 = this;
            L_0x0000:
                int r0 = r2.f64127d
                int r0 = r0 + 1
                r2.f64127d = r0
                kotlin.reflect.jvm.internal.impl.util.d<T> r1 = r2.f64128f
                java.lang.Object[] r1 = r1.f64125a
                int r1 = r1.length
                if (r0 >= r1) goto L_0x001b
                kotlin.reflect.jvm.internal.impl.util.d<T> r0 = r2.f64128f
                java.lang.Object[] r0 = r0.f64125a
                int r1 = r2.f64127d
                r0 = r0[r1]
                if (r0 == 0) goto L_0x0000
            L_0x001b:
                int r0 = r2.f64127d
                kotlin.reflect.jvm.internal.impl.util.d<T> r1 = r2.f64128f
                java.lang.Object[] r1 = r1.f64125a
                int r1 = r1.length
                if (r0 < r1) goto L_0x002a
                r2.mo71689b()
                goto L_0x003c
            L_0x002a:
                kotlin.reflect.jvm.internal.impl.util.d<T> r0 = r2.f64128f
                java.lang.Object[] r0 = r0.f64125a
                int r1 = r2.f64127d
                r0 = r0[r1]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                kotlin.jvm.internal.C13706o.m87927d(r0, r1)
                r2.mo71690c(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C15000d.C15002b.mo71688a():void");
        }
    }

    private C15000d(Object[] objArr, int i) {
        super((C13695i) null);
        this.f64125a = objArr;
        this.f64126c = i;
    }

    /* renamed from: h */
    private final void m93204h(int i) {
        Object[] objArr = this.f64125a;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C13706o.m87928e(copyOf, "copyOf(this, newSize)");
            this.f64125a = copyOf;
        }
    }

    /* renamed from: c */
    public int mo74260c() {
        return this.f64126c;
    }

    /* renamed from: d */
    public void mo74261d(int i, T t) {
        C13706o.m87929f(t, "value");
        m93204h(i);
        if (this.f64125a[i] == null) {
            this.f64126c = mo74260c() + 1;
        }
        this.f64125a[i] = t;
    }

    public T get(int i) {
        return C13596m.m87583H(this.f64125a, i);
    }

    public Iterator<T> iterator() {
        return new C15002b(this);
    }

    public C15000d() {
        this(new Object[20], 0);
    }
}
