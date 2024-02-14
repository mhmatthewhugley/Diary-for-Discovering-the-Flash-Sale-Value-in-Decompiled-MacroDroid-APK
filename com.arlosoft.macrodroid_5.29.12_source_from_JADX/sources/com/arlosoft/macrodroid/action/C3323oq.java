package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.oq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3323oq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WriteToFileAction f8885a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8886c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8887d;

    public /* synthetic */ C3323oq(WriteToFileAction writeToFileAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8885a = writeToFileAction;
        this.f8886c = activity;
        this.f8887d = eVar;
    }

    public final void onClick(View view) {
        this.f8885a.m13864G3(this.f8886c, this.f8887d, view);
    }
}
