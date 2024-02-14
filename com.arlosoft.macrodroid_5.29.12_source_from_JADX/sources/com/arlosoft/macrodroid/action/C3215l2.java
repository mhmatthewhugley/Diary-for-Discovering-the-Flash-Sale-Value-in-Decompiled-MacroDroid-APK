package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.l2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3215l2 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CloseApplicationAction f8637a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8638c;

    public /* synthetic */ C3215l2(CloseApplicationAction closeApplicationAction, Activity activity) {
        this.f8637a = closeApplicationAction;
        this.f8638c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8637a.m10142z3(this.f8638c, dialogInterface, i);
    }
}
