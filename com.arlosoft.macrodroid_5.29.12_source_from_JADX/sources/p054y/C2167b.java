package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2102a;
import p049u.C2103b;
import p049u.C2112k;
import p055z.C2205c;

/* renamed from: y.b */
/* compiled from: AnimatableTextPropertiesParser */
public class C2167b {

    /* renamed from: a */
    private static C2205c.C2206a f6774a = C2205c.C2206a.m9050a("a");

    /* renamed from: b */
    private static C2205c.C2206a f6775b = C2205c.C2206a.m9050a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C2112k m8949a(C2205c cVar, C1463d dVar) throws IOException {
        cVar.mo24400e();
        C2112k kVar = null;
        while (cVar.mo24404h()) {
            if (cVar.mo24412v(f6774a) != 0) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                kVar = m8950b(cVar, dVar);
            }
        }
        cVar.mo24402g();
        return kVar == null ? new C2112k((C2102a) null, (C2102a) null, (C2103b) null, (C2103b) null) : kVar;
    }

    /* renamed from: b */
    private static C2112k m8950b(C2205c cVar, C1463d dVar) throws IOException {
        cVar.mo24400e();
        C2102a aVar = null;
        C2102a aVar2 = null;
        C2103b bVar = null;
        C2103b bVar2 = null;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6775b);
            if (v == 0) {
                aVar = C2171d.m8963c(cVar, dVar);
            } else if (v == 1) {
                aVar2 = C2171d.m8963c(cVar, dVar);
            } else if (v == 2) {
                bVar = C2171d.m8965e(cVar, dVar);
            } else if (v != 3) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                bVar2 = C2171d.m8965e(cVar, dVar);
            }
        }
        cVar.mo24402g();
        return new C2112k(aVar, aVar2, bVar, bVar2);
    }
}
