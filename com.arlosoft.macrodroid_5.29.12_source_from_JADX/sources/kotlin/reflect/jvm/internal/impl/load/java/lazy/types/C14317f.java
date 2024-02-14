package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14944l0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p225cc.C11170a;
import p297ja.C13328m;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f */
/* compiled from: RawType.kt */
public final class C14317f extends C14990y implements C14944l0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f$a */
    /* compiled from: RawType.kt */
    static final class C14318a extends C13708q implements C16265l<String, CharSequence> {

        /* renamed from: a */
        public static final C14318a f63092a = new C14318a();

        C14318a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(String str) {
            C13706o.m87929f(str, "it");
            return "(raw) " + str;
        }
    }

    private C14317f(C14951m0 m0Var, C14951m0 m0Var2, boolean z) {
        super(m0Var, m0Var2);
        if (!z) {
            C14844e.f63967a.mo74060d(m0Var, m0Var2);
        }
    }

    /* renamed from: a1 */
    private static final boolean m90213a1(String str, String str2) {
        return C13706o.m87924a(str, C15177w.m93698q0(str2, "out ")) || C13706o.m87924a(str2, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    /* renamed from: b1 */
    private static final List<String> m90214b1(C14552c cVar, C14900e0 e0Var) {
        List<C14926g1> L0 = e0Var.mo73700L0();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(L0, 10));
        for (C14926g1 x : L0) {
            arrayList.add(cVar.mo73533x(x));
        }
        return arrayList;
    }

    /* renamed from: c1 */
    private static final String m90215c1(String str, String str2) {
        if (!C15177w.m93661M(str, '<', false, 2, (Object) null)) {
            return str;
        }
        return C15177w.m93664N0(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + C15177w.m93658K0(str, '>', (String) null, 2, (Object) null);
    }

    /* renamed from: U0 */
    public C14951m0 mo72950U0() {
        return mo74251V0();
    }

    /* renamed from: X0 */
    public String mo72951X0(C14552c cVar, C14580f fVar) {
        C13706o.m87929f(cVar, "renderer");
        C13706o.m87929f(fVar, "options");
        String w = cVar.mo73532w(mo74251V0());
        String w2 = cVar.mo73532w(mo74252W0());
        if (fVar.mo73590i()) {
            return "raw (" + w + ".." + w2 + ')';
        } else if (mo74252W0().mo73700L0().isEmpty()) {
            return cVar.mo73529t(w, w2, C11170a.m74959h(this));
        } else {
            List<String> b1 = m90214b1(cVar, mo74251V0());
            List<String> b12 = m90214b1(cVar, mo74252W0());
            String g0 = C13566b0.m87432g0(b1, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14318a.f63092a, 30, (Object) null);
            List N0 = C13566b0.m87413N0(b1, b12);
            boolean z = true;
            if (!(N0 instanceof Collection) || !N0.isEmpty()) {
                Iterator it = N0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C13328m mVar = (C13328m) it.next();
                    if (!m90213a1((String) mVar.mo70154c(), (String) mVar.mo70155d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                w2 = m90215c1(w2, g0);
            }
            String c1 = m90215c1(w, g0);
            if (C13706o.m87924a(c1, w2)) {
                return c1;
            }
            return cVar.mo73529t(c1, w2, C11170a.m74959h(this));
        }
    }

    /* renamed from: Y0 */
    public C14317f mo72947R0(boolean z) {
        return new C14317f(mo74251V0().mo73022U0(z), mo74252W0().mo73022U0(z));
    }

    /* renamed from: Z0 */
    public C14990y mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14900e0 h = gVar.mo74070h(mo74251V0());
        C13706o.m87927d(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C14900e0 h2 = gVar.mo74070h(mo74252W0());
        C13706o.m87927d(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C14317f((C14951m0) h, (C14951m0) h2, true);
    }

    /* renamed from: d1 */
    public C14317f mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14317f(mo74251V0().mo73023V0(a1Var), mo74252W0().mo73023V0(a1Var));
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        C13961h c = mo73702N0().mo62183c();
        C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
        if (eVar != null) {
            C14692h q0 = eVar.mo72287q0(new C14313e((C14319g) null, 1, (C13695i) null));
            C13706o.m87928e(q0, "classDescriptor.getMemberScope(RawSubstitution())");
            return q0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo73702N0().mo62183c()).toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14317f(C14951m0 m0Var, C14951m0 m0Var2) {
        this(m0Var, m0Var2, false);
        C13706o.m87929f(m0Var, "lowerBound");
        C13706o.m87929f(m0Var2, "upperBound");
    }
}
