package p457cf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C15907c0;
import okhttp3.C15919e0;
import retrofit2.C17246f;
import retrofit2.C17301t;

/* renamed from: cf.k */
/* compiled from: ScalarsConverterFactory */
public final class C17121k extends C17246f.C17247a {
    private C17121k() {
    }

    /* renamed from: f */
    public static C17121k m100622f() {
        return new C17121k();
    }

    /* renamed from: c */
    public C17246f<?, C15907c0> mo80385c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C17301t tVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C17111a.f68693a;
        }
        return null;
    }

    /* renamed from: d */
    public C17246f<C15919e0, ?> mo80386d(Type type, Annotation[] annotationArr, C17301t tVar) {
        if (type == String.class) {
            return C17120j.f68703a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C17112b.f68695a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C17113c.f68696a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C17114d.f68697a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C17115e.f68698a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C17116f.f68699a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C17117g.f68700a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C17118h.f68701a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C17119i.f68702a;
        }
        return null;
    }
}
