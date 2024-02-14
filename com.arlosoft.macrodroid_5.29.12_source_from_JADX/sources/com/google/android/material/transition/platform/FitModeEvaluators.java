package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class FitModeEvaluators {

    /* renamed from: a */
    private static final FitModeEvaluator f50952a = new FitModeEvaluator() {
        /* renamed from: a */
        public FitModeResult mo59489a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = TransitionUtils.m70378m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new FitModeResult(f8, f9, m, f5 * f8, m, f7 * f9);
        }

        /* renamed from: b */
        public boolean mo59490b(FitModeResult fitModeResult) {
            return fitModeResult.f50957d > fitModeResult.f50959f;
        }

        /* renamed from: c */
        public void mo59491c(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f50959f - fitModeResult.f50957d) * f;
        }
    };

    /* renamed from: b */
    private static final FitModeEvaluator f50953b = new FitModeEvaluator() {
        /* renamed from: a */
        public FitModeResult mo59489a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = TransitionUtils.m70378m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new FitModeResult(f8, f9, f4 * f8, m, f6 * f9, m);
        }

        /* renamed from: b */
        public boolean mo59490b(FitModeResult fitModeResult) {
            return fitModeResult.f50956c > fitModeResult.f50958e;
        }

        /* renamed from: c */
        public void mo59491c(RectF rectF, float f, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f50958e - fitModeResult.f50956c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    };

    private FitModeEvaluators() {
    }

    /* renamed from: a */
    static FitModeEvaluator m70273a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return m70274b(z, rectF, rectF2) ? f50952a : f50953b;
        }
        if (i == 1) {
            return f50952a;
        }
        if (i == 2) {
            return f50953b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i);
    }

    /* renamed from: b */
    private static boolean m70274b(boolean z, RectF rectF, RectF rectF2) {
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
