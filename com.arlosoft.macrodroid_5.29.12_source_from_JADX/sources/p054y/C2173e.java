package p054y;

import android.graphics.PointF;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2107f;
import p049u.C2114m;
import p050v.C2116a;
import p055z.C2205c;

/* renamed from: y.e */
/* compiled from: CircleShapeParser */
class C2173e {

    /* renamed from: a */
    private static C2205c.C2206a f6782a = C2205c.C2206a.m9050a("nm", "p", "s", "hd", "d");

    /* renamed from: a */
    static C2116a m8974a(C2205c cVar, C1463d dVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        C2114m<PointF, PointF> mVar = null;
        C2107f fVar = null;
        boolean z2 = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6782a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                mVar = C2165a.m8947b(cVar, dVar);
            } else if (v == 2) {
                fVar = C2171d.m8969i(cVar, dVar);
            } else if (v == 3) {
                z2 = cVar.mo24405i();
            } else if (v != 4) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                z = cVar.mo24407m() == 3;
            }
        }
        return new C2116a(str, mVar, fVar, z, z2);
    }
}
