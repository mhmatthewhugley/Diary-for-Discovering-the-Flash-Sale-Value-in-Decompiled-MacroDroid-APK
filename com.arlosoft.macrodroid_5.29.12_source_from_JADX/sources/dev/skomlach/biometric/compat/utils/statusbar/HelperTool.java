package dev.skomlach.biometric.compat.utils.statusbar;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/statusbar/HelperTool;", "", "()V", "isVisible", "", "view", "Landroid/view/View;", "minPercentageViewed", "", "setFlag", "window", "Landroid/view/Window;", "set", "bits", "setFlameFlag", "setMIUIFlag", "setUIVisibilityFlag", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: HelperTool.kt */
public final class HelperTool {
    public static final HelperTool INSTANCE = new HelperTool();

    private HelperTool() {
    }

    public final boolean isVisible(View view, int i) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        long height = ((long) rect.height()) * ((long) rect.width());
        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
        if (height2 > 0 && ((long) 100) * height >= ((long) i) * height2) {
            return true;
        }
        return false;
    }

    public final boolean setFlag(Window window, boolean z, int i) {
        C13706o.m87929f(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = attributes.flags;
        int i3 = z ? i2 | i : (~i) & i2;
        if (i3 != i2) {
            attributes.flags = i3;
            window.setAttributes(attributes);
            return true;
        } else if (z && (i3 & i) == i) {
            return true;
        } else {
            if (z || (i3 & i) == i) {
                return false;
            }
            return true;
        }
    }

    public final boolean setFlameFlag(Window window, boolean z, int i) {
        C13706o.m87929f(window, "window");
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(attributes);
            int i3 = z ? i2 | i : (~i) & i2;
            if (i3 != i2) {
                declaredField.setInt(attributes, i3);
                window.setAttributes(attributes);
                return true;
            } else if (z && (i3 & i) == i) {
                return true;
            } else {
                if (z || (i3 & i) == i) {
                    return false;
                }
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(1:9)(1:10)|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r3[0] = java.lang.Integer.valueOf(r9);
        r3[1] = java.lang.Integer.valueOf(r10);
        r2.invoke(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = r8.getClass();
        r6 = java.lang.Integer.TYPE;
        r2 = r2.getMethod("setExtraFlags", new java.lang.Class[]{r6, r6});
        r3 = new java.lang.Object[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r9 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMIUIFlag(android.view.Window r8, boolean r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "window"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            r0 = 0
            r1 = 1
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "clearExtraFlags"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x003a }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x003a }
            r4[r0] = r5     // Catch:{ all -> 0x003a }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x003a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x003a }
            r4[r0] = r6     // Catch:{ all -> 0x003a }
            r3.invoke(r8, r4)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0039
            java.lang.String r3 = "addExtraFlags"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x003a }
            r4[r0] = r5     // Catch:{ all -> 0x003a }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ all -> 0x003a }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x003a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x003a }
            r3[r0] = r4     // Catch:{ all -> 0x003a }
            r2.invoke(r8, r3)     // Catch:{ all -> 0x003a }
        L_0x0039:
            return r1
        L_0x003a:
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "setExtraFlags"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0064 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0064 }
            r5[r0] = r6     // Catch:{ all -> 0x0064 }
            r5[r1] = r6     // Catch:{ all -> 0x0064 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ all -> 0x0064 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0053
            r9 = r10
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0064 }
            r3[r0] = r9     // Catch:{ all -> 0x0064 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0064 }
            r3[r1] = r9     // Catch:{ all -> 0x0064 }
            r2.invoke(r8, r3)     // Catch:{ all -> 0x0064 }
            return r1
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.statusbar.HelperTool.setMIUIFlag(android.view.Window, boolean, int):boolean");
    }

    public final boolean setUIVisibilityFlag(Window window, boolean z, int i) {
        C13706o.m87929f(window, "window");
        View decorView = window.getDecorView();
        C13706o.m87928e(decorView, "window.decorView");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i2 = z ? systemUiVisibility | i : (~i) & systemUiVisibility;
        if (i2 != systemUiVisibility) {
            decorView.setSystemUiVisibility(i2);
            return true;
        } else if (z && (i2 & i) == i) {
            return true;
        } else {
            if (z || (i2 & i) == i) {
                return false;
            }
            return true;
        }
    }
}
