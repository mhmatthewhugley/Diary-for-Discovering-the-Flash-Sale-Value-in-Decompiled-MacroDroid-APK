package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.c0 */
/* compiled from: ReflectProperties */
public class C13724c0 {

    /* renamed from: kotlin.reflect.jvm.internal.c0$a */
    /* compiled from: ReflectProperties */
    public static class C13725a<T> extends C13727c<T> implements C16254a<T> {

        /* renamed from: c */
        private final C16254a<T> f61939c;

        /* renamed from: d */
        private volatile SoftReference<Object> f61940d;

        public C13725a(T t, C16254a<T> aVar) {
            if (aVar == null) {
                m87974d(0);
            }
            this.f61940d = null;
            this.f61939c = aVar;
            if (t != null) {
                this.f61940d = new SoftReference<>(mo71981a(t));
            }
        }

        /* renamed from: d */
        private static /* synthetic */ void m87974d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f61940d;
            if (softReference != null && (obj = softReference.get()) != null) {
                return mo71983c(obj);
            }
            T invoke = this.f61939c.invoke();
            this.f61940d = new SoftReference<>(mo71981a(invoke));
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.c0$b */
    /* compiled from: ReflectProperties */
    public static class C13726b<T> extends C13727c<T> {

        /* renamed from: c */
        private final C16254a<T> f61941c;

        /* renamed from: d */
        private volatile Object f61942d;

        public C13726b(C16254a<T> aVar) {
            if (aVar == null) {
                m87975d(0);
            }
            this.f61942d = null;
            this.f61941c = aVar;
        }

        /* renamed from: d */
        private static /* synthetic */ void m87975d(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        public T invoke() {
            Object obj = this.f61942d;
            if (obj != null) {
                return mo71983c(obj);
            }
            T invoke = this.f61941c.invoke();
            this.f61942d = mo71981a(invoke);
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.c0$c */
    /* compiled from: ReflectProperties */
    public static abstract class C13727c<T> {

        /* renamed from: a */
        private static final Object f61943a = new C13728a();

        /* renamed from: kotlin.reflect.jvm.internal.c0$c$a */
        /* compiled from: ReflectProperties */
        static class C13728a {
            C13728a() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo71981a(T t) {
            return t == null ? f61943a : t;
        }

        /* renamed from: b */
        public final T mo71982b(Object obj, Object obj2) {
            return invoke();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public T mo71983c(Object obj) {
            if (obj == f61943a) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    private static /* synthetic */ void m87970a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C13726b<T> m87971b(C16254a<T> aVar) {
        if (aVar == null) {
            m87970a(0);
        }
        return new C13726b<>(aVar);
    }

    /* renamed from: c */
    public static <T> C13725a<T> m87972c(T t, C16254a<T> aVar) {
        if (aVar == null) {
            m87970a(1);
        }
        return new C13725a<>(t, aVar);
    }

    /* renamed from: d */
    public static <T> C13725a<T> m87973d(C16254a<T> aVar) {
        if (aVar == null) {
            m87970a(2);
        }
        return m87972c((Object) null, aVar);
    }
}
