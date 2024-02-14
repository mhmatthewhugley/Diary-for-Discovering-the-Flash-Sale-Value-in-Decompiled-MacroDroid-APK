package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.Nullable;

class AnimatorTracker {
    @Nullable

    /* renamed from: a */
    private Animator f49318a;

    AnimatorTracker() {
    }

    /* renamed from: a */
    public void mo57769a() {
        Animator animator = this.f49318a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo57770b() {
        this.f49318a = null;
    }

    /* renamed from: c */
    public void mo57771c(Animator animator) {
        mo57769a();
        this.f49318a = animator;
    }
}
