package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbs {

    /* renamed from: a */
    public final int f27698a;

    public zzbs(int i, int i2) {
        this.f27698a = i2;
    }

    /* renamed from: a */
    public final int mo42935a() {
        int i = this.f27698a;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i != 42) {
            return i != 22 ? i != 23 ? 0 : 15 : BasicMeasure.EXACTLY;
        }
        return 16;
    }
}
