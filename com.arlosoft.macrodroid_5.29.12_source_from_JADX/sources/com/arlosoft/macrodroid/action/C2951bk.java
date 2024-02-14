package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.bk */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2951bk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f8061a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8062c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f8063d;

    public /* synthetic */ C2951bk(ShareLocationAction shareLocationAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8061a = shareLocationAction;
        this.f8062c = editText;
        this.f8063d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8061a.m12879A4(this.f8062c, this.f8063d, view);
    }
}
