package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.a6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2809a6 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ SeekBar f7724A;

    /* renamed from: B */
    public final /* synthetic */ SeekBar f7725B;

    /* renamed from: C */
    public final /* synthetic */ CheckBox f7726C;

    /* renamed from: D */
    public final /* synthetic */ ImageButton f7727D;

    /* renamed from: E */
    public final /* synthetic */ ImageButton f7728E;

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f7729a;

    /* renamed from: c */
    public final /* synthetic */ FloatingTextAction f7730c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f7731d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f7732f;

    /* renamed from: g */
    public final /* synthetic */ SeekBar f7733g;

    /* renamed from: o */
    public final /* synthetic */ SeekBar f7734o;

    /* renamed from: p */
    public final /* synthetic */ SeekBar f7735p;

    /* renamed from: s */
    public final /* synthetic */ EditText f7736s;

    /* renamed from: z */
    public final /* synthetic */ EditText f7737z;

    public /* synthetic */ C2809a6(AppCompatDialog appCompatDialog, FloatingTextAction floatingTextAction, RadioButton radioButton, RadioButton radioButton2, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, EditText editText, EditText editText2, SeekBar seekBar4, SeekBar seekBar5, CheckBox checkBox, ImageButton imageButton, ImageButton imageButton2) {
        this.f7729a = appCompatDialog;
        this.f7730c = floatingTextAction;
        this.f7731d = radioButton;
        this.f7732f = radioButton2;
        this.f7733g = seekBar;
        this.f7734o = seekBar2;
        this.f7735p = seekBar3;
        this.f7736s = editText;
        this.f7737z = editText2;
        this.f7724A = seekBar4;
        this.f7725B = seekBar5;
        this.f7726C = checkBox;
        this.f7727D = imageButton;
        this.f7728E = imageButton2;
    }

    public final void onClick(View view) {
        FloatingTextAction.m10775G3(this.f7729a, this.f7730c, this.f7731d, this.f7732f, this.f7733g, this.f7734o, this.f7735p, this.f7736s, this.f7737z, this.f7724A, this.f7725B, this.f7726C, this.f7727D, this.f7728E, view);
    }
}
