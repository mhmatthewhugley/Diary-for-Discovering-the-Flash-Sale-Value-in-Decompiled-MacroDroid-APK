package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.cq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2985cq implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ WaitUntilTriggerAction f8165a;

    public /* synthetic */ C2985cq(WaitUntilTriggerAction waitUntilTriggerAction) {
        this.f8165a = waitUntilTriggerAction;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WaitUntilTriggerAction.m13798w3(this.f8165a, dialogInterface);
    }
}
