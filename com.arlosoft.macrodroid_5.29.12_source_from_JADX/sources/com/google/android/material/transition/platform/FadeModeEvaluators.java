package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
class FadeModeEvaluators {

    /* renamed from: a */
    private static final FadeModeEvaluator f50929a = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59481a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70261a(255, TransitionUtils.m70379n(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final FadeModeEvaluator f50930b = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59481a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70262b(TransitionUtils.m70379n(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final FadeModeEvaluator f50931c = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59481a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70262b(TransitionUtils.m70379n(255, 0, f2, f3, f), TransitionUtils.m70379n(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final FadeModeEvaluator f50932d = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59481a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return FadeModeResult.m70262b(TransitionUtils.m70379n(255, 0, f2, f5, f), TransitionUtils.m70379n(0, 255, f5, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    /* renamed from: a */
    static FadeModeEvaluator m70256a(int i, boolean z) {
        if (i == 0) {
            return z ? f50929a : f50930b;
        }
        if (i == 1) {
            return z ? f50930b : f50929a;
        }
        if (i == 2) {
            return f50931c;
        }
        if (i == 3) {
            return f50932d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
