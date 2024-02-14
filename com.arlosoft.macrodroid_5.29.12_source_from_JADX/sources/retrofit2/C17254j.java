package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.C13635d;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15919e0;
import org.apache.http.client.methods.HttpHead;
import retrofit2.C17307x;

/* renamed from: retrofit2.j */
/* compiled from: HttpServiceMethod */
abstract class C17254j<ResponseT, ReturnT> extends C17304u<ReturnT> {

    /* renamed from: a */
    private final C17298r f68819a;

    /* renamed from: b */
    private final C15917e.C15918a f68820b;

    /* renamed from: c */
    private final C17246f<C15919e0, ResponseT> f68821c;

    /* renamed from: retrofit2.j$a */
    /* compiled from: HttpServiceMethod */
    static final class C17255a<ResponseT, ReturnT> extends C17254j<ResponseT, ReturnT> {

        /* renamed from: d */
        private final C17237c<ResponseT, ReturnT> f68822d;

        C17255a(C17298r rVar, C15917e.C15918a aVar, C17246f<C15919e0, ResponseT> fVar, C17237c<ResponseT, ReturnT> cVar) {
            super(rVar, aVar, fVar);
            this.f68822d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [retrofit2.b, retrofit2.b<ResponseT>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo80550c(retrofit2.C17236b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                retrofit2.c<ResponseT, ReturnT> r2 = r0.f68822d
                java.lang.Object r1 = r2.mo80378b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.C17254j.C17255a.mo80550c(retrofit2.b, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: retrofit2.j$b */
    /* compiled from: HttpServiceMethod */
    static final class C17256b<ResponseT> extends C17254j<ResponseT, Object> {

        /* renamed from: d */
        private final C17237c<ResponseT, C17236b<ResponseT>> f68823d;

        /* renamed from: e */
        private final boolean f68824e;

        C17256b(C17298r rVar, C15917e.C15918a aVar, C17246f<C15919e0, ResponseT> fVar, C17237c<ResponseT, C17236b<ResponseT>> cVar, boolean z) {
            super(rVar, aVar, fVar);
            this.f68823d = cVar;
            this.f68824e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo80550c(C17236b<ResponseT> bVar, Object[] objArr) {
            C17236b bVar2 = (C17236b) this.f68823d.mo80378b(bVar);
            C13635d dVar = objArr[objArr.length - 1];
            try {
                if (this.f68824e) {
                    return C17259l.m100884b(bVar2, dVar);
                }
                return C17259l.m100883a(bVar2, dVar);
            } catch (Exception e) {
                return C17259l.m100886d(e, dVar);
            }
        }
    }

    /* renamed from: retrofit2.j$c */
    /* compiled from: HttpServiceMethod */
    static final class C17257c<ResponseT> extends C17254j<ResponseT, Object> {

        /* renamed from: d */
        private final C17237c<ResponseT, C17236b<ResponseT>> f68825d;

        C17257c(C17298r rVar, C15917e.C15918a aVar, C17246f<C15919e0, ResponseT> fVar, C17237c<ResponseT, C17236b<ResponseT>> cVar) {
            super(rVar, aVar, fVar);
            this.f68825d = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo80550c(C17236b<ResponseT> bVar, Object[] objArr) {
            C17236b bVar2 = (C17236b) this.f68825d.mo80378b(bVar);
            C13635d dVar = objArr[objArr.length - 1];
            try {
                return C17259l.m100885c(bVar2, dVar);
            } catch (Exception e) {
                return C17259l.m100886d(e, dVar);
            }
        }
    }

    C17254j(C17298r rVar, C15917e.C15918a aVar, C17246f<C15919e0, ResponseT> fVar) {
        this.f68819a = rVar;
        this.f68820b = aVar;
        this.f68821c = fVar;
    }

    /* renamed from: d */
    private static <ResponseT, ReturnT> C17237c<ResponseT, ReturnT> m100874d(C17301t tVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return tVar.mo80598a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C17307x.m101012n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static <ResponseT> C17246f<C15919e0, ResponseT> m100875e(C17301t tVar, Method method, Type type) {
        try {
            return tVar.mo80605h(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C17307x.m101012n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    static <ResponseT, ReturnT> C17254j<ResponseT, ReturnT> m100876f(C17301t tVar, Method method, C17298r rVar) {
        Type type;
        boolean z;
        Class<C17300s> cls = C17300s.class;
        boolean z2 = rVar.f68925k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = C17307x.m101004f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C17307x.m101006h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = C17307x.m101005g(0, (ParameterizedType) f);
                z = true;
            }
            type = new C17307x.C17309b((Type) null, C17236b.class, f);
            annotations = C17306w.m100998a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C17237c d = m100874d(tVar, method, type, annotations);
        Type a = d.mo80377a();
        if (a == C15915d0.class) {
            throw C17307x.m101011m(method, "'" + C17307x.m101006h(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw C17307x.m101011m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!rVar.f68917c.equals(HttpHead.METHOD_NAME) || Void.class.equals(a)) {
            C17246f e = m100875e(tVar, method, a);
            C15917e.C15918a aVar = tVar.f68955b;
            if (!z2) {
                return new C17255a(rVar, aVar, e, d);
            }
            if (z) {
                return new C17257c(rVar, aVar, e, d);
            }
            return new C17256b(rVar, aVar, e, d, false);
        } else {
            throw C17307x.m101011m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ReturnT mo80549a(Object[] objArr) {
        return mo80550c(new C17268m(this.f68819a, objArr, this.f68820b, this.f68821c), objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ReturnT mo80550c(C17236b<ResponseT> bVar, Object[] objArr);
}
