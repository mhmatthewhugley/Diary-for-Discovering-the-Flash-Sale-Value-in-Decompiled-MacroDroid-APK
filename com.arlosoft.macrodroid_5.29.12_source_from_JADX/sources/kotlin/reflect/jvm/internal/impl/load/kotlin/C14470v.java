package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.java.C14197f;
import kotlin.reflect.jvm.internal.impl.load.java.C14203g0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14446l;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16151b;
import p362pb.C16153d;
import p370qa.C16270q;
import p389sb.C16519a;
import p398tb.C16609d;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.v */
/* compiled from: methodSignatureMapping.kt */
public final class C14470v {
    /* renamed from: a */
    private static final void m90687a(StringBuilder sb, C14900e0 e0Var) {
        sb.append(m90693g(e0Var));
    }

    /* renamed from: b */
    public static final String m90688b(C14154y yVar, boolean z, boolean z2) {
        String str;
        C13706o.m87929f(yVar, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (yVar instanceof C14052l) {
                str = "<init>";
            } else {
                str = yVar.getName().mo78583d();
                C13706o.m87928e(str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        C14146w0 P = yVar.mo72232P();
        if (P != null) {
            C14900e0 type = P.getType();
            C13706o.m87928e(type, "it.type");
            m90687a(sb, type);
        }
        for (C13966i1 type2 : yVar.mo72235g()) {
            C14900e0 type3 = type2.getType();
            C13706o.m87928e(type3, "parameter.type");
            m90687a(sb, type3);
        }
        sb.append(")");
        if (z) {
            if (C14433d.m90577c(yVar)) {
                sb.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                C14900e0 returnType = yVar.getReturnType();
                C13706o.m87926c(returnType);
                m90687a(sb, returnType);
            }
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public static /* synthetic */ String m90689c(C14154y yVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m90688b(yVar, z, z2);
    }

    /* renamed from: d */
    public static final String m90690d(C13908a aVar) {
        C13706o.m87929f(aVar, "<this>");
        C14473x xVar = C14473x.f63314a;
        if (C14650d.m91605E(aVar)) {
            return null;
        }
        C14064m b = aVar.mo62163b();
        C13948e eVar = b instanceof C13948e ? (C13948e) b : null;
        if (eVar == null || eVar.getName().mo78588j()) {
            return null;
        }
        C13908a a = aVar.mo72233a();
        C14156y0 y0Var = a instanceof C14156y0 ? (C14156y0) a : null;
        if (y0Var == null) {
            return null;
        }
        return C14469u.m90686a(xVar, eVar, m90689c(y0Var, false, false, 3, (Object) null));
    }

    /* renamed from: e */
    public static final boolean m90691e(C13908a aVar) {
        C14154y k;
        C13706o.m87929f(aVar, "f");
        if (!(aVar instanceof C14154y)) {
            return false;
        }
        C14154y yVar = (C14154y) aVar;
        if (!C13706o.m87924a(yVar.getName().mo78583d(), "remove") || yVar.mo72235g().size() != 1 || C14203g0.m89759h((C13936b) aVar)) {
            return false;
        }
        List<C13966i1> g = yVar.mo72233a().mo72235g();
        C13706o.m87928e(g, "f.original.valueParameters");
        C14900e0 type = ((C13966i1) C13566b0.m87446u0(g)).getType();
        C13706o.m87928e(type, "f.original.valueParameters.single().type");
        C14446l g2 = m90693g(type);
        C16610e eVar = null;
        C14446l.C14450d dVar = g2 instanceof C14446l.C14450d ? (C14446l.C14450d) g2 : null;
        if (dVar != null) {
            eVar = dVar.mo73188i();
        }
        if (eVar != C16610e.INT || (k = C14197f.m89740k(yVar)) == null) {
            return false;
        }
        List<C13966i1> g3 = k.mo72233a().mo72235g();
        C13706o.m87928e(g3, "overridden.original.valueParameters");
        C14900e0 type2 = ((C13966i1) C13566b0.m87446u0(g3)).getType();
        C13706o.m87928e(type2, "overridden.original.valueParameters.single().type");
        C14446l g4 = m90693g(type2);
        C14064m b = k.mo62163b();
        C13706o.m87928e(b, "overridden.containingDeclaration");
        if (!C13706o.m87924a(C16519a.m98616i(b), C13902k.C13903a.f62244c0.mo78566j()) || !(g4 instanceof C14446l.C14449c) || !C13706o.m87924a(((C14446l.C14449c) g4).mo73187i(), "java/lang/Object")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final String m90692f(C13948e eVar) {
        C13706o.m87929f(eVar, "<this>");
        C13871c cVar = C13871c.f62112a;
        C16153d j = C16519a.m98615h(eVar).mo78566j();
        C13706o.m87928e(j, "fqNameSafe.toUnsafe()");
        C16151b n = cVar.mo72174n(j);
        if (n == null) {
            return C14433d.m90576b(eVar, (C14475y) null, 2, (Object) null);
        }
        String f = C16609d.m98927b(n).mo79458f();
        C13706o.m87928e(f, "byClassId(it).internalName");
        return f;
    }

    /* renamed from: g */
    public static final C14446l m90693g(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return (C14446l) C14433d.m90579e(e0Var, C14452n.f63301a, C14418a0.f63219o, C14477z.f63316a, (C14444j) null, (C16270q) null, 32, (Object) null);
    }
}
