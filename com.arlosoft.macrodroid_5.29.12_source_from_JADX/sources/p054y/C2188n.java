package p054y;

import com.airbnb.lottie.C1463d;
import com.android.p023dx.rop.code.RegisterSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p012b0.C1397a;
import p049u.C2103b;
import p049u.C2104c;
import p049u.C2105d;
import p049u.C2107f;
import p050v.C2120e;
import p050v.C2121f;
import p050v.C2134p;
import p055z.C2205c;

/* renamed from: y.n */
/* compiled from: GradientStrokeParser */
class C2188n {

    /* renamed from: a */
    private static C2205c.C2206a f6800a = C2205c.C2206a.m9050a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C2205c.C2206a f6801b = C2205c.C2206a.m9050a("p", "k");

    /* renamed from: c */
    private static final C2205c.C2206a f6802c = C2205c.C2206a.m9050a("n", RegisterSpec.PREFIX);

    /* renamed from: a */
    static C2120e m8995a(C2205c cVar, C1463d dVar) throws IOException {
        C2104c cVar2;
        C2205c cVar3 = cVar;
        C1463d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C2121f fVar = null;
        C2104c cVar4 = null;
        C2107f fVar2 = null;
        C2107f fVar3 = null;
        C2103b bVar = null;
        C2134p.C2136b bVar2 = null;
        C2134p.C2137c cVar5 = null;
        float f = 0.0f;
        C2103b bVar3 = null;
        boolean z = false;
        C2105d dVar3 = null;
        while (cVar.mo24404h()) {
            switch (cVar3.mo24412v(f6800a)) {
                case 0:
                    str = cVar.mo24409p();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo24400e();
                    while (cVar.mo24404h()) {
                        int v = cVar3.mo24412v(f6801b);
                        if (v != 0) {
                            cVar2 = cVar4;
                            if (v != 1) {
                                cVar.mo24413w();
                                cVar.mo24414x();
                            } else {
                                cVar4 = C2171d.m8967g(cVar3, dVar2, i);
                            }
                        } else {
                            cVar2 = cVar4;
                            i = cVar.mo24407m();
                        }
                        cVar4 = cVar2;
                    }
                    C2104c cVar6 = cVar4;
                    cVar.mo24402g();
                    break;
                case 2:
                    dVar3 = C2171d.m8968h(cVar, dVar);
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
                    bVar = C2171d.m8965e(cVar, dVar);
                    break;
                case 7:
                    bVar2 = C2134p.C2136b.values()[cVar.mo24407m() - 1];
                    break;
                case 8:
                    cVar5 = C2134p.C2137c.values()[cVar.mo24407m() - 1];
                    break;
                case 9:
                    f = (float) cVar.mo24406j();
                    break;
                case 10:
                    z = cVar.mo24405i();
                    break;
                case 11:
                    cVar.mo24399c();
                    while (cVar.mo24404h()) {
                        cVar.mo24400e();
                        String str2 = null;
                        C2103b bVar4 = null;
                        while (cVar.mo24404h()) {
                            int v2 = cVar3.mo24412v(f6802c);
                            if (v2 != 0) {
                                C2103b bVar5 = bVar3;
                                if (v2 != 1) {
                                    cVar.mo24413w();
                                    cVar.mo24414x();
                                } else {
                                    bVar4 = C2171d.m8965e(cVar, dVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                C2103b bVar6 = bVar3;
                                str2 = cVar.mo24409p();
                            }
                        }
                        C2103b bVar7 = bVar3;
                        cVar.mo24402g();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar2.mo17071t(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    C2103b bVar8 = bVar3;
                    cVar.mo24401f();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    break;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
        }
        if (dVar3 == null) {
            dVar3 = new C2105d(Collections.singletonList(new C1397a(100)));
        }
        return new C2120e(str, fVar, cVar4, dVar3, fVar2, fVar3, bVar, bVar2, cVar5, f, arrayList, bVar3, z);
    }
}
