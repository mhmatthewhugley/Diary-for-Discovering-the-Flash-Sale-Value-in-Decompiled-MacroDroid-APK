package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.b5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2936b5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationAction f8027a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8028c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8029d;

    public /* synthetic */ C2936b5(FileOperationAction fileOperationAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8027a = fileOperationAction;
        this.f8028c = activity;
        this.f8029d = eVar;
    }

    public final void onClick(View view) {
        this.f8027a.m10644A3(this.f8028c, this.f8029d, view);
    }
}
