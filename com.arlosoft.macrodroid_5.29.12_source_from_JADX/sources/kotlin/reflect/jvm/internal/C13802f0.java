package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13773d;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13867a;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.load.java.C14203g0;
import kotlin.reflect.jvm.internal.impl.load.java.C14409z;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import p349ob.C15831d;
import p362pb.C16151b;
import p362pb.C16152c;
import p389sb.C16519a;
import p398tb.C16610e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u0006\u0012\u0002\b\u00030\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/f0;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "", "b", "Lkotlin/reflect/jvm/internal/d$e;", "d", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "", "e", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/d;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/e;", "f", "Ljava/lang/Class;", "klass", "Lpb/b;", "c", "Lkotlin/reflect/jvm/internal/impl/builtins/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.f0 */
/* compiled from: RuntimeTypeMapper.kt */
public final class C13802f0 {

    /* renamed from: a */
    public static final C13802f0 f62018a = new C13802f0();

    /* renamed from: b */
    private static final C16151b f62019b;

    static {
        C16151b m = C16151b.m96975m(new C16152c("java.lang.Void"));
        C13706o.m87928e(m, "topLevel(FqName(\"java.lang.Void\"))");
        f62019b = m;
    }

    private C13802f0() {
    }

    /* renamed from: a */
    private final C13859i m88103a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return C16610e.m98934d(cls.getSimpleName()).mo79464i();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m88104b(C14154y yVar) {
        if (C14602c.m91483o(yVar) || C14602c.m91484p(yVar)) {
            return true;
        }
        if (!C13706o.m87924a(yVar.getName(), C13867a.f62108e.mo72166a()) || !yVar.mo72235g().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final C13773d.C13781e m88105d(C14154y yVar) {
        return new C13773d.C13781e(new C15831d.C15833b(m88106e(yVar), C14470v.m90689c(yVar, false, false, 1, (Object) null)));
    }

    /* renamed from: e */
    private final String m88106e(C13936b bVar) {
        String b = C14203g0.m89753b(bVar);
        if (b != null) {
            return b;
        }
        if (bVar instanceof C14142u0) {
            String d = C16519a.m98622o(bVar).getName().mo78583d();
            C13706o.m87928e(d, "descriptor.propertyIfAccessor.name.asString()");
            return C14409z.m90470b(d);
        } else if (bVar instanceof C14144v0) {
            String d2 = C16519a.m98622o(bVar).getName().mo78583d();
            C13706o.m87928e(d2, "descriptor.propertyIfAccessor.name.asString()");
            return C14409z.m90473e(d2);
        } else {
            String d3 = bVar.getName().mo78583d();
            C13706o.m87928e(d3, "descriptor.name.asString()");
            return d3;
        }
    }

    /* renamed from: c */
    public final C16151b mo72049c(Class<?> cls) {
        C13706o.m87929f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C13706o.m87928e(componentType, "klass.componentType");
            C13859i a = m88103a(componentType);
            if (a != null) {
                return new C16151b(C13902k.f62196r, a.mo72157e());
            }
            C16151b m = C16151b.m96975m(C13902k.C13903a.f62255i.mo78579l());
            C13706o.m87928e(m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m;
        } else if (C13706o.m87924a(cls, Void.TYPE)) {
            return f62019b;
        } else {
            C13859i a2 = m88103a(cls);
            if (a2 != null) {
                return new C16151b(C13902k.f62196r, a2.mo72159g());
            }
            C16151b a3 = C14088d.m89397a(cls);
            if (!a3.mo78553k()) {
                C13871c cVar = C13871c.f62112a;
                C16152c b = a3.mo78544b();
                C13706o.m87928e(b, "classId.asSingleFqName()");
                C16151b m2 = cVar.mo72173m(b);
                if (m2 != null) {
                    return m2;
                }
            }
            return a3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.reflect.jvm.internal.d$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.C13783e mo72050f(kotlin.reflect.jvm.internal.impl.descriptors.C14140t0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b r8 = kotlin.reflect.jvm.internal.impl.resolve.C14650d.m91612L(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C14140t0) r8
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r1 = r8.mo72233a()
            java.lang.String r8 = "unwrapFakeOverride(possi…rriddenProperty).original"
            kotlin.jvm.internal.C13706o.m87928e(r1, r8)
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14775j
            r0 = 0
            if (r8 == 0) goto L_0x003e
            r8 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14775j) r8
            kb.n r2 = r8.mo73859f0()
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<kb.n, nb.a$d> r3 = p336nb.C15766a.f65114d
            java.lang.String r4 = "propertySignature"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            java.lang.Object r3 = p327mb.C15722e.m95026a(r2, r3)
            nb.a$d r3 = (p336nb.C15766a.C15774d) r3
            if (r3 == 0) goto L_0x00c8
            kotlin.reflect.jvm.internal.e$c r6 = new kotlin.reflect.jvm.internal.e$c
            mb.c r4 = r8.mo73857I()
            mb.g r5 = r8.mo73856E()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003e:
            boolean r8 = r1 instanceof p271gb.C12335f
            if (r8 == 0) goto L_0x00c8
            r8 = r1
            gb.f r8 = (p271gb.C12335f) r8
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r8 = r8.getSource()
            boolean r2 = r8 instanceof p279hb.C12412a
            if (r2 == 0) goto L_0x0050
            hb.a r8 = (p279hb.C12412a) r8
            goto L_0x0051
        L_0x0050:
            r8 = r0
        L_0x0051:
            if (r8 == 0) goto L_0x0058
            ib.l r8 = r8.mo67446c()
            goto L_0x0059
        L_0x0058:
            r8 = r0
        L_0x0059:
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14114r
            if (r2 == 0) goto L_0x0069
            kotlin.reflect.jvm.internal.e$a r0 = new kotlin.reflect.jvm.internal.e$a
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r r8 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14114r) r8
            java.lang.reflect.Field r8 = r8.mo72635Q()
            r0.<init>(r8)
            goto L_0x00a3
        L_0x0069:
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u
            if (r2 == 0) goto L_0x00a4
            kotlin.reflect.jvm.internal.e$b r2 = new kotlin.reflect.jvm.internal.e$b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r8 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u) r8
            java.lang.reflect.Method r8 = r8.mo72635Q()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = r1.mo72334H()
            if (r1 == 0) goto L_0x0080
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.getSource()
            goto L_0x0081
        L_0x0080:
            r1 = r0
        L_0x0081:
            boolean r3 = r1 instanceof p279hb.C12412a
            if (r3 == 0) goto L_0x0088
            hb.a r1 = (p279hb.C12412a) r1
            goto L_0x0089
        L_0x0088:
            r1 = r0
        L_0x0089:
            if (r1 == 0) goto L_0x0090
            ib.l r1 = r1.mo67446c()
            goto L_0x0091
        L_0x0090:
            r1 = r0
        L_0x0091:
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u
            if (r3 == 0) goto L_0x0098
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r1 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u) r1
            goto L_0x0099
        L_0x0098:
            r1 = r0
        L_0x0099:
            if (r1 == 0) goto L_0x009f
            java.lang.reflect.Method r0 = r1.mo72635Q()
        L_0x009f:
            r2.<init>(r8, r0)
            r0 = r2
        L_0x00a3:
            return r0
        L_0x00a4:
            kotlin.reflect.jvm.internal.a0 r0 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r8)
            r8 = 41
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        L_0x00c8:
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r8 = r1.mo72346f()
            kotlin.jvm.internal.C13706o.m87926c(r8)
            kotlin.reflect.jvm.internal.d$e r8 = r7.m88105d(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = r1.mo72334H()
            if (r1 == 0) goto L_0x00dd
            kotlin.reflect.jvm.internal.d$e r0 = r7.m88105d(r1)
        L_0x00dd:
            kotlin.reflect.jvm.internal.e$d r1 = new kotlin.reflect.jvm.internal.e$d
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13802f0.mo72050f(kotlin.reflect.jvm.internal.impl.descriptors.t0):kotlin.reflect.jvm.internal.e");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [ib.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.C13773d mo72051g(kotlin.reflect.jvm.internal.impl.descriptors.C14154y r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = kotlin.reflect.jvm.internal.impl.resolve.C14650d.m91612L(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r0
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r0.mo72233a()
            java.lang.String r1 = "unwrapFakeOverride(possi…titutedFunction).original"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14728b
            if (r1 == 0) goto L_0x0072
            r1 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14728b) r1
            kotlin.reflect.jvm.internal.impl.protobuf.o r2 = r1.mo73859f0()
            boolean r3 = r2 instanceof p308kb.C13481i
            if (r3 == 0) goto L_0x003c
            ob.i r3 = p349ob.C15841i.f65291a
            r4 = r2
            kb.i r4 = (p308kb.C13481i) r4
            mb.c r5 = r1.mo73857I()
            mb.g r6 = r1.mo73856E()
            ob.d$b r3 = r3.mo75622e(r4, r5, r6)
            if (r3 == 0) goto L_0x003c
            kotlin.reflect.jvm.internal.d$e r8 = new kotlin.reflect.jvm.internal.d$e
            r8.<init>(r3)
            return r8
        L_0x003c:
            boolean r3 = r2 instanceof p308kb.C13460d
            if (r3 == 0) goto L_0x006d
            ob.i r3 = p349ob.C15841i.f65291a
            kb.d r2 = (p308kb.C13460d) r2
            mb.c r4 = r1.mo73857I()
            mb.g r1 = r1.mo73856E()
            ob.d$b r1 = r3.mo75620b(r2, r4, r1)
            if (r1 == 0) goto L_0x006d
            kotlin.reflect.jvm.internal.impl.descriptors.m r8 = r8.mo62163b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            kotlin.jvm.internal.C13706o.m87928e(r8, r0)
            boolean r8 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91643b(r8)
            if (r8 == 0) goto L_0x0067
            kotlin.reflect.jvm.internal.d$e r8 = new kotlin.reflect.jvm.internal.d$e
            r8.<init>(r1)
            goto L_0x006c
        L_0x0067:
            kotlin.reflect.jvm.internal.d$d r8 = new kotlin.reflect.jvm.internal.d$d
            r8.<init>(r1)
        L_0x006c:
            return r8
        L_0x006d:
            kotlin.reflect.jvm.internal.d$e r8 = r7.m88105d(r0)
            return r8
        L_0x0072:
            boolean r8 = r0 instanceof p271gb.C12331e
            r1 = 0
            if (r8 == 0) goto L_0x00ba
            r8 = r0
            gb.e r8 = (p271gb.C12331e) r8
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r8 = r8.getSource()
            boolean r2 = r8 instanceof p279hb.C12412a
            if (r2 == 0) goto L_0x0085
            hb.a r8 = (p279hb.C12412a) r8
            goto L_0x0086
        L_0x0085:
            r8 = r1
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            ib.l r8 = r8.mo67446c()
            goto L_0x008e
        L_0x008d:
            r8 = r1
        L_0x008e:
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u
            if (r2 == 0) goto L_0x0095
            r1 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u r1 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14117u) r1
        L_0x0095:
            if (r1 == 0) goto L_0x00a3
            java.lang.reflect.Method r8 = r1.mo72635Q()
            if (r8 == 0) goto L_0x00a3
            kotlin.reflect.jvm.internal.d$c r0 = new kotlin.reflect.jvm.internal.d$c
            r0.<init>(r8)
            return r0
        L_0x00a3:
            kotlin.reflect.jvm.internal.a0 r8 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x00ba:
            boolean r8 = r0 instanceof p271gb.C12328b
            r2 = 41
            java.lang.String r3 = " ("
            if (r8 == 0) goto L_0x011f
            r8 = r0
            gb.b r8 = (p271gb.C12328b) r8
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r8 = r8.getSource()
            boolean r4 = r8 instanceof p279hb.C12412a
            if (r4 == 0) goto L_0x00d0
            hb.a r8 = (p279hb.C12412a) r8
            goto L_0x00d1
        L_0x00d0:
            r8 = r1
        L_0x00d1:
            if (r8 == 0) goto L_0x00d7
            ib.l r1 = r8.mo67446c()
        L_0x00d7:
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14111o
            if (r8 == 0) goto L_0x00e7
            kotlin.reflect.jvm.internal.d$b r8 = new kotlin.reflect.jvm.internal.d$b
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o r1 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14111o) r1
            java.lang.reflect.Constructor r0 = r1.mo72635Q()
            r8.<init>(r0)
            goto L_0x00fe
        L_0x00e7:
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l
            if (r8 == 0) goto L_0x00ff
            r8 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r8 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l) r8
            boolean r4 = r8.mo68975o()
            if (r4 == 0) goto L_0x00ff
            kotlin.reflect.jvm.internal.d$a r0 = new kotlin.reflect.jvm.internal.d$a
            java.lang.Class r8 = r8.mo72583b()
            r0.<init>(r8)
            r8 = r0
        L_0x00fe:
            return r8
        L_0x00ff:
            kotlin.reflect.jvm.internal.a0 r8 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r8.<init>(r0)
            throw r8
        L_0x011f:
            boolean r8 = r7.m88104b(r0)
            if (r8 == 0) goto L_0x012a
            kotlin.reflect.jvm.internal.d$e r8 = r7.m88105d(r0)
            return r8
        L_0x012a:
            kotlin.reflect.jvm.internal.a0 r8 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13802f0.mo72051g(kotlin.reflect.jvm.internal.impl.descriptors.y):kotlin.reflect.jvm.internal.d");
    }
}
