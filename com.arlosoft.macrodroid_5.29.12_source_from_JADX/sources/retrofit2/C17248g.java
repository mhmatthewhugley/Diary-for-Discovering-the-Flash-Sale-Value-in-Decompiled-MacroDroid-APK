package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.C15904b0;
import retrofit2.C17237c;

/* renamed from: retrofit2.g */
/* compiled from: DefaultCallAdapterFactory */
final class C17248g extends C17237c.C17238a {

    /* renamed from: a */
    private final Executor f68805a;

    /* renamed from: retrofit2.g$a */
    /* compiled from: DefaultCallAdapterFactory */
    class C17249a implements C17237c<Object, C17236b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f68806a;

        /* renamed from: b */
        final /* synthetic */ Executor f68807b;

        C17249a(Type type, Executor executor) {
            this.f68806a = type;
            this.f68807b = executor;
        }

        /* renamed from: a */
        public Type mo80377a() {
            return this.f68806a;
        }

        /* renamed from: c */
        public C17236b<Object> mo80378b(C17236b<Object> bVar) {
            Executor executor = this.f68807b;
            return executor == null ? bVar : new C17250b(executor, bVar);
        }
    }

    /* renamed from: retrofit2.g$b */
    /* compiled from: DefaultCallAdapterFactory */
    static final class C17250b<T> implements C17236b<T> {

        /* renamed from: a */
        final Executor f68809a;

        /* renamed from: c */
        final C17236b<T> f68810c;

        /* renamed from: retrofit2.g$b$a */
        /* compiled from: DefaultCallAdapterFactory */
        class C17251a implements C17239d<T> {

            /* renamed from: a */
            final /* synthetic */ C17239d f68811a;

            C17251a(C17239d dVar) {
                this.f68811a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m100870e(C17239d dVar, Throwable th) {
                dVar.mo80374a(C17250b.this, th);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m100871f(C17239d dVar, C17300s sVar) {
                if (C17250b.this.f68810c.mo80535I()) {
                    dVar.mo80374a(C17250b.this, new IOException("Canceled"));
                } else {
                    dVar.mo80375b(C17250b.this, sVar);
                }
            }

            /* renamed from: a */
            public void mo80374a(C17236b<T> bVar, Throwable th) {
                C17250b.this.f68809a.execute(new C17252h(this, this.f68811a, th));
            }

            /* renamed from: b */
            public void mo80375b(C17236b<T> bVar, C17300s<T> sVar) {
                C17250b.this.f68809a.execute(new C17253i(this, this.f68811a, sVar));
            }
        }

        C17250b(Executor executor, C17236b<T> bVar) {
            this.f68809a = executor;
            this.f68810c = bVar;
        }

        /* renamed from: I */
        public boolean mo80535I() {
            return this.f68810c.mo80535I();
        }

        /* renamed from: P1 */
        public C17236b<T> clone() {
            return new C17250b(this.f68809a, this.f68810c.mo80536P1());
        }

        public void cancel() {
            this.f68810c.cancel();
        }

        public C17300s<T> execute() throws IOException {
            return this.f68810c.execute();
        }

        /* renamed from: m */
        public C15904b0 mo80539m() {
            return this.f68810c.mo80539m();
        }

        /* renamed from: q0 */
        public void mo80540q0(C17239d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f68810c.mo80540q0(new C17251a(dVar));
        }
    }

    C17248g(Executor executor) {
        this.f68805a = executor;
    }

    /* renamed from: a */
    public C17237c<?, ?> mo80379a(Type type, Annotation[] annotationArr, C17301t tVar) {
        Executor executor = null;
        if (C17237c.C17238a.m100839c(type) != C17236b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = C17307x.m101005g(0, (ParameterizedType) type);
            if (!C17307x.m101010l(annotationArr, C17305v.class)) {
                executor = this.f68805a;
            }
            return new C17249a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
