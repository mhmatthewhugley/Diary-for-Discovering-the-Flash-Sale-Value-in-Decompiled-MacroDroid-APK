package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.C17237c;
import retrofit2.C17246f;

/* renamed from: retrofit2.p */
/* compiled from: Platform */
class C17293p {

    /* renamed from: c */
    private static final C17293p f68896c = m100934e();

    /* renamed from: a */
    private final boolean f68897a;

    /* renamed from: b */
    private final Constructor<MethodHandles.Lookup> f68898b;

    /* renamed from: retrofit2.p$a */
    /* compiled from: Platform */
    static final class C17294a extends C17293p {

        /* renamed from: retrofit2.p$a$a */
        /* compiled from: Platform */
        static final class C17295a implements Executor {

            /* renamed from: a */
            private final Handler f68899a = new Handler(Looper.getMainLooper());

            C17295a() {
            }

            public void execute(Runnable runnable) {
                this.f68899a.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17294a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        /* renamed from: b */
        public Executor mo80573b() {
            return new C17295a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Object mo80576g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return C17293p.super.mo80576g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    C17293p(boolean z) {
        this.f68897a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f68898b = constructor;
    }

    /* renamed from: e */
    private static C17293p m100934e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C17294a();
        }
        return new C17293p(true);
    }

    /* renamed from: f */
    static C17293p m100935f() {
        return f68896c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends C17237c.C17238a> mo80572a(Executor executor) {
        C17248g gVar = new C17248g(executor);
        if (!this.f68897a) {
            return Collections.singletonList(gVar);
        }
        return Arrays.asList(new C17237c.C17238a[]{C17240e.f68797a, gVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Executor mo80573b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<? extends C17246f.C17247a> mo80574c() {
        return this.f68897a ? Collections.singletonList(C17273n.f68849a) : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo80575d() {
        return this.f68897a ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo80576g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f68898b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo80577h(Method method) {
        return this.f68897a && method.isDefault();
    }
}
