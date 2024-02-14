package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.transition.TransitionValues;
import com.google.android.material.C10462R;

public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    @AttrRes

    /* renamed from: f */
    private static final int f50900f = C10462R.attr.motionDurationLong1;
    @AttrRes

    /* renamed from: g */
    private static final int f50901g = C10462R.attr.motionEasingStandard;

    public MaterialFadeThrough() {
        super(m70203g(), m70204h());
    }

    /* renamed from: g */
    private static FadeThroughProvider m70203g() {
        return new FadeThroughProvider();
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70204h() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.mo59476e(false);
        scaleProvider.mo59475d(0.92f);
        return scaleProvider;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59473d(boolean z) {
        return f50900f;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59474e(boolean z) {
        return f50901g;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
