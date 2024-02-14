package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.z7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3645z7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LaunchActivityAction f9677a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9678c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9679d;

    public /* synthetic */ C3645z7(LaunchActivityAction launchActivityAction, AppCompatDialog appCompatDialog, EditText editText) {
        this.f9677a = launchActivityAction;
        this.f9678c = appCompatDialog;
        this.f9679d = editText;
    }

    public final void onClick(View view) {
        this.f9677a.m11194x3(this.f9678c, this.f9679d, view);
    }
}
