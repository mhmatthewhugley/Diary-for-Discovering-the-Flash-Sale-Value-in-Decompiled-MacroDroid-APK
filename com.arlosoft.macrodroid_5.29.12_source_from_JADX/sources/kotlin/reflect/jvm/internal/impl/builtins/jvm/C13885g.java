package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13878f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14125s;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13919f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13995h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14041z;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14249g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14469u;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14473x;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14928h0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p217bb.C11117a;
import p217bb.C11120c;
import p217bb.C11123d;
import p263fb.C12256d;
import p272gc.C12339b;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p433xa.C16887m;
import p442yb.C16981a;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g */
/* compiled from: JvmBuiltInsCustomizer.kt */
public final class C13885g implements C11117a, C11120c {

    /* renamed from: h */
    static final /* synthetic */ C16887m<Object>[] f62153h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13958g0 f62154a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13873d f62155b = C13873d.f62132a;

    /* renamed from: c */
    private final C17006i f62156c;

    /* renamed from: d */
    private final C14900e0 f62157d;

    /* renamed from: e */
    private final C17006i f62158e;

    /* renamed from: f */
    private final C16981a<C16152c, C13948e> f62159f;

    /* renamed from: g */
    private final C17006i f62160g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$a */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    private enum C13886a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$b */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class C13887b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62166a;

        static {
            int[] iArr = new int[C13886a.values().length];
            iArr[C13886a.HIDDEN.ordinal()] = 1;
            iArr[C13886a.NOT_CONSIDERED.ordinal()] = 2;
            iArr[C13886a.DROP.ordinal()] = 3;
            iArr[C13886a.VISIBLE.ordinal()] = 4;
            f62166a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$c */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13888c extends C13708q implements C16254a<C14951m0> {
        final /* synthetic */ C17012n $storageManager;
        final /* synthetic */ C13885g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13888c(C13885g gVar, C17012n nVar) {
            super(0);
            this.this$0 = gVar;
            this.$storageManager = nVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke() {
            return C14147x.m89566c(this.this$0.m88416s().mo72197a(), C13874e.f62133d.mo72191a(), new C14043j0(this.$storageManager, this.this$0.m88416s().mo72197a())).mo72274p();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$d */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C13889d extends C14041z {
        C13889d(C13958g0 g0Var, C16152c cVar) {
            super(g0Var, cVar);
        }

        /* renamed from: G0 */
        public C14692h.C14695b mo72205n() {
            return C14692h.C14695b.f63726b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$e */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13890e extends C13708q implements C16254a<C14900e0> {
        final /* synthetic */ C13885g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13890e(C13885g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final C14900e0 invoke() {
            C14951m0 i = this.this$0.f62154a.mo72296m().mo72136i();
            C13706o.m87928e(i, "moduleDescriptor.builtIns.anyType");
            return i;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$f */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13891f extends C13708q implements C16254a<C13948e> {
        final /* synthetic */ C14241f $javaAnalogueDescriptor;
        final /* synthetic */ C13948e $kotlinMutableClassIfContainer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13891f(C14241f fVar, C13948e eVar) {
            super(0);
            this.$javaAnalogueDescriptor = fVar;
            this.$kotlinMutableClassIfContainer = eVar;
        }

        /* renamed from: a */
        public final C13948e invoke() {
            C14241f fVar = this.$javaAnalogueDescriptor;
            C14181g gVar = C14181g.f62863a;
            C13706o.m87928e(gVar, "EMPTY");
            return fVar.mo72812N0(gVar, this.$kotlinMutableClassIfContainer);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$g */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13892g extends C13708q implements C16265l<C14692h, Collection<? extends C14156y0>> {
        final /* synthetic */ C16157f $name;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13892g(C16157f fVar) {
            super(1);
            this.$name = fVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C14692h hVar) {
            C13706o.m87929f(hVar, "it");
            return hVar.mo72450c(this.$name, C12256d.FROM_BUILTINS);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$h */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13893h<N> implements C12339b.C12342c {

        /* renamed from: a */
        final /* synthetic */ C13885g f62167a;

        C13893h(C13885g gVar) {
            this.f62167a = gVar;
        }

        /* renamed from: b */
        public final Iterable<C13948e> mo68671a(C13948e eVar) {
            Collection<C14900e0> l = eVar.mo62171j().mo72370l();
            C13706o.m87928e(l, "it.typeConstructor.supertypes");
            C13885g gVar = this.f62167a;
            ArrayList arrayList = new ArrayList();
            for (C14900e0 N0 : l) {
                C13961h c = N0.mo73702N0().mo62183c();
                C14241f fVar = null;
                C13961h a = c != null ? c.mo72233a() : null;
                C13948e eVar2 = a instanceof C13948e ? (C13948e) a : null;
                if (eVar2 != null) {
                    fVar = gVar.m88413p(eVar2);
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$i */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C13894i extends C12339b.C12341b<C13948e, C13886a> {

        /* renamed from: a */
        final /* synthetic */ String f62168a;

        /* renamed from: b */
        final /* synthetic */ C13684d0<C13886a> f62169b;

        C13894i(String str, C13684d0<C13886a> d0Var) {
            this.f62168a = str;
            this.f62169b = d0Var;
        }

        /* renamed from: d */
        public boolean mo68668c(C13948e eVar) {
            C13706o.m87929f(eVar, "javaClassDescriptor");
            String a = C14469u.m90686a(C14473x.f63314a, eVar, this.f62168a);
            C13900i iVar = C13900i.f62172a;
            if (iVar.mo72218e().contains(a)) {
                this.f62169b.element = C13886a.HIDDEN;
            } else if (iVar.mo72221h().contains(a)) {
                this.f62169b.element = C13886a.VISIBLE;
            } else if (iVar.mo72216c().contains(a)) {
                this.f62169b.element = C13886a.DROP;
            }
            return this.f62169b.element == null;
        }

        /* renamed from: e */
        public C13886a mo68667a() {
            C13886a aVar = (C13886a) this.f62169b.element;
            return aVar == null ? C13886a.NOT_CONSIDERED : aVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$j */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13895j<N> implements C12339b.C12342c {

        /* renamed from: a */
        public static final C13895j<N> f62170a = new C13895j<>();

        C13895j() {
        }

        /* renamed from: b */
        public final Iterable<C13936b> mo68671a(C13936b bVar) {
            return bVar.mo72233a().mo72234d();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$k */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13896k extends C13708q implements C16265l<C13936b, Boolean> {
        final /* synthetic */ C13885g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13896k(C13885g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            boolean z;
            if (bVar.mo72264h() == C13936b.C13937a.DECLARATION) {
                C13873d f = this.this$0.f62155b;
                C14064m b = bVar.mo62163b();
                C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (f.mo72186c((C13948e) b)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.g$l */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class C13897l extends C13708q implements C16254a<C13921g> {
        final /* synthetic */ C13885g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13897l(C13885g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final C13921g invoke() {
            return C13921g.f62330v.mo72250a(C13612s.m87736e(C13919f.m88495b(this.this$0.f62154a.mo72296m(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", (String) null, (String) null, 6, (Object) null)));
        }
    }

    static {
        Class<C13885g> cls = C13885g.class;
        f62153h = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C13885g(C13958g0 g0Var, C17012n nVar, C16254a<C13878f.C13880b> aVar) {
        C13706o.m87929f(g0Var, "moduleDescriptor");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "settingsComputation");
        this.f62154a = g0Var;
        this.f62156c = nVar.mo80221f(aVar);
        this.f62157d = m88409k(nVar);
        this.f62158e = nVar.mo80221f(new C13888c(this, nVar));
        this.f62159f = nVar.mo80218c();
        this.f62160g = nVar.mo80221f(new C13897l(this));
    }

    /* renamed from: j */
    private final C14156y0 m88408j(C14730d dVar, C14156y0 y0Var) {
        C14154y.C14155a<? extends C14156y0> t = y0Var.mo72401t();
        t.mo72511q(dVar);
        t.mo72502h(C14127t.f62754e);
        t.mo72507m(dVar.mo72274p());
        t.mo72497c(dVar.mo72283J0());
        Object build = t.build();
        C13706o.m87926c(build);
        return (C14156y0) build;
    }

    /* renamed from: k */
    private final C14900e0 m88409k(C17012n nVar) {
        C13995h hVar = new C13995h(new C13889d(this.f62154a, new C16152c("java.io")), C16157f.m97019i("Serializable"), C13945d0.ABSTRACT, C13951f.INTERFACE, C13612s.m87736e(new C14928h0(nVar, new C13890e(this))), C14158z0.f62778a, false, nVar);
        hVar.mo72402K0(C14692h.C14695b.f63726b, C13627z0.m87806d(), (C13944d) null);
        C14951m0 p = hVar.mo72274p();
        C13706o.m87928e(p, "mockSerializableClass.defaultType");
        return p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        if (m88417t(r3, r10) != false) goto L_0x0097;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14156y0> m88410l(kotlin.reflect.jvm.internal.impl.descriptors.C13948e r10, p370qa.C16265l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.C14156y0>> r11) {
        /*
            r9 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r0 = r9.m88413p(r10)
            if (r0 != 0) goto L_0x000b
            java.util.List r10 = kotlin.collections.C13614t.m87748j()
            return r10
        L_0x000b:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r1 = r9.f62155b
            pb.c r2 = p389sb.C16519a.m98615h(r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.b$a r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.C13869b.f62110h
            kotlin.reflect.jvm.internal.impl.builtins.h r3 = r3.mo72168a()
            java.util.Collection r1 = r1.mo72189g(r2, r3)
            java.lang.Object r2 = kotlin.collections.C13566b0.m87435j0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            if (r2 != 0) goto L_0x0028
            java.util.List r10 = kotlin.collections.C13614t.m87748j()
            return r10
        L_0x0028:
            gc.f$b r3 = p272gc.C12359f.f59044d
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C13616u.m87774u(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r5
            pb.c r5 = p389sb.C16519a.m98615h(r5)
            r4.add(r5)
            goto L_0x0039
        L_0x004d:
            gc.f r1 = r3.mo68707b(r4)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d r3 = r9.f62155b
            boolean r10 = r3.mo72186c(r10)
            yb.a<pb.c, kotlin.reflect.jvm.internal.impl.descriptors.e> r3 = r9.f62159f
            pb.c r4 = p389sb.C16519a.m98615h(r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.g$f r5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.g$f
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.mo80212a(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r0 = r0.mo72285X()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0080:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r11.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r4 = r3.mo72264h()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r5 = kotlin.reflect.jvm.internal.impl.descriptors.C13936b.C13937a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x0099
        L_0x0097:
            r6 = 0
            goto L_0x00ed
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.descriptors.u r4 = r3.getVisibility()
            boolean r4 = r4.mo72660d()
            if (r4 != 0) goto L_0x00a4
            goto L_0x0097
        L_0x00a4:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88264j0(r3)
            if (r4 == 0) goto L_0x00ab
            goto L_0x0097
        L_0x00ab:
            java.util.Collection r4 = r3.mo72234d()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00c0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00c0
        L_0x00be:
            r4 = 0
            goto L_0x00e4
        L_0x00c0:
            java.util.Iterator r4 = r4.iterator()
        L_0x00c4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r5
            kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo62163b()
            java.lang.String r8 = "it.containingDeclaration"
            kotlin.jvm.internal.C13706o.m87928e(r5, r8)
            pb.c r5 = p389sb.C16519a.m98615h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x00c4
            r4 = 1
        L_0x00e4:
            if (r4 == 0) goto L_0x00e7
            goto L_0x0097
        L_0x00e7:
            boolean r3 = r9.m88417t(r3, r10)
            if (r3 != 0) goto L_0x0097
        L_0x00ed:
            if (r6 == 0) goto L_0x0080
            r0.add(r2)
            goto L_0x0080
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.C13885g.m88410l(kotlin.reflect.jvm.internal.impl.descriptors.e, qa.l):java.util.Collection");
    }

    /* renamed from: m */
    private final C14951m0 m88411m() {
        return (C14951m0) C17011m.m100276a(this.f62158e, this, f62153h[1]);
    }

    /* renamed from: n */
    private static final boolean m88412n(C14052l lVar, C14945l1 l1Var, C14052l lVar2) {
        return C14658j.m91688x(lVar, lVar2.mo72267c(l1Var)) == C14658j.C14667i.C14668a.f63670a;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final C14241f m88413p(C13948e eVar) {
        C16151b n;
        C16152c b;
        if (C13853h.m88251a0(eVar) || !C13853h.m88243A0(eVar)) {
            return null;
        }
        C16153d i = C16519a.m98616i(eVar);
        if (!i.mo78572f() || (n = C13871c.f62112a.mo72174n(i)) == null || (b = n.mo78544b()) == null) {
            return null;
        }
        C13948e c = C14125s.m89516c(m88416s().mo72197a(), b, C12256d.FROM_BUILTINS);
        if (c instanceof C14241f) {
            return (C14241f) c;
        }
        return null;
    }

    /* renamed from: q */
    private final C13886a m88414q(C14154y yVar) {
        C14064m b = yVar.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b2 = C12339b.m83079b(C13612s.m87736e((C13948e) b), new C13893h(this), new C13894i(C14470v.m90689c(yVar, false, false, 3, (Object) null), new C13684d0()));
        C13706o.m87928e(b2, "private fun FunctionDesc…ERED\n            })\n    }");
        return (C13886a) b2;
    }

    /* renamed from: r */
    private final C13921g m88415r() {
        return (C13921g) C17011m.m100276a(this.f62160g, this, f62153h[2]);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final C13878f.C13880b m88416s() {
        return (C13878f.C13880b) C17011m.m100276a(this.f62156c, this, f62153h[0]);
    }

    /* renamed from: t */
    private final boolean m88417t(C14156y0 y0Var, boolean z) {
        C14064m b = y0Var.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c = C14470v.m90689c(y0Var, false, false, 3, (Object) null);
        if (z ^ C13900i.f62172a.mo72219f().contains(C14469u.m90686a(C14473x.f63314a, (C13948e) b, c))) {
            return true;
        }
        Boolean e = C12339b.m83082e(C13612s.m87736e(y0Var), C13895j.f62170a, new C13896k(this));
        C13706o.m87928e(e, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e.booleanValue();
    }

    /* renamed from: u */
    private final boolean m88418u(C14052l lVar, C13948e eVar) {
        if (lVar.mo72235g().size() == 1) {
            List<C13966i1> g = lVar.mo72235g();
            C13706o.m87928e(g, "valueParameters");
            C13961h c = ((C13966i1) C13566b0.m87446u0(g)).getType().mo73702N0().mo62183c();
            if (C13706o.m87924a(c != null ? C16519a.m98616i(c) : null, C16519a.m98616i(eVar))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo62253a(C13948e eVar, C14156y0 y0Var) {
        C13706o.m87929f(eVar, "classDescriptor");
        C13706o.m87929f(y0Var, "functionDescriptor");
        C14241f p = m88413p(eVar);
        if (p == null || !y0Var.getAnnotations().mo72249n1(C11123d.m74787a())) {
            return true;
        }
        if (!m88416s().mo72198b()) {
            return false;
        }
        String c = C14470v.m90689c(y0Var, false, false, 3, (Object) null);
        C14249g S0 = p.mo72285X();
        C16157f name = y0Var.getName();
        C13706o.m87928e(name, "functionDescriptor.name");
        Collection<C14156y0> c2 = S0.mo72450c(name, C12256d.FROM_BUILTINS);
        if (!(c2 instanceof Collection) || !c2.isEmpty()) {
            for (C14156y0 c3 : c2) {
                if (C13706o.m87924a(C14470v.m90689c(c3, false, false, 3, (Object) null), c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        if (r2 != 3) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14156y0> mo62249b(p362pb.C16157f r7, kotlin.reflect.jvm.internal.impl.descriptors.C13948e r8) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.C13867a.f62108e
            pb.f r0 = r0.mo72166a()
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r7, r0)
            r1 = 1
            if (r0 == 0) goto L_0x008d
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d
            if (r0 == 0) goto L_0x008d
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88257d0(r8)
            if (r0 == 0) goto L_0x008d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d) r8
            kb.c r0 = r8.mo73864b1()
            java.util.List r0 = r0.mo71108O0()
            java.lang.String r2 = "classDescriptor.classProto.functionList"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x003d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x003d
        L_0x003b:
            r1 = 0
            goto L_0x0069
        L_0x003d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r0.next()
            kb.i r2 = (p308kb.C13481i) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r8.mo73863a1()
            mb.c r4 = r4.mo73992g()
            int r2 = r2.mo71267i0()
            pb.f r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x.m92359b(r4, r2)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.C13867a.f62108e
            pb.f r4 = r4.mo72166a()
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r2, r4)
            if (r2 == 0) goto L_0x0041
        L_0x0069:
            if (r1 == 0) goto L_0x0070
            java.util.List r7 = kotlin.collections.C13614t.m87748j()
            return r7
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = r6.m88411m()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h r0 = r0.mo72955n()
            fb.d r1 = p263fb.C12256d.FROM_BUILTINS
            java.util.Collection r7 = r0.mo72450c(r7, r1)
            java.lang.Object r7 = kotlin.collections.C13566b0.m87445t0(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r7
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r7 = r6.m88408j(r8, r7)
            java.util.List r7 = kotlin.collections.C13612s.m87736e(r7)
            return r7
        L_0x008d:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.f$b r0 = r6.m88416s()
            boolean r0 = r0.mo72198b()
            if (r0 != 0) goto L_0x009c
            java.util.List r7 = kotlin.collections.C13614t.m87748j()
            return r7
        L_0x009c:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.g$g r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.g$g
            r0.<init>(r7)
            java.util.Collection r7 = r6.m88410l(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ae:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r2.mo62163b()
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r3
            kotlin.reflect.jvm.internal.impl.types.f1 r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.C13901j.m88453a(r3, r8)
            kotlin.reflect.jvm.internal.impl.types.l1 r3 = r3.mo74203c()
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = r2.mo72267c(r3)
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r3 = r3.mo72401t()
            r3.mo72511q(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = r8.mo72283J0()
            r3.mo72497c(r4)
            r3.mo72506l()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.g$a r2 = r6.m88414q(r2)
            int[] r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.C13885g.C13887b.f62166a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 0
            if (r2 == r1) goto L_0x0107
            r5 = 2
            if (r2 == r5) goto L_0x00ff
            r5 = 3
            if (r2 == r5) goto L_0x011b
            goto L_0x0111
        L_0x00ff:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r6.m88415r()
            r3.mo72513s(r2)
            goto L_0x0111
        L_0x0107:
            boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.C13949e0.m88575a(r8)
            if (r2 == 0) goto L_0x010e
            goto L_0x011b
        L_0x010e:
            r3.mo72498d()
        L_0x0111:
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r3.build()
            kotlin.jvm.internal.C13706o.m87926c(r2)
            r4 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r4
        L_0x011b:
            if (r4 == 0) goto L_0x00ae
            r0.add(r4)
            goto L_0x00ae
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.C13885g.mo62249b(pb.f, kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Collection");
    }

    /* renamed from: c */
    public Collection<C13944d> mo62250c(C13948e eVar) {
        boolean z;
        C13706o.m87929f(eVar, "classDescriptor");
        if (eVar.mo62168h() != C13951f.CLASS || !m88416s().mo72198b()) {
            return C13614t.m87748j();
        }
        C14241f p = m88413p(eVar);
        if (p == null) {
            return C13614t.m87748j();
        }
        C13948e f = C13873d.m88370f(this.f62155b, C16519a.m98615h(p), C13869b.f62110h.mo72168a(), (Integer) null, 4, (Object) null);
        if (f == null) {
            return C13614t.m87748j();
        }
        C14945l1 c = C13901j.m88453a(f, p).mo74203c();
        List<C13944d> O0 = p.mo62173k();
        ArrayList<C13944d> arrayList = new ArrayList<>();
        Iterator<T> it = O0.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C13944d dVar = (C13944d) next;
            if (dVar.getVisibility().mo72660d()) {
                Collection<C13944d> k = f.mo62173k();
                C13706o.m87928e(k, "defaultKotlinVersion.constructors");
                if (!(k instanceof Collection) || !k.isEmpty()) {
                    Iterator<T> it2 = k.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C13944d dVar2 = (C13944d) it2.next();
                        C13706o.m87928e(dVar2, "it");
                        if (m88412n(dVar2, c, dVar)) {
                            z = false;
                            break;
                        }
                    }
                    if (z && !m88418u(dVar, eVar) && !C13853h.m88264j0(dVar) && !C13900i.f62172a.mo72217d().contains(C14469u.m90686a(C14473x.f63314a, p, C14470v.m90689c(dVar, false, false, 3, (Object) null)))) {
                        z2 = true;
                    }
                }
                z = true;
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (C13944d dVar3 : arrayList) {
            C14154y.C14155a<? extends C14154y> t = dVar3.mo72401t();
            t.mo72511q(eVar);
            t.mo72507m(eVar.mo72274p());
            t.mo72506l();
            t.mo72500f(c.mo74211j());
            if (!C13900i.f62172a.mo72220g().contains(C14469u.m90686a(C14473x.f63314a, p, C14470v.m90689c(dVar3, false, false, 3, (Object) null)))) {
                t.mo72513s(m88415r());
            }
            Object build = t.build();
            C13706o.m87927d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C13944d) build);
        }
        return arrayList2;
    }

    /* renamed from: d */
    public Collection<C14900e0> mo62251d(C13948e eVar) {
        C13706o.m87929f(eVar, "classDescriptor");
        C16153d i = C16519a.m98616i(eVar);
        C13900i iVar = C13900i.f62172a;
        if (iVar.mo72222i(i)) {
            C14951m0 m = m88411m();
            C13706o.m87928e(m, "cloneableType");
            return C13614t.m87751m(m, this.f62157d);
        } else if (iVar.mo72223j(i)) {
            return C13612s.m87736e(this.f62157d);
        } else {
            return C13614t.m87748j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = (r2 = r2.mo72817S0()).mo72449b();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<p362pb.C16157f> mo62252e(kotlin.reflect.jvm.internal.impl.descriptors.C13948e r2) {
        /*
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.f$b r0 = r1.m88416s()
            boolean r0 = r0.mo72198b()
            if (r0 != 0) goto L_0x0014
            java.util.Set r2 = kotlin.collections.C13627z0.m87806d()
            return r2
        L_0x0014:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r2 = r1.m88413p(r2)
            if (r2 == 0) goto L_0x0026
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g r2 = r2.mo72285X()
            if (r2 == 0) goto L_0x0026
            java.util.Set r2 = r2.mo72449b()
            if (r2 != 0) goto L_0x002a
        L_0x0026:
            java.util.Set r2 = kotlin.collections.C13627z0.m87806d()
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.C13885g.mo62252e(kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Set");
    }
}
