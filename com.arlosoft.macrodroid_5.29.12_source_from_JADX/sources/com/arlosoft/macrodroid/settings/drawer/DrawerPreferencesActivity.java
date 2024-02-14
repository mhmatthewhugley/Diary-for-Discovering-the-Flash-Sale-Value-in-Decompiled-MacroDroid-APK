package com.arlosoft.macrodroid.settings.drawer;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

/* compiled from: DrawerPreferencesActivity.kt */
public final class DrawerPreferencesActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    public Map<Integer, View> f12887o = new LinkedHashMap();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_drawer_preferences);
        setTitle(C17541R$string.macrodroid_drawer_options);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
