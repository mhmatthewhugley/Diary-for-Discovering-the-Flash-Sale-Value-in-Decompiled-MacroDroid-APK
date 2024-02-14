package p146p4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p4.p */
/* compiled from: ModelLoaderRegistry */
public class C8108p {

    /* renamed from: a */
    private final C8113r f19710a;

    /* renamed from: b */
    private final C8109a f19711b;

    /* renamed from: p4.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C8109a {

        /* renamed from: a */
        private final Map<Class<?>, C8110a<?>> f19712a = new HashMap();

        /* renamed from: p4.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C8110a<Model> {

            /* renamed from: a */
            final List<C8105n<Model, ?>> f19713a;

            public C8110a(List<C8105n<Model, ?>> list) {
                this.f19713a = list;
            }
        }

        C8109a() {
        }

        /* renamed from: a */
        public void mo38127a() {
            this.f19712a.clear();
        }

        @Nullable
        /* renamed from: b */
        public <Model> List<C8105n<Model, ?>> mo38128b(Class<Model> cls) {
            C8110a aVar = this.f19712a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f19713a;
        }

        /* renamed from: c */
        public <Model> void mo38129c(Class<Model> cls, List<C8105n<Model, ?>> list) {
            if (this.f19712a.put(cls, new C8110a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C8108p(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new C8113r(pool));
    }

    @NonNull
    /* renamed from: b */
    private static <A> Class<A> m33723b(@NonNull A a) {
        return a.getClass();
    }

    @NonNull
    /* renamed from: e */
    private synchronized <A> List<C8105n<A, ?>> m33724e(@NonNull Class<A> cls) {
        List<C8105n<A, ?>> b;
        b = this.f19711b.mo38128b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f19710a.mo38132c(cls));
            this.f19711b.mo38129c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo38124a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8107o<? extends Model, ? extends Data> oVar) {
        this.f19710a.mo38131b(cls, cls2, oVar);
        this.f19711b.mo38127a();
    }

    @NonNull
    /* renamed from: c */
    public synchronized List<Class<?>> mo38125c(@NonNull Class<?> cls) {
        return this.f19710a.mo38134g(cls);
    }

    @NonNull
    /* renamed from: d */
    public <A> List<C8105n<A, ?>> mo38126d(@NonNull A a) {
        List e = m33724e(m33723b(a));
        int size = e.size();
        List<C8105n<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C8105n nVar = (C8105n) e.get(i);
            if (nVar.mo38073a(a)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        return emptyList;
    }

    private C8108p(@NonNull C8113r rVar) {
        this.f19711b = new C8109a();
        this.f19710a = rVar;
    }
}
