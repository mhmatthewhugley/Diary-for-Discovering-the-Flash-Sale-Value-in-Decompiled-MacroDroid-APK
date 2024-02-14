package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* renamed from: a */
    private float f48768a;

    /* renamed from: c */
    private float f48769c;

    /* renamed from: d */
    private float f48770d;

    /* renamed from: f */
    private float f48771f;

    /* renamed from: g */
    private float f48772g;

    /* renamed from: o */
    private float f48773o = -1.0f;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.f48769c = f;
        this.f48768a = f2;
        mo56912k(f3);
        this.f48772g = 0.0f;
    }

    /* renamed from: b */
    public void mo56905b(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = f;
        ShapePath shapePath2 = shapePath;
        float f7 = this.f48770d;
        if (f7 == 0.0f) {
            shapePath2.mo58744m(f6, 0.0f);
            return;
        }
        float f8 = ((this.f48769c * 2.0f) + f7) / 2.0f;
        float f9 = f3 * this.f48768a;
        float f10 = f2 + this.f48772g;
        float f11 = (this.f48771f * f3) + ((1.0f - f3) * f8);
        if (f11 / f8 >= 1.0f) {
            shapePath2.mo58744m(f6, 0.0f);
            return;
        }
        float f12 = this.f48773o;
        float f13 = f12 * f3;
        boolean z = f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f;
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f11;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f4 + f9;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f10 - sqrt;
        float f17 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        shapePath2.mo58744m(f16, 0.0f);
        float f19 = f9 * 2.0f;
        float f20 = degrees;
        shapePath.mo58736a(f16 - f9, 0.0f, f16 + f9, f19, 270.0f, degrees);
        if (z) {
            shapePath.mo58736a(f10 - f8, (-f8) - f4, f10 + f8, f8 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f48769c;
            float f22 = f13 * 2.0f;
            float f23 = f10 - f8;
            shapePath.mo58736a(f23, -(f13 + f21), f23 + f21 + f22, f21 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f10 + f8;
            float f25 = this.f48769c;
            shapePath2.mo58744m(f24 - ((f25 / 2.0f) + f13), f25 + f13);
            float f26 = this.f48769c;
            shapePath.mo58736a(f24 - (f22 + f26), -(f13 + f26), f24, f26 + f13, 90.0f, f18 - 0.049804688f);
        }
        shapePath.mo58736a(f17 - f9, 0.0f, f17 + f9, f19, 270.0f - f20, f20);
        shapePath2.mo58744m(f6, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo56906c() {
        return this.f48771f;
    }

    /* renamed from: d */
    public float mo56907d() {
        return this.f48773o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo56908e() {
        return this.f48769c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo56909f() {
        return this.f48768a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public float mo56910g() {
        return this.f48770d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public float mo56911h() {
        return this.f48772g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo56912k(@FloatRange(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f48771f = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: l */
    public void mo56913l(float f) {
        this.f48773o = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo56914n(float f) {
        this.f48769c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo56915o(float f) {
        this.f48768a = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public void mo56916p(float f) {
        this.f48770d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo56917q(float f) {
        this.f48772g = f;
    }
}
