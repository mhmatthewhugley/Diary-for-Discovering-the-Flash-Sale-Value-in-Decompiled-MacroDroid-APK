package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.cl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2980cl implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ int[] f8145A;

    /* renamed from: a */
    public final /* synthetic */ SpeakTextAction f8146a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8147c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8148d;

    /* renamed from: f */
    public final /* synthetic */ SeekBar f8149f;

    /* renamed from: g */
    public final /* synthetic */ SeekBar f8150g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f8151o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f8152p;

    /* renamed from: s */
    public final /* synthetic */ CheckBox f8153s;

    /* renamed from: z */
    public final /* synthetic */ Spinner f8154z;

    public /* synthetic */ C2980cl(SpeakTextAction speakTextAction, AppCompatDialog appCompatDialog, EditText editText, SeekBar seekBar, SeekBar seekBar2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Spinner spinner, int[] iArr) {
        this.f8146a = speakTextAction;
        this.f8147c = appCompatDialog;
        this.f8148d = editText;
        this.f8149f = seekBar;
        this.f8150g = seekBar2;
        this.f8151o = checkBox;
        this.f8152p = checkBox2;
        this.f8153s = checkBox3;
        this.f8154z = spinner;
        this.f8145A = iArr;
    }

    public final void onClick(View view) {
        this.f8146a.m13094Y3(this.f8147c, this.f8148d, this.f8149f, this.f8150g, this.f8151o, this.f8152p, this.f8153s, this.f8154z, this.f8145A, view);
    }
}
