package com.arlosoft.macrodroid.extensions;

import android.app.Activity;
import android.view.Window;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.extensions.a */
/* compiled from: ActivityExtensions.kt */
public final class C4654a {
    /* renamed from: a */
    public static final void m18109a(Activity activity) {
        C13706o.m87929f(activity, "<this>");
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1024);
        window.setStatusBarColor(0);
    }
}
