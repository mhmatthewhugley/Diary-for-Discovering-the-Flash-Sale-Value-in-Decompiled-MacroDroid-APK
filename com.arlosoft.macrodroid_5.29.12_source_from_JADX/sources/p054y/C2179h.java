package p054y;

import java.io.IOException;
import p048t.C2093b;
import p055z.C2205c;

/* renamed from: y.h */
/* compiled from: DocumentDataParser */
public class C2179h implements C2184j0<C2093b> {

    /* renamed from: a */
    public static final C2179h f6788a = new C2179h();

    /* renamed from: b */
    private static final C2205c.C2206a f6789b = C2205c.C2206a.m9050a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C2179h() {
    }

    /* renamed from: b */
    public C2093b mo24389a(C2205c cVar, float f) throws IOException {
        C2093b.C2094a aVar = C2093b.C2094a.CENTER;
        cVar.mo24400e();
        C2093b.C2094a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (cVar.mo24404h()) {
            switch (cVar.mo24412v(f6789b)) {
                case 0:
                    str = cVar.mo24409p();
                    break;
                case 1:
                    str2 = cVar.mo24409p();
                    break;
                case 2:
                    f2 = (float) cVar.mo24406j();
                    break;
                case 3:
                    int m = cVar.mo24407m();
                    aVar2 = C2093b.C2094a.CENTER;
                    if (m <= aVar2.ordinal() && m >= 0) {
                        aVar2 = C2093b.C2094a.values()[m];
                        break;
                    }
                case 4:
                    i = cVar.mo24407m();
                    break;
                case 5:
                    f3 = (float) cVar.mo24406j();
                    break;
                case 6:
                    f4 = (float) cVar.mo24406j();
                    break;
                case 7:
                    i2 = C2190p.m9001d(cVar);
                    break;
                case 8:
                    i3 = C2190p.m9001d(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.mo24406j();
                    break;
                case 10:
                    z = cVar.mo24405i();
                    break;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
        }
        C2205c cVar2 = cVar;
        cVar.mo24402g();
        return new C2093b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
