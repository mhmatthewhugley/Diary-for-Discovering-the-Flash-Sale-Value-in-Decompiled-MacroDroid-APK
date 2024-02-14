package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.C15907c0;
import okhttp3.C15917e;
import okhttp3.C15919e0;
import okhttp3.C15989v;
import okhttp3.C16002z;
import retrofit2.C17229a;
import retrofit2.C17237c;
import retrofit2.C17246f;

/* renamed from: retrofit2.t */
/* compiled from: Retrofit */
public final class C17301t {

    /* renamed from: a */
    private final Map<Method, C17304u<?>> f68954a = new ConcurrentHashMap();

    /* renamed from: b */
    final C15917e.C15918a f68955b;

    /* renamed from: c */
    final C15989v f68956c;

    /* renamed from: d */
    final List<C17246f.C17247a> f68957d;

    /* renamed from: e */
    final List<C17237c.C17238a> f68958e;

    /* renamed from: f */
    final Executor f68959f;

    /* renamed from: g */
    final boolean f68960g;

    /* renamed from: retrofit2.t$a */
    /* compiled from: Retrofit */
    class C17302a implements InvocationHandler {

        /* renamed from: a */
        private final C17293p f68961a = C17293p.m100935f();

        /* renamed from: b */
        private final Object[] f68962b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f68963c;

        C17302a(Class cls) {
            this.f68963c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f68962b;
            }
            if (this.f68961a.mo80577h(method)) {
                return this.f68961a.mo80576g(method, this.f68963c, obj, objArr);
            }
            return C17301t.this.mo80600c(method).mo80549a(objArr);
        }
    }

    C17301t(C15917e.C15918a aVar, C15989v vVar, List<C17246f.C17247a> list, List<C17237c.C17238a> list2, Executor executor, boolean z) {
        this.f68955b = aVar;
        this.f68956c = vVar;
        this.f68957d = list;
        this.f68958e = list2;
        this.f68959f = executor;
        this.f68960g = z;
    }

    /* renamed from: j */
    private void m100979j(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f68960g) {
                C17293p f = C17293p.m100935f();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!f.mo80577h(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo80600c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public C17237c<?, ?> mo80598a(Type type, Annotation[] annotationArr) {
        return mo80601d((C17237c.C17238a) null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T mo80599b(Class<T> cls) {
        m100979j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C17302a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C17304u<?> mo80600c(Method method) {
        C17304u<?> uVar;
        C17304u<?> uVar2 = this.f68954a.get(method);
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (this.f68954a) {
            uVar = this.f68954a.get(method);
            if (uVar == null) {
                uVar = C17304u.m100996b(this, method);
                this.f68954a.put(method, uVar);
            }
        }
        return uVar;
    }

    /* renamed from: d */
    public C17237c<?, ?> mo80601d(C17237c.C17238a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f68958e.indexOf(aVar) + 1;
        int size = this.f68958e.size();
        for (int i = indexOf; i < size; i++) {
            C17237c<?, ?> a = this.f68958e.get(i).mo80379a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f68958e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f68958e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f68958e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public <T> C17246f<T, C15907c0> mo80602e(C17246f.C17247a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f68957d.indexOf(aVar) + 1;
        int size = this.f68957d.size();
        for (int i = indexOf; i < size; i++) {
            C17246f<?, C15907c0> c = this.f68957d.get(i).mo80385c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f68957d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f68957d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f68957d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> C17246f<C15919e0, T> mo80603f(C17246f.C17247a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f68957d.indexOf(aVar) + 1;
        int size = this.f68957d.size();
        for (int i = indexOf; i < size; i++) {
            C17246f<C15919e0, ?> d = this.f68957d.get(i).mo80386d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f68957d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f68957d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f68957d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> C17246f<T, C15907c0> mo80604g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo80602e((C17246f.C17247a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public <T> C17246f<C15919e0, T> mo80605h(Type type, Annotation[] annotationArr) {
        return mo80603f((C17246f.C17247a) null, type, annotationArr);
    }

    /* renamed from: i */
    public <T> C17246f<T, String> mo80606i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f68957d.size();
        for (int i = 0; i < size; i++) {
            C17246f<?, String> e = this.f68957d.get(i).mo80544e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C17229a.C17233d.f68794a;
    }

    /* renamed from: retrofit2.t$b */
    /* compiled from: Retrofit */
    public static final class C17303b {

        /* renamed from: a */
        private final C17293p f68965a;

        /* renamed from: b */
        private C15917e.C15918a f68966b;

        /* renamed from: c */
        private C15989v f68967c;

        /* renamed from: d */
        private final List<C17246f.C17247a> f68968d;

        /* renamed from: e */
        private final List<C17237c.C17238a> f68969e;

        /* renamed from: f */
        private Executor f68970f;

        /* renamed from: g */
        private boolean f68971g;

        C17303b(C17293p pVar) {
            this.f68968d = new ArrayList();
            this.f68969e = new ArrayList();
            this.f68965a = pVar;
        }

        /* renamed from: a */
        public C17303b mo80608a(C17237c.C17238a aVar) {
            List<C17237c.C17238a> list = this.f68969e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C17303b mo80609b(C17246f.C17247a aVar) {
            List<C17246f.C17247a> list = this.f68968d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C17303b mo80610c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo80611d(C15989v.m96325h(str));
        }

        /* renamed from: d */
        public C17303b mo80611d(C15989v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List<String> m = vVar.mo76273m();
            if ("".equals(m.get(m.size() - 1))) {
                this.f68967c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        /* renamed from: e */
        public C17301t mo80612e() {
            if (this.f68967c != null) {
                C15917e.C15918a aVar = this.f68966b;
                if (aVar == null) {
                    aVar = new C16002z();
                }
                C15917e.C15918a aVar2 = aVar;
                Executor executor = this.f68970f;
                if (executor == null) {
                    executor = this.f68965a.mo80573b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f68969e);
                arrayList.addAll(this.f68965a.mo80572a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f68968d.size() + 1 + this.f68965a.mo80575d());
                arrayList2.add(new C17229a());
                arrayList2.addAll(this.f68968d);
                arrayList2.addAll(this.f68965a.mo80574c());
                return new C17301t(aVar2, this.f68967c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f68971g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public C17303b mo80613f(C15917e.C15918a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f68966b = aVar;
            return this;
        }

        /* renamed from: g */
        public C17303b mo80614g(C16002z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return mo80613f(zVar);
        }

        public C17303b() {
            this(C17293p.m100935f());
        }
    }
}
