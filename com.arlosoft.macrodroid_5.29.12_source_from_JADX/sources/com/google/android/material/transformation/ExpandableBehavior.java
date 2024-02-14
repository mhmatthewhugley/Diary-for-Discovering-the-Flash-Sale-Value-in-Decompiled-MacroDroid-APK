package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f50745a = 0;

    public ExpandableBehavior() {
    }

    /* renamed from: b */
    private boolean m70096b(boolean z) {
        if (z) {
            int i = this.f50745a;
            return i == 0 || i == 2;
        } else if (this.f50745a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public ExpandableWidget mo59435c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo59436d(View view, View view2, boolean z, boolean z2);

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!m70096b(expandableWidget.mo57763c())) {
            return false;
        }
        this.f50745a = expandableWidget.mo57763c() ? 1 : 2;
        return mo59436d((View) expandableWidget, view, expandableWidget.mo57763c(), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = mo59435c(r3, r4);
     */
    @androidx.annotation.CallSuper
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull final android.view.View r4, int r5) {
        /*
            r2 = this;
            boolean r5 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r5 != 0) goto L_0x002d
            com.google.android.material.expandable.ExpandableWidget r3 = r2.mo59435c(r3, r4)
            if (r3 == 0) goto L_0x002d
            boolean r5 = r3.mo57763c()
            boolean r5 = r2.m70096b(r5)
            if (r5 == 0) goto L_0x002d
            boolean r5 = r3.mo57763c()
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 2
        L_0x001f:
            r2.f50745a = r5
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$1 r1 = new com.google.android.material.transformation.ExpandableBehavior$1
            r1.<init>(r4, r5, r3)
            r0.addOnPreDrawListener(r1)
        L_0x002d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
