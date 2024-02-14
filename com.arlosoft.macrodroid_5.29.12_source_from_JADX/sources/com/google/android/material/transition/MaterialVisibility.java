package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.List;

abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {

    /* renamed from: a */
    private final P f50904a;
    @Nullable

    /* renamed from: c */
    private VisibilityAnimatorProvider f50905c;

    /* renamed from: d */
    private final List<VisibilityAnimatorProvider> f50906d = new ArrayList();

    protected MaterialVisibility(P p, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f50904a = p;
        this.f50905c = visibilityAnimatorProvider;
    }

    /* renamed from: a */
    private static void m70209a(List<Animator> list, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        if (visibilityAnimatorProvider != null) {
            if (z) {
                animator = visibilityAnimatorProvider.mo59451b(viewGroup, view);
            } else {
                animator = visibilityAnimatorProvider.mo59450a(viewGroup, view);
            }
            if (animator != null) {
                list.add(animator);
            }
        }
    }

    /* renamed from: b */
    private Animator m70210b(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m70209a(arrayList, this.f50904a, viewGroup, view, z);
        m70209a(arrayList, this.f50905c, viewGroup, view, z);
        for (VisibilityAnimatorProvider a : this.f50906d) {
            m70209a(arrayList, a, viewGroup, view, z);
        }
        m70211f(viewGroup.getContext(), z);
        AnimatorSetCompat.m67223a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: f */
    private void m70211f(@NonNull Context context, boolean z) {
        TransitionUtils.m70242o(this, context, mo59473d(z));
        TransitionUtils.m70243p(this, context, mo59474e(z), mo59472c(z));
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo59472c(boolean z) {
        return AnimationUtils.f48522b;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: d */
    public int mo59473d(boolean z) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @AttrRes
    /* renamed from: e */
    public int mo59474e(boolean z) {
        return 0;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70210b(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m70210b(viewGroup, view, false);
    }
}
