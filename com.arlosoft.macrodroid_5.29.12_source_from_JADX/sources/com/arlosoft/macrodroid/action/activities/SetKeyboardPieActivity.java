package com.arlosoft.macrodroid.action.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.arlosoft.macrodroid.common.NonAppActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p257f0.C12210p;
import p257f0.C12211q;

/* compiled from: SetKeyboardPieActivity.kt */
public final class SetKeyboardPieActivity extends NonAppActivity {

    /* renamed from: o */
    public Map<Integer, View> f7842o = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m13981N1(SetKeyboardPieActivity setKeyboardPieActivity) {
        C13706o.m87929f(setKeyboardPieActivity, "this$0");
        Object systemService = setKeyboardPieActivity.getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showInputMethodPicker();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m13982O1(SetKeyboardPieActivity setKeyboardPieActivity) {
        C13706o.m87929f(setKeyboardPieActivity, "this$0");
        setKeyboardPieActivity.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler().postDelayed(new C12210p(this), 500);
        new Handler().postDelayed(new C12211q(this), 1000);
    }
}
