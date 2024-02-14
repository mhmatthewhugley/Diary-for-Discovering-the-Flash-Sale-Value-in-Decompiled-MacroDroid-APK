package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.l1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5990l1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CallActiveTrigger f14167a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14168c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f14169d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14170f;

    public /* synthetic */ C5990l1(CallActiveTrigger callActiveTrigger, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f14167a = callActiveTrigger;
        this.f14168c = editText;
        this.f14169d = checkBox;
        this.f14170f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14167a.m21808H3(this.f14168c, this.f14169d, this.f14170f, view);
    }
}
