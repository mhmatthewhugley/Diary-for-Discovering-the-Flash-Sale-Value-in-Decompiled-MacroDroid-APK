package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
interface FitModeEvaluator {
    /* renamed from: a */
    FitModeResult mo59489a(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    /* renamed from: b */
    boolean mo59490b(FitModeResult fitModeResult);

    /* renamed from: c */
    void mo59491c(RectF rectF, float f, FitModeResult fitModeResult);
}
