package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.n4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3273n4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8739a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f8740c;

    /* renamed from: d */
    public final /* synthetic */ ExportLogAction f8741d;

    public /* synthetic */ C3273n4(Activity activity, C4023j0.C4028e eVar, ExportLogAction exportLogAction) {
        this.f8739a = activity;
        this.f8740c = eVar;
        this.f8741d = exportLogAction;
    }

    public final void onClick(View view) {
        ExportLogAction.m10582A3(this.f8739a, this.f8740c, this.f8741d, view);
    }
}
