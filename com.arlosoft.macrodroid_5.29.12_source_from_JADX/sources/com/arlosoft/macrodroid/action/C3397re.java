package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.re */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3397re implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecordMicrophoneAction f9039a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f9040c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9041d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9042f;

    public /* synthetic */ C3397re(RecordMicrophoneAction recordMicrophoneAction, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog) {
        this.f9039a = recordMicrophoneAction;
        this.f9040c = radioButton;
        this.f9041d = editText;
        this.f9042f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9039a.m12011G3(this.f9040c, this.f9041d, this.f9042f, view);
    }
}
