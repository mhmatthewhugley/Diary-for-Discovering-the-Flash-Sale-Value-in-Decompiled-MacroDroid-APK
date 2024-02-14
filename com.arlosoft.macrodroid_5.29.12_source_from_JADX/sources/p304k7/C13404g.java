package p304k7;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: k7.g */
/* compiled from: PropertyValuesHolder */
public class C13404g implements Cloneable {

    /* renamed from: A */
    private static final C13407h f61446A = new C13400d();

    /* renamed from: B */
    private static final C13407h f61447B = new C13398b();

    /* renamed from: C */
    private static Class[] f61448C;

    /* renamed from: D */
    private static Class[] f61449D;

    /* renamed from: E */
    private static Class[] f61450E;

    /* renamed from: F */
    private static final HashMap<Class, HashMap<String, Method>> f61451F = new HashMap<>();

    /* renamed from: G */
    private static final HashMap<Class, HashMap<String, Method>> f61452G = new HashMap<>();

    /* renamed from: a */
    String f61453a;

    /* renamed from: c */
    Method f61454c;

    /* renamed from: d */
    private Method f61455d;

    /* renamed from: f */
    Class f61456f;

    /* renamed from: g */
    C13403f f61457g;

    /* renamed from: o */
    final ReentrantReadWriteLock f61458o;

    /* renamed from: p */
    final Object[] f61459p;

    /* renamed from: s */
    private C13407h f61460s;

    /* renamed from: z */
    private Object f61461z;

    /* renamed from: k7.g$b */
    /* compiled from: PropertyValuesHolder */
    static class C13406b extends C13404g {

        /* renamed from: H */
        C13399c f61462H;

        /* renamed from: I */
        float f61463I;

        public C13406b(String str, float... fArr) {
            super(str);
            mo70835f(fArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70830a(float f) {
            this.f61463I = this.f61462H.mo70818f(f);
        }

        /* renamed from: f */
        public void mo70835f(float... fArr) {
            C13404g.super.mo70835f(fArr);
            this.f61462H = (C13399c) this.f61457g;
        }

        /* renamed from: g */
        public C13406b clone() {
            C13406b bVar = (C13406b) C13404g.super.clone();
            bVar.f61462H = (C13399c) bVar.f61457g;
            return bVar;
        }
    }

    static {
        Class<Integer> cls = Integer.class;
        Class<Double> cls2 = Double.class;
        Class<Float> cls3 = Float.class;
        Class cls4 = Float.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Integer.TYPE;
        f61448C = new Class[]{cls4, cls3, cls5, cls6, cls2, cls};
        f61449D = new Class[]{cls6, cls, cls4, cls5, cls3, cls2};
        f61450E = new Class[]{cls5, cls2, cls4, cls6, cls3, cls};
    }

    /* renamed from: e */
    public static C13404g m85805e(String str, float... fArr) {
        return new C13406b(str, fArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70830a(float f) {
        this.f61461z = this.f61457g.mo70815b(f);
    }

    /* renamed from: b */
    public C13404g clone() {
        try {
            C13404g gVar = (C13404g) super.clone();
            gVar.f61453a = this.f61453a;
            gVar.f61457g = this.f61457g.mo70814a();
            gVar.f61460s = this.f61460s;
            return gVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public String mo70832c() {
        return this.f61453a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo70834d() {
        if (this.f61460s == null) {
            Class<Float> cls = this.f61456f;
            this.f61460s = cls == Integer.class ? f61446A : cls == Float.class ? f61447B : null;
        }
        C13407h hVar = this.f61460s;
        if (hVar != null) {
            this.f61457g.mo70828d(hVar);
        }
    }

    /* renamed from: f */
    public void mo70835f(float... fArr) {
        this.f61456f = Float.TYPE;
        this.f61457g = C13403f.m85801c(fArr);
    }

    public String toString() {
        return this.f61453a + ": " + this.f61457g.toString();
    }

    private C13404g(String str) {
        this.f61454c = null;
        this.f61455d = null;
        this.f61457g = null;
        this.f61458o = new ReentrantReadWriteLock();
        this.f61459p = new Object[1];
        this.f61453a = str;
    }
}
