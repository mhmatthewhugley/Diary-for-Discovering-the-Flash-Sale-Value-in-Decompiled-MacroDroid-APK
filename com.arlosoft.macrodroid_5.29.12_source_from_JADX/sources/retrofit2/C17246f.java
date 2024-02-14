package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.C15907c0;
import okhttp3.C15919e0;

/* renamed from: retrofit2.f */
/* compiled from: Converter */
public interface C17246f<F, T> {

    /* renamed from: retrofit2.f$a */
    /* compiled from: Converter */
    public static abstract class C17247a {
        /* renamed from: a */
        protected static Type m100855a(int i, ParameterizedType parameterizedType) {
            return C17307x.m101005g(i, parameterizedType);
        }

        /* renamed from: b */
        protected static Class<?> m100856b(Type type) {
            return C17307x.m101006h(type);
        }

        /* renamed from: c */
        public C17246f<?, C15907c0> mo80385c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C17301t tVar) {
            return null;
        }

        /* renamed from: d */
        public C17246f<C15919e0, ?> mo80386d(Type type, Annotation[] annotationArr, C17301t tVar) {
            return null;
        }

        /* renamed from: e */
        public C17246f<?, String> mo80544e(Type type, Annotation[] annotationArr, C17301t tVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo80387a(F f) throws IOException;
}
