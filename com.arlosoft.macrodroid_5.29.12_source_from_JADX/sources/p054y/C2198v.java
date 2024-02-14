package p054y;

import java.io.IOException;
import p050v.C2124h;
import p055z.C2205c;

/* renamed from: y.v */
/* compiled from: MergePathsParser */
class C2198v {

    /* renamed from: a */
    private static final C2205c.C2206a f6819a = C2205c.C2206a.m9050a("nm", "mm", "hd");

    /* renamed from: a */
    static C2124h m9024a(C2205c cVar) throws IOException {
        String str = null;
        C2124h.C2125a aVar = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6819a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                aVar = C2124h.C2125a.m8760b(cVar.mo24407m());
            } else if (v != 2) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                z = cVar.mo24405i();
            }
        }
        return new C2124h(str, aVar, z);
    }
}
