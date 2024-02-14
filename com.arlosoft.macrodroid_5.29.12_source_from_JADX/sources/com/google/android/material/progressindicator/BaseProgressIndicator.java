package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {

    /* renamed from: F */
    static final int f49794F = C10462R.style.Widget_MaterialComponents_ProgressIndicator;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f49795A = 4;

    /* renamed from: B */
    private final Runnable f49796B = new Runnable() {
        public void run() {
            BaseProgressIndicator.this.m68954k();
        }
    };

    /* renamed from: C */
    private final Runnable f49797C = new Runnable() {
        public void run() {
            BaseProgressIndicator.this.m68953j();
            long unused = BaseProgressIndicator.this.f49806p = -1;
        }
    };

    /* renamed from: D */
    private final Animatable2Compat.AnimationCallback f49798D = new Animatable2Compat.AnimationCallback() {
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.mo58477o(baseProgressIndicator.f49801c, BaseProgressIndicator.this.f49802d);
        }
    };

    /* renamed from: E */
    private final Animatable2Compat.AnimationCallback f49799E = new Animatable2Compat.AnimationCallback() {
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!BaseProgressIndicator.this.f49808z) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f49795A);
            }
        }
    };

    /* renamed from: a */
    S f49800a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f49801c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f49802d;

    /* renamed from: f */
    private boolean f49803f;

    /* renamed from: g */
    private final int f49804g;

    /* renamed from: o */
    private final int f49805o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f49806p = -1;

    /* renamed from: s */
    AnimatorDurationScaleProvider f49807s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f49808z = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    protected BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(MaterialThemeOverlay.m69957c(context, attributeSet, i, f49794F), attributeSet, i);
        Context context2 = getContext();
        this.f49800a = mo58474i(context2, attributeSet);
        TypedArray h = ThemeEnforcement.m68822h(context2, attributeSet, C10462R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.f49804g = h.getInt(C10462R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f49805o = Math.min(h.getInt(C10462R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        h.recycle();
        this.f49807s = new AnimatorDurationScaleProvider();
        this.f49803f = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo58571t();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo58550u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m68953j() {
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).mo58542o(false, false, true);
        if (m68955m()) {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m68954k() {
        if (this.f49805o > 0) {
            this.f49806p = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m68955m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    /* renamed from: n */
    private void m68956n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo58570s().mo58509d(this.f49798D);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.f49799E);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.f49799E);
        }
    }

    /* renamed from: p */
    private void m68957p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.f49799E);
            getIndeterminateDrawable().mo58570s().mo58512h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.f49799E);
        }
    }

    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f49800a.f49818f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f49800a.f49815c;
    }

    public int getShowAnimationBehavior() {
        return this.f49800a.f49817e;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f49800a.f49816d;
    }

    @C0144Px
    public int getTrackCornerRadius() {
        return this.f49800a.f49814b;
    }

    @C0144Px
    public int getTrackThickness() {
        return this.f49800a.f49813a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo58473h(boolean z) {
        if (this.f49803f) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).mo58542o(mo58484q(), false, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract S mo58474i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo58476l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo58477o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f49801c = i;
            this.f49802d = z;
            this.f49808z = true;
            if (!getIndeterminateDrawable().isVisible() || this.f49807s.mo58463a(getContext().getContentResolver()) == 0.0f) {
                this.f49798D.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo58570s().mo58510f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m68956n();
        if (mo58484q()) {
            m68954k();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f49797C);
        removeCallbacks(this.f49796B);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).mo58537h();
        m68957p();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        DrawingDelegate currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo58506e();
            int d = currentDrawingDelegate.mo58505d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        mo58473h(i == 0);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo58473h(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo58484q() {
        return ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0 && mo58476l();
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f49807s = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f49856d = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f49856d = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f49800a.f49818f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.mo58537h();
            }
            super.setIndeterminate(z);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.mo58542o(mo58484q(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && mo58484q()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).mo58570s().mo58511g();
            }
            this.f49808z = false;
        }
    }

    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).mo58537h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.m68102b(getContext(), C10462R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f49800a.f49815c = iArr;
            getIndeterminateDrawable().mo58570s().mo58508c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo58477o(i, false);
        }
    }

    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.mo58537h();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.mo58552y(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f49800a.f49817e = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        S s = this.f49800a;
        if (s.f49816d != i) {
            s.f49816d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@C0144Px int i) {
        S s = this.f49800a;
        if (s.f49814b != i) {
            s.f49814b = Math.min(i, s.f49813a / 2);
        }
    }

    public void setTrackThickness(@C0144Px int i) {
        S s = this.f49800a;
        if (s.f49813a != i) {
            s.f49813a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f49795A = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
