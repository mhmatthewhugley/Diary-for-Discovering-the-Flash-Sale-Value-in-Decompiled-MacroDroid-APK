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
import p050v.C2126i;
import p050v.C2138q;
import p051w.C2140a;

/* renamed from: q.n */
/* compiled from: PolystarContent */
public class C2061n implements C2060m, C2068a.C2070b, C2057k {

    /* renamed from: a */
    private final Path f6370a = new Path();

    /* renamed from: b */
    private final String f6371b;

    /* renamed from: c */
    private final C1472f f6372c;

    /* renamed from: d */
    private final C2126i.C2127a f6373d;

    /* renamed from: e */
    private final boolean f6374e;

    /* renamed from: f */
    private final C2068a<?, Float> f6375f;

    /* renamed from: g */
    private final C2068a<?, PointF> f6376g;

    /* renamed from: h */
    private final C2068a<?, Float> f6377h;
    @Nullable

    /* renamed from: i */
    private final C2068a<?, Float> f6378i;

    /* renamed from: j */
    private final C2068a<?, Float> f6379j;
    @Nullable

    /* renamed from: k */
    private final C2068a<?, Float> f6380k;

    /* renamed from: l */
    private final C2068a<?, Float> f6381l;

    /* renamed from: m */
    private C2048b f6382m = new C2048b();

    /* renamed from: n */
    private boolean f6383n;

    /* renamed from: q.n$a */
    /* compiled from: PolystarContent */
    static /* synthetic */ class C2062a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6384a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                v.i$a[] r0 = p050v.C2126i.C2127a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6384a = r0
                v.i$a r1 = p050v.C2126i.C2127a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6384a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.i$a r1 = p050v.C2126i.C2127a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p045q.C2061n.C2062a.<clinit>():void");
        }
    }

    public C2061n(C1472f fVar, C2140a aVar, C2126i iVar) {
        this.f6372c = fVar;
        this.f6371b = iVar.mo24284d();
        C2126i.C2127a j = iVar.mo24290j();
        this.f6373d = j;
        this.f6374e = iVar.mo24291k();
        C2068a<Float, Float> a = iVar.mo24287g().mo24228a();
        this.f6375f = a;
        C2068a<PointF, PointF> a2 = iVar.mo24288h().mo24228a();
        this.f6376g = a2;
        C2068a<Float, Float> a3 = iVar.mo24289i().mo24228a();
        this.f6377h = a3;
        C2068a<Float, Float> a4 = iVar.mo24285e().mo24228a();
        this.f6379j = a4;
        C2068a<Float, Float> a5 = iVar.mo24286f().mo24228a();
        this.f6381l = a5;
        C2126i.C2127a aVar2 = C2126i.C2127a.STAR;
        if (j == aVar2) {
            this.f6378i = iVar.mo24282b().mo24228a();
            this.f6380k = iVar.mo24283c().mo24228a();
        } else {
            this.f6378i = null;
            this.f6380k = null;
        }
        aVar.mo24347i(a);
        aVar.mo24347i(a2);
        aVar.mo24347i(a3);
        aVar.mo24347i(a4);
        aVar.mo24347i(a5);
        if (j == aVar2) {
            aVar.mo24347i(this.f6378i);
            aVar.mo24347i(this.f6380k);
        }
        a.mo24142a(this);
        a2.mo24142a(this);
        a3.mo24142a(this);
        a4.mo24142a(this);
        a5.mo24142a(this);
        if (j == aVar2) {
            this.f6378i.mo24142a(this);
            this.f6380k.mo24142a(this);
        }
    }

    /* renamed from: f */
    private void m8512f() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) this.f6375f.mo24148h().floatValue());
        C2068a<?, Float> aVar = this.f6377h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo24148h().floatValue()) - 90.0d);
        double d4 = (double) floor;
        float floatValue = this.f6381l.mo24148h().floatValue() / 100.0f;
        float floatValue2 = this.f6379j.mo24148h().floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f6370a.moveTo(cos, sin);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.f6370a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f6370a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF h = this.f6376g.mo24148h();
        this.f6370a.offset(h.x, h.y);
        this.f6370a.close();
    }

    /* renamed from: h */
    private void m8513h() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float floatValue = this.f6375f.mo24148h().floatValue();
        C2068a<?, Float> aVar = this.f6377h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo24148h().floatValue()) - 90.0d);
        double d4 = (double) floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((float) ((int) floatValue));
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f12) * f11);
        }
        float floatValue2 = this.f6379j.mo24148h().floatValue();
        float floatValue3 = this.f6378i.mo24148h().floatValue();
        C2068a<?, Float> aVar2 = this.f6380k;
        float floatValue4 = aVar2 != null ? aVar2.mo24148h().floatValue() / 100.0f : 0.0f;
        C2068a<?, Float> aVar3 = this.f6381l;
        float floatValue5 = aVar3 != null ? aVar3.mo24148h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = (double) f;
            d = d4;
            f3 = (float) (d5 * Math.cos(radians));
            f2 = (float) (d5 * Math.sin(radians));
            this.f6370a.moveTo(f3, f2);
            d2 = radians + ((double) ((f10 * f12) / 2.0f));
        } else {
            d = d4;
            i = i2;
            double d6 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f6370a.moveTo(cos, sin);
            d2 = radians + ((double) f11);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        float f13 = floatValue2;
        float f14 = floatValue3;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f15 = z ? f13 : f14;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f10;
                    f5 = f11;
                } else {
                    f4 = f10;
                    f5 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f11;
                    d3 = d7;
                    f7 = f15;
                } else {
                    f6 = f11;
                    d3 = d7;
                    f7 = f;
                }
                double d8 = (double) f7;
                double d9 = ceil;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f6370a.lineTo(cos2, sin2);
                    f9 = floatValue4;
                    f8 = f;
                } else {
                    f9 = floatValue4;
                    f8 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float sin3 = (float) Math.sin(atan2);
                    float cos3 = (float) Math.cos(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f9 : floatValue5;
                    float f17 = z ? floatValue5 : f9;
                    float f18 = (z ? f14 : f13) * f16 * 0.47829f;
                    float f19 = cos3 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? f13 : f14) * f17 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d3 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.f6370a.cubicTo(f3 - f19, f2 - f20, cos2 + f22, sin2 + f23, cos2, sin2);
                }
                d2 += (double) f5;
                z = !z;
                i3++;
                f3 = cos2;
                f2 = sin2;
                floatValue4 = f9;
                f = f8;
                f11 = f6;
                f10 = f4;
                ceil = d9;
            } else {
                PointF h = this.f6376g.mo24148h();
                this.f6370a.offset(h.x, h.y);
                this.f6370a.close();
                return;
            }
        }
    }

    /* renamed from: i */
    private void m8514i() {
        this.f6383n = false;
        this.f6372c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo24123a() {
        m8514i();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2049c cVar = list.get(i);
            if (cVar instanceof C2067s) {
                C2067s sVar = (C2067s) cVar;
                if (sVar.mo24140i() == C2138q.C2139a.SIMULTANEOUSLY) {
                    this.f6382m.mo24129a(sVar);
                    sVar.mo24136c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        C2068a<?, Float> aVar;
        C2068a<?, Float> aVar2;
        if (t == C1492k.f1006u) {
            this.f6375f.mo24154n(cVar);
        } else if (t == C1492k.f1007v) {
            this.f6377h.mo24154n(cVar);
        } else if (t == C1492k.f997l) {
            this.f6376g.mo24154n(cVar);
        } else if (t == C1492k.f1008w && (aVar2 = this.f6378i) != null) {
            aVar2.mo24154n(cVar);
        } else if (t == C1492k.f1009x) {
            this.f6379j.mo24154n(cVar);
        } else if (t == C1492k.f1010y && (aVar = this.f6380k) != null) {
            aVar.mo24154n(cVar);
        } else if (t == C1492k.f1011z) {
            this.f6381l.mo24154n(cVar);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C0009g.m70m(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f6371b;
    }

    public Path getPath() {
        if (this.f6383n) {
            return this.f6370a;
        }
        this.f6370a.reset();
        if (this.f6374e) {
            this.f6383n = true;
            return this.f6370a;
        }
        int i = C2062a.f6384a[this.f6373d.ordinal()];
        if (i == 1) {
            m8513h();
        } else if (i == 2) {
            m8512f();
        }
        this.f6370a.close();
        this.f6382m.mo24130b(this.f6370a);
        this.f6383n = true;
        return this.f6370a;
    }
}
