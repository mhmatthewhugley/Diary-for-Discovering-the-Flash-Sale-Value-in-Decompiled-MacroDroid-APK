package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: com.arlosoft.macrodroid.utils.m1 */
/* compiled from: UIUtils */
public class C6405m1 {
    /* renamed from: a */
    public static int m24661a(Context context) {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("config_screenBrightnessSettingMinimum", TypedValues.Custom.S_INT, "android");
        if (identifier == 0) {
            identifier = system.getIdentifier("config_screenBrightnessDim", TypedValues.Custom.S_INT, "android");
        }
        if (identifier == 0) {
            return 0;
        }
        try {
            return system.getInteger(identifier);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static void m24662b(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }
}
