package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

public class InterpolateOnScrollPositionChangeHelper {

    /* renamed from: a */
    private View f49976a;

    /* renamed from: b */
    private MaterialShapeDrawable f49977b;

    /* renamed from: c */
    private ScrollView f49978c;

    /* renamed from: d */
    private final int[] f49979d;

    /* renamed from: e */
    private final int[] f49980e;

    /* renamed from: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1 */
    class C106171 implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        final /* synthetic */ InterpolateOnScrollPositionChangeHelper f49981a;

        public void onScrollChanged() {
            this.f49981a.mo58636a();
        }
    }

    /* renamed from: a */
    public void mo58636a() {
        ScrollView scrollView = this.f49978c;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.f49978c.getLocationInWindow(this.f49979d);
                this.f49978c.getChildAt(0).getLocationInWindow(this.f49980e);
                int top = (this.f49976a.getTop() - this.f49979d[1]) + this.f49980e[1];
                int height = this.f49976a.getHeight();
                int height2 = this.f49978c.getHeight();
                if (top < 0) {
                    this.f49977b.mo58657b0(Math.max(0.0f, Math.min(1.0f, (((float) top) / ((float) height)) + 1.0f)));
                    this.f49976a.invalidate();
                    return;
                }
                int i = top + height;
                if (i > height2) {
                    this.f49977b.mo58657b0(Math.max(0.0f, Math.min(1.0f, 1.0f - (((float) (i - height2)) / ((float) height)))));
                    this.f49976a.invalidate();
                } else if (this.f49977b.mo58685y() != 1.0f) {
                    this.f49977b.mo58657b0(1.0f);
                    this.f49976a.invalidate();
                }
            } else {
                throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
            }
        }
    }
}
