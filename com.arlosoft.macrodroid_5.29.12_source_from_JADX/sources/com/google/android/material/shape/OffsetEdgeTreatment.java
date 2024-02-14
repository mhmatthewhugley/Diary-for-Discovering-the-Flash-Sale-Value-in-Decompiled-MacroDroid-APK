package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    private final EdgeTreatment f50033a;

    /* renamed from: b */
    private final float f50034b;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f) {
        this.f50033a = edgeTreatment;
        this.f50034b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo58635a() {
        return this.f50033a.mo58635a();
    }

    /* renamed from: b */
    public void mo56905b(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        this.f50033a.mo56905b(f, f2 - this.f50034b, f3, shapePath);
    }
}
