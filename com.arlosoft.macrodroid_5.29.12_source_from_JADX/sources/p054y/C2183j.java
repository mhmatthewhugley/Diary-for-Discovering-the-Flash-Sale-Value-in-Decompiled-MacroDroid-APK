package p054y;

import com.airbnb.lottie.C1463d;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import p048t.C2096d;
import p050v.C2132n;
import p055z.C2205c;

/* renamed from: y.j */
/* compiled from: FontCharacterParser */
class C2183j {

    /* renamed from: a */
    private static final C2205c.C2206a f6794a = C2205c.C2206a.m9050a("ch", "size", "w", "style", "fFamily", Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);

    /* renamed from: b */
    private static final C2205c.C2206a f6795b = C2205c.C2206a.m9050a("shapes");

    /* renamed from: a */
    static C2096d m8987a(C2205c cVar, C1463d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo24400e();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6794a);
            if (v == 0) {
                c = cVar.mo24409p().charAt(0);
            } else if (v == 1) {
                d = cVar.mo24406j();
            } else if (v == 2) {
                d2 = cVar.mo24406j();
            } else if (v == 3) {
                str = cVar.mo24409p();
            } else if (v == 4) {
                str2 = cVar.mo24409p();
            } else if (v != 5) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                cVar.mo24400e();
                while (cVar.mo24404h()) {
                    if (cVar.mo24412v(f6795b) != 0) {
                        cVar.mo24413w();
                        cVar.mo24414x();
                    } else {
                        cVar.mo24399c();
                        while (cVar.mo24404h()) {
                            arrayList.add((C2132n) C2177g.m8979a(cVar, dVar));
                        }
                        cVar.mo24401f();
                    }
                }
                cVar.mo24402g();
            }
        }
        cVar.mo24402g();
        return new C2096d(arrayList, c, d, d2, str, str2);
    }
}
