package p304k7;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p304k7.C13401e;

/* renamed from: k7.c */
/* compiled from: FloatKeyframeSet */
class C13399c extends C13403f {

    /* renamed from: g */
    private float f61431g;

    /* renamed from: h */
    private float f61432h;

    /* renamed from: i */
    private float f61433i;

    /* renamed from: j */
    private boolean f61434j = true;

    public C13399c(C13401e.C13402a... aVarArr) {
        super(aVarArr);
    }

    /* renamed from: b */
    public Object mo70815b(float f) {
        return Float.valueOf(mo70818f(f));
    }

    /* renamed from: e */
    public C13399c clone() {
        ArrayList<C13401e> arrayList = this.f61444e;
        int size = arrayList.size();
        C13401e.C13402a[] aVarArr = new C13401e.C13402a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (C13401e.C13402a) arrayList.get(i).clone();
        }
        return new C13399c(aVarArr);
    }

    /* renamed from: f */
    public float mo70818f(float f) {
        int i = this.f61440a;
        if (i == 2) {
            if (this.f61434j) {
                this.f61434j = false;
                this.f61431g = ((C13401e.C13402a) this.f61444e.get(0)).mo70827k();
                float k = ((C13401e.C13402a) this.f61444e.get(1)).mo70827k();
                this.f61432h = k;
                this.f61433i = k - this.f61431g;
            }
            Interpolator interpolator = this.f61443d;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            C13407h hVar = this.f61445f;
            if (hVar == null) {
                return this.f61431g + (f * this.f61433i);
            }
            return ((Number) hVar.evaluate(f, Float.valueOf(this.f61431g), Float.valueOf(this.f61432h))).floatValue();
        } else if (f <= 0.0f) {
            C13401e.C13402a aVar = (C13401e.C13402a) this.f61444e.get(0);
            C13401e.C13402a aVar2 = (C13401e.C13402a) this.f61444e.get(1);
            float k2 = aVar.mo70827k();
            float k3 = aVar2.mo70827k();
            float b = aVar.mo70821b();
            float b2 = aVar2.mo70821b();
            Interpolator c = aVar2.mo70822c();
            if (c != null) {
                f = c.getInterpolation(f);
            }
            float f2 = (f - b) / (b2 - b);
            C13407h hVar2 = this.f61445f;
            return hVar2 == null ? k2 + (f2 * (k3 - k2)) : ((Number) hVar2.evaluate(f2, Float.valueOf(k2), Float.valueOf(k3))).floatValue();
        } else if (f >= 1.0f) {
            C13401e.C13402a aVar3 = (C13401e.C13402a) this.f61444e.get(i - 2);
            C13401e.C13402a aVar4 = (C13401e.C13402a) this.f61444e.get(this.f61440a - 1);
            float k4 = aVar3.mo70827k();
            float k5 = aVar4.mo70827k();
            float b3 = aVar3.mo70821b();
            float b4 = aVar4.mo70821b();
            Interpolator c2 = aVar4.mo70822c();
            if (c2 != null) {
                f = c2.getInterpolation(f);
            }
            float f3 = (f - b3) / (b4 - b3);
            C13407h hVar3 = this.f61445f;
            return hVar3 == null ? k4 + (f3 * (k5 - k4)) : ((Number) hVar3.evaluate(f3, Float.valueOf(k4), Float.valueOf(k5))).floatValue();
        } else {
            C13401e.C13402a aVar5 = (C13401e.C13402a) this.f61444e.get(0);
            int i2 = 1;
            while (true) {
                int i3 = this.f61440a;
                if (i2 >= i3) {
                    return ((Number) this.f61444e.get(i3 - 1).mo70824d()).floatValue();
                }
                C13401e.C13402a aVar6 = (C13401e.C13402a) this.f61444e.get(i2);
                if (f < aVar6.mo70821b()) {
                    Interpolator c3 = aVar6.mo70822c();
                    if (c3 != null) {
                        f = c3.getInterpolation(f);
                    }
                    float b5 = (f - aVar5.mo70821b()) / (aVar6.mo70821b() - aVar5.mo70821b());
                    float k6 = aVar5.mo70827k();
                    float k7 = aVar6.mo70827k();
                    C13407h hVar4 = this.f61445f;
                    return hVar4 == null ? k6 + (b5 * (k7 - k6)) : ((Number) hVar4.evaluate(b5, Float.valueOf(k6), Float.valueOf(k7))).floatValue();
                }
                i2++;
                aVar5 = aVar6;
            }
        }
    }
}
