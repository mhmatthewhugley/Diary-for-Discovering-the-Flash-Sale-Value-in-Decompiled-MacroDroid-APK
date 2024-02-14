package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13694h0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14095h;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14118v;
import p288ib.C12487d0;
import p288ib.C12492g;
import p288ib.C12495j;
import p288ib.C12509w;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;
import p433xa.C16878g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l */
/* compiled from: ReflectJavaClass.kt */
public final class C14100l extends C14112p implements C14095h, C14118v, C12492g {

    /* renamed from: a */
    private final Class<?> f62728a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$a */
    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class C14101a extends C13703l implements C16265l<Member, Boolean> {

        /* renamed from: a */
        public static final C14101a f62729a = new C14101a();

        C14101a() {
            super(1);
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: l */
        public final Boolean invoke(Member member) {
            C13706o.m87929f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$b */
    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class C14102b extends C13703l implements C16265l<Constructor<?>, C14111o> {

        /* renamed from: a */
        public static final C14102b f62730a = new C14102b();

        C14102b() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14111o.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        /* renamed from: l */
        public final C14111o invoke(Constructor<?> constructor) {
            C13706o.m87929f(constructor, "p0");
            return new C14111o(constructor);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$c */
    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class C14103c extends C13703l implements C16265l<Member, Boolean> {

        /* renamed from: a */
        public static final C14103c f62731a = new C14103c();

        C14103c() {
            super(1);
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: l */
        public final Boolean invoke(Member member) {
            C13706o.m87929f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$d */
    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class C14104d extends C13703l implements C16265l<Field, C14114r> {

        /* renamed from: a */
        public static final C14104d f62732a = new C14104d();

        C14104d() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14114r.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        /* renamed from: l */
        public final C14114r invoke(Field field) {
            C13706o.m87929f(field, "p0");
            return new C14114r(field);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$e */
    /* compiled from: ReflectJavaClass.kt */
    static final class C14105e extends C13708q implements C16265l<Class<?>, Boolean> {

        /* renamed from: a */
        public static final C14105e f62733a = new C14105e();

        C14105e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            C13706o.m87928e(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$f */
    /* compiled from: ReflectJavaClass.kt */
    static final class C14106f extends C13708q implements C16265l<Class<?>, C16157f> {

        /* renamed from: a */
        public static final C14106f f62734a = new C14106f();

        C14106f() {
            super(1);
        }

        /* renamed from: a */
        public final C16157f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C16157f.m97020k(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C16157f.m97019i(simpleName);
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$g */
    /* compiled from: ReflectJavaClass.kt */
    static final class C14107g extends C13708q implements C16265l<Method, Boolean> {
        final /* synthetic */ C14100l this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14107g(C14100l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l.m89425N(r0, r5) == false) goto L_0x001f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x000a
            L_0x0008:
                r1 = 0
                goto L_0x001f
            L_0x000a:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = r4.this$0
                boolean r0 = r0.mo68978u()
                if (r0 == 0) goto L_0x001f
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = r4.this$0
                java.lang.String r3 = "method"
                kotlin.jvm.internal.C13706o.m87928e(r5, r3)
                boolean r5 = r0.m89426W(r5)
                if (r5 != 0) goto L_0x0008
            L_0x001f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l.C14107g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l$h */
    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class C14108h extends C13703l implements C16265l<Method, C14117u> {

        /* renamed from: a */
        public static final C14108h f62735a = new C14108h();

        C14108h() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14117u.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        /* renamed from: l */
        public final C14117u invoke(Method method) {
            C13706o.m87929f(method, "p0");
            return new C14117u(method);
        }
    }

    public C14100l(Class<?> cls) {
        C13706o.m87929f(cls, "klass");
        this.f62728a = cls;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final boolean m89426W(Method method) {
        String name = method.getName();
        if (C13706o.m87924a(name, "values")) {
            Class[] parameterTypes = method.getParameterTypes();
            C13706o.m87928e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (C13706o.m87924a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo68966F() {
        return this.f62728a.isInterface();
    }

    /* renamed from: G */
    public C12487d0 mo68967G() {
        return null;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return C14095h.C14096a.m89418c(this);
    }

    /* renamed from: O */
    public C14091e mo68961H(C16152c cVar) {
        return C14095h.C14096a.m89416a(this, cVar);
    }

    /* renamed from: P */
    public List<C14091e> getAnnotations() {
        return C14095h.C14096a.m89417b(this);
    }

    /* renamed from: Q */
    public List<C14111o> mo68971k() {
        Constructor[] declaredConstructors = this.f62728a.getDeclaredConstructors();
        C13706o.m87928e(declaredConstructors, "klass.declaredConstructors");
        return C15132p.m93480D(C15132p.m93494w(C15132p.m93486o(C13596m.m87622t(declaredConstructors), C14101a.f62729a), C14102b.f62730a));
    }

    /* renamed from: R */
    public Class<?> mo72583b() {
        return this.f62728a;
    }

    /* renamed from: S */
    public List<C14114r> getFields() {
        Field[] declaredFields = this.f62728a.getDeclaredFields();
        C13706o.m87928e(declaredFields, "klass.declaredFields");
        return C15132p.m93480D(C15132p.m93494w(C15132p.m93486o(C13596m.m87622t(declaredFields), C14103c.f62731a), C14104d.f62732a));
    }

    /* renamed from: T */
    public List<C16157f> mo68980y() {
        Class[] declaredClasses = this.f62728a.getDeclaredClasses();
        C13706o.m87928e(declaredClasses, "klass.declaredClasses");
        return C15132p.m93480D(C15132p.m93495x(C15132p.m93486o(C13596m.m87622t(declaredClasses), C14105e.f62733a), C14106f.f62734a));
    }

    /* renamed from: U */
    public List<C14117u> getMethods() {
        Method[] declaredMethods = this.f62728a.getDeclaredMethods();
        C13706o.m87928e(declaredMethods, "klass.declaredMethods");
        return C15132p.m93480D(C15132p.m93494w(C15132p.m93485n(C13596m.m87622t(declaredMethods), new C14107g(this)), C14108h.f62735a));
    }

    /* renamed from: V */
    public C14100l mo68973m() {
        Class<?> declaringClass = this.f62728a.getDeclaringClass();
        if (declaringClass != null) {
            return new C14100l(declaringClass);
        }
        return null;
    }

    /* renamed from: e */
    public C16152c mo68968e() {
        C16152c b = C14088d.m89397a(this.f62728a).mo78544b();
        C13706o.m87928e(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14100l) && C13706o.m87924a(this.f62728a, ((C14100l) obj).f62728a);
    }

    public int getModifiers() {
        return this.f62728a.getModifiers();
    }

    public C16157f getName() {
        C16157f i = C16157f.m97019i(this.f62728a.getSimpleName());
        C13706o.m87928e(i, "identifier(klass.simpleName)");
        return i;
    }

    public List<C14081a0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f62728a.getTypeParameters();
        C13706o.m87928e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable a0Var : typeParameters) {
            arrayList.add(new C14081a0(a0Var));
        }
        return arrayList;
    }

    public C14068m1 getVisibility() {
        return C14118v.C14119a.m89496a(this);
    }

    /* renamed from: h */
    public boolean mo69001h() {
        return C14118v.C14119a.m89499d(this);
    }

    public int hashCode() {
        return this.f62728a.hashCode();
    }

    public boolean isAbstract() {
        return C14118v.C14119a.m89497b(this);
    }

    public boolean isFinal() {
        return C14118v.C14119a.m89498c(this);
    }

    /* renamed from: l */
    public Collection<C12495j> mo68972l() {
        Type type = Object.class;
        if (C13706o.m87924a(this.f62728a, type)) {
            return C13614t.m87748j();
        }
        C13694h0 h0Var = new C13694h0(2);
        Type genericSuperclass = this.f62728a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        h0Var.mo71949a(type);
        Type[] genericInterfaces = this.f62728a.getGenericInterfaces();
        C13706o.m87928e(genericInterfaces, "klass.genericInterfaces");
        h0Var.mo71950b(genericInterfaces);
        List<Type> m = C13614t.m87751m(h0Var.mo71952d(new Type[h0Var.mo71951c()]));
        ArrayList arrayList = new ArrayList(C13616u.m87774u(m, 10));
        for (Type nVar : m) {
            arrayList.add(new C14110n(nVar));
        }
        return arrayList;
    }

    /* renamed from: n */
    public Collection<C12509w> mo68974n() {
        Object[] d = C14082b.f62696a.mo72588d(this.f62728a);
        if (d == null) {
            d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d.length);
        for (Object yVar : d) {
            arrayList.add(new C14122y(yVar));
        }
        return arrayList;
    }

    /* renamed from: o */
    public boolean mo68975o() {
        return this.f62728a.isAnnotation();
    }

    /* renamed from: p */
    public boolean mo68976p() {
        Boolean e = C14082b.f62696a.mo72589e(this.f62728a);
        if (e != null) {
            return e.booleanValue();
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo68977q() {
        return false;
    }

    public String toString() {
        return C14100l.class.getName() + ": " + this.f62728a;
    }

    /* renamed from: u */
    public boolean mo68978u() {
        return this.f62728a.isEnum();
    }

    /* renamed from: w */
    public boolean mo68979w() {
        Boolean f = C14082b.f62696a.mo72590f(this.f62728a);
        if (f != null) {
            return f.booleanValue();
        }
        return false;
    }

    /* renamed from: z */
    public Collection<C12495j> mo68981z() {
        Class[] c = C14082b.f62696a.mo72587c(this.f62728a);
        if (c == null) {
            return C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(c.length);
        for (Class nVar : c) {
            arrayList.add(new C14110n(nVar));
        }
        return arrayList;
    }
}
