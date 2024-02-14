package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13917d;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14613c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14614d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14615e;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14621i;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14623k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14626l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14627m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14641r;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14644u;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14645v;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14646w;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14647x;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14648y;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14649z;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p297ja.C13328m;
import p308kb.C13444b;
import p327mb.C15714b;
import p327mb.C15719c;
import p362pb.C16151b;
import p362pb.C16157f;
import p424wa.C16788e;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.e */
/* compiled from: AnnotationDeserializer.kt */
public final class C14781e {

    /* renamed from: a */
    private final C13958g0 f63875a;

    /* renamed from: b */
    private final C14043j0 f63876b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.e$a */
    /* compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class C14782a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63877a;

        static {
            int[] iArr = new int[C13444b.C13446b.C13449c.C13452c.values().length];
            iArr[C13444b.C13446b.C13449c.C13452c.BYTE.ordinal()] = 1;
            iArr[C13444b.C13446b.C13449c.C13452c.CHAR.ordinal()] = 2;
            iArr[C13444b.C13446b.C13449c.C13452c.SHORT.ordinal()] = 3;
            iArr[C13444b.C13446b.C13449c.C13452c.INT.ordinal()] = 4;
            iArr[C13444b.C13446b.C13449c.C13452c.LONG.ordinal()] = 5;
            iArr[C13444b.C13446b.C13449c.C13452c.FLOAT.ordinal()] = 6;
            iArr[C13444b.C13446b.C13449c.C13452c.DOUBLE.ordinal()] = 7;
            iArr[C13444b.C13446b.C13449c.C13452c.BOOLEAN.ordinal()] = 8;
            iArr[C13444b.C13446b.C13449c.C13452c.STRING.ordinal()] = 9;
            iArr[C13444b.C13446b.C13449c.C13452c.CLASS.ordinal()] = 10;
            iArr[C13444b.C13446b.C13449c.C13452c.ENUM.ordinal()] = 11;
            iArr[C13444b.C13446b.C13449c.C13452c.ANNOTATION.ordinal()] = 12;
            iArr[C13444b.C13446b.C13449c.C13452c.ARRAY.ordinal()] = 13;
            f63877a = iArr;
        }
    }

    public C14781e(C13958g0 g0Var, C14043j0 j0Var) {
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(j0Var, "notFoundClasses");
        this.f63875a = g0Var;
        this.f63876b = j0Var;
    }

    /* renamed from: b */
    private final boolean m92227b(C14617g<?> gVar, C14900e0 e0Var, C13444b.C13446b.C13449c cVar) {
        C13444b.C13446b.C13449c.C13452c W = cVar.mo71055W();
        int i = W == null ? -1 : C14782a.f63877a[W.ordinal()];
        if (i == 10) {
            C13961h c = e0Var.mo73702N0().mo62183c();
            C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
            if (eVar == null || C13853h.m88265k0(eVar)) {
                return true;
            }
            return false;
        } else if (i != 13) {
            return C13706o.m87924a(gVar.mo73715a(this.f63875a), e0Var);
        } else {
            if ((gVar instanceof C14612b) && ((List) ((C14612b) gVar).mo73727b()).size() == cVar.mo71047M().size()) {
                C14900e0 k = m92228c().mo72138k(e0Var);
                C13706o.m87928e(k, "builtIns.getArrayElementType(expectedType)");
                C14612b bVar = (C14612b) gVar;
                C16788e k2 = C13614t.m87749k((Collection) bVar.mo73727b());
                if (!(k2 instanceof Collection) || !((Collection) k2).isEmpty()) {
                    Iterator it = k2.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((C13603n0) it).nextInt();
                        C13444b.C13446b.C13449c J = cVar.mo71045J(nextInt);
                        C13706o.m87928e(J, "value.getArrayElement(i)");
                        if (!m92227b((C14617g) ((List) bVar.mo73727b()).get(nextInt), k, J)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
        }
        return true;
    }

    /* renamed from: c */
    private final C13853h m92228c() {
        return this.f63875a.mo72296m();
    }

    /* renamed from: d */
    private final C13328m<C16157f, C14617g<?>> m92229d(C13444b.C13446b bVar, Map<C16157f, ? extends C13966i1> map, C15719c cVar) {
        C13966i1 i1Var = (C13966i1) map.get(C14823x.m92359b(cVar, bVar.mo71027y()));
        if (i1Var == null) {
            return null;
        }
        C16157f b = C14823x.m92359b(cVar, bVar.mo71027y());
        C14900e0 type = i1Var.getType();
        C13706o.m87928e(type, "parameter.type");
        C13444b.C13446b.C13449c z = bVar.mo71028z();
        C13706o.m87928e(z, "proto.value");
        return new C13328m<>(b, m92231g(type, z, cVar));
    }

    /* renamed from: e */
    private final C13948e m92230e(C16151b bVar) {
        return C14147x.m89566c(this.f63875a, bVar, this.f63876b);
    }

    /* renamed from: g */
    private final C14617g<?> m92231g(C14900e0 e0Var, C13444b.C13446b.C13449c cVar, C15719c cVar2) {
        C14617g<?> f = mo73942f(e0Var, cVar, cVar2);
        if (!m92227b(f, e0Var, cVar)) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        C14623k.C14624a aVar = C14623k.f63621b;
        return aVar.mo73737a("Unexpected argument value: actual type " + cVar.mo71055W() + " != expected type " + e0Var);
    }

    /* renamed from: a */
    public final C13915c mo73941a(C13444b bVar, C15719c cVar) {
        C13706o.m87929f(bVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13948e e = m92230e(C14823x.m92358a(cVar, bVar.mo71009C()));
        Map i = C13615t0.m87759i();
        if (bVar.mo71020z() != 0 && !C17088k.m100541m(e) && C14650d.m91633t(e)) {
            Collection<C13944d> k = e.mo62173k();
            C13706o.m87928e(k, "annotationClass.constructors");
            C13944d dVar = (C13944d) C13566b0.m87447v0(k);
            if (dVar != null) {
                List<C13966i1> g = dVar.mo72235g();
                C13706o.m87928e(g, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(g, 10)), 16));
                for (T next : g) {
                    linkedHashMap.put(((C13966i1) next).getName(), next);
                }
                List<C13444b.C13446b> A = bVar.mo71008A();
                C13706o.m87928e(A, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C13444b.C13446b bVar2 : A) {
                    C13706o.m87928e(bVar2, "it");
                    C13328m<C16157f, C14617g<?>> d = m92229d(bVar2, linkedHashMap, cVar);
                    if (d != null) {
                        arrayList.add(d);
                    }
                }
                i = C13615t0.m87768r(arrayList);
            }
        }
        return new C13917d(e.mo72274p(), i, C14158z0.f62778a);
    }

    /* renamed from: f */
    public final C14617g<?> mo73942f(C14900e0 e0Var, C13444b.C13446b.C13449c cVar, C15719c cVar2) {
        C14617g<?> gVar;
        C13706o.m87929f(e0Var, "expectedType");
        C13706o.m87929f(cVar, "value");
        C13706o.m87929f(cVar2, "nameResolver");
        Boolean g = C15714b.f65039O.mo75157d(cVar.mo71051R());
        C13706o.m87928e(g, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = g.booleanValue();
        C13444b.C13446b.C13449c.C13452c W = cVar.mo71055W();
        switch (W == null ? -1 : C14782a.f63877a[W.ordinal()]) {
            case 1:
                byte U = (byte) ((int) cVar.mo71053U());
                return booleanValue ? new C14646w(U) : new C14614d(U);
            case 2:
                gVar = new C14615e((char) ((int) cVar.mo71053U()));
                break;
            case 3:
                short U2 = (short) ((int) cVar.mo71053U());
                return booleanValue ? new C14649z(U2) : new C14644u(U2);
            case 4:
                int U3 = (int) cVar.mo71053U();
                if (!booleanValue) {
                    gVar = new C14627m(U3);
                    break;
                } else {
                    gVar = new C14647x(U3);
                    break;
                }
            case 5:
                long U4 = cVar.mo71053U();
                return booleanValue ? new C14648y(U4) : new C14641r(U4);
            case 6:
                gVar = new C14626l(cVar.mo71052T());
                break;
            case 7:
                gVar = new C14621i(cVar.mo71049P());
                break;
            case 8:
                gVar = new C14613c(cVar.mo71053U() != 0);
                break;
            case 9:
                gVar = new C14645v(cVar2.getString(cVar.mo71054V()));
                break;
            case 10:
                gVar = new C14636q(C14823x.m92358a(cVar2, cVar.mo71048N()), cVar.mo71044I());
                break;
            case 11:
                gVar = new C14622j(C14823x.m92358a(cVar2, cVar.mo71048N()), C14823x.m92359b(cVar2, cVar.mo71050Q()));
                break;
            case 12:
                C13444b H = cVar.mo71043H();
                C13706o.m87928e(H, "value.annotation");
                gVar = new C14610a(mo73941a(H, cVar2));
                break;
            case 13:
                List<C13444b.C13446b.C13449c> M = cVar.mo71047M();
                C13706o.m87928e(M, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C13616u.m87774u(M, 10));
                for (C13444b.C13446b.C13449c cVar3 : M) {
                    C14951m0 i = m92228c().mo72136i();
                    C13706o.m87928e(i, "builtIns.anyType");
                    C13706o.m87928e(cVar3, "it");
                    arrayList.add(mo73942f(i, cVar3, cVar2));
                }
                return new C14799n(arrayList, e0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.mo71055W() + " (expected " + e0Var + ')').toString());
        }
        return gVar;
    }
}
