package p054y;

import android.graphics.PointF;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.ArrayList;
import p001a0.C0010h;
import p012b0.C1397a;
import p049u.C2103b;
import p049u.C2106e;
import p049u.C2110i;
import p049u.C2114m;
import p055z.C2205c;

/* renamed from: y.a */
/* compiled from: AnimatablePathValueParser */
public class C2165a {

    /* renamed from: a */
    private static final C2205c.C2206a f6772a = C2205c.C2206a.m9050a("k", "x", "y");

    /* renamed from: a */
    public static C2106e m8946a(C2205c cVar, C1463d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY) {
            cVar.mo24399c();
            while (cVar.mo24404h()) {
                arrayList.add(C2199w.m9025a(cVar, dVar));
            }
            cVar.mo24401f();
            C2193r.m9014b(arrayList);
        } else {
            arrayList.add(new C1397a(C2190p.m9002e(cVar, C0010h.m75e())));
        }
        return new C2106e(arrayList);
    }

    /* renamed from: b */
    static C2114m<PointF, PointF> m8947b(C2205c cVar, C1463d dVar) throws IOException {
        cVar.mo24400e();
        C2106e eVar = null;
        C2103b bVar = null;
        C2103b bVar2 = null;
        boolean z = false;
        while (cVar.mo24410s() != C2205c.C2207b.END_OBJECT) {
            int v = cVar.mo24412v(f6772a);
            if (v != 0) {
                if (v != 1) {
                    if (v != 2) {
                        cVar.mo24413w();
                        cVar.mo24414x();
                    } else if (cVar.mo24410s() == C2205c.C2207b.STRING) {
                        cVar.mo24414x();
                    } else {
                        bVar2 = C2171d.m8965e(cVar, dVar);
                    }
                } else if (cVar.mo24410s() == C2205c.C2207b.STRING) {
                    cVar.mo24414x();
                } else {
                    bVar = C2171d.m8965e(cVar, dVar);
                }
                z = true;
            } else {
                eVar = m8946a(cVar, dVar);
            }
        }
        cVar.mo24402g();
        if (z) {
            dVar.mo17052a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C2110i(bVar, bVar2);
    }
}
