package dev.skomlach.biometric.compat.utils.activityView;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.core.util.ObjectsCompat;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/ActiveWindow;", "", "()V", "clazz", "Ljava/lang/Class;", "viewRoots", "", "Landroid/view/ViewParent;", "getViewRoots", "()Ljava/util/List;", "windowManager", "windowManagerClazz", "extractActivity", "Landroid/app/Activity;", "c", "Landroid/content/Context;", "getActiveWindow", "Landroid/view/View;", "list", "getActiveWindows", "activity", "Landroidx/fragment/app/FragmentActivity;", "viewBelongActivity", "", "view", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: ActiveWindow.kt */
public final class ActiveWindow {
    public static final ActiveWindow INSTANCE = new ActiveWindow();
    private static Class<?> clazz;
    private static Object windowManager;
    private static Class<?> windowManagerClazz;

    static {
        try {
            clazz = Class.forName("android.view.ViewRootImpl");
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            windowManagerClazz = cls;
            Method method = cls.getMethod("getInstance", new Class[0]);
            Object obj = null;
            if (method != null) {
                obj = method.invoke((Object) null, new Object[0]);
            }
            windowManager = obj;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private ActiveWindow() {
    }

    private final Activity extractActivity(Context context) {
        Context baseContext;
        while (!(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                return null;
            }
            C13706o.m87928e(baseContext, "{\n                    va…Context\n                }");
            context = baseContext;
        }
        return null;
    }

    private final List<ViewParent> getViewRoots() {
        Object obj;
        ArrayList<ViewParent> arrayList;
        Boolean bool;
        ArrayList arrayList2 = new ArrayList();
        try {
            Class<?> cls = windowManagerClazz;
            Field declaredField = cls != null ? cls.getDeclaredField("mRoots") : null;
            Boolean valueOf = declaredField != null ? Boolean.valueOf(declaredField.isAccessible()) : null;
            try {
                Boolean bool2 = Boolean.FALSE;
                if (C13706o.m87924a(valueOf, bool2)) {
                    declaredField.setAccessible(true);
                }
                Class<?> cls2 = clazz;
                declaredField = cls2 != null ? cls2.getDeclaredField("mStopped") : null;
                valueOf = declaredField != null ? Boolean.valueOf(declaredField.isAccessible()) : null;
                try {
                    if (C13706o.m87924a(valueOf, bool2)) {
                        declaredField.setAccessible(true);
                    }
                    obj = declaredField != null ? declaredField.get(windowManager) : null;
                    arrayList = new ArrayList<>();
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.collections.List<android.view.ViewParent>");
                    arrayList.addAll((List) obj);
                } catch (ClassCastException unused) {
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Array<android.view.ViewParent>");
                    ViewParent[] viewParentArr = (ViewParent[]) obj;
                    arrayList.addAll(C13614t.m87751m(Arrays.copyOf(viewParentArr, viewParentArr.length)));
                } catch (Throwable th) {
                    if (C13706o.m87924a(valueOf, Boolean.FALSE)) {
                        declaredField.setAccessible(false);
                    }
                    throw th;
                }
                for (ViewParent viewParent : arrayList) {
                    Object obj2 = declaredField != null ? declaredField.get(viewParent) : null;
                    C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj2).booleanValue()) {
                        arrayList2.add(viewParent);
                    }
                }
                if (C13706o.m87924a(valueOf, bool)) {
                    declaredField.setAccessible(false);
                }
                return arrayList2;
            } finally {
                if (C13706o.m87924a(valueOf, Boolean.FALSE)) {
                    declaredField.setAccessible(false);
                }
            }
        } catch (Exception e) {
            BiometricLoggerImpl.INSTANCE.mo68219e(e, "ActiveWindow");
        }
    }

    private final boolean viewBelongActivity(View view, Activity activity) {
        if (view == null) {
            return false;
        }
        Context context = view.getContext();
        C13706o.m87928e(context, "view.context");
        Object extractActivity = extractActivity(context);
        if (extractActivity == null) {
            extractActivity = view.getContext();
        }
        if (ObjectsCompat.equals(activity, extractActivity)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewBelongActivity(viewGroup.getChildAt(i), activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final View getActiveWindow(List<? extends View> list) {
        C13706o.m87929f(list, "list");
        int size = list.size();
        View view = null;
        for (int i = 0; i < size; i++) {
            View view2 = (View) list.get(i);
            try {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                int i2 = ((WindowManager.LayoutParams) layoutParams).type;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    C13706o.m87927d(layoutParams2, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                    if (i2 <= ((WindowManager.LayoutParams) layoutParams2).type) {
                        if (view2.hasWindowFocus()) {
                            if (view.hasWindowFocus()) {
                            }
                        }
                    }
                }
                view = view2;
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68219e(th, "ActiveWindow.getActiveView");
            }
        }
        if (view != null) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68220e("ActiveWindow.getActiveView-" + view);
            return view;
        }
        throw new IllegalStateException("Unable to find Active Window to attach");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r6 = r6.getMethod("getView", new java.lang.Class[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.view.View> getActiveWindows(androidx.fragment.app.FragmentActivity r10) {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r9.getViewRoots()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x0066
            java.lang.Object r5 = r1.get(r4)
            android.view.ViewParent r5 = (android.view.ViewParent) r5
            java.lang.Class<?> r6 = clazz     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0031
            java.lang.String r7 = "getView"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ all -> 0x0056 }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0031
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r6.invoke(r5, r7)     // Catch:{ all -> 0x0056 }
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            java.lang.String r6 = "null cannot be cast to non-null type android.view.View"
            kotlin.jvm.internal.C13706o.m87927d(r5, r6)     // Catch:{ all -> 0x0056 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0056 }
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = "null cannot be cast to non-null type android.view.WindowManager.LayoutParams"
            kotlin.jvm.internal.C13706o.m87927d(r6, r7)     // Catch:{ all -> 0x0056 }
            android.view.WindowManager$LayoutParams r6 = (android.view.WindowManager.LayoutParams) r6     // Catch:{ all -> 0x0056 }
            int r6 = r6.type     // Catch:{ all -> 0x0056 }
            r7 = 2000(0x7d0, float:2.803E-42)
            if (r6 < r7) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            boolean r6 = r9.viewBelongActivity(r5, r10)     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x0052
            goto L_0x0063
        L_0x0052:
            r0.add(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0063
        L_0x0056:
            r5 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r6 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "ActiveWindow.getActiveView"
            r7[r3] = r8
            r6.mo68219e(r5, r7)
        L_0x0063:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.activityView.ActiveWindow.getActiveWindows(androidx.fragment.app.FragmentActivity):java.util.List");
    }
}
