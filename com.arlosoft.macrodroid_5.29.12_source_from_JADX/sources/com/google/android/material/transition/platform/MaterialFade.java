package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;

@RequiresApi(21)
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    @AttrRes

    /* renamed from: f */
    private static final int f51061f = C10462R.attr.motionDurationShort2;
    @AttrRes

    /* renamed from: g */
    private static final int f51062g = C10462R.attr.motionDurationShort1;
    @AttrRes

    /* renamed from: o */
    private static final int f51063o = C10462R.attr.motionEasingLinear;

    public MaterialFade() {
        super(m70336g(), m70337h());
    }

    /* renamed from: g */
    private static FadeProvider m70336g() {
        FadeProvider fadeProvider = new FadeProvider();
        fadeProvider.mo59484d(0.3f);
        return fadeProvider;
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70337h() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.mo59527e(false);
        scaleProvider.mo59526d(0.8f);
        return scaleProvider;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo59523c(boolean z) {
        return AnimationUtils.f48521a;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59524d(boolean z) {
        return z ? f51061f : f51062g;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59525e(boolean z) {
        return f51063o;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
