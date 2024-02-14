package p046r;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1492k;
import java.util.Collections;
import p012b0.C1397a;
import p012b0.C1399c;
import p012b0.C1400d;
import p046r.C2068a;
import p049u.C2113l;
import p051w.C2140a;

/* renamed from: r.o */
/* compiled from: TransformKeyframeAnimation */
public class C2088o {

    /* renamed from: a */
    private final Matrix f6458a = new Matrix();

    /* renamed from: b */
    private final Matrix f6459b;

    /* renamed from: c */
    private final Matrix f6460c;

    /* renamed from: d */
    private final Matrix f6461d;

    /* renamed from: e */
    private final float[] f6462e;
    @NonNull

    /* renamed from: f */
    private C2068a<PointF, PointF> f6463f;
    @NonNull

    /* renamed from: g */
    private C2068a<?, PointF> f6464g;
    @NonNull

    /* renamed from: h */
    private C2068a<C1400d, C1400d> f6465h;
    @NonNull

    /* renamed from: i */
    private C2068a<Float, Float> f6466i;
    @NonNull

    /* renamed from: j */
    private C2068a<Integer, Integer> f6467j;
    @Nullable

    /* renamed from: k */
    private C2076c f6468k;
    @Nullable

    /* renamed from: l */
    private C2076c f6469l;
    @Nullable

    /* renamed from: m */
    private C2068a<?, Float> f6470m;
    @Nullable

    /* renamed from: n */
    private C2068a<?, Float> f6471n;

    public C2088o(C2113l lVar) {
        this.f6463f = lVar.mo24235c() == null ? null : lVar.mo24235c().mo24228a();
        this.f6464g = lVar.mo24238f() == null ? null : lVar.mo24238f().mo24228a();
        this.f6465h = lVar.mo24240h() == null ? null : lVar.mo24240h().mo24228a();
        this.f6466i = lVar.mo24239g() == null ? null : lVar.mo24239g().mo24228a();
        C2076c cVar = lVar.mo24241i() == null ? null : (C2076c) lVar.mo24241i().mo24228a();
        this.f6468k = cVar;
        if (cVar != null) {
            this.f6459b = new Matrix();
            this.f6460c = new Matrix();
            this.f6461d = new Matrix();
            this.f6462e = new float[9];
        } else {
            this.f6459b = null;
            this.f6460c = null;
            this.f6461d = null;
            this.f6462e = null;
        }
        this.f6469l = lVar.mo24242j() == null ? null : (C2076c) lVar.mo24242j().mo24228a();
        if (lVar.mo24237e() != null) {
            this.f6467j = lVar.mo24237e().mo24228a();
        }
        if (lVar.mo24243k() != null) {
            this.f6470m = lVar.mo24243k().mo24228a();
        } else {
            this.f6470m = null;
        }
        if (lVar.mo24236d() != null) {
            this.f6471n = lVar.mo24236d().mo24228a();
        } else {
            this.f6471n = null;
        }
    }

    /* renamed from: d */
    private void m8619d() {
        for (int i = 0; i < 9; i++) {
            this.f6462e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo24186a(C2140a aVar) {
        aVar.mo24347i(this.f6467j);
        aVar.mo24347i(this.f6470m);
        aVar.mo24347i(this.f6471n);
        aVar.mo24347i(this.f6463f);
        aVar.mo24347i(this.f6464g);
        aVar.mo24347i(this.f6465h);
        aVar.mo24347i(this.f6466i);
        aVar.mo24347i(this.f6468k);
        aVar.mo24347i(this.f6469l);
    }

    /* renamed from: b */
    public void mo24187b(C2068a.C2070b bVar) {
        C2068a<Integer, Integer> aVar = this.f6467j;
        if (aVar != null) {
            aVar.mo24142a(bVar);
        }
        C2068a<?, Float> aVar2 = this.f6470m;
        if (aVar2 != null) {
            aVar2.mo24142a(bVar);
        }
        C2068a<?, Float> aVar3 = this.f6471n;
        if (aVar3 != null) {
            aVar3.mo24142a(bVar);
        }
        C2068a<PointF, PointF> aVar4 = this.f6463f;
        if (aVar4 != null) {
            aVar4.mo24142a(bVar);
        }
        C2068a<?, PointF> aVar5 = this.f6464g;
        if (aVar5 != null) {
            aVar5.mo24142a(bVar);
        }
        C2068a<C1400d, C1400d> aVar6 = this.f6465h;
        if (aVar6 != null) {
            aVar6.mo24142a(bVar);
        }
        C2068a<Float, Float> aVar7 = this.f6466i;
        if (aVar7 != null) {
            aVar7.mo24142a(bVar);
        }
        C2076c cVar = this.f6468k;
        if (cVar != null) {
            cVar.mo24142a(bVar);
        }
        C2076c cVar2 = this.f6469l;
        if (cVar2 != null) {
            cVar2.mo24142a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean mo24188c(T t, @Nullable C1399c<T> cVar) {
        C2076c cVar2;
        C2076c cVar3;
        C2068a<?, Float> aVar;
        C2068a<?, Float> aVar2;
        if (t == C1492k.f990e) {
            C2068a<PointF, PointF> aVar3 = this.f6463f;
            if (aVar3 == null) {
                this.f6463f = new C2089p(cVar, new PointF());
                return true;
            }
            aVar3.mo24154n(cVar);
            return true;
        } else if (t == C1492k.f991f) {
            C2068a<?, PointF> aVar4 = this.f6464g;
            if (aVar4 == null) {
                this.f6464g = new C2089p(cVar, new PointF());
                return true;
            }
            aVar4.mo24154n(cVar);
            return true;
        } else {
            if (t == C1492k.f992g) {
                C2068a<?, PointF> aVar5 = this.f6464g;
                if (aVar5 instanceof C2086m) {
                    ((C2086m) aVar5).mo24183r(cVar);
                    return true;
                }
            }
            if (t == C1492k.f993h) {
                C2068a<?, PointF> aVar6 = this.f6464g;
                if (aVar6 instanceof C2086m) {
                    ((C2086m) aVar6).mo24184s(cVar);
                    return true;
                }
            }
            if (t == C1492k.f998m) {
                C2068a<C1400d, C1400d> aVar7 = this.f6465h;
                if (aVar7 == null) {
                    this.f6465h = new C2089p(cVar, new C1400d());
                    return true;
                }
                aVar7.mo24154n(cVar);
                return true;
            } else if (t == C1492k.f999n) {
                C2068a<Float, Float> aVar8 = this.f6466i;
                if (aVar8 == null) {
                    this.f6466i = new C2089p(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar8.mo24154n(cVar);
                return true;
            } else if (t == C1492k.f988c) {
                C2068a<Integer, Integer> aVar9 = this.f6467j;
                if (aVar9 == null) {
                    this.f6467j = new C2089p(cVar, 100);
                    return true;
                }
                aVar9.mo24154n(cVar);
                return true;
            } else if (t != C1492k.f980A || (aVar2 = this.f6470m) == null) {
                if (t != C1492k.f981B || (aVar = this.f6471n) == null) {
                    if (t == C1492k.f1000o && (cVar3 = this.f6468k) != null) {
                        if (cVar3 == null) {
                            this.f6468k = new C2076c(Collections.singletonList(new C1397a(Float.valueOf(0.0f))));
                        }
                        this.f6468k.mo24154n(cVar);
                        return true;
                    } else if (t != C1492k.f1001p || (cVar2 = this.f6469l) == null) {
                        return false;
                    } else {
                        if (cVar2 == null) {
                            this.f6469l = new C2076c(Collections.singletonList(new C1397a(Float.valueOf(0.0f))));
                        }
                        this.f6469l.mo24154n(cVar);
                        return true;
                    }
                } else if (aVar == null) {
                    this.f6471n = new C2089p(cVar, 100);
                    return true;
                } else {
                    aVar.mo24154n(cVar);
                    return true;
                }
            } else if (aVar2 == null) {
                this.f6470m = new C2089p(cVar, 100);
                return true;
            } else {
                aVar2.mo24154n(cVar);
                return true;
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public C2068a<?, Float> mo24189e() {
        return this.f6471n;
    }

    /* renamed from: f */
    public Matrix mo24190f() {
        float f;
        this.f6458a.reset();
        C2068a<?, PointF> aVar = this.f6464g;
        if (aVar != null) {
            PointF h = aVar.mo24148h();
            float f2 = h.x;
            if (!(f2 == 0.0f && h.y == 0.0f)) {
                this.f6458a.preTranslate(f2, h.y);
            }
        }
        C2068a<Float, Float> aVar2 = this.f6466i;
        if (aVar2 != null) {
            if (aVar2 instanceof C2089p) {
                f = aVar2.mo24148h().floatValue();
            } else {
                f = ((C2076c) aVar2).mo24164p();
            }
            if (f != 0.0f) {
                this.f6458a.preRotate(f);
            }
        }
        if (this.f6468k != null) {
            C2076c cVar = this.f6469l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.mo24164p()) + 90.0f)));
            C2076c cVar2 = this.f6469l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.mo24164p()) + 90.0f)));
            m8619d();
            float[] fArr = this.f6462e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f6459b.setValues(fArr);
            m8619d();
            float[] fArr2 = this.f6462e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f6468k.mo24164p()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f6460c.setValues(fArr2);
            m8619d();
            float[] fArr3 = this.f6462e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f6461d.setValues(fArr3);
            this.f6460c.preConcat(this.f6459b);
            this.f6461d.preConcat(this.f6460c);
            this.f6458a.preConcat(this.f6461d);
        }
        C2068a<C1400d, C1400d> aVar3 = this.f6465h;
        if (aVar3 != null) {
            C1400d h2 = aVar3.mo24148h();
            if (!(h2.mo16822b() == 1.0f && h2.mo16823c() == 1.0f)) {
                this.f6458a.preScale(h2.mo16822b(), h2.mo16823c());
            }
        }
        C2068a<PointF, PointF> aVar4 = this.f6463f;
        if (aVar4 != null) {
            PointF h3 = aVar4.mo24148h();
            float f4 = h3.x;
            if (!(f4 == 0.0f && h3.y == 0.0f)) {
                this.f6458a.preTranslate(-f4, -h3.y);
            }
        }
        return this.f6458a;
    }

    /* renamed from: g */
    public Matrix mo24191g(float f) {
        C2068a<?, PointF> aVar = this.f6464g;
        PointF pointF = null;
        PointF h = aVar == null ? null : aVar.mo24148h();
        C2068a<C1400d, C1400d> aVar2 = this.f6465h;
        C1400d h2 = aVar2 == null ? null : aVar2.mo24148h();
        this.f6458a.reset();
        if (h != null) {
            this.f6458a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = (double) f;
            this.f6458a.preScale((float) Math.pow((double) h2.mo16822b(), d), (float) Math.pow((double) h2.mo16823c(), d));
        }
        C2068a<Float, Float> aVar3 = this.f6466i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo24148h().floatValue();
            C2068a<PointF, PointF> aVar4 = this.f6463f;
            if (aVar4 != null) {
                pointF = aVar4.mo24148h();
            }
            Matrix matrix = this.f6458a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f6458a;
    }

    @Nullable
    /* renamed from: h */
    public C2068a<?, Integer> mo24192h() {
        return this.f6467j;
    }

    @Nullable
    /* renamed from: i */
    public C2068a<?, Float> mo24193i() {
        return this.f6470m;
    }

    /* renamed from: j */
    public void mo24194j(float f) {
        C2068a<Integer, Integer> aVar = this.f6467j;
        if (aVar != null) {
            aVar.mo24153m(f);
        }
        C2068a<?, Float> aVar2 = this.f6470m;
        if (aVar2 != null) {
            aVar2.mo24153m(f);
        }
        C2068a<?, Float> aVar3 = this.f6471n;
        if (aVar3 != null) {
            aVar3.mo24153m(f);
        }
        C2068a<PointF, PointF> aVar4 = this.f6463f;
        if (aVar4 != null) {
            aVar4.mo24153m(f);
        }
        C2068a<?, PointF> aVar5 = this.f6464g;
        if (aVar5 != null) {
            aVar5.mo24153m(f);
        }
        C2068a<C1400d, C1400d> aVar6 = this.f6465h;
        if (aVar6 != null) {
            aVar6.mo24153m(f);
        }
        C2068a<Float, Float> aVar7 = this.f6466i;
        if (aVar7 != null) {
            aVar7.mo24153m(f);
        }
        C2076c cVar = this.f6468k;
        if (cVar != null) {
            cVar.mo24153m(f);
        }
        C2076c cVar2 = this.f6469l;
        if (cVar2 != null) {
            cVar2.mo24153m(f);
        }
    }
}
