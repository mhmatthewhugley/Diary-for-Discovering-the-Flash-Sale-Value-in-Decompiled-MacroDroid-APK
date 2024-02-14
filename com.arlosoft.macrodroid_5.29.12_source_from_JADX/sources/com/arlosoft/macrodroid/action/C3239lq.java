package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.lq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3239lq implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ WriteToFileAction f8671a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8672c;

    public /* synthetic */ C3239lq(WriteToFileAction writeToFileAction, AppCompatDialog appCompatDialog) {
        this.f8671a = writeToFileAction;
        this.f8672c = appCompatDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f8671a.m13860C3(this.f8672c, dialogInterface);
    }
}
