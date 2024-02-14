package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14972s0;
import p253ec.C12187a;
import p263fb.C12256d;
import p297ja.C13321g;
import p297ja.C13326k;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16254a;
import p433xa.C16887m;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.j */
/* compiled from: ReflectionTypes.kt */
public final class C13863j {

    /* renamed from: k */
    public static final C13865b f62095k = new C13865b((C13695i) null);

    /* renamed from: l */
    static final /* synthetic */ C16887m<Object>[] f62096l;

    /* renamed from: a */
    private final C14043j0 f62097a;

    /* renamed from: b */
    private final C13321g f62098b;

    /* renamed from: c */
    private final C13864a f62099c = new C13864a(1);

    /* renamed from: d */
    private final C13864a f62100d = new C13864a(1);

    /* renamed from: e */
    private final C13864a f62101e = new C13864a(1);

    /* renamed from: f */
    private final C13864a f62102f = new C13864a(2);

    /* renamed from: g */
    private final C13864a f62103g = new C13864a(3);

    /* renamed from: h */
    private final C13864a f62104h = new C13864a(1);

    /* renamed from: i */
    private final C13864a f62105i = new C13864a(2);

    /* renamed from: j */
    private final C13864a f62106j = new C13864a(3);

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.j$a */
    /* compiled from: ReflectionTypes.kt */
    private static final class C13864a {

        /* renamed from: a */
        private final int f62107a;

        public C13864a(int i) {
            this.f62107a = i;
        }

        /* renamed from: a */
        public final C13948e mo72163a(C13863j jVar, C16887m<?> mVar) {
            C13706o.m87929f(jVar, "types");
            C13706o.m87929f(mVar, "property");
            return jVar.m88337b(C12187a.m82850a(mVar.getName()), this.f62107a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.j$b */
    /* compiled from: ReflectionTypes.kt */
    public static final class C13865b {
        private C13865b() {
        }

        public /* synthetic */ C13865b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14900e0 mo72164a(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            C13948e a = C14147x.m89564a(g0Var, C13902k.C13903a.f62276s0);
            if (a == null) {
                return null;
            }
            C14830a1 h = C14830a1.f63959c.mo74051h();
            List<C13950e1> parameters = a.mo62171j().getParameters();
            C13706o.m87928e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object u0 = C13566b0.m87446u0(parameters);
            C13706o.m87928e(u0, "kPropertyClass.typeConstructor.parameters.single()");
            return C14906f0.m92819g(h, a, C13612s.m87736e(new C14972s0((C13950e1) u0)));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.j$c */
    /* compiled from: ReflectionTypes.kt */
    static final class C13866c extends C13708q implements C16254a<C14692h> {
        final /* synthetic */ C13958g0 $module;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13866c(C13958g0 g0Var) {
            super(0);
            this.$module = g0Var;
        }

        /* renamed from: a */
        public final C14692h invoke() {
            return this.$module.mo72295V(C13902k.f62193o).mo72524n();
        }
    }

    static {
        Class<C13863j> cls = C13863j.class;
        f62096l = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public C13863j(C13958g0 g0Var, C14043j0 j0Var) {
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(j0Var, "notFoundClasses");
        this.f62097a = j0Var;
        this.f62098b = C13323i.m85668a(C13326k.PUBLICATION, new C13866c(g0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C13948e m88337b(String str, int i) {
        C16157f i2 = C16157f.m97019i(str);
        C13706o.m87928e(i2, "identifier(className)");
        C13961h e = m88338d().mo72800e(i2, C12256d.FROM_REFLECTION);
        C13948e eVar = e instanceof C13948e ? (C13948e) e : null;
        return eVar == null ? this.f62097a.mo72552d(new C16151b(C13902k.f62193o, i2), C13612s.m87736e(Integer.valueOf(i))) : eVar;
    }

    /* renamed from: d */
    private final C14692h m88338d() {
        return (C14692h) this.f62098b.getValue();
    }

    /* renamed from: c */
    public final C13948e mo72162c() {
        return this.f62099c.mo72163a(this, f62096l[0]);
    }
}
