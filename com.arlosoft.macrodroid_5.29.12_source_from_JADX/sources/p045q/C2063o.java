package p045q;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1399c;
import p046r.C2068a;
import p046r.C2076c;
import p048t.C2097e;
import p050v.C2128j;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.o */
/* compiled from: RectangleContent */
public class C2063o implements C2068a.C2070b, C2057k, C2060m {

    /* renamed from: a */
    private final Path f6385a = new Path();

    /* renamed from: b */
    private final RectF f6386b = new RectF();

    /* renamed from: c */
    private final String f6387c;

    /* renamed from: d */
    private final boolean f6388d;

    /* renamed from: e */
    private final C1472f f6389e;

    /* renamed from: f */
    private final C2068a<?, PointF> f6390f;

    /* renamed from: g */
    private final C2068a<?, PointF> f6391g;

    /* renamed from: h */
    private final C2068a<?, Float> f6392h;

    /* renamed from: i */
    private C2048b f6393i = new C2048b();

    /* renamed from: j */
    private boolean f6394j;

    public C2063o(C1472f fVar, C2140a aVar, C2128j jVar) {
        this.f6387c = jVar.mo24293c();
        this.f6388d = jVar.mo24296f();
        this.f6389e = fVar;
        C2068a<PointF, PointF> a = jVar.mo24294d().mo24228a();
        this.f6390f = a;
        C2068a<PointF, PointF> a2 = jVar.mo24295e().mo24228a();
        this.f6391g = a2;
        C2068a<Float, Float> a3 = jVar.mo24292b().mo24228a();
        this.f6392h = a3;
        aVar.mo24347i(a);
        aVar.mo24347i(a2);
        aVar.mo24347i(a3);
        a.mo24142a(this);
        a2.mo24142a(this);
        a3.mo24142a(this);
    }

    /* renamed from: f */
    private void m8519f() {
        this.f6394j = false;
        this.f6389e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo24123a() {
        m8519f();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2049c cVar = list.get(i);
            if (cVar instanceof C2067s) {
                C2067s sVar = (C2067s) cVar;
                if (sVar.mo24140i() == C2138q.C2139a.SIMULTANEOUSLY) {
                    this.f6393i.mo24129a(sVar);
                    sVar.mo24136c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (t == C1492k.f995j) {
            this.f6391g.mo24154n(cVar);
        } else if (t == C1492k.f997l) {
            this.f6390f.mo24154n(cVar);
        } else if (t == C1492k.f996k) {
            this.f6392h.mo24154n(cVar);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f6387c;
    }

    public Path getPath() {
        float f;
        if (this.f6394j) {
            return this.f6385a;
        }
        this.f6385a.reset();
        if (this.f6388d) {
            this.f6394j = true;
            return this.f6385a;
        }
        PointF h = this.f6391g.mo24148h();
        float f2 = h.x / 2.0f;
        float f3 = h.y / 2.0f;
        C2068a<?, Float> aVar = this.f6392h;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = ((C2076c) aVar).mo24164p();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF h2 = this.f6390f.mo24148h();
        this.f6385a.moveTo(h2.x + f2, (h2.y - f3) + f);
        this.f6385a.lineTo(h2.x + f2, (h2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f6386b;
            float f4 = h2.x;
            float f5 = f * 2.0f;
            float f6 = h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f6385a.arcTo(this.f6386b, 0.0f, 90.0f, false);
        }
        this.f6385a.lineTo((h2.x - f2) + f, h2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f6386b;
            float f7 = h2.x;
            float f8 = h2.y;
            float f9 = f * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f6385a.arcTo(this.f6386b, 90.0f, 90.0f, false);
        }
        this.f6385a.lineTo(h2.x - f2, (h2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f6386b;
            float f10 = h2.x;
            float f11 = h2.y;
            float f12 = f * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f6385a.arcTo(this.f6386b, 180.0f, 90.0f, false);
        }
        this.f6385a.lineTo((h2.x + f2) - f, h2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f6386b;
            float f13 = h2.x;
            float f14 = f * 2.0f;
            float f15 = h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f6385a.arcTo(this.f6386b, 270.0f, 90.0f, false);
        }
        this.f6385a.close();
        this.f6393i.mo24130b(this.f6385a);
        this.f6394j = true;
        return this.f6385a;
    }
}
