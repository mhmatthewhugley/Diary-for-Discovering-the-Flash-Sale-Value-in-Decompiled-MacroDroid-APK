package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: a */
    private final Runnable f50674a;

    /* renamed from: c */
    private int f50675c;

    /* renamed from: d */
    private MaterialShapeDrawable f50676d;

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private Drawable m70006a() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f50676d = materialShapeDrawable;
        materialShapeDrawable.mo58654Y(new RelativeCornerSize(0.5f));
        this.f50676d.mo58656a0(ColorStateList.valueOf(-1));
        return this.f50676d;
    }

    /* renamed from: d */
    private static boolean m70007d(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: g */
    private void m70008g() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f50674a);
            handler.post(this.f50674a);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        m70008g();
    }

    @Dimension
    /* renamed from: b */
    public int mo59376b() {
        return this.f50675c;
    }

    /* renamed from: c */
    public void mo59350c(@Dimension int i) {
        this.f50675c = i;
        mo59377f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo59377f() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m70007d(getChildAt(i2))) {
                i++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone((ConstraintLayout) this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C10462R.C10465id.circle_center;
            if (id != i4 && !m70007d(childAt)) {
                constraintSet.constrainCircle(childAt.getId(), i4, this.f50675c, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        constraintSet.applyTo(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo59377f();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m70008g();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.f50676d.mo58656a0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C10462R.C10467layout.material_radial_view_group, this);
        ViewCompat.setBackground(this, m70006a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.RadialViewGroup, i, 0);
        this.f50675c = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f50674a = new Runnable() {
            public void run() {
                RadialViewGroup.this.mo59377f();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
