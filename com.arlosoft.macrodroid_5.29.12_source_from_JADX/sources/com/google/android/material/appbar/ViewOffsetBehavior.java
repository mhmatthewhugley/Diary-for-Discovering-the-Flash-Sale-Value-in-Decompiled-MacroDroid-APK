package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private ViewOffsetHelper f48645a;

    /* renamed from: b */
    private int f48646b = 0;

    /* renamed from: c */
    private int f48647c = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: a */
    public int mo56688a() {
        ViewOffsetHelper viewOffsetHelper = this.f48645a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.mo56797c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56783b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    /* renamed from: c */
    public boolean mo56689c(int i) {
        ViewOffsetHelper viewOffsetHelper = this.f48645a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.mo56800f(i);
        }
        this.f48646b = i;
        return false;
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        mo56783b(coordinatorLayout, v, i);
        if (this.f48645a == null) {
            this.f48645a = new ViewOffsetHelper(v);
        }
        this.f48645a.mo56798d();
        this.f48645a.mo56795a();
        int i2 = this.f48646b;
        if (i2 != 0) {
            this.f48645a.mo56800f(i2);
            this.f48646b = 0;
        }
        int i3 = this.f48647c;
        if (i3 == 0) {
            return true;
        }
        this.f48645a.mo56799e(i3);
        this.f48647c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
