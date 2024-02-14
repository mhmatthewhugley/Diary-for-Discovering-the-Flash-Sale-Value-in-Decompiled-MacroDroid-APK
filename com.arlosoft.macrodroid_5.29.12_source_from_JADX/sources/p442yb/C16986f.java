package p442yb;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p272gc.C12346c;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

/* renamed from: yb.f */
/* compiled from: LockBasedStorageManager */
public class C16986f implements C17012n {

    /* renamed from: d */
    private static final String f68365d = C15177w.m93668P0(C16986f.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final C17012n f68366e = new C16987a("NO_LOCKS", C16993f.f68375a, C16985e.f68364b);

    /* renamed from: a */
    protected final C17008k f68367a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16993f f68368b;

    /* renamed from: c */
    private final String f68369c;

    /* renamed from: yb.f$a */
    /* compiled from: LockBasedStorageManager */
    static class C16987a extends C16986f {
        C16987a(String str, C16993f fVar, C17008k kVar) {
            super(str, fVar, kVar, (C16987a) null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m100239j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public <K, V> C17003o<V> mo80227p(String str, K k) {
            if (str == null) {
                m100239j(0);
            }
            C17003o<V> a = C17003o.m100267a();
            if (a == null) {
                m100239j(1);
            }
            return a;
        }
    }

    /* renamed from: yb.f$b */
    /* compiled from: LockBasedStorageManager */
    class C16988b extends C16998j<T> {

        /* renamed from: f */
        final /* synthetic */ Object f68370f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16988b(C16986f fVar, C16254a aVar, Object obj) {
            super(fVar, aVar);
            this.f68370f = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m100241a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"}));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C17003o<T> mo80229c(boolean z) {
            C17003o<T> d = C17003o.m100268d(this.f68370f);
            if (d == null) {
                m100241a(0);
            }
            return d;
        }
    }

    /* renamed from: yb.f$c */
    /* compiled from: LockBasedStorageManager */
    class C16989c extends C16999k<T> {

        /* renamed from: g */
        final /* synthetic */ C16265l f68372g;

        /* renamed from: o */
        final /* synthetic */ C16265l f68373o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16989c(C16986f fVar, C16254a aVar, C16265l lVar, C16265l lVar2) {
            super(fVar, aVar);
            this.f68372g = lVar;
            this.f68373o = lVar2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m100243a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C17003o<T> mo80229c(boolean z) {
            C16265l lVar = this.f68372g;
            if (lVar == null) {
                C17003o<T> c = super.mo80229c(z);
                if (c == null) {
                    m100243a(0);
                }
                return c;
            }
            C17003o<T> d = C17003o.m100268d(lVar.invoke(Boolean.valueOf(z)));
            if (d == null) {
                m100243a(1);
            }
            return d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo80230d(T t) {
            if (t == null) {
                m100243a(2);
            }
            this.f68373o.invoke(t);
        }
    }

    /* renamed from: yb.f$d */
    /* compiled from: LockBasedStorageManager */
    private static class C16990d<K, V> extends C16991e<K, V> implements C16981a<K, V> {
        /* synthetic */ C16990d(C16986f fVar, ConcurrentMap concurrentMap, C16987a aVar) {
            this(fVar, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m100246b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public V mo80212a(K k, C16254a<? extends V> aVar) {
            if (aVar == null) {
                m100246b(2);
            }
            V a = super.mo80212a(k, aVar);
            if (a == null) {
                m100246b(3);
            }
            return a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C16990d(C16986f fVar, ConcurrentMap<C16995g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, (C16987a) null);
            if (fVar == null) {
                m100246b(0);
            }
            if (concurrentMap == null) {
                m100246b(1);
            }
        }
    }

    /* renamed from: yb.f$e */
    /* compiled from: LockBasedStorageManager */
    private static class C16991e<K, V> extends C17000l<C16995g<K, V>, V> implements C16982b<K, V> {

        /* renamed from: yb.f$e$a */
        /* compiled from: LockBasedStorageManager */
        class C16992a implements C16265l<C16995g<K, V>, V> {
            C16992a() {
            }

            /* renamed from: a */
            public V invoke(C16995g<K, V> gVar) {
                return gVar.f68377b.invoke();
            }
        }

        /* synthetic */ C16991e(C16986f fVar, ConcurrentMap concurrentMap, C16987a aVar) {
            this(fVar, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m100248b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo80212a(K k, C16254a<? extends V> aVar) {
            if (aVar == null) {
                m100248b(2);
            }
            return invoke(new C16995g(k, aVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C16991e(C16986f fVar, ConcurrentMap<C16995g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new C16992a());
            if (fVar == null) {
                m100248b(0);
            }
            if (concurrentMap == null) {
                m100248b(1);
            }
        }
    }

    /* renamed from: yb.f$f */
    /* compiled from: LockBasedStorageManager */
    public interface C16993f {

        /* renamed from: a */
        public static final C16993f f68375a = new C16994a();

        /* renamed from: yb.f$f$a */
        /* compiled from: LockBasedStorageManager */
        static class C16994a implements C16993f {
            C16994a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m100251a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            public RuntimeException handleException(Throwable th) {
                if (th == null) {
                    m100251a(0);
                }
                throw C12346c.m83095b(th);
            }
        }

        RuntimeException handleException(Throwable th);
    }

    /* renamed from: yb.f$g */
    /* compiled from: LockBasedStorageManager */
    private static class C16995g<K, V> {

        /* renamed from: a */
        private final K f68376a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C16254a<? extends V> f68377b;

        public C16995g(K k, C16254a<? extends V> aVar) {
            this.f68376a = k;
            this.f68377b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f68376a.equals(((C16995g) obj).f68376a);
        }

        public int hashCode() {
            return this.f68376a.hashCode();
        }
    }

    /* renamed from: yb.f$h */
    /* compiled from: LockBasedStorageManager */
    private static class C16996h<T> implements C17007j<T> {

        /* renamed from: a */
        private final C16986f f68378a;

        /* renamed from: c */
        private final C16254a<? extends T> f68379c;

        /* renamed from: d */
        private volatile Object f68380d;

        public C16996h(C16986f fVar, C16254a<? extends T> aVar) {
            if (fVar == null) {
                m100253a(0);
            }
            if (aVar == null) {
                m100253a(1);
            }
            this.f68380d = C17002n.NOT_COMPUTED;
            this.f68378a = fVar;
            this.f68379c = aVar;
        }

        /* renamed from: a */
        private static /* synthetic */ void m100253a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80235b(T t) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C17003o<T> mo80229c(boolean z) {
            C17003o<T> p = this.f68378a.mo80227p("in a lazy value", null);
            if (p == null) {
                m100253a(2);
            }
            return p;
        }

        /* renamed from: i */
        public boolean mo80236i() {
            return (this.f68380d == C17002n.NOT_COMPUTED || this.f68380d == C17002n.COMPUTING) ? false : true;
        }

        public T invoke() {
            T invoke;
            Object obj = this.f68380d;
            if (!(obj instanceof C17002n)) {
                return WrappedValues.m93267f(obj);
            }
            this.f68378a.f68367a.lock();
            try {
                Object obj2 = this.f68380d;
                if (!(obj2 instanceof C17002n)) {
                    invoke = WrappedValues.m93267f(obj2);
                } else {
                    C17002n nVar = C17002n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f68380d = C17002n.RECURSION_WAS_DETECTED;
                        C17003o c = mo80229c(true);
                        if (!c.mo80240c()) {
                            invoke = c.mo80239b();
                        }
                    }
                    if (obj2 == C17002n.RECURSION_WAS_DETECTED) {
                        C17003o c2 = mo80229c(false);
                        if (!c2.mo80240c()) {
                            invoke = c2.mo80239b();
                        }
                    }
                    this.f68380d = nVar;
                    invoke = this.f68379c.invoke();
                    mo80235b(invoke);
                    this.f68380d = invoke;
                }
                this.f68378a.f68367a.unlock();
                return invoke;
            } catch (Throwable th) {
                this.f68378a.f68367a.unlock();
                throw th;
            }
        }
    }

    /* renamed from: yb.f$i */
    /* compiled from: LockBasedStorageManager */
    private static abstract class C16997i<T> extends C16996h<T> {

        /* renamed from: f */
        private volatile C17010l<T> f68381f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16997i(C16986f fVar, C16254a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                m100257a(0);
            }
            if (aVar == null) {
                m100257a(1);
            }
            this.f68381f = null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m100257a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo80235b(T t) {
            this.f68381f = new C17010l<>(t);
            try {
                mo80230d(t);
            } finally {
                this.f68381f = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo80230d(T t);

        public T invoke() {
            C17010l<T> lVar = this.f68381f;
            if (lVar == null || !lVar.mo80245b()) {
                return super.invoke();
            }
            return lVar.mo80244a();
        }
    }

    /* renamed from: yb.f$j */
    /* compiled from: LockBasedStorageManager */
    private static class C16998j<T> extends C16996h<T> implements C17006i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16998j(C16986f fVar, C16254a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                m100260a(0);
            }
            if (aVar == null) {
                m100260a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m100260a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                m100260a(2);
            }
            return invoke;
        }
    }

    /* renamed from: yb.f$k */
    /* compiled from: LockBasedStorageManager */
    private static abstract class C16999k<T> extends C16997i<T> implements C17006i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16999k(C16986f fVar, C16254a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                m100261a(0);
            }
            if (aVar == null) {
                m100261a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m100261a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke == null) {
                m100261a(2);
            }
            return invoke;
        }
    }

    /* renamed from: yb.f$l */
    /* compiled from: LockBasedStorageManager */
    private static class C17000l<K, V> implements C17005h<K, V> {

        /* renamed from: a */
        private final C16986f f68382a;

        /* renamed from: c */
        private final ConcurrentMap<K, Object> f68383c;

        /* renamed from: d */
        private final C16265l<? super K, ? extends V> f68384d;

        public C17000l(C16986f fVar, ConcurrentMap<K, Object> concurrentMap, C16265l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                m100262b(0);
            }
            if (concurrentMap == null) {
                m100262b(1);
            }
            if (lVar == null) {
                m100262b(2);
            }
            this.f68382a = fVar;
            this.f68383c = concurrentMap;
            this.f68384d = lVar;
        }

        /* renamed from: b */
        private static /* synthetic */ void m100262b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        private AssertionError m100263c(K k, Object obj) {
            AssertionError assertionError = (AssertionError) C16986f.m100226q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f68382a));
            if (assertionError == null) {
                m100262b(4);
            }
            return assertionError;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C17003o<V> mo80237d(K k, boolean z) {
            C17003o<V> p = this.f68382a.mo80227p("", k);
            if (p == null) {
                m100262b(3);
            }
            return p;
        }

        public V invoke(K k) {
            V d;
            Object obj = this.f68383c.get(k);
            if (obj != null && obj != C17002n.COMPUTING) {
                return WrappedValues.m93265d(obj);
            }
            this.f68382a.f68367a.lock();
            try {
                Object obj2 = this.f68383c.get(k);
                C17002n nVar = C17002n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = C17002n.RECURSION_WAS_DETECTED;
                    C17003o d2 = mo80237d(k, true);
                    if (!d2.mo80240c()) {
                        d = d2.mo80239b();
                        this.f68382a.f68367a.unlock();
                        return d;
                    }
                }
                if (obj2 == C17002n.RECURSION_WAS_DETECTED) {
                    C17003o d3 = mo80237d(k, false);
                    if (!d3.mo80240c()) {
                        d = d3.mo80239b();
                        this.f68382a.f68367a.unlock();
                        return d;
                    }
                }
                if (obj2 != null) {
                    d = WrappedValues.m93265d(obj2);
                    this.f68382a.f68367a.unlock();
                    return d;
                }
                this.f68383c.put(k, nVar);
                V invoke = this.f68384d.invoke(k);
                Object put = this.f68383c.put(k, WrappedValues.m93263b(invoke));
                if (put == nVar) {
                    this.f68382a.f68367a.unlock();
                    return invoke;
                }
                throw m100263c(k, put);
            } catch (Throwable th) {
                this.f68382a.f68367a.unlock();
                throw th;
            }
        }

        /* renamed from: m */
        public boolean mo80238m(K k) {
            Object obj = this.f68383c.get(k);
            return (obj == null || obj == C17002n.COMPUTING) ? false : true;
        }
    }

    /* renamed from: yb.f$m */
    /* compiled from: LockBasedStorageManager */
    private static class C17001m<K, V> extends C17000l<K, V> implements C17004g<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17001m(C16986f fVar, ConcurrentMap<K, Object> concurrentMap, C16265l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                m100266b(0);
            }
            if (concurrentMap == null) {
                m100266b(1);
            }
            if (lVar == null) {
                m100266b(2);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m100266b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke == null) {
                m100266b(3);
            }
            return invoke;
        }
    }

    /* renamed from: yb.f$n */
    /* compiled from: LockBasedStorageManager */
    private enum C17002n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: yb.f$o */
    /* compiled from: LockBasedStorageManager */
    private static class C17003o<T> {

        /* renamed from: a */
        private final T f68389a;

        /* renamed from: b */
        private final boolean f68390b;

        private C17003o(T t, boolean z) {
            this.f68389a = t;
            this.f68390b = z;
        }

        /* renamed from: a */
        public static <T> C17003o<T> m100267a() {
            return new C17003o<>((Object) null, true);
        }

        /* renamed from: d */
        public static <T> C17003o<T> m100268d(T t) {
            return new C17003o<>(t, false);
        }

        /* renamed from: b */
        public T mo80239b() {
            return this.f68389a;
        }

        /* renamed from: c */
        public boolean mo80240c() {
            return this.f68390b;
        }

        public String toString() {
            return mo80240c() ? "FALL_THROUGH" : String.valueOf(this.f68389a);
        }
    }

    /* synthetic */ C16986f(String str, C16993f fVar, C17008k kVar, C16987a aVar) {
        this(str, fVar, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m100222j(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = 3
            goto L_0x0022
        L_0x0021:
            r7 = 2
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p442yb.C16986f.m100222j(int):void");
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m100225m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m100226q(T t) {
        if (t == null) {
            m100222j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (!stackTrace[i2].getClassName().startsWith(f68365d)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public <T> C17006i<T> mo80216a(C16254a<? extends T> aVar, T t) {
        if (aVar == null) {
            m100222j(26);
        }
        if (t == null) {
            m100222j(27);
        }
        return new C16988b(this, aVar, t);
    }

    /* renamed from: b */
    public <K, V> C17005h<K, V> mo80217b(C16265l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            m100222j(19);
        }
        C17005h<K, V> o = mo80226o(lVar, m100225m());
        if (o == null) {
            m100222j(20);
        }
        return o;
    }

    /* renamed from: c */
    public <K, V> C16981a<K, V> mo80218c() {
        return new C16990d(this, m100225m(), (C16987a) null);
    }

    /* renamed from: d */
    public <T> C17007j<T> mo80219d(C16254a<? extends T> aVar) {
        if (aVar == null) {
            m100222j(30);
        }
        return new C16996h(this, aVar);
    }

    /* renamed from: e */
    public <T> C17006i<T> mo80220e(C16254a<? extends T> aVar, C16265l<? super Boolean, ? extends T> lVar, C16265l<? super T, C13339u> lVar2) {
        if (aVar == null) {
            m100222j(28);
        }
        if (lVar2 == null) {
            m100222j(29);
        }
        return new C16989c(this, aVar, lVar, lVar2);
    }

    /* renamed from: f */
    public <T> C17006i<T> mo80221f(C16254a<? extends T> aVar) {
        if (aVar == null) {
            m100222j(23);
        }
        return new C16998j(this, aVar);
    }

    /* renamed from: g */
    public <T> T mo80222g(C16254a<? extends T> aVar) {
        if (aVar == null) {
            m100222j(34);
        }
        this.f68367a.lock();
        try {
            T invoke = aVar.invoke();
            this.f68367a.unlock();
            return invoke;
        } catch (Throwable th) {
            this.f68367a.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public <K, V> C17004g<K, V> mo80223h(C16265l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            m100222j(9);
        }
        C17004g<K, V> n = mo80225n(lVar, m100225m());
        if (n == null) {
            m100222j(10);
        }
        return n;
    }

    /* renamed from: i */
    public <K, V> C16982b<K, V> mo80224i() {
        return new C16991e(this, m100225m(), (C16987a) null);
    }

    /* renamed from: n */
    public <K, V> C17004g<K, V> mo80225n(C16265l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            m100222j(14);
        }
        if (concurrentMap == null) {
            m100222j(15);
        }
        return new C17001m(this, concurrentMap, lVar);
    }

    /* renamed from: o */
    public <K, V> C17005h<K, V> mo80226o(C16265l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            m100222j(21);
        }
        if (concurrentMap == null) {
            m100222j(22);
        }
        return new C17000l(this, concurrentMap, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public <K, V> C17003o<V> mo80227p(String str, K k) {
        String str2;
        if (str == null) {
            m100222j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m100226q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f68369c + ")";
    }

    private C16986f(String str, C16993f fVar, C17008k kVar) {
        if (str == null) {
            m100222j(4);
        }
        if (fVar == null) {
            m100222j(5);
        }
        if (kVar == null) {
            m100222j(6);
        }
        this.f68367a = kVar;
        this.f68368b = fVar;
        this.f68369c = str;
    }

    public C16986f(String str) {
        this(str, (Runnable) null, (C16265l<InterruptedException, C13339u>) null);
    }

    public C16986f(String str, Runnable runnable, C16265l<InterruptedException, C13339u> lVar) {
        this(str, C16993f.f68375a, (C17008k) C17008k.f68391a.mo80243a(runnable, lVar));
    }
}
