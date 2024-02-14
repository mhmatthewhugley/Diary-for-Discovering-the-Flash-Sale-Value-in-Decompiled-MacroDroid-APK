package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

@RequiresApi(21)
class MaskEvaluator {

    /* renamed from: a */
    private final Path f50960a = new Path();

    /* renamed from: b */
    private final Path f50961b = new Path();

    /* renamed from: c */
    private final Path f50962c = new Path();

    /* renamed from: d */
    private final ShapeAppearancePathProvider f50963d = ShapeAppearancePathProvider.m69330k();

    /* renamed from: e */
    private ShapeAppearanceModel f50964e;

    MaskEvaluator() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59494a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f50960a);
            return;
        }
        canvas.clipPath(this.f50961b);
        canvas.clipPath(this.f50962c, Region.Op.UNION);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo59495b(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel o = TransitionUtils.m70380o(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.mo59509d(), progressThresholds.mo59508c(), f);
        this.f50964e = o;
        this.f50963d.mo58734d(o, 1.0f, rectF2, this.f50961b);
        this.f50963d.mo58734d(this.f50964e, 1.0f, rectF3, this.f50962c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f50960a.op(this.f50961b, this.f50962c, Path.Op.UNION);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ShapeAppearanceModel mo59496c() {
        return this.f50964e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Path mo59497d() {
        return this.f50960a;
    }
}
