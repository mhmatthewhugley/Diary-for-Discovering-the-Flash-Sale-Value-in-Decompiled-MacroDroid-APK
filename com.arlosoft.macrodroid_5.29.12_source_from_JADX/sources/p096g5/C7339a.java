package p096g5;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g5.a */
/* compiled from: FactoryPools */
public final class C7339a {

    /* renamed from: a */
    private static final C7346g<Object> f17993a = new C7340a();

    /* renamed from: g5.a$a */
    /* compiled from: FactoryPools */
    class C7340a implements C7346g<Object> {
        C7340a() {
        }

        /* renamed from: a */
        public void mo37322a(@NonNull Object obj) {
        }
    }

    /* renamed from: g5.a$b */
    /* compiled from: FactoryPools */
    class C7341b implements C7343d<List<T>> {
        C7341b() {
        }

        @NonNull
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* renamed from: g5.a$c */
    /* compiled from: FactoryPools */
    class C7342c implements C7346g<List<T>> {
        C7342c() {
        }

        /* renamed from: b */
        public void mo37322a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* renamed from: g5.a$d */
    /* compiled from: FactoryPools */
    public interface C7343d<T> {
        T create();
    }

    /* renamed from: g5.a$e */
    /* compiled from: FactoryPools */
    private static final class C7344e<T> implements Pools.Pool<T> {

        /* renamed from: a */
        private final C7343d<T> f17994a;

        /* renamed from: b */
        private final C7346g<T> f17995b;

        /* renamed from: c */
        private final Pools.Pool<T> f17996c;

        C7344e(@NonNull Pools.Pool<T> pool, @NonNull C7343d<T> dVar, @NonNull C7346g<T> gVar) {
            this.f17996c = pool;
            this.f17994a = dVar;
            this.f17995b = gVar;
        }

        public T acquire() {
            T acquire = this.f17996c.acquire();
            if (acquire == null) {
                acquire = this.f17994a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(acquire.getClass());
                }
            }
            if (acquire instanceof C7345f) {
                ((C7345f) acquire).mo24547i().mo37325b(false);
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            if (t instanceof C7345f) {
                ((C7345f) t).mo24547i().mo37325b(true);
            }
            this.f17995b.mo37322a(t);
            return this.f17996c.release(t);
        }
    }

    /* renamed from: g5.a$f */
    /* compiled from: FactoryPools */
    public interface C7345f {
        @NonNull
        /* renamed from: i */
        C7348c mo24547i();
    }

    /* renamed from: g5.a$g */
    /* compiled from: FactoryPools */
    public interface C7346g<T> {
        /* renamed from: a */
        void mo37322a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    private static <T extends C7345f> Pools.Pool<T> m30342a(@NonNull Pools.Pool<T> pool, @NonNull C7343d<T> dVar) {
        return m30343b(pool, dVar, m30344c());
    }

    @NonNull
    /* renamed from: b */
    private static <T> Pools.Pool<T> m30343b(@NonNull Pools.Pool<T> pool, @NonNull C7343d<T> dVar, @NonNull C7346g<T> gVar) {
        return new C7344e(pool, dVar, gVar);
    }

    @NonNull
    /* renamed from: c */
    private static <T> C7346g<T> m30344c() {
        return f17993a;
    }

    @NonNull
    /* renamed from: d */
    public static <T extends C7345f> Pools.Pool<T> m30345d(int i, @NonNull C7343d<T> dVar) {
        return m30342a(new Pools.SynchronizedPool(i), dVar);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Pools.Pool<List<T>> m30346e() {
        return m30347f(20);
    }

    @NonNull
    /* renamed from: f */
    public static <T> Pools.Pool<List<T>> m30347f(int i) {
        return m30343b(new Pools.SynchronizedPool(i), new C7341b(), new C7342c());
    }
}
