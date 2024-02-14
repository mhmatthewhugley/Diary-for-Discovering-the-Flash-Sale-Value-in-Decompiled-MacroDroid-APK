package p045q;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1399c;
import p046r.C2068a;
import p048t.C2097e;
import p050v.C2116a;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.f */
/* compiled from: EllipseContent */
public class C2052f implements C2060m, C2068a.C2070b, C2057k {

    /* renamed from: a */
    private final Path f6316a = new Path();

    /* renamed from: b */
    private final String f6317b;

    /* renamed from: c */
    private final C1472f f6318c;

    /* renamed from: d */
    private final C2068a<?, PointF> f6319d;

    /* renamed from: e */
    private final C2068a<?, PointF> f6320e;

    /* renamed from: f */
    private final C2116a f6321f;

    /* renamed from: g */
    private C2048b f6322g = new C2048b();

    /* renamed from: h */
    private boolean f6323h;

    public C2052f(C1472f fVar, C2140a aVar, C2116a aVar2) {
        this.f6317b = aVar2.mo24244b();
        this.f6318c = fVar;
        C2068a<PointF, PointF> a = aVar2.mo24246d().mo24228a();
        this.f6319d = a;
        C2068a<PointF, PointF> a2 = aVar2.mo24245c().mo24228a();
        this.f6320e = a2;
        this.f6321f = aVar2;
        aVar.mo24347i(a);
        aVar.mo24347i(a2);
        a.mo24142a(this);
        a2.mo24142a(this);
    }

    /* renamed from: f */
    private void m8480f() {
        this.f6323h = false;
        this.f6318c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo24123a() {
        m8480f();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2049c cVar = list.get(i);
            if (cVar instanceof C2067s) {
                C2067s sVar = (C2067s) cVar;
                if (sVar.mo24140i() == C2138q.C2139a.SIMULTANEOUSLY) {
                    this.f6322g.mo24129a(sVar);
                    sVar.mo24136c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (t == C1492k.f994i) {
            this.f6319d.mo24154n(cVar);
        } else if (t == C1492k.f997l) {
            this.f6320e.mo24154n(cVar);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f6317b;
    }

    public Path getPath() {
        if (this.f6323h) {
            return this.f6316a;
        }
        this.f6316a.reset();
        if (this.f6321f.mo24247e()) {
            this.f6323h = true;
            return this.f6316a;
        }
        PointF h = this.f6319d.mo24148h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f6316a.reset();
        if (this.f6321f.mo24248f()) {
            float f5 = -f2;
            this.f6316a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f6316a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f6316a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f6316a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f6316a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f6316a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f6316a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f6316a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f6316a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f6316a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF h2 = this.f6320e.mo24148h();
        this.f6316a.offset(h2.x, h2.y);
        this.f6316a.close();
        this.f6322g.mo24130b(this.f6316a);
        this.f6323h = true;
        return this.f6316a;
    }
}
