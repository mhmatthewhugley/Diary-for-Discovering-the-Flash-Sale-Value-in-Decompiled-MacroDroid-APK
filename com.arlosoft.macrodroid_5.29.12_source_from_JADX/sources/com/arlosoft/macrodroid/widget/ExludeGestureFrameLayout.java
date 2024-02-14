package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: ExludeGestureFrameLayout.kt */
public final class ExludeGestureFrameLayout extends FrameLayout {

    /* renamed from: a */
    public Map<Integer, View> f15381a = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExludeGestureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewCompat.setSystemGestureExclusionRects(this, C13614t.m87744f(new Rect(i, i2, i3, i4)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExludeGestureFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
    }
}
