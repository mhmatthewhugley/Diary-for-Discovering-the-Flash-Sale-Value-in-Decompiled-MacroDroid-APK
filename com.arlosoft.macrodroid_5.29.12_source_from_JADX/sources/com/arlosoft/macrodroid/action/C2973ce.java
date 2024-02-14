package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.ce */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2973ce implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ReadFileAction f8124a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8125c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8126d;

    public /* synthetic */ C2973ce(ReadFileAction readFileAction, AppCompatDialog appCompatDialog, RadioButton radioButton) {
        this.f8124a = readFileAction;
        this.f8125c = appCompatDialog;
        this.f8126d = radioButton;
    }

    public final void onClick(View view) {
        ReadFileAction.m11900H3(this.f8124a, this.f8125c, this.f8126d, view);
    }
}
