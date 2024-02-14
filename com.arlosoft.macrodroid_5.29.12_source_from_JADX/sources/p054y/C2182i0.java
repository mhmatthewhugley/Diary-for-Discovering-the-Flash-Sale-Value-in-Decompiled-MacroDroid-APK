package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2103b;
import p050v.C2138q;
import p055z.C2205c;

/* renamed from: y.i0 */
/* compiled from: ShapeTrimPathParser */
class C2182i0 {

    /* renamed from: a */
    private static C2205c.C2206a f6793a = C2205c.C2206a.m9050a("s", "e", "o", "nm", "m", "hd");

    /* renamed from: a */
    static C2138q m8986a(C2205c cVar, C1463d dVar) throws IOException {
        String str = null;
        C2138q.C2139a aVar = null;
        C2103b bVar = null;
        C2103b bVar2 = null;
        C2103b bVar3 = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6793a);
            if (v == 0) {
                bVar = C2171d.m8966f(cVar, dVar, false);
            } else if (v == 1) {
                bVar2 = C2171d.m8966f(cVar, dVar, false);
            } else if (v == 2) {
                bVar3 = C2171d.m8966f(cVar, dVar, false);
            } else if (v == 3) {
                str = cVar.mo24409p();
            } else if (v == 4) {
                aVar = C2138q.C2139a.m8824b(cVar.mo24407m());
            } else if (v != 5) {
                cVar.mo24414x();
            } else {
                z = cVar.mo24405i();
            }
        }
        return new C2138q(str, aVar, bVar, bVar2, bVar3, z);
    }
}
