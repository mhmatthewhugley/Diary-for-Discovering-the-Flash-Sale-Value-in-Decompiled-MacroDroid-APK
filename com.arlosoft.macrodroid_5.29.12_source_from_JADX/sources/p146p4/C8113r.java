package p146p4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p090f5.C7315j;
import p102h4.C7384g;
import p146p4.C8105n;

/* renamed from: p4.r */
/* compiled from: MultiModelLoaderFactory */
public class C8113r {

    /* renamed from: e */
    private static final C8116c f19723e = new C8116c();

    /* renamed from: f */
    private static final C8105n<Object, Object> f19724f = new C8114a();

    /* renamed from: a */
    private final List<C8115b<?, ?>> f19725a;

    /* renamed from: b */
    private final C8116c f19726b;

    /* renamed from: c */
    private final Set<C8115b<?, ?>> f19727c;

    /* renamed from: d */
    private final Pools.Pool<List<Throwable>> f19728d;

    /* renamed from: p4.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8114a implements C8105n<Object, Object> {
        C8114a() {
        }

        /* renamed from: a */
        public boolean mo38073a(@NonNull Object obj) {
            return false;
        }

        @Nullable
        /* renamed from: b */
        public C8105n.C8106a<Object> mo38074b(@NonNull Object obj, int i, int i2, @NonNull C7384g gVar) {
            return null;
        }
    }

    /* renamed from: p4.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8115b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f19729a;

        /* renamed from: b */
        final Class<Data> f19730b;

        /* renamed from: c */
        final C8107o<? extends Model, ? extends Data> f19731c;

        public C8115b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8107o<? extends Model, ? extends Data> oVar) {
            this.f19729a = cls;
            this.f19730b = cls2;
            this.f19731c = oVar;
        }

        /* renamed from: a */
        public boolean mo38135a(@NonNull Class<?> cls) {
            return this.f19729a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo38136b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return mo38135a(cls) && this.f19730b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: p4.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C8116c {
        C8116c() {
        }

        @NonNull
        /* renamed from: a */
        public <Model, Data> C8111q<Model, Data> mo38137a(@NonNull List<C8105n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new C8111q<>(list, pool);
        }
    }

    public C8113r(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f19723e);
    }

    /* renamed from: a */
    private <Model, Data> void m33740a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8107o<? extends Model, ? extends Data> oVar, boolean z) {
        C8115b bVar = new C8115b(cls, cls2, oVar);
        List<C8115b<?, ?>> list = this.f19725a;
        list.add(z ? list.size() : 0, bVar);
    }

    @NonNull
    /* renamed from: e */
    private <Model, Data> C8105n<Model, Data> m33741e(@NonNull C8115b<?, ?> bVar) {
        return (C8105n) C7315j.m30204d(bVar.f19731c.mo38078a(this));
    }

    @NonNull
    /* renamed from: f */
    private static <Model, Data> C8105n<Model, Data> m33742f() {
        return f19724f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo38131b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8107o<? extends Model, ? extends Data> oVar) {
        m33740a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public synchronized <Model> List<C8105n<Model, ?>> mo38132c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8115b next : this.f19725a) {
                if (!this.f19727c.contains(next)) {
                    if (next.mo38135a(cls)) {
                        this.f19727c.add(next);
                        arrayList.add(m33741e(next));
                        this.f19727c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f19727c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <Model, Data> C8105n<Model, Data> mo38133d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8115b next : this.f19725a) {
                if (this.f19727c.contains(next)) {
                    z = true;
                } else if (next.mo38136b(cls, cls2)) {
                    this.f19727c.add(next);
                    arrayList.add(m33741e(next));
                    this.f19727c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f19726b.mo38137a(arrayList, this.f19728d);
            } else if (arrayList.size() == 1) {
                return (C8105n) arrayList.get(0);
            } else if (z) {
                return m33742f();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f19727c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public synchronized List<Class<?>> mo38134g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8115b next : this.f19725a) {
            if (!arrayList.contains(next.f19730b) && next.mo38135a(cls)) {
                arrayList.add(next.f19730b);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    C8113r(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull C8116c cVar) {
        this.f19725a = new ArrayList();
        this.f19727c = new HashSet();
        this.f19728d = pool;
        this.f19726b = cVar;
    }
}
