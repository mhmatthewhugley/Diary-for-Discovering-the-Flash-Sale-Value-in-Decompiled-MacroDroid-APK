package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @Nullable

    /* renamed from: i */
    private Map<View, Integer> f50776i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: C */
    private void m70127C(@NonNull View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f50776i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f50776i;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.f50776i.get(childAt).intValue());
                        }
                    } else {
                        this.f50776i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f50776i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: A */
    public FabTransformationBehavior.FabTransformationSpec mo59440A(Context context, boolean z) {
        int i;
        if (z) {
            i = C10462R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C10462R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.f50769a = MotionSpec.m67236d(context, i);
        fabTransformationSpec.f50770b = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationSpec;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: d */
    public boolean mo59436d(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        m70127C(view2, z);
        return super.mo59436d(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
