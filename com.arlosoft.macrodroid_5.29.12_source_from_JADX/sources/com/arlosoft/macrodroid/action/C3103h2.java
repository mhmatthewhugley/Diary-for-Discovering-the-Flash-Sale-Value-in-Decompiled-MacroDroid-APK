package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.h2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3103h2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardAction f8404a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8405c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8406d;

    public /* synthetic */ C3103h2(ClipboardAction clipboardAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8404a = clipboardAction;
        this.f8405c = activity;
        this.f8406d = eVar;
    }

    public final void onClick(View view) {
        this.f8404a.m10111q3(this.f8405c, this.f8406d, view);
    }
}
