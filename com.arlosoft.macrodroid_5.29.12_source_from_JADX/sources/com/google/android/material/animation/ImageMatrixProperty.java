package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f48530a = new Matrix();

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @NonNull
    /* renamed from: a */
    public Matrix get(@NonNull ImageView imageView) {
        this.f48530a.set(imageView.getImageMatrix());
        return this.f48530a;
    }

    /* renamed from: b */
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
