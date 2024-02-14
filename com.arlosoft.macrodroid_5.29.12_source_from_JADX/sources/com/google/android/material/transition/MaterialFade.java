package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.transition.TransitionValues;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;

public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    @AttrRes

    /* renamed from: f */
    private static final int f50897f = C10462R.attr.motionDurationShort2;
    @AttrRes

    /* renamed from: g */
    private static final int f50898g = C10462R.attr.motionDurationShort1;
    @AttrRes

    /* renamed from: o */
    private static final int f50899o = C10462R.attr.motionEasingLinear;

    public MaterialFade() {
        super(m70198g(), m70199h());
    }

    /* renamed from: g */
    private static FadeProvider m70198g() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.mo59452d(0.3f);
        return fadeProvider;
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70199h() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.mo59476e(false);
        scaleProvider.mo59475d(0.8f);
        return scaleProvider;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo59472c(boolean z) {
        return AnimationUtils.f48521a;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59473d(boolean z) {
        return z ? f50897f : f50898g;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59474e(boolean z) {
        return f50899o;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
