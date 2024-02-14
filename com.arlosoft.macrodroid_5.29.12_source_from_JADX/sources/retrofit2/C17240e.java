package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.C17237c;

/* renamed from: retrofit2.e */
/* compiled from: CompletableFutureCallAdapterFactory */
final class C17240e extends C17237c.C17238a {

    /* renamed from: a */
    static final C17237c.C17238a f68797a = new C17240e();

    /* renamed from: retrofit2.e$a */
    /* compiled from: CompletableFutureCallAdapterFactory */
    private static final class C17241a<R> implements C17237c<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f68798a;

        /* renamed from: retrofit2.e$a$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        private class C17242a implements C17239d<R> {

            /* renamed from: a */
            private final CompletableFuture<R> f68799a;

            public C17242a(CompletableFuture<R> completableFuture) {
                this.f68799a = completableFuture;
            }

            /* renamed from: a */
            public void mo80374a(C17236b<R> bVar, Throwable th) {
                this.f68799a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo80375b(C17236b<R> bVar, C17300s<R> sVar) {
                if (sVar.mo80595e()) {
                    this.f68799a.complete(sVar.mo80592a());
                } else {
                    this.f68799a.completeExceptionally(new HttpException(sVar));
                }
            }
        }

        C17241a(Type type) {
            this.f68798a = type;
        }

        /* renamed from: a */
        public Type mo80377a() {
            return this.f68798a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo80378b(C17236b<R> bVar) {
            C17243b bVar2 = new C17243b(bVar);
            bVar.mo80540q0(new C17242a(bVar2));
            return bVar2;
        }
    }

    /* renamed from: retrofit2.e$b */
    /* compiled from: CompletableFutureCallAdapterFactory */
    private static final class C17243b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        private final C17236b<?> f68801a;

        C17243b(C17236b<?> bVar) {
            this.f68801a = bVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f68801a.cancel();
            }
            return super.cancel(z);
        }
    }

    /* renamed from: retrofit2.e$c */
    /* compiled from: CompletableFutureCallAdapterFactory */
    private static final class C17244c<R> implements C17237c<R, CompletableFuture<C17300s<R>>> {

        /* renamed from: a */
        private final Type f68802a;

        /* renamed from: retrofit2.e$c$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        private class C17245a implements C17239d<R> {

            /* renamed from: a */
            private final CompletableFuture<C17300s<R>> f68803a;

            public C17245a(CompletableFuture<C17300s<R>> completableFuture) {
                this.f68803a = completableFuture;
            }

            /* renamed from: a */
            public void mo80374a(C17236b<R> bVar, Throwable th) {
                this.f68803a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo80375b(C17236b<R> bVar, C17300s<R> sVar) {
                this.f68803a.complete(sVar);
            }
        }

        C17244c(Type type) {
            this.f68802a = type;
        }

        /* renamed from: a */
        public Type mo80377a() {
            return this.f68802a;
        }

        /* renamed from: c */
        public CompletableFuture<C17300s<R>> mo80378b(C17236b<R> bVar) {
            C17243b bVar2 = new C17243b(bVar);
            bVar.mo80540q0(new C17245a(bVar2));
            return bVar2;
        }
    }

    C17240e() {
    }

    /* renamed from: a */
    public C17237c<?, ?> mo80379a(Type type, Annotation[] annotationArr, C17301t tVar) {
        if (C17237c.C17238a.m100839c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C17237c.C17238a.m100838b(0, (ParameterizedType) type);
            if (C17237c.C17238a.m100839c(b) != C17300s.class) {
                return new C17241a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C17244c(C17237c.C17238a.m100838b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
