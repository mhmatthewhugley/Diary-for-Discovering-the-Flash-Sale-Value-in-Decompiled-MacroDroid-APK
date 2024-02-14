package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.v2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6160v2 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ EditText f14632A;

    /* renamed from: B */
    public final /* synthetic */ EditText f14633B;

    /* renamed from: C */
    public final /* synthetic */ EditText f14634C;

    /* renamed from: a */
    public final /* synthetic */ FloatingButtonTrigger f14635a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14636c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f14637d;

    /* renamed from: f */
    public final /* synthetic */ SeekBar f14638f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f14639g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f14640o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f14641p;

    /* renamed from: s */
    public final /* synthetic */ CheckBox f14642s;

    /* renamed from: z */
    public final /* synthetic */ Spinner f14643z;

    public /* synthetic */ C6160v2(FloatingButtonTrigger floatingButtonTrigger, AppCompatDialog appCompatDialog, SeekBar seekBar, SeekBar seekBar2, RadioButton radioButton, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Spinner spinner, EditText editText, EditText editText2, EditText editText3) {
        this.f14635a = floatingButtonTrigger;
        this.f14636c = appCompatDialog;
        this.f14637d = seekBar;
        this.f14638f = seekBar2;
        this.f14639g = radioButton;
        this.f14640o = checkBox;
        this.f14641p = checkBox2;
        this.f14642s = checkBox3;
        this.f14643z = spinner;
        this.f14632A = editText;
        this.f14633B = editText2;
        this.f14634C = editText3;
    }

    public final void onClick(View view) {
        this.f14635a.m22201K3(this.f14636c, this.f14637d, this.f14638f, this.f14639g, this.f14640o, this.f14641p, this.f14642s, this.f14643z, this.f14632A, this.f14633B, this.f14634C, view);
    }
}
