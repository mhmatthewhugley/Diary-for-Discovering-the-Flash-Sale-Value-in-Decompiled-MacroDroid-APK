package p045q;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import p012b0.C1399c;
import p046r.C2068a;
import p046r.C2089p;
import p050v.C2118c;
import p050v.C2120e;
import p050v.C2121f;
import p051w.C2140a;

/* renamed from: q.i */
/* compiled from: GradientStrokeContent */
public class C2055i extends C2045a {

    /* renamed from: o */
    private final String f6352o;

    /* renamed from: p */
    private final boolean f6353p;

    /* renamed from: q */
    private final LongSparseArray<LinearGradient> f6354q = new LongSparseArray<>();

    /* renamed from: r */
    private final LongSparseArray<RadialGradient> f6355r = new LongSparseArray<>();

    /* renamed from: s */
    private final RectF f6356s = new RectF();

    /* renamed from: t */
    private final C2121f f6357t;

    /* renamed from: u */
    private final int f6358u;

    /* renamed from: v */
    private final C2068a<C2118c, C2118c> f6359v;

    /* renamed from: w */
    private final C2068a<PointF, PointF> f6360w;

    /* renamed from: x */
    private final C2068a<PointF, PointF> f6361x;
    @Nullable

    /* renamed from: y */
    private C2089p f6362y;

    public C2055i(C1472f fVar, C2140a aVar, C2120e eVar) {
        super(fVar, aVar, eVar.mo24261b().mo24332b(), eVar.mo24266g().mo24333b(), eVar.mo24268i(), eVar.mo24270k(), eVar.mo24272m(), eVar.mo24267h(), eVar.mo24262c());
        this.f6352o = eVar.mo24269j();
        this.f6357t = eVar.mo24265f();
        this.f6353p = eVar.mo24273n();
        this.f6358u = (int) (fVar.mo17139p().mo17055d() / 32.0f);
        C2068a<C2118c, C2118c> a = eVar.mo24264e().mo24228a();
        this.f6359v = a;
        a.mo24142a(this);
        aVar.mo24347i(a);
        C2068a<PointF, PointF> a2 = eVar.mo24271l().mo24228a();
        this.f6360w = a2;
        a2.mo24142a(this);
        aVar.mo24347i(a2);
        C2068a<PointF, PointF> a3 = eVar.mo24263d().mo24228a();
        this.f6361x = a3;
        a3.mo24142a(this);
        aVar.mo24347i(a3);
    }

    /* renamed from: i */
    private int[] m8501i(int[] iArr) {
        C2089p pVar = this.f6362y;
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

    /* renamed from: j */
    private int m8502j() {
        int round = Math.round(this.f6360w.mo24147f() * ((float) this.f6358u));
        int round2 = Math.round(this.f6361x.mo24147f() * ((float) this.f6358u));
        int round3 = Math.round(this.f6359v.mo24147f() * ((float) this.f6358u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: k */
    private LinearGradient m8503k() {
        long j = (long) m8502j();
        LinearGradient linearGradient = this.f6354q.get(j);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h = this.f6360w.mo24148h();
        PointF h2 = this.f6361x.mo24148h();
        C2118c h3 = this.f6359v.mo24148h();
        LinearGradient linearGradient2 = new LinearGradient(h.x, h.y, h2.x, h2.y, m8501i(h3.mo24249a()), h3.mo24250b(), Shader.TileMode.CLAMP);
        this.f6354q.put(j, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: l */
    private RadialGradient m8504l() {
        long j = (long) m8502j();
        RadialGradient radialGradient = this.f6355r.get(j);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h = this.f6360w.mo24148h();
        PointF h2 = this.f6361x.mo24148h();
        C2118c h3 = this.f6359v.mo24148h();
        int[] i = m8501i(h3.mo24249a());
        float[] b = h3.mo24250b();
        float f = h.x;
        float f2 = h.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2)), i, b, Shader.TileMode.CLAMP);
        this.f6355r.put(j, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t == C1492k.f985F) {
            C2089p pVar = this.f6362y;
            if (pVar != null) {
                this.f6293f.mo24341C(pVar);
            }
            if (cVar == null) {
                this.f6362y = null;
                return;
            }
            C2089p pVar2 = new C2089p(cVar);
            this.f6362y = pVar2;
            pVar2.mo24142a(this);
            this.f6293f.mo24347i(this.f6362y);
        }
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f6353p) {
            mo24127e(this.f6356s, matrix, false);
            if (this.f6357t == C2121f.LINEAR) {
                shader = m8503k();
            } else {
                shader = m8504l();
            }
            shader.setLocalMatrix(matrix);
            this.f6296i.setShader(shader);
            super.mo24128g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f6352o;
    }
}
