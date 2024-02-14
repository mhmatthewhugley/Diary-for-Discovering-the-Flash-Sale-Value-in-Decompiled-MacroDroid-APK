package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p012b0.C1397a;
import p046r.C2081h;
import p055z.C2205c;

/* renamed from: y.r */
/* compiled from: KeyframesParser */
class C2193r {

    /* renamed from: a */
    static C2205c.C2206a f6810a = C2205c.C2206a.m9050a("k");

    /* renamed from: a */
    static <T> List<C1397a<T>> m9013a(C2205c cVar, C1463d dVar, float f, C2184j0<T> j0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo24410s() == C2205c.C2207b.STRING) {
            dVar.mo17052a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo24400e();
        while (cVar.mo24404h()) {
            if (cVar.mo24412v(f6810a) != 0) {
                cVar.mo24414x();
            } else if (cVar.mo24410s() == C2205c.C2207b.BEGIN_ARRAY) {
                cVar.mo24399c();
                if (cVar.mo24410s() == C2205c.C2207b.NUMBER) {
                    arrayList.add(C2192q.m9007c(cVar, dVar, f, j0Var, false, z));
                } else {
                    while (cVar.mo24404h()) {
                        arrayList.add(C2192q.m9007c(cVar, dVar, f, j0Var, true, z));
                    }
                }
                cVar.mo24401f();
            } else {
                arrayList.add(C2192q.m9007c(cVar, dVar, f, j0Var, false, z));
            }
        }
        cVar.mo24402g();
        m9014b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m9014b(List<? extends C1397a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1397a aVar = (C1397a) list.get(i2);
            i2++;
            C1397a aVar2 = (C1397a) list.get(i2);
            aVar.f721h = Float.valueOf(aVar2.f720g);
            if (aVar.f716c == null && (t = aVar2.f715b) != null) {
                aVar.f716c = t;
                if (aVar instanceof C2081h) {
                    ((C2081h) aVar).mo24174i();
                }
            }
        }
        C1397a aVar3 = (C1397a) list.get(i);
        if ((aVar3.f715b == null || aVar3.f716c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
