package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.math.MathUtils;

public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {

        /* renamed from: b */
        public static final TypeEvaluator<RevealInfo> f49083b = new CircularRevealEvaluator();

        /* renamed from: a */
        private final RevealInfo f49084a = new RevealInfo();

        @NonNull
        /* renamed from: a */
        public RevealInfo evaluate(float f, @NonNull RevealInfo revealInfo, @NonNull RevealInfo revealInfo2) {
            this.f49084a.mo57528b(MathUtils.m68855d(revealInfo.f49087a, revealInfo2.f49087a, f), MathUtils.m68855d(revealInfo.f49088b, revealInfo2.f49088b, f), MathUtils.m68855d(revealInfo.f49089c, revealInfo2.f49089c, f));
            return this.f49084a;
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, RevealInfo> f49085a = new CircularRevealProperty("circularReveal");

        private CircularRevealProperty(String str) {
            super(RevealInfo.class, str);
        }

        @Nullable
        /* renamed from: a */
        public RevealInfo get(@NonNull CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        /* renamed from: b */
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @Nullable RevealInfo revealInfo) {
            circularRevealWidget.setRevealInfo(revealInfo);
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, Integer> f49086a = new CircularRevealScrimColorProperty("circularRevealScrimColor");

        private CircularRevealScrimColorProperty(String str) {
            super(Integer.class, str);
        }

        @NonNull
        /* renamed from: a */
        public Integer get(@NonNull CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(@NonNull CircularRevealWidget circularRevealWidget, @NonNull Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class RevealInfo {

        /* renamed from: a */
        public float f49087a;

        /* renamed from: b */
        public float f49088b;

        /* renamed from: c */
        public float f49089c;

        private RevealInfo() {
        }

        /* renamed from: a */
        public boolean mo57527a() {
            return this.f49089c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void mo57528b(float f, float f2, float f3) {
            this.f49087a = f;
            this.f49088b = f2;
            this.f49089c = f3;
        }

        /* renamed from: c */
        public void mo57529c(@NonNull RevealInfo revealInfo) {
            mo57528b(revealInfo.f49087a, revealInfo.f49088b, revealInfo.f49089c);
        }

        public RevealInfo(float f, float f2, float f3) {
            this.f49087a = f;
            this.f49088b = f2;
            this.f49089c = f3;
        }

        public RevealInfo(@NonNull RevealInfo revealInfo) {
            this(revealInfo.f49087a, revealInfo.f49088b, revealInfo.f49089c);
        }
    }

    /* renamed from: a */
    void mo57486a();

    /* renamed from: b */
    void mo57487b();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    RevealInfo getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i);

    void setRevealInfo(@Nullable RevealInfo revealInfo);
}
