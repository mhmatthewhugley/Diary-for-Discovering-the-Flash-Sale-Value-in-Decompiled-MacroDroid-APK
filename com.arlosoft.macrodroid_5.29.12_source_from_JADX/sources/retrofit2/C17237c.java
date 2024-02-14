package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.c */
/* compiled from: CallAdapter */
public interface C17237c<R, T> {

    /* renamed from: retrofit2.c$a */
    /* compiled from: CallAdapter */
    public static abstract class C17238a {
        /* renamed from: b */
        protected static Type m100838b(int i, ParameterizedType parameterizedType) {
            return C17307x.m101005g(i, parameterizedType);
        }

        /* renamed from: c */
        protected static Class<?> m100839c(Type type) {
            return C17307x.m101006h(type);
        }

        /* renamed from: a */
        public abstract C17237c<?, ?> mo80379a(Type type, Annotation[] annotationArr, C17301t tVar);
    }

    /* renamed from: a */
    Type mo80377a();

    /* renamed from: b */
    T mo80378b(C17236b<R> bVar);
}
