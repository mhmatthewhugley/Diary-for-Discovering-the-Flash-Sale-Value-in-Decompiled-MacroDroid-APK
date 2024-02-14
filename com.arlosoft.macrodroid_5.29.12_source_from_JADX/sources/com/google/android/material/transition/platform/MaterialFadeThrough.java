package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.RequiresApi;
import com.google.android.material.C10462R;

@RequiresApi(21)
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    @AttrRes

    /* renamed from: f */
    private static final int f51064f = C10462R.attr.motionDurationLong1;
    @AttrRes

    /* renamed from: g */
    private static final int f51065g = C10462R.attr.motionEasingStandard;

    public MaterialFadeThrough() {
        super(m70341g(), m70342h());
    }

    /* renamed from: g */
    private static FadeThroughProvider m70341g() {
        return new FadeThroughProvider();
    }

    /* renamed from: h */
    private static VisibilityAnimatorProvider m70342h() {
        ScaleProvider scaleProvider = new ScaleProvider();
        scaleProvider.mo59527e(false);
        scaleProvider.mo59526d(0.92f);
        return scaleProvider;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59524d(boolean z) {
        return f51064f;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59525e(boolean z) {
        return f51065g;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
