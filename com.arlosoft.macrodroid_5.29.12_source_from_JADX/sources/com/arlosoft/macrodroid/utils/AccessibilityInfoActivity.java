package com.arlosoft.macrodroid.utils;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: AccessibilityInfoActivity.kt */
public final class AccessibilityInfoActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    public Map<Integer, View> f14934o = new LinkedHashMap();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.dialog_accessibility_info);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        onBackPressed();
        return true;
    }
}
