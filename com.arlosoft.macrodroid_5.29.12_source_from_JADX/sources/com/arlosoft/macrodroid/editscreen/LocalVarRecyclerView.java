package com.arlosoft.macrodroid.editscreen;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: LocalVarRecyclerView.kt */
public final class LocalVarRecyclerView extends RecyclerView {

    /* renamed from: a */
    public Map<Integer, View> f11605a = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalVarRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(attributeSet, "attrs");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((Resources.getSystem().getDisplayMetrics().heightPixels * 2) / 3, Integer.MIN_VALUE));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalVarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
    }
}
