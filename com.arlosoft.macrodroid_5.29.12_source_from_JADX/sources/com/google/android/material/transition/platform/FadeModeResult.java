package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
class FadeModeResult {

    /* renamed from: a */
    final int f50933a;

    /* renamed from: b */
    final int f50934b;

    /* renamed from: c */
    final boolean f50935c;

    private FadeModeResult(int i, int i2, boolean z) {
        this.f50933a = i;
        this.f50934b = i2;
        this.f50935c = z;
    }

    /* renamed from: a */
    static FadeModeResult m70261a(int i, int i2) {
        return new FadeModeResult(i, i2, true);
    }

    /* renamed from: b */
    static FadeModeResult m70262b(int i, int i2) {
        return new FadeModeResult(i, i2, false);
    }
}
