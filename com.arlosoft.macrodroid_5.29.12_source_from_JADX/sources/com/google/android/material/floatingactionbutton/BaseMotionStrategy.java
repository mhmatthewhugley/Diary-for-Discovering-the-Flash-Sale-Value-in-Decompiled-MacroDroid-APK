package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

abstract class BaseMotionStrategy implements MotionStrategy {

    /* renamed from: a */
    private final Context f49319a;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: b */
    public final ExtendedFloatingActionButton f49320b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f49321c = new ArrayList<>();

    /* renamed from: d */
    private final AnimatorTracker f49322d;
    @Nullable

    /* renamed from: e */
    private MotionSpec f49323e;
    @Nullable

    /* renamed from: f */
    private MotionSpec f49324f;

    BaseMotionStrategy(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.f49320b = extendedFloatingActionButton;
        this.f49319a = extendedFloatingActionButton.getContext();
        this.f49322d = animatorTracker;
    }

    @Nullable
    /* renamed from: b */
    public MotionSpec mo57772b() {
        return this.f49324f;
    }

    @CallSuper
    /* renamed from: d */
    public void mo57773d() {
        this.f49322d.mo57770b();
    }

    @CallSuper
    /* renamed from: f */
    public void mo57774f() {
        this.f49322d.mo57770b();
    }

    /* renamed from: g */
    public final void mo57775g(@Nullable MotionSpec motionSpec) {
        this.f49324f = motionSpec;
    }

    /* renamed from: h */
    public AnimatorSet mo57776h() {
        return mo57778l(mo57779m());
    }

    @NonNull
    /* renamed from: i */
    public final List<Animator.AnimatorListener> mo57777i() {
        return this.f49321c;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: l */
    public AnimatorSet mo57778l(@NonNull MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.mo56593j("opacity")) {
            arrayList.add(motionSpec.mo56588f("opacity", this.f49320b, View.ALPHA));
        }
        if (motionSpec.mo56593j("scale")) {
            arrayList.add(motionSpec.mo56588f("scale", this.f49320b, View.SCALE_Y));
            arrayList.add(motionSpec.mo56588f("scale", this.f49320b, View.SCALE_X));
        }
        if (motionSpec.mo56593j("width")) {
            arrayList.add(motionSpec.mo56588f("width", this.f49320b, ExtendedFloatingActionButton.f49344W));
        }
        if (motionSpec.mo56593j("height")) {
            arrayList.add(motionSpec.mo56588f("height", this.f49320b, ExtendedFloatingActionButton.f49345a0));
        }
        if (motionSpec.mo56593j("paddingStart")) {
            arrayList.add(motionSpec.mo56588f("paddingStart", this.f49320b, ExtendedFloatingActionButton.f49346b0));
        }
        if (motionSpec.mo56593j("paddingEnd")) {
            arrayList.add(motionSpec.mo56588f("paddingEnd", this.f49320b, ExtendedFloatingActionButton.f49347c0));
        }
        if (motionSpec.mo56593j("labelOpacity")) {
            arrayList.add(motionSpec.mo56588f("labelOpacity", this.f49320b, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") {
                /* renamed from: a */
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(AnimationUtils.m67220a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f49361U.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f49320b.f49361U.getDefaultColor())))));
                }

                /* renamed from: b */
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int colorForState = extendedFloatingActionButton.f49361U.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.f49320b.f49361U.getDefaultColor());
                    ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.m67220a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.mo57802D(extendedFloatingActionButton.f49361U);
                    } else {
                        extendedFloatingActionButton.mo57802D(valueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final MotionSpec mo57779m() {
        MotionSpec motionSpec = this.f49324f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f49323e == null) {
            this.f49323e = MotionSpec.m67236d(this.f49319a, mo57849e());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.f49323e);
    }

    @CallSuper
    public void onAnimationStart(Animator animator) {
        this.f49322d.mo57771c(animator);
    }
}
