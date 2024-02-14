package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsActivity;

/* renamed from: com.arlosoft.macrodroid.action.kh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3202kh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8607a;

    public /* synthetic */ C3202kh(Activity activity) {
        this.f8607a = activity;
    }

    public final void onClick(View view) {
        this.f8607a.startActivityForResult(new Intent(this.f8607a, QuickSettingsActivity.class), SetQuickSettingsStateAction.REQUEST_CODE_QUICK_SETTINGS);
    }
}
