package agency.tango.materialintroscreen.parallax;

import agency.tango.materialintroscreen.R$styleable;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.FloatRange;
import p034i.C1990b;

public class ParallaxRelativeLayout extends RelativeLayout implements C1990b {
    public ParallaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0030a generateDefaultLayoutParams() {
        return new C0030a(-1, -1);
    }

    /* renamed from: b */
    public C0030a generateLayoutParams(AttributeSet attributeSet) {
        return new C0030a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0030a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0030a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0030a;
    }

    public void setOffset(@FloatRange(from = -1.0d, mo592to = 1.0d) float f) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0030a aVar = (C0030a) childAt.getLayoutParams();
            if (aVar.f93a != 0.0f) {
                childAt.setTranslationX(((float) getWidth()) * (-f) * aVar.f93a);
            }
        }
    }

    public ParallaxRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: agency.tango.materialintroscreen.parallax.ParallaxRelativeLayout$a */
    public static class C0030a extends RelativeLayout.LayoutParams {

        /* renamed from: a */
        float f93a = 0.0f;

        C0030a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ParallaxLayout_Layout);
            this.f93a = obtainStyledAttributes.getFloat(R$styleable.ParallaxLayout_Layout_layout_parallaxFactor, this.f93a);
            obtainStyledAttributes.recycle();
        }

        C0030a(int i, int i2) {
            super(i, i2);
        }

        C0030a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
