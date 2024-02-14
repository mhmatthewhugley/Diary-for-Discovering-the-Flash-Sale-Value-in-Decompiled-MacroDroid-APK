package p045q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2075b;
import p046r.C2089p;
import p048t.C2097e;
import p050v.C2131m;
import p051w.C2140a;

/* renamed from: q.g */
/* compiled from: FillContent */
public class C2053g implements C2051e, C2068a.C2070b, C2057k {

    /* renamed from: a */
    private final Path f6324a;

    /* renamed from: b */
    private final Paint f6325b = new C2044a(1);

    /* renamed from: c */
    private final C2140a f6326c;

    /* renamed from: d */
    private final String f6327d;

    /* renamed from: e */
    private final boolean f6328e;

    /* renamed from: f */
    private final List<C2060m> f6329f = new ArrayList();

    /* renamed from: g */
    private final C2068a<Integer, Integer> f6330g;

    /* renamed from: h */
    private final C2068a<Integer, Integer> f6331h;
    @Nullable

    /* renamed from: i */
    private C2068a<ColorFilter, ColorFilter> f6332i;

    /* renamed from: j */
    private final C1472f f6333j;

    public C2053g(C1472f fVar, C2140a aVar, C2131m mVar) {
        Path path = new Path();
        this.f6324a = path;
        this.f6326c = aVar;
        this.f6327d = mVar.mo24310d();
        this.f6328e = mVar.mo24312f();
        this.f6333j = fVar;
        if (mVar.mo24308b() == null || mVar.mo24311e() == null) {
            this.f6330g = null;
            this.f6331h = null;
            return;
        }
        path.setFillType(mVar.mo24309c());
        C2068a<Integer, Integer> a = mVar.mo24308b().mo24228a();
        this.f6330g = a;
        a.mo24142a(this);
        aVar.mo24347i(a);
        C2068a<Integer, Integer> a2 = mVar.mo24311e().mo24228a();
        this.f6331h = a2;
        a2.mo24142a(this);
        aVar.mo24347i(a2);
    }

    /* renamed from: a */
    public void mo24123a() {
        this.f6333j.invalidateSelf();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C2049c cVar = list2.get(i);
            if (cVar instanceof C2060m) {
                this.f6329f.add((C2060m) cVar);
            }
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (t == C1492k.f986a) {
            this.f6330g.mo24154n(cVar);
        } else if (t == C1492k.f989d) {
            this.f6331h.mo24154n(cVar);
        } else if (t == C1492k.f984E) {
            C2068a<ColorFilter, ColorFilter> aVar = this.f6332i;
            if (aVar != null) {
                this.f6326c.mo24341C(aVar);
            }
            if (cVar == null) {
                this.f6332i = null;
                return;
            }
            C2089p pVar = new C2089p(cVar);
            this.f6332i = pVar;
            pVar.mo24142a(this);
            this.f6326c.mo24347i(this.f6332i);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        this.f6324a.reset();
        for (int i = 0; i < this.f6329f.size(); i++) {
            this.f6324a.addPath(this.f6329f.get(i).getPath(), matrix);
        }
        this.f6324a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f6328e) {
            C1461c.m735a("FillContent#draw");
            this.f6325b.setColor(((C2075b) this.f6330g).mo24161p());
            this.f6325b.setAlpha(C0009g.m61d((int) ((((((float) i) / 255.0f) * ((float) this.f6331h.mo24148h().intValue())) / 100.0f) * 255.0f), 0, 255));
            C2068a<ColorFilter, ColorFilter> aVar = this.f6332i;
            if (aVar != null) {
                this.f6325b.setColorFilter(aVar.mo24148h());
            }
            this.f6324a.reset();
            for (int i2 = 0; i2 < this.f6329f.size(); i2++) {
                this.f6324a.addPath(this.f6329f.get(i2).getPath(), matrix);
            }
            canvas.drawPath(this.f6324a, this.f6325b);
            C1461c.m736b("FillContent#draw");
        }
    }

    public String getName() {
        return this.f6327d;
    }
}
