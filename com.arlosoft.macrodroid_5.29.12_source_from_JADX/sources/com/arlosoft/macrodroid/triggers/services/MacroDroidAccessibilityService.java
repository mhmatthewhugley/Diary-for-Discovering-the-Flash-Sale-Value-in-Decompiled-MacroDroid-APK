package com.arlosoft.macrodroid.triggers.services;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.RecentAppsTrigger;

public class MacroDroidAccessibilityService extends AccessibilityService {

    /* renamed from: c */
    public static String f14497c = null;

    /* renamed from: d */
    public static boolean f14498d = false;

    /* renamed from: a */
    private boolean f14499a;

    /* renamed from: a */
    private void m24174a(String str, String str2) {
        f14497c = str;
        ApplicationLaunchedTrigger.m21508K3(str, str2);
        RecentAppsTrigger.m23021h3(str, str2);
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getParcelableData();
        if (accessibilityEvent.getEventType() == 32 && accessibilityEvent.getPackageName() != null) {
            m24174a(accessibilityEvent.getPackageName().toString(), accessibilityEvent.getClassName() != null ? accessibilityEvent.getClassName().toString() : "?");
        }
    }

    public void onDestroy() {
        C4878b.m18879r("Accessibility Service Destroyed");
        f14498d = false;
        super.onDestroy();
    }

    public void onInterrupt() {
        this.f14499a = false;
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        C4878b.m18879r("Accessibility Service Connected");
        this.f14499a = true;
        f14498d = true;
    }
}
