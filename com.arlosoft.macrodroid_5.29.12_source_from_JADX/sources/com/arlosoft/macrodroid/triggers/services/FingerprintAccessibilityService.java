package com.arlosoft.macrodroid.triggers.services;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.FingerprintGestureController;
import android.os.Build;
import android.os.Handler;
import android.view.accessibility.AccessibilityEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.FingerprintGestureTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;

public class FingerprintAccessibilityService extends AccessibilityService {

    /* renamed from: a */
    public static boolean f14432a = false;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FingerprintAccessibilityService$a */
    class C6095a extends FingerprintGestureController.FingerprintGestureCallback {
        C6095a() {
        }

        public void onGestureDetected(int i) {
            super.onGestureDetected(i);
            FingerprintAccessibilityService.this.m24108b(i);
        }

        public void onGestureDetectionAvailabilityChanged(boolean z) {
            super.onGestureDetectionAvailabilityChanged(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24108b(int i) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if ((next2 instanceof FingerprintGestureTrigger) && ((FingerprintGestureTrigger) next2).mo31124h3(i) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public void onDestroy() {
        C4878b.m18879r("Fingerprint Accessibility Service Destroyed");
        f14432a = false;
        super.onDestroy();
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        FingerprintGestureController fingerprintGestureController;
        C4878b.m18873l("Fingerprint accessibility service connected");
        f14432a = true;
        if (Build.VERSION.SDK_INT >= 26 && (fingerprintGestureController = getFingerprintGestureController()) != null) {
            try {
                if (fingerprintGestureController.isGestureDetectionAvailable()) {
                    C4878b.m18873l("Device reports that Fingerprint gesture detection is available (although it may still not be implemented on some devices that report this)");
                } else {
                    C4878b.m18873l("Device reports that Fingerprint gesture detection is not available");
                }
            } catch (Exception unused) {
            }
            fingerprintGestureController.registerFingerprintGestureCallback(new C6095a(), new Handler());
        }
    }
}
