package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: a */
    private final P f51068a;
    @Nullable

    /* renamed from: c */
    private VisibilityAnimatorProvider f51069c;

    /* renamed from: d */
    private final List<VisibilityAnimatorProvider> f51070d = new ArrayList();

    protected MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f51068a = p;
        this.f51069c = visibilityAnimatorProvider;
    }

    /* renamed from: a */
    private static void m70347a(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (visibilityAnimatorProvider != null) {
            if (z) {
                animator = visibilityAnimatorProvider.mo59483b(viewGroup, view);
            } else {
                animator = visibilityAnimatorProvider.mo59482a(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: b */
    private Animator m70348b(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m70347a(arrayList, this.f51068a, viewGroup, view, z);
        m70347a(arrayList, this.f51069c, viewGroup, view, z);
        for (VisibilityAnimatorProvider a : this.f51070d) {
            m70347a(arrayList, a, viewGroup, view, z);
        }
        m70349f(viewGroup.getContext(), z);
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: f */
    private void m70349f(@NonNull Context context, boolean z) {
        TransitionUtils.m70381p(this, context, mo59524d(z));
        TransitionUtils.m70382q(this, context, mo59525e(z), mo59523c(z));
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo59523c(boolean z) {
        return AnimationUtils.f48522b;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59524d(boolean z) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59525e(boolean z) {
        return 0;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70348b(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70348b(viewGroup, view, false);
    }
}
