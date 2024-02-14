package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.ArrayList;
import p050v.C2117b;
import p050v.C2132n;
import p055z.C2205c;

/* renamed from: y.f0 */
/* compiled from: ShapeGroupParser */
class C2176f0 {

    /* renamed from: a */
    private static C2205c.C2206a f6785a = C2205c.C2206a.m9050a("nm", "hd", "it");

    /* renamed from: a */
    static C2132n m8978a(C2205c cVar, C1463d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6785a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                z = cVar.mo24405i();
            } else if (v != 2) {
                cVar.mo24414x();
            } else {
                cVar.mo24399c();
                while (cVar.mo24404h()) {
                    C2117b a = C2177g.m8979a(cVar, dVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                cVar.mo24401f();
            }
        }
        return new C2132n(str, arrayList, z);
    }
}
