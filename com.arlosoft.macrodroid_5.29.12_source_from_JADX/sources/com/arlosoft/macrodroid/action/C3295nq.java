package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.nq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3295nq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WriteToFileAction f8813a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8814c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8815d;

    public /* synthetic */ C3295nq(WriteToFileAction writeToFileAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8813a = writeToFileAction;
        this.f8814c = activity;
        this.f8815d = eVar;
    }

    public final void onClick(View view) {
        this.f8813a.m13863F3(this.f8814c, this.f8815d, view);
    }
}
