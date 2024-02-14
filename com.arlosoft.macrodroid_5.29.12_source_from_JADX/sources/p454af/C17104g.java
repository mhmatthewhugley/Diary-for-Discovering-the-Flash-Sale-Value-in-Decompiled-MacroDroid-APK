package p454af;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p414v9.C16728b;
import p414v9.C16732f;
import p414v9.C16734h;
import p414v9.C16735i;
import p414v9.C16742o;
import p414v9.C16747p;
import retrofit2.C17237c;
import retrofit2.C17300s;
import retrofit2.C17301t;

/* renamed from: af.g */
/* compiled from: RxJava2CallAdapterFactory */
public final class C17104g extends C17237c.C17238a {

    /* renamed from: a */
    private final C16742o f68679a;

    /* renamed from: b */
    private final boolean f68680b;

    private C17104g(C16742o oVar, boolean z) {
        this.f68679a = oVar;
        this.f68680b = z;
    }

    /* renamed from: d */
    public static C17104g m100577d() {
        return new C17104g((C16742o) null, false);
    }

    /* renamed from: a */
    public C17237c<?, ?> mo80379a(Type type, Annotation[] annotationArr, C17301t tVar) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> c = C17237c.C17238a.m100839c(type);
        if (c == C16728b.class) {
            return new C17103f(Void.class, this.f68679a, this.f68680b, false, true, false, false, false, true);
        }
        boolean z3 = c == C16732f.class;
        boolean z4 = c == C16747p.class;
        boolean z5 = c == C16734h.class;
        if (c != C16735i.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type b = C17237c.C17238a.m100838b(0, (ParameterizedType) type);
        Class<?> c2 = C17237c.C17238a.m100839c(b);
        if (c2 == C17300s.class) {
            if (b instanceof ParameterizedType) {
                type2 = C17237c.C17238a.m100838b(0, (ParameterizedType) b);
                z2 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (c2 != C17100d.class) {
            type2 = b;
            z2 = false;
            z = true;
            return new C17103f(type2, this.f68679a, this.f68680b, z2, z, z3, z4, z5, false);
        } else if (b instanceof ParameterizedType) {
            type2 = C17237c.C17238a.m100838b(0, (ParameterizedType) b);
            z2 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z = false;
        return new C17103f(type2, this.f68679a, this.f68680b, z2, z, z3, z4, z5, false);
    }
}
