package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.sl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3456sl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchAction f9207a;

    /* renamed from: c */
    public final /* synthetic */ String f9208c;

    public /* synthetic */ C3456sl(StopWatchAction stopWatchAction, String str) {
        this.f9207a = stopWatchAction;
        this.f9208c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9207a.m13164v3(this.f9208c, dialogInterface, i);
    }
}
