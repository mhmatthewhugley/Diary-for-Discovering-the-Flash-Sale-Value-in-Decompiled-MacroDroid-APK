package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.C10462R;

public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f48527a = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @NonNull
    /* renamed from: a */
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C10462R.C10465id.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C10462R.C10465id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
