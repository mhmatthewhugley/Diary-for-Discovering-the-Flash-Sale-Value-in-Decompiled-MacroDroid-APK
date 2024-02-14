package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {

    /* renamed from: G */
    private DrawingDelegate<S> f49870G;

    /* renamed from: H */
    private IndeterminateAnimatorDelegate<ObjectAnimator> f49871H;

    IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        mo58573v(drawingDelegate);
        mo58572u(indeterminateAnimatorDelegate);
    }

    @NonNull
    /* renamed from: q */
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> m69052q(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec), new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    /* renamed from: r */
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> m69053r(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f49897g == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec));
    }

    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f49870G.mo58564g(canvas, mo58555g());
            this.f49870G.mo58504c(canvas, this.f49852D);
            int i = 0;
            while (true) {
                IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate = this.f49871H;
                int[] iArr = indeterminateAnimatorDelegate.f49869c;
                if (i < iArr.length) {
                    DrawingDelegate<S> drawingDelegate = this.f49870G;
                    Paint paint = this.f49852D;
                    float[] fArr = indeterminateAnimatorDelegate.f49868b;
                    int i2 = i * 2;
                    drawingDelegate.mo58503b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f49870G.mo58505d();
    }

    public int getIntrinsicWidth() {
        return this.f49870G.mo58506e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo58537h() {
        return super.mo58537h();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo58538i() {
        return super.mo58538i();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo58540j() {
        return super.mo58540j();
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ boolean mo58542o(boolean z, boolean z2, boolean z3) {
        return super.mo58542o(z, z2, z3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo58544p(boolean z, boolean z2, boolean z3) {
        boolean p = super.mo58544p(z, z2, z3);
        if (!isRunning()) {
            this.f49871H.mo58507a();
        }
        float a = this.f49856d.mo58463a(this.f49854a.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.f49871H.mo58511g();
        }
        return p;
    }

    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: s */
    public IndeterminateAnimatorDelegate<ObjectAnimator> mo58570s() {
        return this.f49871H;
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: t */
    public DrawingDelegate<S> mo58571t() {
        return this.f49870G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo58572u(@NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.f49871H = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.mo58566e(this);
    }

    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo58573v(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.f49870G = drawingDelegate;
        drawingDelegate.mo58563f(this);
    }
}
