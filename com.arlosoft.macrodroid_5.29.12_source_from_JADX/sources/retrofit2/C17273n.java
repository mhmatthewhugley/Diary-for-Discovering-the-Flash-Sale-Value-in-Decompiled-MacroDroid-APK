package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.C15919e0;
import retrofit2.C17246f;

/* renamed from: retrofit2.n */
/* compiled from: OptionalConverterFactory */
final class C17273n extends C17246f.C17247a {

    /* renamed from: a */
    static final C17246f.C17247a f68849a = new C17273n();

    /* renamed from: retrofit2.n$a */
    /* compiled from: OptionalConverterFactory */
    static final class C17274a<T> implements C17246f<C15919e0, Optional<T>> {

        /* renamed from: a */
        final C17246f<C15919e0, T> f68850a;

        C17274a(C17246f<C15919e0, T> fVar) {
            this.f68850a = fVar;
        }

        /* renamed from: b */
        public Optional<T> mo80387a(C15919e0 e0Var) throws IOException {
            return Optional.ofNullable(this.f68850a.mo80387a(e0Var));
        }
    }

    C17273n() {
    }

    /* renamed from: d */
    public C17246f<C15919e0, ?> mo80386d(Type type, Annotation[] annotationArr, C17301t tVar) {
        if (C17246f.C17247a.m100856b(type) != Optional.class) {
            return null;
        }
        return new C17274a(tVar.mo80605h(C17246f.C17247a.m100855a(0, (ParameterizedType) type), annotationArr));
    }
}
