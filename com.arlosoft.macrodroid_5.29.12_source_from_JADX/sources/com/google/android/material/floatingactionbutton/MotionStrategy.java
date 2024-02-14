package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.Nullable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

interface MotionStrategy {
    /* renamed from: a */
    void mo57847a();

    @Nullable
    /* renamed from: b */
    MotionSpec mo57772b();

    /* renamed from: c */
    boolean mo57848c();

    /* renamed from: d */
    void mo57773d();

    @AnimatorRes
    /* renamed from: e */
    int mo57849e();

    /* renamed from: f */
    void mo57774f();

    /* renamed from: g */
    void mo57775g(@Nullable MotionSpec motionSpec);

    /* renamed from: h */
    AnimatorSet mo57776h();

    /* renamed from: i */
    List<Animator.AnimatorListener> mo57777i();

    /* renamed from: j */
    void mo57850j(@Nullable ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    void onAnimationStart(Animator animator);
}
