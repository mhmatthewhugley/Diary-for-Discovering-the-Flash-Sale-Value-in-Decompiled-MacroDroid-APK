package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceViewHolder;
import androidx.recyclerview.widget.RecyclerView;

public class PreferenceCategory extends androidx.preference.PreferenceCategory {

    /* renamed from: d */
    private static final int[] f57638d = {R$attr.colorAccent};

    /* renamed from: a */
    protected int f57639a;

    /* renamed from: c */
    protected View f57640c;

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PreferenceCategory, i, 0);
        this.f57639a = obtainStyledAttributes.getColor(R$styleable.PreferenceCategory_pref_categoryColor, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m81930b(View view, boolean z) {
        RecyclerView.LayoutParams layoutParams;
        if (view != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
            boolean z2 = view.getTag() != null && layoutParams2.width == 0;
            if (view.getTag() == null) {
                layoutParams = new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams2);
                view.setTag(layoutParams);
            } else {
                layoutParams = (RecyclerView.LayoutParams) view.getTag();
            }
            if (z) {
                if (view.getVisibility() == 8 || z2) {
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    layoutParams2.leftMargin = layoutParams.leftMargin;
                    layoutParams2.rightMargin = layoutParams.rightMargin;
                    layoutParams2.topMargin = layoutParams.topMargin;
                    layoutParams2.bottomMargin = layoutParams.bottomMargin;
                    view.setVisibility(0);
                }
            } else if (view.getVisibility() == 0 || !z2) {
                layoutParams2.width = 0;
                layoutParams2.height = 0;
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                view.setVisibility(8);
            }
        }
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        this.f57640c = preferenceViewHolder.itemView;
        TextView textView = (TextView) preferenceViewHolder.findViewById(16908310);
        if (textView != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f57638d);
            if (obtainStyledAttributes.length() > 0 && obtainStyledAttributes.getIndexCount() > 0) {
                int color = obtainStyledAttributes.getColor(obtainStyledAttributes.getIndex(0), 16728193);
                int i = this.f57639a;
                if (i != 0) {
                    color = i;
                }
                textView.setTextColor(color);
            }
            obtainStyledAttributes.recycle();
        }
        m81930b(preferenceViewHolder.itemView, !TextUtils.isEmpty(getTitle()));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m81930b(this.f57640c, !TextUtils.isEmpty(getTitle()));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R$attr.preferenceCategoryStyle, 16842892));
    }
}
