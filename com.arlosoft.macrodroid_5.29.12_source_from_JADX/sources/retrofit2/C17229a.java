package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C15907c0;
import okhttp3.C15919e0;
import p297ja.C13339u;
import p458df.C17144w;
import retrofit2.C17246f;

/* renamed from: retrofit2.a */
/* compiled from: BuiltInConverters */
final class C17229a extends C17246f.C17247a {

    /* renamed from: a */
    private boolean f68790a = true;

    /* renamed from: retrofit2.a$a */
    /* compiled from: BuiltInConverters */
    static final class C17230a implements C17246f<C15919e0, C15919e0> {

        /* renamed from: a */
        static final C17230a f68791a = new C17230a();

        C17230a() {
        }

        /* renamed from: b */
        public C15919e0 mo80387a(C15919e0 e0Var) throws IOException {
            try {
                return C17307x.m100999a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    /* compiled from: BuiltInConverters */
    static final class C17231b implements C17246f<C15907c0, C15907c0> {

        /* renamed from: a */
        static final C17231b f68792a = new C17231b();

        C17231b() {
        }

        /* renamed from: b */
        public C15907c0 mo80387a(C15907c0 c0Var) {
            return c0Var;
        }
    }

    /* renamed from: retrofit2.a$c */
    /* compiled from: BuiltInConverters */
    static final class C17232c implements C17246f<C15919e0, C15919e0> {

        /* renamed from: a */
        static final C17232c f68793a = new C17232c();

        C17232c() {
        }

        /* renamed from: b */
        public C15919e0 mo80387a(C15919e0 e0Var) {
            return e0Var;
        }
    }

    /* renamed from: retrofit2.a$d */
    /* compiled from: BuiltInConverters */
    static final class C17233d implements C17246f<Object, String> {

        /* renamed from: a */
        static final C17233d f68794a = new C17233d();

        C17233d() {
        }

        /* renamed from: b */
        public String mo80387a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    /* compiled from: BuiltInConverters */
    static final class C17234e implements C17246f<C15919e0, C13339u> {

        /* renamed from: a */
        static final C17234e f68795a = new C17234e();

        C17234e() {
        }

        /* renamed from: b */
        public C13339u mo80387a(C15919e0 e0Var) {
            e0Var.close();
            return C13339u.f61331a;
        }
    }

    /* renamed from: retrofit2.a$f */
    /* compiled from: BuiltInConverters */
    static final class C17235f implements C17246f<C15919e0, Void> {

        /* renamed from: a */
        static final C17235f f68796a = new C17235f();

        C17235f() {
        }

        /* renamed from: b */
        public Void mo80387a(C15919e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    C17229a() {
    }

    /* renamed from: c */
    public C17246f<?, C15907c0> mo80385c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C17301t tVar) {
        if (C15907c0.class.isAssignableFrom(C17307x.m101006h(type))) {
            return C17231b.f68792a;
        }
        return null;
    }

    /* renamed from: d */
    public C17246f<C15919e0, ?> mo80386d(Type type, Annotation[] annotationArr, C17301t tVar) {
        if (type == C15919e0.class) {
            if (C17307x.m101010l(annotationArr, C17144w.class)) {
                return C17232c.f68793a;
            }
            return C17230a.f68791a;
        } else if (type == Void.class) {
            return C17235f.f68796a;
        } else {
            if (!this.f68790a || type != C13339u.class) {
                return null;
            }
            try {
                return C17234e.f68795a;
            } catch (NoClassDefFoundError unused) {
                this.f68790a = false;
                return null;
            }
        }
    }
}
