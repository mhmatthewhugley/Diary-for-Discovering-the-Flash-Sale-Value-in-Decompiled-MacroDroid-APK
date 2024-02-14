package com.google.android.material.transition;

class FadeModeResult {

    /* renamed from: a */
    final int f50781a;

    /* renamed from: b */
    final int f50782b;

    /* renamed from: c */
    final boolean f50783c;

    private FadeModeResult(int i, int i2, boolean z) {
        this.f50781a = i;
        this.f50782b = i2;
        this.f50783c = z;
    }

    /* renamed from: a */
    static FadeModeResult m70136a(int i, int i2) {
        return new FadeModeResult(i, i2, true);
    }

    /* renamed from: b */
    static FadeModeResult m70137b(int i, int i2) {
        return new FadeModeResult(i, i2, false);
    }
}
