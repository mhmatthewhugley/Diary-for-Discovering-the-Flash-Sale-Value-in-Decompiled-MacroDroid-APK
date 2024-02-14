package p054y;

import android.graphics.PointF;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p049u.C2103b;
import p049u.C2107f;
import p049u.C2114m;
import p050v.C2128j;
import p055z.C2205c;

/* renamed from: y.a0 */
/* compiled from: RectangleShapeParser */
class C2166a0 {

    /* renamed from: a */
    private static C2205c.C2206a f6773a = C2205c.C2206a.m9050a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C2128j m8948a(C2205c cVar, C1463d dVar) throws IOException {
        String str = null;
        C2114m<PointF, PointF> mVar = null;
        C2107f fVar = null;
        C2103b bVar = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6773a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                mVar = C2165a.m8947b(cVar, dVar);
            } else if (v == 2) {
                fVar = C2171d.m8969i(cVar, dVar);
            } else if (v == 3) {
                bVar = C2171d.m8965e(cVar, dVar);
            } else if (v != 4) {
                cVar.mo24414x();
            } else {
                z = cVar.mo24405i();
            }
        }
        return new C2128j(str, mVar, fVar, bVar, z);
    }
}
