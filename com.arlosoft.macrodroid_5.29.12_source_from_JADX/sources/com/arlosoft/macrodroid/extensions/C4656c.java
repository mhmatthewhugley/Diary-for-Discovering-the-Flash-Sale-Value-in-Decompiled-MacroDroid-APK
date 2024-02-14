package com.arlosoft.macrodroid.extensions;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.Window;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17527R$bool;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.extensions.c */
/* compiled from: DialogExtensions.kt */
public final class C4656c {
    /* renamed from: a */
    public static final void m18112a(Dialog dialog, int i) {
        C13706o.m87929f(dialog, "<this>");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = dialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        if (!dialog.getContext().getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - i;
        } else {
            layoutParams.height = (Resources.getSystem().getDisplayMetrics().heightPixels * 2) / 3;
        }
        Window window2 = dialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18113b(Dialog dialog, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        m18112a(dialog, i);
    }

    /* renamed from: c */
    public static final void m18114c(Dialog dialog, int i) {
        C13706o.m87929f(dialog, "<this>");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = dialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        if (!dialog.getContext().getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = Resources.getSystem().getDisplayMetrics().widthPixels - i;
        } else {
            layoutParams.width = (Resources.getSystem().getDisplayMetrics().widthPixels * 2) / 3;
        }
        Window window2 = dialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18115d(Dialog dialog, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        m18114c(dialog, i);
    }
}
