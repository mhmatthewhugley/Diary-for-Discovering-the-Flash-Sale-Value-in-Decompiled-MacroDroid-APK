package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.ak */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2923ak implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f7998a;

    /* renamed from: c */
    public final /* synthetic */ EditText f7999c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8000d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8001f;

    public /* synthetic */ C2923ak(ShareLocationAction shareLocationAction, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f7998a = shareLocationAction;
        this.f7999c = editText;
        this.f8000d = radioButton;
        this.f8001f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f7998a.m12954q4(this.f7999c, this.f8000d, this.f8001f, view);
    }
}
