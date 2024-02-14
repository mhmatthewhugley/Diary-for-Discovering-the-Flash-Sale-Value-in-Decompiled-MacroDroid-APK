package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.i5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3134i5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FileOperationV21Action f8470a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8471c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8472d;

    public /* synthetic */ C3134i5(FileOperationV21Action fileOperationV21Action, Activity activity, C4023j0.C4028e eVar) {
        this.f8470a = fileOperationV21Action;
        this.f8471c = activity;
        this.f8472d = eVar;
    }

    public final void onClick(View view) {
        this.f8470a.m10679G3(this.f8471c, this.f8472d, view);
    }
}
