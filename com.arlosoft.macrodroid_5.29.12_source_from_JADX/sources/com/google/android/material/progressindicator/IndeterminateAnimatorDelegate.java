package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* renamed from: a */
    protected IndeterminateDrawable f49867a;

    /* renamed from: b */
    protected final float[] f49868b;

    /* renamed from: c */
    protected final int[] f49869c;

    protected IndeterminateAnimatorDelegate(int i) {
        this.f49868b = new float[(i * 2)];
        this.f49869c = new int[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo58507a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo58565b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo58508c();

    /* renamed from: d */
    public abstract void mo58509d(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo58566e(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.f49867a = indeterminateDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo58510f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo58511g();

    /* renamed from: h */
    public abstract void mo58512h();
}
