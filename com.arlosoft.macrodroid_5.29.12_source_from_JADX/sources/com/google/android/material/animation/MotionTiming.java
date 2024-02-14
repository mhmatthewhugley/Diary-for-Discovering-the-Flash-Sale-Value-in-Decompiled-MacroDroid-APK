package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MotionTiming {

    /* renamed from: a */
    private long f48536a;

    /* renamed from: b */
    private long f48537b;
    @Nullable

    /* renamed from: c */
    private TimeInterpolator f48538c;

    /* renamed from: d */
    private int f48539d;

    /* renamed from: e */
    private int f48540e;

    public MotionTiming(long j, long j2) {
        this.f48538c = null;
        this.f48539d = 0;
        this.f48540e = 1;
        this.f48536a = j;
        this.f48537b = j2;
    }

    @NonNull
    /* renamed from: b */
    static MotionTiming m67246b(@NonNull ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m67247f(valueAnimator));
        motionTiming.f48539d = valueAnimator.getRepeatCount();
        motionTiming.f48540e = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    /* renamed from: f */
    private static TimeInterpolator m67247f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return AnimationUtils.f48522b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return AnimationUtils.f48523c;
        }
        return interpolator instanceof DecelerateInterpolator ? AnimationUtils.f48524d : interpolator;
    }

    /* renamed from: a */
    public void mo56598a(@NonNull Animator animator) {
        animator.setStartDelay(mo56599c());
        animator.setDuration(mo56600d());
        animator.setInterpolator(mo56601e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo56603g());
            valueAnimator.setRepeatMode(mo56604h());
        }
    }

    /* renamed from: c */
    public long mo56599c() {
        return this.f48536a;
    }

    /* renamed from: d */
    public long mo56600d() {
        return this.f48537b;
    }

    @Nullable
    /* renamed from: e */
    public TimeInterpolator mo56601e() {
        TimeInterpolator timeInterpolator = this.f48538c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f48522b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (mo56599c() == motionTiming.mo56599c() && mo56600d() == motionTiming.mo56600d() && mo56603g() == motionTiming.mo56603g() && mo56604h() == motionTiming.mo56604h()) {
            return mo56601e().getClass().equals(motionTiming.mo56601e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo56603g() {
        return this.f48539d;
    }

    /* renamed from: h */
    public int mo56604h() {
        return this.f48540e;
    }

    public int hashCode() {
        return (((((((((int) (mo56599c() ^ (mo56599c() >>> 32))) * 31) + ((int) (mo56600d() ^ (mo56600d() >>> 32)))) * 31) + mo56601e().getClass().hashCode()) * 31) + mo56603g()) * 31) + mo56604h();
    }

    @NonNull
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo56599c() + " duration: " + mo56600d() + " interpolator: " + mo56601e().getClass() + " repeatCount: " + mo56603g() + " repeatMode: " + mo56604h() + "}\n";
    }

    public MotionTiming(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f48539d = 0;
        this.f48540e = 1;
        this.f48536a = j;
        this.f48537b = j2;
        this.f48538c = timeInterpolator;
    }
}
