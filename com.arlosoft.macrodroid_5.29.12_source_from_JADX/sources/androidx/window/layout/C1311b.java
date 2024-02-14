package androidx.window.layout;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.window.layout.WindowInfoTracker;

/* renamed from: androidx.window.layout.b */
/* compiled from: WindowInfoTracker.kt */
public final /* synthetic */ class C1311b {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    /* renamed from: a */
    public static WindowInfoTracker m603a(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public static void m604b(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static void m605c() {
        WindowInfoTracker.Companion.reset();
    }
}
