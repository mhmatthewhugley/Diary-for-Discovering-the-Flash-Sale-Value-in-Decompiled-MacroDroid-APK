package p054y;

import android.graphics.PointF;
import com.android.p023dx.rop.code.RegisterSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0009g;
import p048t.C2092a;
import p050v.C2130l;
import p055z.C2205c;

/* renamed from: y.d0 */
/* compiled from: ShapeDataParser */
public class C2172d0 implements C2184j0<C2130l> {

    /* renamed from: a */
    public static final C2172d0 f6780a = new C2172d0();

    /* renamed from: b */
    private static final C2205c.C2206a f6781b = C2205c.C2206a.m9050a("c", RegisterSpec.PREFIX, "i", "o");

    private C2172d0() {
    }

    /* renamed from: b */
    public C2130l mo24389a(C2205c cVar, float f) throws IOException {
        if (cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY) {
            cVar.mo24399c();
        }
        cVar.mo24400e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.mo24404h()) {
            int v = cVar.mo24412v(f6781b);
            if (v == 0) {
                z = cVar.mo24405i();
            } else if (v == 1) {
                list = C2190p.m9003f(cVar, f);
            } else if (v == 2) {
                list2 = C2190p.m9003f(cVar, f);
            } else if (v != 3) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                list3 = C2190p.m9003f(cVar, f);
            }
        }
        cVar.mo24402g();
        if (cVar.mo24410s() == C2205c.C2207b.END_ARRAY) {
            cVar.mo24401f();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C2130l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C2092a(C0009g.m58a(list.get(i2), list3.get(i2)), C0009g.m58a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C2092a(C0009g.m58a(list.get(i3), list3.get(i3)), C0009g.m58a(pointF3, list2.get(0)), pointF3));
            }
            return new C2130l(pointF, z, arrayList);
        }
    }
}
