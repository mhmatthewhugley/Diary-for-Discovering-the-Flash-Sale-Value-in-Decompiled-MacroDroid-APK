package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.xd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3597xd implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ ReadFileAction f9576a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9577c;

    public /* synthetic */ C3597xd(ReadFileAction readFileAction, AppCompatDialog appCompatDialog) {
        this.f9576a = readFileAction;
        this.f9577c = appCompatDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ReadFileAction.m11902J3(this.f9576a, this.f9577c, dialogInterface);
    }
}
