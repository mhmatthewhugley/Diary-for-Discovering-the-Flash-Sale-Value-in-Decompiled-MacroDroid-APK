package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

public class DrawableAlphaProperty extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f48528b = new DrawableAlphaProperty();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f48529a = new WeakHashMap<>();

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Nullable
    /* renamed from: a */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
