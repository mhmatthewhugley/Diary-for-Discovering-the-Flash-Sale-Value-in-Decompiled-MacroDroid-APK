package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.C10462R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {

    /* renamed from: I */
    private static final int f49379I = C10462R.style.Widget_Design_FloatingActionButton;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f49380A;

    /* renamed from: B */
    private int f49381B;

    /* renamed from: C */
    boolean f49382C;

    /* renamed from: D */
    final Rect f49383D;

    /* renamed from: E */
    private final Rect f49384E;
    @NonNull

    /* renamed from: F */
    private final AppCompatImageHelper f49385F;
    @NonNull

    /* renamed from: G */
    private final ExpandableWidgetHelper f49386G;

    /* renamed from: H */
    private FloatingActionButtonImpl f49387H;
    @Nullable

    /* renamed from: c */
    private ColorStateList f49388c;
    @Nullable

    /* renamed from: d */
    private PorterDuff.Mode f49389d;
    @Nullable

    /* renamed from: f */
    private ColorStateList f49390f;
    @Nullable

    /* renamed from: g */
    private PorterDuff.Mode f49391g;
    @Nullable

    /* renamed from: o */
    private ColorStateList f49392o;

    /* renamed from: p */
    private int f49393p;

    /* renamed from: s */
    private int f49394s;

    /* renamed from: z */
    private int f49395z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo57931a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ boolean mo57932d(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo57933e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class OnVisibilityChangedListener {
        /* renamed from: a */
        public void mo56886a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo56887b(FloatingActionButton floatingActionButton) {
        }
    }

    private class ShadowDelegateImpl implements ShadowViewDelegate {
        ShadowDelegateImpl() {
        }

        /* renamed from: a */
        public boolean mo57934a() {
            return FloatingActionButton.this.f49382C;
        }

        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f49383D.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f49380A, i2 + FloatingActionButton.this.f49380A, i3 + FloatingActionButton.this.f49380A, i4 + FloatingActionButton.this.f49380A);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {
        @NonNull

        /* renamed from: a */
        private final TransformationCallback<T> f49402a;

        TransformationCallbackWrapper(@NonNull TransformationCallback<T> transformationCallback) {
            this.f49402a = transformationCallback;
        }

        /* renamed from: a */
        public void mo57937a() {
            this.f49402a.mo56608b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo57938b() {
            this.f49402a.mo56607a(FloatingActionButton.this);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof TransformationCallbackWrapper) && ((TransformationCallbackWrapper) obj).f49402a.equals(this.f49402a);
        }

        public int hashCode() {
            return this.f49402a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.floatingActionButtonStyle);
    }

    private FloatingActionButtonImpl getImpl() {
        if (this.f49387H == null) {
            this.f49387H = m68480h();
        }
        return this.f49387H;
    }

    @NonNull
    /* renamed from: h */
    private FloatingActionButtonImpl m68480h() {
        return new FloatingActionButtonImplLollipop(this, new ShadowDelegateImpl());
    }

    /* renamed from: k */
    private int m68481k(int i) {
        int i2 = this.f49395z;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C10462R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C10462R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m68481k(1);
        } else {
            return m68481k(0);
        }
    }

    /* renamed from: q */
    private void m68482q(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f49383D;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: r */
    private void m68483r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f49390f;
            if (colorStateList == null) {
                DrawableCompat.clearColorFilter(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f49391g;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
        }
    }

    /* renamed from: s */
    private static int m68484s(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    /* renamed from: w */
    private FloatingActionButtonImpl.InternalVisibilityChangedListener m68485w(@Nullable final OnVisibilityChangedListener onVisibilityChangedListener) {
        if (onVisibilityChangedListener == null) {
            return null;
        }
        return new FloatingActionButtonImpl.InternalVisibilityChangedListener() {
            /* renamed from: a */
            public void mo57929a() {
                onVisibilityChangedListener.mo56887b(FloatingActionButton.this);
            }

            /* renamed from: b */
            public void mo57930b() {
                onVisibilityChangedListener.mo56886a(FloatingActionButton.this);
            }
        };
    }

    /* renamed from: c */
    public boolean mo57763c() {
        return this.f49386G.mo57765c();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo57945E(getDrawableState());
    }

    /* renamed from: e */
    public void mo57861e(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().mo57970e(animatorListener);
    }

    /* renamed from: f */
    public void mo57862f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().mo57972f(animatorListener);
    }

    /* renamed from: g */
    public void mo57863g(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        getImpl().mo57974g(new TransformationCallbackWrapper(transformationCallback));
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f49388c;
    }

    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f49389d;
    }

    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo57978n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo57981q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo57983t();
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().mo57977m();
    }

    @C0144Px
    public int getCustomSize() {
        return this.f49395z;
    }

    public int getExpandedComponentIdHint() {
        return this.f49386G.mo57764b();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return getImpl().mo57980p();
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f49392o;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f49392o;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) Preconditions.checkNotNull(getImpl().mo57984u());
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return getImpl().mo57985v();
    }

    public int getSize() {
        return this.f49394s;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m68481k(this.f49394s);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f49390f;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f49391g;
    }

    public boolean getUseCompatPadding() {
        return this.f49382C;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo57879i(@NonNull Rect rect) {
        if (!ViewCompat.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m68482q(rect);
        return true;
    }

    /* renamed from: j */
    public void mo57880j(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m68482q(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo57941A();
    }

    /* renamed from: l */
    public void mo57882l() {
        mo57883m((OnVisibilityChangedListener) null);
    }

    /* renamed from: m */
    public void mo57883m(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        mo57884n(onVisibilityChangedListener, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo57884n(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().mo57986w(m68485w(onVisibilityChangedListener), z);
    }

    /* renamed from: o */
    public boolean mo57885o() {
        return getImpl().mo57988y();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo57942B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo57944D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f49380A = (sizeDimension - this.f49381B) / 2;
        getImpl().mo57973f0();
        int min = Math.min(m68484s(sizeDimension, i), m68484s(sizeDimension, i2));
        Rect rect = this.f49383D;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f49386G.mo57766d((Bundle) Preconditions.checkNotNull(extendableSavedState.f50294a.get("expandableWidgetHelper")));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f50294a.put("expandableWidgetHelper", this.f49386G.mo57767e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo57879i(this.f49384E) || this.f49384E.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo57892p() {
        return getImpl().mo57989z();
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49388c != colorStateList) {
            this.f49388c = colorStateList;
            getImpl().mo57952L(colorStateList);
        }
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f49389d != mode) {
            this.f49389d = mode;
            getImpl().mo57953M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo57954N(f);
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo57957Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo57961U(f);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@C0144Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f49395z) {
            this.f49395z = i;
            requestLayout();
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo57975g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo57979o()) {
            getImpl().mo57955O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.f49386G.mo57768f(i);
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().mo57956P(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo57971e0();
            if (this.f49390f != null) {
                m68483r();
            }
        }
    }

    public void setImageResource(@DrawableRes int i) {
        this.f49385F.setImageResource(i);
        m68483r();
    }

    public void setMaxImageSize(int i) {
        this.f49381B = i;
        getImpl().mo57959S(i);
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo57949I();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo57949I();
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo57963W(z);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().mo57964X(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().mo57965Y(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setSize(int i) {
        this.f49395z = 0;
        if (i != this.f49394s) {
            this.f49394s = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49390f != colorStateList) {
            this.f49390f = colorStateList;
            m68483r();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f49391g != mode) {
            this.f49391g = mode;
            m68483r();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo57950J();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo57950J();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo57950J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f49382C != z) {
            this.f49382C = z;
            getImpl().mo57943C();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public void mo57926t() {
        mo57927u((OnVisibilityChangedListener) null);
    }

    /* renamed from: u */
    public void mo57927u(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        mo57928v(onVisibilityChangedListener, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo57928v(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        getImpl().mo57968c0(m68485w(onVisibilityChangedListener), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f49398a;

        /* renamed from: b */
        private OnVisibilityChangedListener f49399b;

        /* renamed from: c */
        private boolean f49400c;

        public BaseBehavior() {
            this.f49400c = true;
        }

        /* renamed from: b */
        private static boolean m68502b(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: c */
        private void m68503c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f49383D;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= layoutParams.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= layoutParams.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    ViewCompat.offsetTopAndBottom(floatingActionButton, i2);
                }
                if (i != 0) {
                    ViewCompat.offsetLeftAndRight(floatingActionButton, i);
                }
            }
        }

        /* renamed from: f */
        private boolean m68504f(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (this.f49400c && layoutParams.getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private boolean m68505g(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!m68504f(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f49398a == null) {
                this.f49398a = new Rect();
            }
            Rect rect = this.f49398a;
            DescendantOffsetUtils.m68712a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo57884n(this.f49399b, false);
                return true;
            }
            floatingActionButton.mo57928v(this.f49399b, false);
            return true;
        }

        /* renamed from: h */
        private boolean m68506h(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!m68504f(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo57884n(this.f49399b, false);
                return true;
            }
            floatingActionButton.mo57928v(this.f49399b, false);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f49383D;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m68505g(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m68502b(view)) {
                return false;
            } else {
                m68506h(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: e */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m68502b(view) && m68506h(view, floatingActionButton)) {
                        break;
                    }
                } else if (m68505g(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            m68503c(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.FloatingActionButton_Behavior_Layout);
            this.f49400c = obtainStyledAttributes.getBoolean(C10462R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f49379I
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f49383D = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f49384E = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.m69121a(r11, r0, r1)
            r10.f49388c = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.m68843j(r1, r3)
            r10.f49389d = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.m69121a(r11, r0, r1)
            r10.f49392o = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f49394s = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f49395z = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f49393p = r1
            int r1 = com.google.android.material.C10462R.styleable.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.google.android.material.C10462R.styleable.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.google.android.material.C10462R.styleable.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.google.android.material.C10462R.styleable.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f49382C = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = com.google.android.material.C10462R.dimen.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.google.android.material.C10462R.styleable.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = com.google.android.material.C10462R.styleable.FloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.m67235c(r11, r0, r5)
            int r8 = com.google.android.material.C10462R.styleable.FloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r8 = com.google.android.material.animation.MotionSpec.m67235c(r11, r0, r8)
            com.google.android.material.shape.CornerSize r9 = com.google.android.material.shape.ShapeAppearanceModel.f50037m
            com.google.android.material.shape.ShapeAppearanceModel$Builder r11 = com.google.android.material.shape.ShapeAppearanceModel.m69266g(r11, r12, r13, r6, r9)
            com.google.android.material.shape.ShapeAppearanceModel r11 = r11.mo58721m()
            int r6 = com.google.android.material.C10462R.styleable.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = com.google.android.material.C10462R.styleable.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.AppCompatImageHelper r0 = new androidx.appcompat.widget.AppCompatImageHelper
            r0.<init>(r10)
            r10.f49385F = r0
            r0.loadFromAttributes(r12, r13)
            com.google.android.material.expandable.ExpandableWidgetHelper r12 = new com.google.android.material.expandable.ExpandableWidgetHelper
            r12.<init>(r10)
            r10.f49386G = r12
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r12 = r10.getImpl()
            r12.mo57964X(r11)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f49388c
            android.graphics.PorterDuff$Mode r13 = r10.f49389d
            android.content.res.ColorStateList r0 = r10.f49392o
            int r7 = r10.f49393p
            r11.mo57987x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57960T(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57954N(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57957Q(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57961U(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57965Y(r5)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57956P(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.mo57955O(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f49392o != colorStateList) {
            this.f49392o = colorStateList;
            getImpl().mo57962V(this.f49392o);
        }
    }
}
