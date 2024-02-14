package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {

    /* renamed from: L */
    private static final FloatPropertyCompat<DeterminateDrawable> f49842L = new FloatPropertyCompat<DeterminateDrawable>("indicatorLevel") {
        /* renamed from: a */
        public float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.m69007v() * 10000.0f;
        }

        /* renamed from: b */
        public void setValue(DeterminateDrawable determinateDrawable, float f) {
            determinateDrawable.m69008x(f / 10000.0f);
        }
    };

    /* renamed from: G */
    private DrawingDelegate<S> f49843G;

    /* renamed from: H */
    private final SpringForce f49844H;

    /* renamed from: I */
    private final SpringAnimation f49845I;

    /* renamed from: J */
    private float f49846J;

    /* renamed from: K */
    private boolean f49847K = false;

    DeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        mo58551w(drawingDelegate);
        SpringForce springForce = new SpringForce();
        this.f49844H = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f49842L);
        this.f49845I = springAnimation;
        springAnimation.setSpring(springForce);
        mo58556l(1.0f);
    }

    @NonNull
    /* renamed from: s */
    public static DeterminateDrawable<CircularProgressIndicatorSpec> m69005s(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    /* renamed from: t */
    public static DeterminateDrawable<LinearProgressIndicatorSpec> m69006t(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public float m69007v() {
        return this.f49846J;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m69008x(float f) {
        this.f49846J = f;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f49843G.mo58564g(canvas, mo58555g());
            this.f49843G.mo58504c(canvas, this.f49852D);
            Canvas canvas2 = canvas;
            this.f49843G.mo58503b(canvas2, this.f49852D, 0.0f, m69007v(), MaterialColors.m68101a(this.f49855c.f49815c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f49843G.mo58505d();
    }

    public int getIntrinsicWidth() {
        return this.f49843G.mo58506e();
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

    public void jumpToCurrentState() {
        this.f49845I.skipToEnd();
        m69008x(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ boolean mo58542o(boolean z, boolean z2, boolean z3) {
        return super.mo58542o(z, z2, z3);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f49847K) {
            this.f49845I.skipToEnd();
            m69008x(((float) i) / 10000.0f);
            return true;
        }
        this.f49845I.setStartValue(m69007v() * 10000.0f);
        this.f49845I.animateToFinalPosition((float) i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo58544p(boolean z, boolean z2, boolean z3) {
        boolean p = super.mo58544p(z, z2, z3);
        float a = this.f49856d.mo58463a(this.f49854a.getContentResolver());
        if (a == 0.0f) {
            this.f49847K = true;
        } else {
            this.f49847K = false;
            this.f49844H.setStiffness(50.0f / a);
        }
        return p;
    }

    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
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
    /* renamed from: u */
    public DrawingDelegate<S> mo58550u() {
        return this.f49843G;
    }

    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo58551w(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.f49843G = drawingDelegate;
        drawingDelegate.mo58563f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo58552y(float f) {
        setLevel((int) (f * 10000.0f));
    }
}
