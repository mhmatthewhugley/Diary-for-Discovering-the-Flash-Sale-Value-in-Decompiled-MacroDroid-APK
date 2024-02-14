package p045q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0009g;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2089p;
import p048t.C2097e;
import p050v.C2118c;
import p050v.C2119d;
import p050v.C2121f;
import p051w.C2140a;

/* renamed from: q.h */
/* compiled from: GradientFillContent */
public class C2054h implements C2051e, C2068a.C2070b, C2057k {
    @NonNull

    /* renamed from: a */
    private final String f6334a;

    /* renamed from: b */
    private final boolean f6335b;

    /* renamed from: c */
    private final C2140a f6336c;

    /* renamed from: d */
    private final LongSparseArray<LinearGradient> f6337d = new LongSparseArray<>();

    /* renamed from: e */
    private final LongSparseArray<RadialGradient> f6338e = new LongSparseArray<>();

    /* renamed from: f */
    private final Path f6339f;

    /* renamed from: g */
    private final Paint f6340g;

    /* renamed from: h */
    private final RectF f6341h;

    /* renamed from: i */
    private final List<C2060m> f6342i;

    /* renamed from: j */
    private final C2121f f6343j;

    /* renamed from: k */
    private final C2068a<C2118c, C2118c> f6344k;

    /* renamed from: l */
    private final C2068a<Integer, Integer> f6345l;

    /* renamed from: m */
    private final C2068a<PointF, PointF> f6346m;

    /* renamed from: n */
    private final C2068a<PointF, PointF> f6347n;
    @Nullable

    /* renamed from: o */
    private C2068a<ColorFilter, ColorFilter> f6348o;
    @Nullable

    /* renamed from: p */
    private C2089p f6349p;

    /* renamed from: q */
    private final C1472f f6350q;

    /* renamed from: r */
    private final int f6351r;

    public C2054h(C1472f fVar, C2140a aVar, C2119d dVar) {
        Path path = new Path();
        this.f6339f = path;
        this.f6340g = new C2044a(1);
        this.f6341h = new RectF();
        this.f6342i = new ArrayList();
        this.f6336c = aVar;
        this.f6334a = dVar.mo24257f();
        this.f6335b = dVar.mo24260i();
        this.f6350q = fVar;
        this.f6343j = dVar.mo24256e();
        path.setFillType(dVar.mo24254c());
        this.f6351r = (int) (fVar.mo17139p().mo17055d() / 32.0f);
        C2068a<C2118c, C2118c> a = dVar.mo24255d().mo24228a();
        this.f6344k = a;
        a.mo24142a(this);
        aVar.mo24347i(a);
        C2068a<Integer, Integer> a2 = dVar.mo24258g().mo24228a();
        this.f6345l = a2;
        a2.mo24142a(this);
        aVar.mo24347i(a2);
        C2068a<PointF, PointF> a3 = dVar.mo24259h().mo24228a();
        this.f6346m = a3;
        a3.mo24142a(this);
        aVar.mo24347i(a3);
        C2068a<PointF, PointF> a4 = dVar.mo24253b().mo24228a();
        this.f6347n = a4;
        a4.mo24142a(this);
        aVar.mo24347i(a4);
    }

    /* renamed from: f */
    private int[] m8491f(int[] iArr) {
        C2089p pVar = this.f6349p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo24148h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private int m8492h() {
        int round = Math.round(this.f6346m.mo24147f() * ((float) this.f6351r));
        int round2 = Math.round(this.f6347n.mo24147f() * ((float) this.f6351r));
        int round3 = Math.round(this.f6344k.mo24147f() * ((float) this.f6351r));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: i */
    private LinearGradient m8493i() {
        long h = (long) m8492h();
        LinearGradient linearGradient = this.f6337d.get(h);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h2 = this.f6346m.mo24148h();
        PointF h3 = this.f6347n.mo24148h();
        C2118c h4 = this.f6344k.mo24148h();
        LinearGradient linearGradient2 = new LinearGradient(h2.x, h2.y, h3.x, h3.y, m8491f(h4.mo24249a()), h4.mo24250b(), Shader.TileMode.CLAMP);
        this.f6337d.put(h, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: j */
    private RadialGradient m8494j() {
        long h = (long) m8492h();
        RadialGradient radialGradient = this.f6338e.get(h);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h2 = this.f6346m.mo24148h();
        PointF h3 = this.f6347n.mo24148h();
        C2118c h4 = this.f6344k.mo24148h();
        int[] f = m8491f(h4.mo24249a());
        float[] b = h4.mo24250b();
        float f2 = h2.x;
        float f3 = h2.y;
        float hypot = (float) Math.hypot((double) (h3.x - f2), (double) (h3.y - f3));
        RadialGradient radialGradient2 = new RadialGradient(f2, f3, hypot <= 0.0f ? 0.001f : hypot, f, b, Shader.TileMode.CLAMP);
        this.f6338e.put(h, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public void mo24123a() {
        this.f6350q.invalidateSelf();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C2049c cVar = list2.get(i);
            if (cVar instanceof C2060m) {
                this.f6342i.add((C2060m) cVar);
            }
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        if (t == C1492k.f989d) {
            this.f6345l.mo24154n(cVar);
        } else if (t == C1492k.f984E) {
            C2068a<ColorFilter, ColorFilter> aVar = this.f6348o;
            if (aVar != null) {
                this.f6336c.mo24341C(aVar);
            }
            if (cVar == null) {
                this.f6348o = null;
                return;
            }
            C2089p pVar = new C2089p(cVar);
            this.f6348o = pVar;
            pVar.mo24142a(this);
            this.f6336c.mo24347i(this.f6348o);
        } else if (t == C1492k.f985F) {
            C2089p pVar2 = this.f6349p;
            if (pVar2 != null) {
                this.f6336c.mo24341C(pVar2);
            }
            if (cVar == null) {
                this.f6349p = null;
                return;
            }
            this.f6337d.clear();
            this.f6338e.clear();
            C2089p pVar3 = new C2089p(cVar);
            this.f6349p = pVar3;
            pVar3.mo24142a(this);
            this.f6336c.mo24347i(this.f6349p);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        this.f6339f.reset();
        for (int i = 0; i < this.f6342i.size(); i++) {
            this.f6339f.addPath(this.f6342i.get(i).getPath(), matrix);
        }
        this.f6339f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f6335b) {
            C1461c.m735a("GradientFillContent#draw");
            this.f6339f.reset();
            for (int i2 = 0; i2 < this.f6342i.size(); i2++) {
                this.f6339f.addPath(this.f6342i.get(i2).getPath(), matrix);
            }
            this.f6339f.computeBounds(this.f6341h, false);
            if (this.f6343j == C2121f.LINEAR) {
                shader = m8493i();
            } else {
                shader = m8494j();
            }
            shader.setLocalMatrix(matrix);
            this.f6340g.setShader(shader);
            C2068a<ColorFilter, ColorFilter> aVar = this.f6348o;
            if (aVar != null) {
                this.f6340g.setColorFilter(aVar.mo24148h());
            }
            this.f6340g.setAlpha(C0009g.m61d((int) ((((((float) i) / 255.0f) * ((float) this.f6345l.mo24148h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f6339f, this.f6340g);
            C1461c.m736b("GradientFillContent#draw");
        }
    }

    public String getName() {
        return this.f6334a;
    }
}
