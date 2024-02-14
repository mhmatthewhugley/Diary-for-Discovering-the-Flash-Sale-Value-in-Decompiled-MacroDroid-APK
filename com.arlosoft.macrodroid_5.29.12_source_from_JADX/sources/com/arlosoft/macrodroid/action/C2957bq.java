package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.bq */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2957bq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VoiceInputAction f8076a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8077c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8078d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f8079f;

    public /* synthetic */ C2957bq(VoiceInputAction voiceInputAction, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f8076a = voiceInputAction;
        this.f8077c = editText;
        this.f8078d = radioButton;
        this.f8079f = appCompatDialog;
    }

    public final void onClick(View view) {
        VoiceInputAction.m13741u3(this.f8076a, this.f8077c, this.f8078d, this.f8079f, view);
    }
}
