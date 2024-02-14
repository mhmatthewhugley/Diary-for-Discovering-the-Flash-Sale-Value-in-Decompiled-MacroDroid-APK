package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

class MaskEvaluator {

    /* renamed from: a */
    private final Path f50808a = new Path();

    /* renamed from: b */
    private final Path f50809b = new Path();

    /* renamed from: c */
    private final Path f50810c = new Path();

    /* renamed from: d */
    private final ShapeAppearancePathProvider f50811d = ShapeAppearancePathProvider.m69330k();

    /* renamed from: e */
    private ShapeAppearanceModel f50812e;

    MaskEvaluator() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59460a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f50808a);
            return;
        }
        canvas.clipPath(this.f50809b);
        canvas.clipPath(this.f50810c, Region.Op.UNION);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo59461b(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel n = TransitionUtils.m70241n(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.mo59466d(), progressThresholds.mo59465c(), f);
        this.f50812e = n;
        this.f50811d.mo58734d(n, 1.0f, rectF2, this.f50809b);
        this.f50811d.mo58734d(this.f50812e, 1.0f, rectF3, this.f50810c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f50808a.op(this.f50809b, this.f50810c, Path.Op.UNION);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ShapeAppearanceModel mo59462c() {
        return this.f50812e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Path mo59463d() {
        return this.f50808a;
    }
}
