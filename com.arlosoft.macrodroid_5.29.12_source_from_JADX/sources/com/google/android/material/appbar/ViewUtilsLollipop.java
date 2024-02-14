package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;

@RequiresApi(21)
class ViewUtilsLollipop {

    /* renamed from: a */
    private static final int[] f48655a = {16843848};

    ViewUtilsLollipop() {
    }

    /* renamed from: a */
    static void m67410a(@NonNull View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m67411b(@NonNull View view, float f) {
        int integer = view.getResources().getInteger(C10462R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, C10462R.attr.state_liftable, -C10462R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m67412c(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, f48655a, i, i2, new int[0]);
        try {
            if (h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h.getResourceId(0, 0)));
            }
        } finally {
            h.recycle();
        }
    }
}
