package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2109h;
import p050v.C2133o;
import p055z.C2205c;

/* renamed from: y.g0 */
/* compiled from: ShapePathParser */
class C2178g0 {

    /* renamed from: a */
    static C2205c.C2206a f6787a = C2205c.C2206a.m9050a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C2133o m8980a(C2205c cVar, C1463d dVar) throws IOException {
        int i = 0;
        String str = null;
        C2109h hVar = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6787a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                i = cVar.mo24407m();
            } else if (v == 2) {
                hVar = C2171d.m8971k(cVar, dVar);
            } else if (v != 3) {
                cVar.mo24414x();
            } else {
                z = cVar.mo24405i();
            }
        }
        return new C2133o(str, i, hVar, z);
    }
}
