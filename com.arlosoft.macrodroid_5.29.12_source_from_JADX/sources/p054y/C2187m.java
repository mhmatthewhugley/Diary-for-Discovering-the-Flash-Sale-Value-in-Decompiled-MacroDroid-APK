package p054y;

import android.graphics.Path;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.Collections;
import p012b0.C1397a;
import p049u.C2103b;
import p049u.C2104c;
import p049u.C2105d;
import p049u.C2107f;
import p050v.C2119d;
import p050v.C2121f;
import p055z.C2205c;

/* renamed from: y.m */
/* compiled from: GradientFillParser */
class C2187m {

    /* renamed from: a */
    private static final C2205c.C2206a f6798a = C2205c.C2206a.m9050a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final C2205c.C2206a f6799b = C2205c.C2206a.m9050a("p", "k");

    /* renamed from: a */
    static C2119d m8994a(C2205c cVar, C1463d dVar) throws IOException {
        C2105d dVar2 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C2121f fVar = null;
        C2104c cVar2 = null;
        C2107f fVar2 = null;
        C2107f fVar3 = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            switch (cVar.mo24412v(f6798a)) {
                case 0:
                    str = cVar.mo24409p();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo24400e();
                    while (cVar.mo24404h()) {
                        int v = cVar.mo24412v(f6799b);
                        if (v == 0) {
                            i = cVar.mo24407m();
                        } else if (v != 1) {
                            cVar.mo24413w();
                            cVar.mo24414x();
                        } else {
                            cVar2 = C2171d.m8967g(cVar, dVar, i);
                        }
                    }
                    cVar.mo24402g();
                    break;
                case 2:
                    dVar2 = C2171d.m8968h(cVar, dVar);
                    break;
                case 3:
                    fVar = cVar.mo24407m() == 1 ? C2121f.LINEAR : C2121f.RADIAL;
                    break;
                case 4:
                    fVar2 = C2171d.m8969i(cVar, dVar);
                    break;
                case 5:
                    fVar3 = C2171d.m8969i(cVar, dVar);
                    break;
                case 6:
                    fillType = cVar.mo24407m() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.mo24405i();
                    break;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
        }
        return new C2119d(str, fVar, fillType, cVar2, dVar2 == null ? new C2105d(Collections.singletonList(new C1397a(100))) : dVar2, fVar2, fVar3, (C2103b) null, (C2103b) null, z);
    }
}
