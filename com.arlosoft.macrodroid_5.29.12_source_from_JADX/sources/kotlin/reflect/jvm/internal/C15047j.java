package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13685e;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13699k;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13722c;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C13773d;
import kotlin.reflect.jvm.internal.calls.C13729a;
import kotlin.reflect.jvm.internal.calls.C13738d;
import kotlin.reflect.jvm.internal.calls.C13740e;
import kotlin.reflect.jvm.internal.calls.C13765f;
import kotlin.reflect.jvm.internal.calls.C13768h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import p370qa.C16254a;
import p398tb.C16607b;
import p433xa.C16879h;
import p433xa.C16881j;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bB\u0010CB7\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u00109\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u0010D\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010EB+\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u00109\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010FJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010-\u001a\u0006\u0012\u0002\b\u00030)8VX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b%\u0010,R!\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8VX\u0002¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u00105R\u0014\u0010>\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00105R\u0014\u0010?\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u00105R\u0014\u0010@\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00105R\u0014\u0010A\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u00105¨\u0006G"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/j;", "Lkotlin/reflect/jvm/internal/f;", "", "Lxa/h;", "Lkotlin/jvm/internal/k;", "Lkotlin/reflect/jvm/internal/c;", "Ljava/lang/reflect/Method;", "member", "Lkotlin/reflect/jvm/internal/calls/e$h;", "G", "F", "E", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "", "isDefault", "Lkotlin/reflect/jvm/internal/calls/e;", "D", "other", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/i;", "g", "Lkotlin/reflect/jvm/internal/i;", "t", "()Lkotlin/reflect/jvm/internal/i;", "container", "o", "Ljava/lang/String;", "signature", "p", "Ljava/lang/Object;", "rawBoundReceiver", "s", "Lkotlin/reflect/jvm/internal/c0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lkotlin/reflect/jvm/internal/calls/d;", "z", "Lkotlin/reflect/jvm/internal/c0$b;", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "A", "u", "defaultCaller", "H", "()Ljava/lang/Object;", "boundReceiver", "x", "()Z", "isBound", "getName", "()Ljava/lang/String;", "name", "getArity", "()I", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.j */
/* compiled from: KFunctionImpl.kt */
public final class C15047j extends C13792f<Object> implements C13699k<Object>, C16879h<Object>, C13722c {

    /* renamed from: B */
    static final /* synthetic */ C16887m<Object>[] f64225B;

    /* renamed from: A */
    private final C13724c0.C13726b f64226A;

    /* renamed from: g */
    private final C13832i f64227g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final String f64228o;

    /* renamed from: p */
    private final Object f64229p;

    /* renamed from: s */
    private final C13724c0.C13725a f64230s;

    /* renamed from: z */
    private final C13724c0.C13726b f64231z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/d;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/d;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.j$a */
    /* compiled from: KFunctionImpl.kt */
    static final class C15048a extends C13708q implements C16254a<C13738d<? extends Member>> {
        final /* synthetic */ C15047j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15048a(C15047j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final C13738d<Member> invoke() {
            Object obj;
            C13738d dVar;
            C13773d g = C13802f0.f62018a.mo72051g(this.this$0.mo72037v());
            if (g instanceof C13773d.C13780d) {
                if (this.this$0.mo72038w()) {
                    Class<?> e = this.this$0.mo72035t().mo71931e();
                    List<C16881j> parameters = this.this$0.getParameters();
                    ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
                    for (C16881j name : parameters) {
                        String name2 = name.getName();
                        C13706o.m87926c(name2);
                        arrayList.add(name2);
                    }
                    return new C13729a(e, arrayList, C13729a.C13730a.POSITIONAL_CALL, C13729a.C13731b.KOTLIN, (List) null, 16, (C13695i) null);
                }
                obj = this.this$0.mo72035t().mo72087n(((C13773d.C13780d) g).mo72012b());
            } else if (g instanceof C13773d.C13781e) {
                C13773d.C13781e eVar = (C13773d.C13781e) g;
                obj = this.this$0.mo72035t().mo72091r(eVar.mo72014c(), eVar.mo72013b());
            } else if (g instanceof C13773d.C13779c) {
                obj = ((C13773d.C13779c) g).mo72011b();
            } else if (g instanceof C13773d.C13777b) {
                obj = ((C13773d.C13777b) g).mo72009b();
            } else if (g instanceof C13773d.C13774a) {
                List<Method> b = ((C13773d.C13774a) g).mo72006b();
                Class<?> e2 = this.this$0.mo72035t().mo71931e();
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(b, 10));
                for (Method name3 : b) {
                    arrayList2.add(name3.getName());
                }
                return new C13729a(e2, arrayList2, C13729a.C13730a.POSITIONAL_CALL, C13729a.C13731b.JAVA, b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (obj instanceof Constructor) {
                C15047j jVar = this.this$0;
                dVar = jVar.m93273D((Constructor) obj, jVar.mo72037v(), false);
            } else if (obj instanceof Method) {
                Method method = (Method) obj;
                if (!Modifier.isStatic(method.getModifiers())) {
                    dVar = this.this$0.m93274E(method);
                } else if (this.this$0.mo72037v().getAnnotations().mo72247H(C13841i0.m88204i()) != null) {
                    dVar = this.this$0.m93275F(method);
                } else {
                    dVar = this.this$0.m93276G(method);
                }
            } else {
                throw new C13719a0("Could not compute caller for function: " + this.this$0.mo72037v() + " (member = " + obj + ')');
            }
            return C13768h.m88020c(dVar, this.this$0.mo72037v(), false, 2, (Object) null);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/d;", "a", "()Lkotlin/reflect/jvm/internal/calls/d;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.j$b */
    /* compiled from: KFunctionImpl.kt */
    static final class C15049b extends C13708q implements C16254a<C13738d<? extends Member>> {
        final /* synthetic */ C15047j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15049b(C15047j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final C13738d<Member> invoke() {
            Object obj;
            C13738d dVar;
            C13773d g = C13802f0.f62018a.mo72051g(this.this$0.mo72037v());
            if (g instanceof C13773d.C13781e) {
                C13832i t = this.this$0.mo72035t();
                C13773d.C13781e eVar = (C13773d.C13781e) g;
                String c = eVar.mo72014c();
                String b = eVar.mo72013b();
                Member b2 = this.this$0.mo72034s().mo71985b();
                C13706o.m87926c(b2);
                obj = t.mo72089p(c, b, !Modifier.isStatic(b2.getModifiers()));
            } else if (g instanceof C13773d.C13780d) {
                if (this.this$0.mo72038w()) {
                    Class<?> e = this.this$0.mo72035t().mo71931e();
                    List<C16881j> parameters = this.this$0.getParameters();
                    ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
                    for (C16881j name : parameters) {
                        String name2 = name.getName();
                        C13706o.m87926c(name2);
                        arrayList.add(name2);
                    }
                    return new C13729a(e, arrayList, C13729a.C13730a.CALL_BY_NAME, C13729a.C13731b.KOTLIN, (List) null, 16, (C13695i) null);
                }
                obj = this.this$0.mo72035t().mo72088o(((C13773d.C13780d) g).mo72012b());
            } else if (g instanceof C13773d.C13774a) {
                List<Method> b3 = ((C13773d.C13774a) g).mo72006b();
                Class<?> e2 = this.this$0.mo72035t().mo71931e();
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(b3, 10));
                for (Method name3 : b3) {
                    arrayList2.add(name3.getName());
                }
                return new C13729a(e2, arrayList2, C13729a.C13730a.CALL_BY_NAME, C13729a.C13731b.JAVA, b3);
            } else {
                obj = null;
            }
            if (obj instanceof Constructor) {
                C15047j jVar = this.this$0;
                dVar = jVar.m93273D((Constructor) obj, jVar.mo72037v(), true);
            } else if (obj instanceof Method) {
                if (this.this$0.mo72037v().getAnnotations().mo72247H(C13841i0.m88204i()) != null) {
                    C14064m b4 = this.this$0.mo72037v().mo62163b();
                    C13706o.m87927d(b4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((C13948e) b4).mo62162a0()) {
                        dVar = this.this$0.m93275F((Method) obj);
                    }
                }
                dVar = this.this$0.m93276G((Method) obj);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                return C13768h.m88019b(dVar, this.this$0.mo72037v(), true);
            }
            return null;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/y;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.j$c */
    /* compiled from: KFunctionImpl.kt */
    static final class C15050c extends C13708q implements C16254a<C14154y> {
        final /* synthetic */ String $name;
        final /* synthetic */ C15047j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15050c(C15047j jVar, String str) {
            super(0);
            this.this$0 = jVar;
            this.$name = str;
        }

        /* renamed from: a */
        public final C14154y invoke() {
            return this.this$0.mo72035t().mo72090q(this.$name, this.this$0.f64228o);
        }
    }

    static {
        Class<C15047j> cls = C15047j.class;
        f64225B = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C15047j(C13832i iVar, String str, String str2, C14154y yVar, Object obj, int i, C13695i iVar2) {
        this(iVar, str, str2, yVar, (i & 16) != 0 ? C13685e.NO_RECEIVER : obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final C13740e<Constructor<?>> m93273D(Constructor<?> constructor, C14154y yVar, boolean z) {
        if (z || !C16607b.m98923f(yVar)) {
            if (mo72039x()) {
                return new C13740e.C13743c(constructor, m93277H());
            }
            return new C13740e.C13745e(constructor);
        } else if (mo72039x()) {
            return new C13740e.C13741a(constructor, m93277H());
        } else {
            return new C13740e.C13742b(constructor);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final C13740e.C13758h m93274E(Method method) {
        return mo72039x() ? new C13740e.C13758h.C13759a(method, m93277H()) : new C13740e.C13758h.C13762d(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final C13740e.C13758h m93275F(Method method) {
        return mo72039x() ? new C13740e.C13758h.C13760b(method) : new C13740e.C13758h.C13763e(method);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final C13740e.C13758h m93276G(Method method) {
        return mo72039x() ? new C13740e.C13758h.C13761c(method, m93277H()) : new C13740e.C13758h.C13764f(method);
    }

    /* renamed from: H */
    private final Object m93277H() {
        return C13768h.m88018a(this.f64229p, mo72037v());
    }

    /* renamed from: I */
    public C14154y mo72037v() {
        Object b = this.f64230s.mo71982b(this, f64225B[0]);
        C13706o.m87928e(b, "<get-descriptor>(...)");
        return (C14154y) b;
    }

    /* renamed from: e */
    public Object mo28012e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return C13722c.C13723a.m87969g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean equals(Object obj) {
        C15047j b = C13841i0.m88197b(obj);
        if (b != null && C13706o.m87924a(mo72035t(), b.mo72035t()) && C13706o.m87924a(getName(), b.getName()) && C13706o.m87924a(this.f64228o, b.f64228o) && C13706o.m87924a(this.f64229p, b.f64229p)) {
            return true;
        }
        return false;
    }

    public int getArity() {
        return C13765f.m88012a(mo72034s());
    }

    public String getName() {
        String d = mo72037v().getName().mo78583d();
        C13706o.m87928e(d, "descriptor.name.asString()");
        return d;
    }

    public int hashCode() {
        return (((mo72035t().hashCode() * 31) + getName().hashCode()) * 31) + this.f64228o.hashCode();
    }

    public Object invoke() {
        return C13722c.C13723a.m87963a(this);
    }

    public boolean isExternal() {
        return mo72037v().isExternal();
    }

    public boolean isInfix() {
        return mo72037v().isInfix();
    }

    public boolean isInline() {
        return mo72037v().isInline();
    }

    public boolean isOperator() {
        return mo72037v().isOperator();
    }

    public boolean isSuspend() {
        return mo72037v().isSuspend();
    }

    /* renamed from: n */
    public Object mo24899n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return C13722c.C13723a.m87968f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: s */
    public C13738d<?> mo72034s() {
        Object b = this.f64231z.mo71982b(this, f64225B[1]);
        C13706o.m87928e(b, "<get-caller>(...)");
        return (C13738d) b;
    }

    /* renamed from: t */
    public C13832i mo72035t() {
        return this.f64227g;
    }

    public String toString() {
        return C13788e0.f62008a.mo72026d(mo72037v());
    }

    /* renamed from: u */
    public C13738d<?> mo72036u() {
        return (C13738d) this.f64226A.mo71982b(this, f64225B[2]);
    }

    /* renamed from: x */
    public boolean mo72039x() {
        return !C13706o.m87924a(this.f64229p, C13685e.NO_RECEIVER);
    }

    public Object invoke(Object obj) {
        return C13722c.C13723a.m87964b(this, obj);
    }

    private C15047j(C13832i iVar, String str, String str2, C14154y yVar, Object obj) {
        this.f64227g = iVar;
        this.f64228o = str2;
        this.f64229p = obj;
        this.f64230s = C13724c0.m87972c(yVar, new C15050c(this, str));
        this.f64231z = C13724c0.m87971b(new C15048a(this));
        this.f64226A = C13724c0.m87971b(new C15049b(this));
    }

    public Object invoke(Object obj, Object obj2) {
        return C13722c.C13723a.m87965c(this, obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return C13722c.C13723a.m87966d(this, obj, obj2, obj3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return C13722c.C13723a.m87967e(this, obj, obj2, obj3, obj4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15047j(C13832i iVar, String str, String str2, Object obj) {
        this(iVar, str, str2, (C14154y) null, obj);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15047j(kotlin.reflect.jvm.internal.C13832i r10, kotlin.reflect.jvm.internal.impl.descriptors.C14154y r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            pb.f r0 = r11.getName()
            java.lang.String r3 = r0.mo78583d()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)
            kotlin.reflect.jvm.internal.f0 r0 = kotlin.reflect.jvm.internal.C13802f0.f62018a
            kotlin.reflect.jvm.internal.d r0 = r0.mo72051g(r11)
            java.lang.String r4 = r0.mo72005a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C15047j.<init>(kotlin.reflect.jvm.internal.i, kotlin.reflect.jvm.internal.impl.descriptors.y):void");
    }
}
