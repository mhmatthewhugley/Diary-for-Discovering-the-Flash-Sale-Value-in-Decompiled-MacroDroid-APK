package p054y;

import java.io.IOException;
import p012b0.C1400d;
import p055z.C2205c;

/* renamed from: y.c0 */
/* compiled from: ScaleXYParser */
public class C2170c0 implements C2184j0<C1400d> {

    /* renamed from: a */
    public static final C2170c0 f6779a = new C2170c0();

    private C2170c0() {
    }

    /* renamed from: b */
    public C1400d mo24389a(C2205c cVar, float f) throws IOException {
        boolean z = cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY;
        if (z) {
            cVar.mo24399c();
        }
        float j = (float) cVar.mo24406j();
        float j2 = (float) cVar.mo24406j();
        while (cVar.mo24404h()) {
            cVar.mo24414x();
        }
        if (z) {
            cVar.mo24401f();
        }
        return new C1400d((j / 100.0f) * f, (j2 / 100.0f) * f);
    }
}
