package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: SmartNestedScrollView.kt */
public class SmartNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    public Map<Integer, View> f15396a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
        this.f15396a = new LinkedHashMap();
    }

    /* renamed from: a */
    private final RecyclerView m25122a(View view) {
        ViewGroup viewGroup;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i = 0;
        do {
            viewGroup = (ViewGroup) view;
            RecyclerView a = m25122a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
            i++;
        } while (i < viewGroup.getChildCount());
        return null;
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (m25122a(view) != null) {
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(i, View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, Integer.MIN_VALUE));
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmartNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13706o.m87929f(context, "context");
    }
}
