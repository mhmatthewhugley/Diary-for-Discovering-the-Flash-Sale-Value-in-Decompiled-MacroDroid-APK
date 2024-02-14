package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    @NonNull
    /* renamed from: a */
    static CornerTreatment m69250a(int i) {
        if (i == 0) {
            return new RoundedCornerTreatment();
        }
        if (i != 1) {
            return m69251b();
        }
        return new CutCornerTreatment();
    }

    @NonNull
    /* renamed from: b */
    static CornerTreatment m69251b() {
        return new RoundedCornerTreatment();
    }

    @NonNull
    /* renamed from: c */
    static EdgeTreatment m69252c() {
        return new EdgeTreatment();
    }

    /* renamed from: d */
    public static void m69253d(@NonNull View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).mo58655Z(f);
        }
    }

    /* renamed from: e */
    public static void m69254e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            m69255f(view, (MaterialShapeDrawable) background);
        }
    }

    /* renamed from: f */
    public static void m69255f(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.mo58650R()) {
            materialShapeDrawable.mo58660e0(ViewUtils.m68841h(view));
        }
    }
}
