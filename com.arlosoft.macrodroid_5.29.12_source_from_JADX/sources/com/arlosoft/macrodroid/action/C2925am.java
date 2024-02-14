package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.am */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2925am implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ SystemSettingAction f8008a;

    public /* synthetic */ C2925am(SystemSettingAction systemSettingAction) {
        this.f8008a = systemSettingAction;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        SystemSettingAction.m13197A3(this.f8008a, dialogInterface);
    }
}
