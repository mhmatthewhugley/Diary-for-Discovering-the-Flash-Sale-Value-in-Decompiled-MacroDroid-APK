package com.google.android.material.transition;

import android.graphics.RectF;

class FitModeEvaluators {

    /* renamed from: a */
    private static final FitModeEvaluator f50800a = new FitModeEvaluator() {
        /* renamed from: a */
        public FitModeResult mo59457a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float l = TransitionUtils.m70239l(f4, f6, f2, f3, f, true);
            float f8 = l / f4;
            float f9 = l / f6;
            return new FitModeResult(f8, f9, l, f5 * f8, l, f7 * f9);
        }

        /* renamed from: b */
        public boolean mo59458b(FitModeResult fitModeResult) {
            return fitModeResult.f50805d > fitModeResult.f50807f;
        }

        /* renamed from: c */
        public void mo59459c(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f50807f - fitModeResult.f50805d) * f;
        }
    };

    /* renamed from: b */
    private static final FitModeEvaluator f50801b = new FitModeEvaluator() {
        /* renamed from: a */
        public FitModeResult mo59457a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float l = TransitionUtils.m70239l(f5, f7, f2, f3, f, true);
            float f8 = l / f5;
            float f9 = l / f7;
            return new FitModeResult(f8, f9, f4 * f8, l, f6 * f9, l);
        }

        /* renamed from: b */
        public boolean mo59458b(FitModeResult fitModeResult) {
            return fitModeResult.f50804c > fitModeResult.f50806e;
        }

        /* renamed from: c */
        public void mo59459c(RectF rectF, float f, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f50806e - fitModeResult.f50804c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    };

    private FitModeEvaluators() {
    }

    /* renamed from: a */
    static FitModeEvaluator m70148a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return m70149b(z, rectF, rectF2) ? f50800a : f50801b;
        }
        if (i == 1) {
            return f50800a;
        }
        if (i == 2) {
            return f50801b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i);
    }

    /* renamed from: b */
    private static boolean m70149b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}
