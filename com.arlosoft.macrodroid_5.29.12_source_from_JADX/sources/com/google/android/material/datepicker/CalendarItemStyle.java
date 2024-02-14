package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

final class CalendarItemStyle {
    @NonNull

    /* renamed from: a */
    private final Rect f49127a;

    /* renamed from: b */
    private final ColorStateList f49128b;

    /* renamed from: c */
    private final ColorStateList f49129c;

    /* renamed from: d */
    private final ColorStateList f49130d;

    /* renamed from: e */
    private final int f49131e;

    /* renamed from: f */
    private final ShapeAppearanceModel f49132f;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, @NonNull Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f49127a = rect;
        this.f49128b = colorStateList2;
        this.f49129c = colorStateList;
        this.f49130d = colorStateList3;
        this.f49131e = i;
        this.f49132f = shapeAppearanceModel;
    }

    @NonNull
    /* renamed from: a */
    static CalendarItemStyle m68129a(@NonNull Context context, @StyleRes int i) {
        Preconditions.checkArgument(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10462R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C10462R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C10462R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C10462R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C10462R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = MaterialResources.m69121a(context, obtainStyledAttributes, C10462R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel m = ShapeAppearanceModel.m69261b(context, obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo58721m();
        obtainStyledAttributes.recycle();
        return new CalendarItemStyle(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo57565b() {
        return this.f49127a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo57566c() {
        return this.f49127a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo57567d(@NonNull TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f49132f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f49132f);
        materialShapeDrawable.mo58656a0(this.f49129c);
        materialShapeDrawable.mo58673l0((float) this.f49131e, this.f49130d);
        textView.setTextColor(this.f49128b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f49128b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f49127a;
        ViewCompat.setBackground(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
