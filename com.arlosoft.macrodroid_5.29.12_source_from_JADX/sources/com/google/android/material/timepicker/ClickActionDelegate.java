package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ClickActionDelegate extends AccessibilityDelegateCompat {

    /* renamed from: a */
    private final AccessibilityNodeInfoCompat.AccessibilityActionCompat f50607a;

    public ClickActionDelegate(Context context, int i) {
        this.f50607a = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i));
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.f50607a);
    }
}
