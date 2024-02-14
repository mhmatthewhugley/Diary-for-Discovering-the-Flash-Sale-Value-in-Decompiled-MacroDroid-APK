package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f48531a = new float[9];

    /* renamed from: b */
    private final float[] f48532b = new float[9];

    /* renamed from: c */
    private final Matrix f48533c = new Matrix();

    @NonNull
    /* renamed from: a */
    public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f48531a);
        matrix2.getValues(this.f48532b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f48532b;
            float f2 = fArr[i];
            float[] fArr2 = this.f48531a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f48533c.setValues(this.f48532b);
        return this.f48533c;
    }
}
