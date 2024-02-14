package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StateListAnimator {

    /* renamed from: a */
    private final ArrayList<Tuple> f49631a = new ArrayList<>();
    @Nullable

    /* renamed from: b */
    private Tuple f49632b = null;
    @Nullable

    /* renamed from: c */
    ValueAnimator f49633c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f49634d = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f49633c == animator) {
                stateListAnimator.f49633c = null;
            }
        }
    };

    static class Tuple {

        /* renamed from: a */
        final int[] f49636a;

        /* renamed from: b */
        final ValueAnimator f49637b;

        Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.f49636a = iArr;
            this.f49637b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m68787b() {
        ValueAnimator valueAnimator = this.f49633c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49633c = null;
        }
    }

    /* renamed from: e */
    private void m68788e(@NonNull Tuple tuple) {
        ValueAnimator valueAnimator = tuple.f49637b;
        this.f49633c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo58205a(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.f49634d);
        this.f49631a.add(tuple);
    }

    /* renamed from: c */
    public void mo58206c() {
        ValueAnimator valueAnimator = this.f49633c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f49633c = null;
        }
    }

    /* renamed from: d */
    public void mo58207d(int[] iArr) {
        Tuple tuple;
        int size = this.f49631a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tuple = null;
                break;
            }
            tuple = this.f49631a.get(i);
            if (StateSet.stateSetMatches(tuple.f49636a, iArr)) {
                break;
            }
            i++;
        }
        Tuple tuple2 = this.f49632b;
        if (tuple != tuple2) {
            if (tuple2 != null) {
                m68787b();
            }
            this.f49632b = tuple;
            if (tuple != null) {
                m68788e(tuple);
            }
        }
    }
}
