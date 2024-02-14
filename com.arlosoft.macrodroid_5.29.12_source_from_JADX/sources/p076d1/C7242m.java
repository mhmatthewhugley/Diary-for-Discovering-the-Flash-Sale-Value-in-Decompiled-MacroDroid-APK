package p076d1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.C13706o;

/* renamed from: d1.m */
/* compiled from: ScreenUtils.kt */
public final class C7242m {

    /* renamed from: a */
    public static final C7242m f17670a = new C7242m();

    private C7242m() {
    }

    /* renamed from: a */
    public final int mo37102a(int i) {
        return Math.round(((float) i) * (((float) Resources.getSystem().getDisplayMetrics().densityDpi) / ((float) 160)));
    }

    /* renamed from: b */
    public final int mo37103b(View view) {
        C13706o.m87929f(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    /* renamed from: c */
    public final int mo37104c(View view) {
        C13706o.m87929f(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* renamed from: d */
    public final int mo37105d(Context context) {
        C13706o.m87929f(context, "context");
        Object systemService = context.getSystemService("window");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    /* renamed from: e */
    public final int mo37106e(Context context) {
        C13706o.m87929f(context, "context");
        Object systemService = context.getSystemService("window");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: f */
    public final int mo37107f(Context context) {
        C13706o.m87929f(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo37108g(Activity activity, View view) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(view, "targetView");
        return mo37106e(activity) / 2 > mo37103b(view);
    }

    /* renamed from: h */
    public final boolean mo37109h(Activity activity, View view) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(view, "targetView");
        return mo37105d(activity) / 2 > mo37104c(view);
    }
}
