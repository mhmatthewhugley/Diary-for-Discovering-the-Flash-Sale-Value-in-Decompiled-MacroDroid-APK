package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.qq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3381qq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WriteToFileAction f9001a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9002c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9003d;

    /* renamed from: f */
    public final /* synthetic */ EditText f9004f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f9005g;

    /* renamed from: o */
    public final /* synthetic */ RadioButton f9006o;

    /* renamed from: p */
    public final /* synthetic */ RadioButton f9007p;

    public /* synthetic */ C3381qq(WriteToFileAction writeToFileAction, AppCompatDialog appCompatDialog, EditText editText, EditText editText2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f9001a = writeToFileAction;
        this.f9002c = appCompatDialog;
        this.f9003d = editText;
        this.f9004f = editText2;
        this.f9005g = radioButton;
        this.f9006o = radioButton2;
        this.f9007p = radioButton3;
    }

    public final void onClick(View view) {
        this.f9001a.m13858A3(this.f9002c, this.f9003d, this.f9004f, this.f9005g, this.f9006o, this.f9007p, view);
    }
}
