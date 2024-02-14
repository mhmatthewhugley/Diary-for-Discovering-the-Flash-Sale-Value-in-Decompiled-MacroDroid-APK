package p045q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0009g;
import p001a0.C0010h;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2076c;
import p046r.C2078e;
import p046r.C2089p;
import p048t.C2097e;
import p049u.C2103b;
import p049u.C2105d;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.a */
/* compiled from: BaseStrokeContent */
public abstract class C2045a implements C2068a.C2070b, C2057k, C2051e {

    /* renamed from: a */
    private final PathMeasure f6288a = new PathMeasure();

    /* renamed from: b */
    private final Path f6289b = new Path();

    /* renamed from: c */
    private final Path f6290c = new Path();

    /* renamed from: d */
    private final RectF f6291d = new RectF();

    /* renamed from: e */
    private final C1472f f6292e;

    /* renamed from: f */
    protected final C2140a f6293f;

    /* renamed from: g */
    private final List<C2047b> f6294g = new ArrayList();

    /* renamed from: h */
    private final float[] f6295h;

    /* renamed from: i */
    final Paint f6296i;

    /* renamed from: j */
    private final C2068a<?, Float> f6297j;

    /* renamed from: k */
    private final C2068a<?, Integer> f6298k;

    /* renamed from: l */
    private final List<C2068a<?, Float>> f6299l;
    @Nullable

    /* renamed from: m */
    private final C2068a<?, Float> f6300m;
    @Nullable

    /* renamed from: n */
    private C2068a<ColorFilter, ColorFilter> f6301n;

    /* renamed from: q.a$b */
    /* compiled from: BaseStrokeContent */
    private static final class C2047b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C2060m> f6302a;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: b */
        public final C2067s f6303b;

        private C2047b(@Nullable C2067s sVar) {
            this.f6302a = new ArrayList();
            this.f6303b = sVar;
        }
    }

    C2045a(C1472f fVar, C2140a aVar, Paint.Cap cap, Paint.Join join, float f, C2105d dVar, C2103b bVar, List<C2103b> list, C2103b bVar2) {
        C2044a aVar2 = new C2044a(1);
        this.f6296i = aVar2;
        this.f6292e = fVar;
        this.f6293f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f6298k = dVar.mo24228a();
        this.f6297j = bVar.mo24228a();
        if (bVar2 == null) {
            this.f6300m = null;
        } else {
            this.f6300m = bVar2.mo24228a();
        }
        this.f6299l = new ArrayList(list.size());
        this.f6295h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f6299l.add(list.get(i).mo24228a());
        }
        aVar.mo24347i(this.f6298k);
        aVar.mo24347i(this.f6297j);
        for (int i2 = 0; i2 < this.f6299l.size(); i2++) {
            aVar.mo24347i(this.f6299l.get(i2));
        }
        C2068a<?, Float> aVar3 = this.f6300m;
        if (aVar3 != null) {
            aVar.mo24347i(aVar3);
        }
        this.f6298k.mo24142a(this);
        this.f6297j.mo24142a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f6299l.get(i3).mo24142a(this);
        }
        C2068a<?, Float> aVar4 = this.f6300m;
        if (aVar4 != null) {
            aVar4.mo24142a(this);
        }
    }

    /* renamed from: f */
    private void m8454f(Matrix matrix) {
        C1461c.m735a("StrokeContent#applyDashPattern");
        if (this.f6299l.isEmpty()) {
            C1461c.m736b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C0010h.m77g(matrix);
        for (int i = 0; i < this.f6299l.size(); i++) {
            this.f6295h[i] = ((Float) this.f6299l.get(i).mo24148h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f6295h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f6295h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f6295h;
            fArr3[i] = fArr3[i] * g;
        }
        C2068a<?, Float> aVar = this.f6300m;
        this.f6296i.setPathEffect(new DashPathEffect(this.f6295h, aVar == null ? 0.0f : g * aVar.mo24148h().floatValue()));
        C1461c.m736b("StrokeContent#applyDashPattern");
    }

    /* renamed from: h */
    private void m8455h(Canvas canvas, C2047b bVar, Matrix matrix) {
        C1461c.m735a("StrokeContent#applyTrimPath");
        if (bVar.f6303b == null) {
            C1461c.m736b("StrokeContent#applyTrimPath");
            return;
        }
        this.f6289b.reset();
        for (int size = bVar.f6302a.size() - 1; size >= 0; size--) {
            this.f6289b.addPath(((C2060m) bVar.f6302a.get(size)).getPath(), matrix);
        }
        this.f6288a.setPath(this.f6289b, false);
        float length = this.f6288a.getLength();
        while (this.f6288a.nextContour()) {
            length += this.f6288a.getLength();
        }
        float floatValue = (bVar.f6303b.mo24138f().mo24148h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f6303b.mo24139h().mo24148h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f6303b.mo24137d().mo24148h().floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = bVar.f6302a.size() - 1; size2 >= 0; size2--) {
            this.f6290c.set(((C2060m) bVar.f6302a.get(size2)).getPath());
            this.f6290c.transform(matrix);
            this.f6288a.setPath(this.f6290c, false);
            float length2 = this.f6288a.getLength();
            float f2 = 1.0f;
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f + length2 && f < f3) {
                    C0010h.m71a(this.f6290c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f6290c, this.f6296i);
                    f += length2;
                }
            }
            float f4 = f + length2;
            if (f4 >= floatValue2 && f <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f) {
                    float f5 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f4) {
                        f2 = (floatValue3 - f) / length2;
                    }
                    C0010h.m71a(this.f6290c, f5, f2, 0.0f);
                    canvas.drawPath(this.f6290c, this.f6296i);
                } else {
                    canvas.drawPath(this.f6290c, this.f6296i);
                }
            }
            f += length2;
        }
        C1461c.m736b("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo24123a() {
        this.f6292e.invalidateSelf();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        C2067s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C2049c cVar = list.get(size);
            if (cVar instanceof C2067s) {
                C2067s sVar2 = (C2067s) cVar;
                if (sVar2.mo24140i() == C2138q.C2139a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.mo24136c(this);
        }
        C2047b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C2049c cVar2 = list2.get(size2);
            if (cVar2 instanceof C2067s) {
                C2067s sVar3 = (C2067s) cVar2;
                if (sVar3.mo24140i() == C2138q.C2139a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f6294g.add(bVar);
                    }
                    bVar = new C2047b(sVar3);
                    sVar3.mo24136c(this);
                }
            }
            if (cVar2 instanceof C2060m) {
                if (bVar == null) {
                    bVar = new C2047b(sVar);
                }
                bVar.f6302a.add((C2060m) cVar2);
            }
        }
        if (bVar != null) {
            this.f6294g.add(bVar);
        }
    }

    @CallSuper
    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (t == C1492k.f989d) {
            this.f6298k.mo24154n(cVar);
        } else if (t == C1492k.f1002q) {
            this.f6297j.mo24154n(cVar);
        } else if (t == C1492k.f984E) {
            C2068a<ColorFilter, ColorFilter> aVar = this.f6301n;
            if (aVar != null) {
                this.f6293f.mo24341C(aVar);
            }
            if (cVar == null) {
                this.f6301n = null;
                return;
            }
            C2089p pVar = new C2089p(cVar);
            this.f6301n = pVar;
            pVar.mo24142a(this);
            this.f6293f.mo24347i(this.f6301n);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        C1461c.m735a("StrokeContent#getBounds");
        this.f6289b.reset();
        for (int i = 0; i < this.f6294g.size(); i++) {
            C2047b bVar = this.f6294g.get(i);
            for (int i2 = 0; i2 < bVar.f6302a.size(); i2++) {
                this.f6289b.addPath(((C2060m) bVar.f6302a.get(i2)).getPath(), matrix);
            }
        }
        this.f6289b.computeBounds(this.f6291d, false);
        float p = ((C2076c) this.f6297j).mo24164p();
        RectF rectF2 = this.f6291d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f6291d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1461c.m736b("StrokeContent#getBounds");
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        C1461c.m735a("StrokeContent#draw");
        if (C0010h.m78h(matrix)) {
            C1461c.m736b("StrokeContent#draw");
            return;
        }
        this.f6296i.setAlpha(C0009g.m61d((int) ((((((float) i) / 255.0f) * ((float) ((C2078e) this.f6298k).mo24168p())) / 100.0f) * 255.0f), 0, 255));
        this.f6296i.setStrokeWidth(((C2076c) this.f6297j).mo24164p() * C0010h.m77g(matrix));
        if (this.f6296i.getStrokeWidth() <= 0.0f) {
            C1461c.m736b("StrokeContent#draw");
            return;
        }
        m8454f(matrix);
        C2068a<ColorFilter, ColorFilter> aVar = this.f6301n;
        if (aVar != null) {
            this.f6296i.setColorFilter(aVar.mo24148h());
        }
        for (int i2 = 0; i2 < this.f6294g.size(); i2++) {
            C2047b bVar = this.f6294g.get(i2);
            if (bVar.f6303b != null) {
                m8455h(canvas, bVar, matrix);
            } else {
                C1461c.m735a("StrokeContent#buildPath");
                this.f6289b.reset();
                for (int size = bVar.f6302a.size() - 1; size >= 0; size--) {
                    this.f6289b.addPath(((C2060m) bVar.f6302a.get(size)).getPath(), matrix);
                }
                C1461c.m736b("StrokeContent#buildPath");
                C1461c.m735a("StrokeContent#drawPath");
                canvas.drawPath(this.f6289b, this.f6296i);
                C1461c.m736b("StrokeContent#drawPath");
            }
        }
        C1461c.m736b("StrokeContent#draw");
    }
}
