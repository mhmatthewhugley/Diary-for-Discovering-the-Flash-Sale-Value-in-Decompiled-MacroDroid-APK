package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2103b;
import p049u.C2113l;
import p050v.C2129k;
import p055z.C2205c;

/* renamed from: y.b0 */
/* compiled from: RepeaterParser */
class C2168b0 {

    /* renamed from: a */
    private static C2205c.C2206a f6776a = C2205c.C2206a.m9050a("nm", "c", "o", "tr", "hd");

    /* renamed from: a */
    static C2129k m8951a(C2205c cVar, C1463d dVar) throws IOException {
        String str = null;
        C2103b bVar = null;
        C2103b bVar2 = null;
        C2113l lVar = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6776a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                bVar = C2171d.m8966f(cVar, dVar, false);
            } else if (v == 2) {
                bVar2 = C2171d.m8966f(cVar, dVar, false);
            } else if (v == 3) {
                lVar = C2169c.m8958g(cVar, dVar);
            } else if (v != 4) {
                cVar.mo24414x();
            } else {
                z = cVar.mo24405i();
            }
        }
        return new C2129k(str, bVar, bVar2, lVar, z);
    }
}
