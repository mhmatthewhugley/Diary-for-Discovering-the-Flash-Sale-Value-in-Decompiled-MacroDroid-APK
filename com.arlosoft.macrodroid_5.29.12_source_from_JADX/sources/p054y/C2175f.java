package p054y;

import android.graphics.Color;
import java.io.IOException;
import p055z.C2205c;

/* renamed from: y.f */
/* compiled from: ColorParser */
public class C2175f implements C2184j0<Integer> {

    /* renamed from: a */
    public static final C2175f f6784a = new C2175f();

    private C2175f() {
    }

    /* renamed from: b */
    public Integer mo24389a(C2205c cVar, float f) throws IOException {
        boolean z = cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY;
        if (z) {
            cVar.mo24399c();
        }
        double j = cVar.mo24406j();
        double j2 = cVar.mo24406j();
        double j3 = cVar.mo24406j();
        double j4 = cVar.mo24410s() == C2205c.C2207b.NUMBER ? cVar.mo24406j() : 1.0d;
        if (z) {
            cVar.mo24401f();
        }
        if (j <= 1.0d && j2 <= 1.0d && j3 <= 1.0d) {
            j *= 255.0d;
            j2 *= 255.0d;
            j3 *= 255.0d;
            if (j4 <= 1.0d) {
                j4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) j4, (int) j, (int) j2, (int) j3));
    }
}
