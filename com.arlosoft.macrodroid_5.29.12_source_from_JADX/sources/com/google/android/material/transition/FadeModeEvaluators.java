package com.google.android.material.transition;

class FadeModeEvaluators {

    /* renamed from: a */
    private static final FadeModeEvaluator f50777a = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59449a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70136a(255, TransitionUtils.m70240m(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final FadeModeEvaluator f50778b = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59449a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70137b(TransitionUtils.m70240m(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final FadeModeEvaluator f50779c = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59449a(float f, float f2, float f3, float f4) {
            return FadeModeResult.m70137b(TransitionUtils.m70240m(255, 0, f2, f3, f), TransitionUtils.m70240m(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final FadeModeEvaluator f50780d = new FadeModeEvaluator() {
        /* renamed from: a */
        public FadeModeResult mo59449a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return FadeModeResult.m70137b(TransitionUtils.m70240m(255, 0, f2, f5, f), TransitionUtils.m70240m(0, 255, f5, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    /* renamed from: a */
    static FadeModeEvaluator m70131a(int i, boolean z) {
        if (i == 0) {
            return z ? f50777a : f50778b;
        }
        if (i == 1) {
            return z ? f50778b : f50777a;
        }
        if (i == 2) {
            return f50779c;
        }
        if (i == 3) {
            return f50780d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
