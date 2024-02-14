package p050v;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0006d;
import p001a0.C0009g;
import p048t.C2092a;

/* renamed from: v.l */
/* compiled from: ShapeData */
public class C2130l {

    /* renamed from: a */
    private final List<C2092a> f6614a;

    /* renamed from: b */
    private PointF f6615b;

    /* renamed from: c */
    private boolean f6616c;

    public C2130l(PointF pointF, boolean z, List<C2092a> list) {
        this.f6615b = pointF;
        this.f6616c = z;
        this.f6614a = new ArrayList(list);
    }

    /* renamed from: e */
    private void m8785e(float f, float f2) {
        if (this.f6615b == null) {
            this.f6615b = new PointF();
        }
        this.f6615b.set(f, f2);
    }

    /* renamed from: a */
    public List<C2092a> mo24303a() {
        return this.f6614a;
    }

    /* renamed from: b */
    public PointF mo24304b() {
        return this.f6615b;
    }

    /* renamed from: c */
    public void mo24305c(C2130l lVar, C2130l lVar2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        if (this.f6615b == null) {
            this.f6615b = new PointF();
        }
        this.f6616c = lVar.mo24306d() || lVar2.mo24306d();
        if (lVar.mo24303a().size() != lVar2.mo24303a().size()) {
            C0006d.m32c("Curves must have the same number of control points. Shape 1: " + lVar.mo24303a().size() + "\tShape 2: " + lVar2.mo24303a().size());
        }
        int min = Math.min(lVar.mo24303a().size(), lVar2.mo24303a().size());
        if (this.f6614a.size() < min) {
            for (int size = this.f6614a.size(); size < min; size++) {
                this.f6614a.add(new C2092a());
            }
        } else if (this.f6614a.size() > min) {
            for (int size2 = this.f6614a.size() - 1; size2 >= min; size2--) {
                List<C2092a> list = this.f6614a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = lVar.mo24304b();
        PointF b2 = lVar2.mo24304b();
        m8785e(C0009g.m68k(b.x, b2.x, f), C0009g.m68k(b.y, b2.y, f));
        for (int size3 = this.f6614a.size() - 1; size3 >= 0; size3--) {
            C2092a aVar = lVar.mo24303a().get(size3);
            C2092a aVar2 = lVar2.mo24303a().get(size3);
            PointF a = aVar.mo24200a();
            PointF b3 = aVar.mo24201b();
            PointF c = aVar.mo24202c();
            PointF a2 = aVar2.mo24200a();
            PointF b4 = aVar2.mo24201b();
            PointF c2 = aVar2.mo24202c();
            this.f6614a.get(size3).mo24203d(C0009g.m68k(a.x, a2.x, f), C0009g.m68k(a.y, a2.y, f));
            this.f6614a.get(size3).mo24204e(C0009g.m68k(b3.x, b4.x, f), C0009g.m68k(b3.y, b4.y, f));
            this.f6614a.get(size3).mo24205f(C0009g.m68k(c.x, c2.x, f), C0009g.m68k(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo24306d() {
        return this.f6616c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f6614a.size() + "closed=" + this.f6616c + '}';
    }

    public C2130l() {
        this.f6614a = new ArrayList();
    }
}
