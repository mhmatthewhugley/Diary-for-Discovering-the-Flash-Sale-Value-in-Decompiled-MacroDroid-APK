package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public interface VisibilityAnimatorProvider {
    @Nullable
    /* renamed from: a */
    Animator mo59482a(@NonNull ViewGroup viewGroup, @NonNull View view);

    @Nullable
    /* renamed from: b */
    Animator mo59483b(@NonNull ViewGroup viewGroup, @NonNull View view);
}
