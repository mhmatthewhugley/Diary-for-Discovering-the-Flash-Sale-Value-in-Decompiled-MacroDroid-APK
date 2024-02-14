package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class ExpandableWidgetHelper {
    @NonNull

    /* renamed from: a */
    private final View f49315a;

    /* renamed from: b */
    private boolean f49316b = false;
    @IdRes

    /* renamed from: c */
    private int f49317c = 0;

    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f49315a = (View) expandableWidget;
    }

    /* renamed from: a */
    private void m68389a() {
        ViewParent parent = this.f49315a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f49315a);
        }
    }

    @IdRes
    /* renamed from: b */
    public int mo57764b() {
        return this.f49317c;
    }

    /* renamed from: c */
    public boolean mo57765c() {
        return this.f49316b;
    }

    /* renamed from: d */
    public void mo57766d(@NonNull Bundle bundle) {
        this.f49316b = bundle.getBoolean("expanded", false);
        this.f49317c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f49316b) {
            m68389a();
        }
    }

    @NonNull
    /* renamed from: e */
    public Bundle mo57767e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f49316b);
        bundle.putInt("expandedComponentIdHint", this.f49317c);
        return bundle;
    }

    /* renamed from: f */
    public void mo57768f(@IdRes int i) {
        this.f49317c = i;
    }
}
