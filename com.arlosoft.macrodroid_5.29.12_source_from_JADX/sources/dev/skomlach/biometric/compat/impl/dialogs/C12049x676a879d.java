package dev.skomlach.biometric.compat.impl.dialogs;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u001f"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialog$ScreenProtection$applyProtectionInView$1", "Landroid/view/View$AccessibilityDelegate;", "Landroid/view/View;", "host", "", "eventType", "Lja/u;", "sendAccessibilityEvent", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "Landroid/view/accessibility/AccessibilityEvent;", "event", "sendAccessibilityEventUnchecked", "dispatchPopulateAccessibilityEvent", "onPopulateAccessibilityEvent", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "", "extraDataKey", "arguments", "addExtraDataToAccessibilityNodeInfo", "Landroid/view/ViewGroup;", "child", "onRequestSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeProvider;", "getAccessibilityNodeProvider", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialog$ScreenProtection$applyProtectionInView$1 */
/* compiled from: BiometricPromptCompatDialog.kt */
public final class C12049x676a879d extends View.AccessibilityDelegate {
    C12049x676a879d() {
    }

    public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityNodeInfo, "info");
        C13706o.m87929f(str, "extraDataKey");
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
        return false;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C13706o.m87929f(view, "host");
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityNodeInfo, "info");
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C13706o.m87929f(viewGroup, "host");
        C13706o.m87929f(view, "child");
        C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
        return false;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C13706o.m87929f(view, "host");
        return false;
    }

    public void sendAccessibilityEvent(View view, int i) {
        C13706o.m87929f(view, "host");
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C13706o.m87929f(view, "host");
        C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
    }
}
