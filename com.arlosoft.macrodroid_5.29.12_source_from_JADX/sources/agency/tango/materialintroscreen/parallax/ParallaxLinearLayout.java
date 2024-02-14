package agency.tango.materialintroscreen.parallax;

import agency.tango.materialintroscreen.R$styleable;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.FloatRange;
import p034i.C1990b;

public class ParallaxLinearLayout extends LinearLayout implements C1990b {
    public ParallaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0029a generateDefaultLayoutParams() {
        return new C0029a(-1, -1);
    }

    /* renamed from: b */
    public C0029a generateLayoutParams(AttributeSet attributeSet) {
        return new C0029a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0029a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0029a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0029a;
    }

    public void setOffset(@FloatRange(from = -1.0d, mo592to = 1.0d) float f) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0029a aVar = (C0029a) childAt.getLayoutParams();
            if (aVar.f92a != 0.0f) {
                childAt.setTranslationX(((float) getWidth()) * (-f) * aVar.f92a);
            }
        }
    }

    public ParallaxLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: agency.tango.materialintroscreen.parallax.ParallaxLinearLayout$a */
    public static class C0029a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        float f92a = 0.0f;

        C0029a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ParallaxLayout_Layout);
            this.f92a = obtainStyledAttributes.getFloat(R$styleable.ParallaxLayout_Layout_layout_parallaxFactor, this.f92a);
            obtainStyledAttributes.recycle();
        }

        C0029a(int i, int i2) {
            super(i, i2);
        }

        C0029a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
