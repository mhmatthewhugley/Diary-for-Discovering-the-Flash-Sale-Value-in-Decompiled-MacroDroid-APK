package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: h */
    private static final int f49294h = C10462R.style.Widget_MaterialComponents_MaterialDivider;
    @NonNull

    /* renamed from: a */
    private Drawable f49295a;

    /* renamed from: b */
    private int f49296b;
    @ColorInt

    /* renamed from: c */
    private int f49297c;

    /* renamed from: d */
    private int f49298d;

    /* renamed from: e */
    private int f49299e;

    /* renamed from: f */
    private int f49300f;

    /* renamed from: g */
    private final Rect f49301g;

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, C10462R.attr.materialDividerStyle, i);
    }

    /* renamed from: a */
    private void m68377a(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int i3 = i2 + this.f49299e;
        int i4 = i - this.f49300f;
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f49301g);
            int round = this.f49301g.right + Math.round(childAt.getTranslationX());
            this.f49295a.setBounds((round - this.f49295a.getIntrinsicWidth()) - this.f49296b, i3, round, i4);
            this.f49295a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m68378b(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        boolean z = true;
        if (ViewCompat.getLayoutDirection(recyclerView) != 1) {
            z = false;
        }
        int i3 = i2 + (z ? this.f49300f : this.f49299e);
        int i4 = i - (z ? this.f49299e : this.f49300f);
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f49301g);
            int round = this.f49301g.bottom + Math.round(childAt.getTranslationY());
            this.f49295a.setBounds(i3, (round - this.f49295a.getIntrinsicHeight()) - this.f49296b, i4, round);
            this.f49295a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: c */
    public void mo57756c(@ColorInt int i) {
        this.f49297c = i;
        Drawable wrap = DrawableCompat.wrap(this.f49295a);
        this.f49295a = wrap;
        DrawableCompat.setTint(wrap, i);
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (this.f49298d == 1) {
            rect.bottom = this.f49295a.getIntrinsicHeight() + this.f49296b;
        } else {
            rect.right = this.f49295a.getIntrinsicWidth() + this.f49296b;
        }
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null) {
            if (this.f49298d == 1) {
                m68378b(canvas, recyclerView);
            } else {
                m68377a(canvas, recyclerView);
            }
        }
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.f49298d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.f49301g = new Rect();
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.MaterialDivider, i, f49294h, new int[0]);
        this.f49297c = MaterialResources.m69121a(context, h, C10462R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f49296b = h.getDimensionPixelSize(C10462R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C10462R.dimen.material_divider_thickness));
        this.f49299e = h.getDimensionPixelOffset(C10462R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f49300f = h.getDimensionPixelOffset(C10462R.styleable.MaterialDivider_dividerInsetEnd, 0);
        h.recycle();
        this.f49295a = new ShapeDrawable();
        mo57756c(this.f49297c);
        setOrientation(i2);
    }
}
