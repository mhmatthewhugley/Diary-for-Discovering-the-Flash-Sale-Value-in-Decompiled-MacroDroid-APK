package p054y;

import android.graphics.PointF;
import java.io.IOException;
import p055z.C2205c;

/* renamed from: y.y */
/* compiled from: PointFParser */
public class C2201y implements C2184j0<PointF> {

    /* renamed from: a */
    public static final C2201y f6821a = new C2201y();

    private C2201y() {
    }

    /* renamed from: b */
    public PointF mo24389a(C2205c cVar, float f) throws IOException {
        C2205c.C2207b s = cVar.mo24410s();
        if (s == C2205c.C2207b.BEGIN_ARRAY) {
            return C2190p.m9002e(cVar, f);
        }
        if (s == C2205c.C2207b.BEGIN_OBJECT) {
            return C2190p.m9002e(cVar, f);
        }
        if (s == C2205c.C2207b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo24406j()) * f, ((float) cVar.mo24406j()) * f);
            while (cVar.mo24404h()) {
                cVar.mo24414x();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + s);
    }
}
