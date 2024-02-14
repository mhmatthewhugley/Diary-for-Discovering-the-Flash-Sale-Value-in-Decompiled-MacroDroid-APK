package p054y;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import p012b0.C1397a;
import p012b0.C1400d;
import p049u.C2103b;
import p049u.C2105d;
import p049u.C2106e;
import p049u.C2108g;
import p049u.C2110i;
import p049u.C2113l;
import p049u.C2114m;
import p055z.C2205c;

/* renamed from: y.c */
/* compiled from: AnimatableTransformParser */
public class C2169c {

    /* renamed from: a */
    private static final C2205c.C2206a f6777a = C2205c.C2206a.m9050a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final C2205c.C2206a f6778b = C2205c.C2206a.m9050a("k");

    /* renamed from: a */
    private static boolean m8952a(C2106e eVar) {
        return eVar == null || (eVar.mo24230h() && ((PointF) eVar.mo24229b().get(0).f715b).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m8953b(C2114m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C2110i) && mVar.mo24230h() && ((PointF) mVar.mo24229b().get(0).f715b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m8954c(C2103b bVar) {
        return bVar == null || (bVar.mo24230h() && ((Float) ((C1397a) bVar.mo24229b().get(0)).f715b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m8955d(C2108g gVar) {
        return gVar == null || (gVar.mo24230h() && ((C1400d) ((C1397a) gVar.mo24229b().get(0)).f715b).mo16821a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m8956e(C2103b bVar) {
        return bVar == null || (bVar.mo24230h() && ((Float) ((C1397a) bVar.mo24229b().get(0)).f715b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m8957f(C2103b bVar) {
        return bVar == null || (bVar.mo24230h() && ((Float) ((C1397a) bVar.mo24229b().get(0)).f715b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C2113l m8958g(C2205c cVar, C1463d dVar) throws IOException {
        C2205c cVar2 = cVar;
        C1463d dVar2 = dVar;
        boolean z = false;
        boolean z2 = cVar.mo24410s() == C2205c.C2207b.BEGIN_OBJECT;
        if (z2) {
            cVar.mo24400e();
        }
        C2103b bVar = null;
        C2106e eVar = null;
        C2114m<PointF, PointF> mVar = null;
        C2108g gVar = null;
        C2103b bVar2 = null;
        C2103b bVar3 = null;
        C2105d dVar3 = null;
        C2103b bVar4 = null;
        C2103b bVar5 = null;
        while (cVar.mo24404h()) {
            switch (cVar2.mo24412v(f6777a)) {
                case 0:
                    cVar.mo24400e();
                    while (cVar.mo24404h()) {
                        if (cVar2.mo24412v(f6778b) != 0) {
                            cVar.mo24413w();
                            cVar.mo24414x();
                        } else {
                            eVar = C2165a.m8946a(cVar, dVar);
                        }
                    }
                    cVar.mo24402g();
                    break;
                case 1:
                    mVar = C2165a.m8947b(cVar, dVar);
                    break;
                case 2:
                    gVar = C2171d.m8970j(cVar, dVar);
                    break;
                case 3:
                    dVar2.mo17052a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar3 = C2171d.m8968h(cVar, dVar);
                    continue;
                case 6:
                    bVar4 = C2171d.m8966f(cVar2, dVar2, z);
                    continue;
                case 7:
                    bVar5 = C2171d.m8966f(cVar2, dVar2, z);
                    continue;
                case 8:
                    bVar2 = C2171d.m8966f(cVar2, dVar2, z);
                    continue;
                case 9:
                    bVar3 = C2171d.m8966f(cVar2, dVar2, z);
                    continue;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
            C2103b f = C2171d.m8966f(cVar2, dVar2, z);
            if (f.mo24229b().isEmpty()) {
                C1397a aVar = r1;
                C1397a aVar2 = new C1397a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(dVar.mo17057f()));
                f.mo24229b().add(aVar);
            } else if (((C1397a) f.mo24229b().get(0)).f715b == null) {
                f.mo24229b().set(0, new C1397a(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(dVar.mo17057f())));
                bVar = f;
                z = false;
            }
            bVar = f;
            z = false;
        }
        if (z2) {
            cVar.mo24402g();
        }
        C2106e eVar2 = m8952a(eVar) ? null : eVar;
        C2114m<PointF, PointF> mVar2 = m8953b(mVar) ? null : mVar;
        C2103b bVar6 = m8954c(bVar) ? null : bVar;
        if (m8955d(gVar)) {
            gVar = null;
        }
        return new C2113l(eVar2, mVar2, gVar, bVar6, dVar3, bVar4, bVar5, m8957f(bVar2) ? null : bVar2, m8956e(bVar3) ? null : bVar3);
    }
}
