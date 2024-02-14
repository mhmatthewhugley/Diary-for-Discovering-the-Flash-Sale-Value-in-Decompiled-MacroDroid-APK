package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.c8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2967c8 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LaunchAndPressAction f8101a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8102c;

    public /* synthetic */ C2967c8(LaunchAndPressAction launchAndPressAction, Activity activity) {
        this.f8101a = launchAndPressAction;
        this.f8102c = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8101a.m11220I3(this.f8102c, dialogInterface, i);
    }
}
