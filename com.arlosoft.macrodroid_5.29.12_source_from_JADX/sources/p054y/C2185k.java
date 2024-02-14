package p054y;

import java.io.IOException;
import p048t.C2095c;
import p055z.C2205c;

/* renamed from: y.k */
/* compiled from: FontParser */
class C2185k {

    /* renamed from: a */
    private static final C2205c.C2206a f6796a = C2205c.C2206a.m9050a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C2095c m8989a(C2205c cVar) throws IOException {
        cVar.mo24400e();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6796a);
            if (v == 0) {
                str = cVar.mo24409p();
            } else if (v == 1) {
                str2 = cVar.mo24409p();
            } else if (v == 2) {
                str3 = cVar.mo24409p();
            } else if (v != 3) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                f = (float) cVar.mo24406j();
            }
        }
        cVar.mo24402g();
        return new C2095c(str, str2, str3, f);
    }
}
