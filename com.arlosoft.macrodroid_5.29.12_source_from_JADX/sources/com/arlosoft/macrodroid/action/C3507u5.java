package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.u5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3507u5 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ Spinner f9331A;

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f9332a;

    /* renamed from: c */
    public final /* synthetic */ FloatingButtonConfigureAction f9333c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f9334d;

    /* renamed from: f */
    public final /* synthetic */ SeekBar f9335f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f9336g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f9337o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f9338p;

    /* renamed from: s */
    public final /* synthetic */ EditText f9339s;

    /* renamed from: z */
    public final /* synthetic */ EditText f9340z;

    public /* synthetic */ C3507u5(AppCompatDialog appCompatDialog, FloatingButtonConfigureAction floatingButtonConfigureAction, SeekBar seekBar, SeekBar seekBar2, RadioButton radioButton, CheckBox checkBox, CheckBox checkBox2, EditText editText, EditText editText2, Spinner spinner) {
        this.f9332a = appCompatDialog;
        this.f9333c = floatingButtonConfigureAction;
        this.f9334d = seekBar;
        this.f9335f = seekBar2;
        this.f9336g = radioButton;
        this.f9337o = checkBox;
        this.f9338p = checkBox2;
        this.f9339s = editText;
        this.f9340z = editText2;
        this.f9331A = spinner;
    }

    public final void onClick(View view) {
        FloatingButtonConfigureAction.m10728C3(this.f9332a, this.f9333c, this.f9334d, this.f9335f, this.f9336g, this.f9337o, this.f9338p, this.f9339s, this.f9340z, this.f9331A, view);
    }
}
