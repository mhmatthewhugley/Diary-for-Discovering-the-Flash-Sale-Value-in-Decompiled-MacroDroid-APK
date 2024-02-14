package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.wh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3574wh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f9495a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9496c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9497d;

    public /* synthetic */ C3574wh(SetVariableAction setVariableAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9495a = setVariableAction;
        this.f9496c = activity;
        this.f9497d = eVar;
    }

    public final void onClick(View view) {
        this.f9495a.m12708v4(this.f9496c, this.f9497d, view);
    }
}
