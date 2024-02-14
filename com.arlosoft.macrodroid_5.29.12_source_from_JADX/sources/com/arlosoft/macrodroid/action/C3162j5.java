package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.j5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3162j5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationV21Action f8521a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8522c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8523d;

    public /* synthetic */ C3162j5(FileOperationV21Action fileOperationV21Action, Activity activity, C4023j0.C4028e eVar) {
        this.f8521a = fileOperationV21Action;
        this.f8522c = activity;
        this.f8523d = eVar;
    }

    public final void onClick(View view) {
        this.f8521a.m10685M3(this.f8522c, this.f8523d, view);
    }
}
