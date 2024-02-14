package p327mb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p308kb.C13508q;
import p308kb.C13524t;

/* renamed from: mb.g */
/* compiled from: TypeTable.kt */
public final class C15724g {

    /* renamed from: a */
    private final List<C13508q> f65072a;

    public C15724g(C13524t tVar) {
        C13706o.m87929f(tVar, "typeTable");
        List<C13508q> C = tVar.mo71561C();
        if (tVar.mo71562D()) {
            int z = tVar.mo71565z();
            List<C13508q> C2 = tVar.mo71561C();
            C13706o.m87928e(C2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(C2, 10));
            int i = 0;
            for (T next : C2) {
                int i2 = i + 1;
                if (i < 0) {
                    C13614t.m87758t();
                }
                C13508q qVar = (C13508q) next;
                if (i >= z) {
                    qVar = qVar.mo71014b().mo71491O(true).build();
                }
                arrayList.add(qVar);
                i = i2;
            }
            C = arrayList;
        }
        C13706o.m87928e(C, "run {\n        val origin… else originalTypes\n    }");
        this.f65072a = C;
    }

    /* renamed from: a */
    public final C13508q mo75166a(int i) {
        return this.f65072a.get(i);
    }
}
