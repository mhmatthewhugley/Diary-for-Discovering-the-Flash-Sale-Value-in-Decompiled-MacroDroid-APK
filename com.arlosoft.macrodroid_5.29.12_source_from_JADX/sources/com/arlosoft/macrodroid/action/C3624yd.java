package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.yd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3624yd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f9626a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f9627c;

    /* renamed from: d */
    public final /* synthetic */ ReadFileAction f9628d;

    public /* synthetic */ C3624yd(Activity activity, C4023j0.C4028e eVar, ReadFileAction readFileAction) {
        this.f9626a = activity;
        this.f9627c = eVar;
        this.f9628d = readFileAction;
    }

    public final void onClick(View view) {
        ReadFileAction.m11904L3(this.f9626a, this.f9627c, this.f9628d, view);
    }
}
