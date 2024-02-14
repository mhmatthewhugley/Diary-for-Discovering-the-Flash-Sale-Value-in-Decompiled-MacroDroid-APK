package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;

/* renamed from: com.arlosoft.macrodroid.action.jn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3180jn implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8565a;

    public /* synthetic */ C3180jn(Activity activity) {
        this.f8565a = activity;
    }

    public final void onClick(View view) {
        this.f8565a.startActivityForResult(new Intent(this.f8565a, IconSelectActivity.class), ToastAction.REQUEST_CODE_SELECT_ICON);
    }
}
