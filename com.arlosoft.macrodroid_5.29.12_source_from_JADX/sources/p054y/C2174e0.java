package p054y;

import android.graphics.Path;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.Collections;
import p012b0.C1397a;
import p049u.C2102a;
import p049u.C2105d;
import p050v.C2131m;
import p055z.C2205c;

/* renamed from: y.e0 */
/* compiled from: ShapeFillParser */
class C2174e0 {

    /* renamed from: a */
    private static final C2205c.C2206a f6783a = C2205c.C2206a.m9050a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C2131m m8975a(C2205c cVar, C1463d dVar) throws IOException {
        C2105d dVar2 = null;
        String str = null;
        C2102a aVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6783a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                aVar = C2171d.m8963c(cVar, dVar);
            } else if (v == 2) {
                dVar2 = C2171d.m8968h(cVar, dVar);
            } else if (v == 3) {
                z = cVar.mo24405i();
            } else if (v == 4) {
                i = cVar.mo24407m();
            } else if (v != 5) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                z2 = cVar.mo24405i();
            }
        }
        return new C2131m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar2 == null ? new C2105d(Collections.singletonList(new C1397a(100))) : dVar2, z2);
    }
}
