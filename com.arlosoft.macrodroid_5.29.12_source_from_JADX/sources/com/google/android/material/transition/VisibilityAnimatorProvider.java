package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface VisibilityAnimatorProvider {
    @Nullable
    /* renamed from: a */
    Animator mo59450a(@NonNull ViewGroup viewGroup, @NonNull View view);

    @Nullable
    /* renamed from: b */
    Animator mo59451b(@NonNull ViewGroup viewGroup, @NonNull View view);
}
