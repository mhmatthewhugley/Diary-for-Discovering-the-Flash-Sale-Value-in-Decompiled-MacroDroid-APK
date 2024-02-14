package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* renamed from: a */
    S f49865a;

    /* renamed from: b */
    protected DrawableWithAnimatedVisibilityChange f49866b;

    public DrawingDelegate(S s) {
        this.f49865a = s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo58502a(@NonNull Canvas canvas, @FloatRange(from = 0.0d, mo592to = 1.0d) float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo58503b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @ColorInt int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo58504c(@NonNull Canvas canvas, @NonNull Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo58505d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo58506e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo58563f(@NonNull DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.f49866b = drawableWithAnimatedVisibilityChange;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo58564g(@NonNull Canvas canvas, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f49865a.mo58501e();
        mo58502a(canvas, f);
    }
}
