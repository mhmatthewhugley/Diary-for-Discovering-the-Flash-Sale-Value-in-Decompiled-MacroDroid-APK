package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.C10462R;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

@RequiresApi(21)
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {

    static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        AlwaysStatefulMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        public boolean isStateful() {
            return true;
        }
    }

    FloatingActionButtonImplLollipop(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    @NonNull
    /* renamed from: j0 */
    private Animator m68589j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f49436w, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f49436w, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(FloatingActionButtonImpl.f49404D);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo57941A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo57943C() {
        mo57973f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo57945E(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f49436w.isEnabled()) {
            this.f49436w.setElevation(this.f49421h);
            if (this.f49436w.isPressed()) {
                this.f49436w.setTranslationZ(this.f49423j);
            } else if (this.f49436w.isFocused() || this.f49436w.isHovered()) {
                this.f49436w.setTranslationZ(this.f49422i);
            } else {
                this.f49436w.setTranslationZ(0.0f);
            }
        } else {
            this.f49436w.setElevation(0.0f);
            this.f49436w.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo57946F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f49436w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(FloatingActionButtonImpl.f49405E, m68589j0(f, f3));
            stateListAnimator.addState(FloatingActionButtonImpl.f49406F, m68589j0(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.f49407G, m68589j0(f, f2));
            stateListAnimator.addState(FloatingActionButtonImpl.f49408H, m68589j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f49436w, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f49436w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f49436w, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(FloatingActionButtonImpl.f49404D);
            stateListAnimator.addState(FloatingActionButtonImpl.f49409I, animatorSet);
            stateListAnimator.addState(FloatingActionButtonImpl.f49410J, m68589j0(0.0f, 0.0f));
            this.f49436w.setStateListAnimator(stateListAnimator);
        }
        if (mo57966Z()) {
            mo57973f0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo57951K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo57962V(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f49416c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.m69155d(colorStateList));
        } else {
            super.mo57962V(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo57966Z() {
        return this.f49437x.mo57934a() || !mo57967b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo57969d0() {
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i0 */
    public BorderDrawable mo58002i0(int i, ColorStateList colorStateList) {
        Context context = this.f49436w.getContext();
        BorderDrawable borderDrawable = new BorderDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.f49414a));
        borderDrawable.mo57789e(ContextCompat.getColor(context, C10462R.C10463color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, C10462R.C10463color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, C10462R.C10463color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, C10462R.C10463color.design_fab_stroke_end_outer_color));
        borderDrawable.mo57787d((float) i);
        borderDrawable.mo57786c(colorStateList);
        return borderDrawable;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: l */
    public MaterialShapeDrawable mo57976l() {
        return new AlwaysStatefulMaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.f49414a));
    }

    /* renamed from: n */
    public float mo57978n() {
        return this.f49436w.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo57982s(@NonNull Rect rect) {
        if (this.f49437x.mo57934a()) {
            super.mo57982s(rect);
        } else if (!mo57967b0()) {
            int sizeDimension = (this.f49424k - this.f49436w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo57987x(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable l = mo57976l();
        this.f49415b = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f49415b.setTintMode(mode);
        }
        this.f49415b.mo58649P(this.f49436w.getContext());
        if (i > 0) {
            this.f49417d = mo58002i0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f49417d), (Drawable) Preconditions.checkNotNull(this.f49415b)});
        } else {
            this.f49417d = null;
            drawable = this.f49415b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m69155d(colorStateList2), drawable, (Drawable) null);
        this.f49416c = rippleDrawable;
        this.f49418e = rippleDrawable;
    }
}
