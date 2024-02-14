package p054y;

import android.graphics.PointF;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2103b;
import p049u.C2114m;
import p050v.C2126i;
import p055z.C2205c;

/* renamed from: y.z */
/* compiled from: PolystarShapeParser */
class C2202z {

    /* renamed from: a */
    private static final C2205c.C2206a f6822a = C2205c.C2206a.m9050a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    static C2126i m9030a(C2205c cVar, C1463d dVar) throws IOException {
        String str = null;
        C2126i.C2127a aVar = null;
        C2103b bVar = null;
        C2114m<PointF, PointF> mVar = null;
        C2103b bVar2 = null;
        C2103b bVar3 = null;
        C2103b bVar4 = null;
        C2103b bVar5 = null;
        C2103b bVar6 = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            switch (cVar.mo24412v(f6822a)) {
                case 0:
                    str = cVar.mo24409p();
                    break;
                case 1:
                    aVar = C2126i.C2127a.m8772b(cVar.mo24407m());
                    break;
                case 2:
                    bVar = C2171d.m8966f(cVar, dVar, false);
                    break;
                case 3:
                    mVar = C2165a.m8947b(cVar, dVar);
                    break;
                case 4:
                    bVar2 = C2171d.m8966f(cVar, dVar, false);
                    break;
                case 5:
                    bVar4 = C2171d.m8965e(cVar, dVar);
                    break;
                case 6:
                    bVar6 = C2171d.m8966f(cVar, dVar, false);
                    break;
                case 7:
                    bVar3 = C2171d.m8965e(cVar, dVar);
                    break;
                case 8:
                    bVar5 = C2171d.m8966f(cVar, dVar, false);
                    break;
                case 9:
                    z = cVar.mo24405i();
                    break;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
        }
        return new C2126i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
