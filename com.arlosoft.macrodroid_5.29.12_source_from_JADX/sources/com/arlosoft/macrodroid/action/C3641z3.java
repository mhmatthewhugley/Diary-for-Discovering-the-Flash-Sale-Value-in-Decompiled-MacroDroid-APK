package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.z3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3641z3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DimScreenAction f9669a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f9670c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f9671d;

    /* renamed from: f */
    public final /* synthetic */ SeekBar f9672f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f9673g;

    public /* synthetic */ C3641z3(DimScreenAction dimScreenAction, RadioButton radioButton, Spinner spinner, SeekBar seekBar, AppCompatDialog appCompatDialog) {
        this.f9669a = dimScreenAction;
        this.f9670c = radioButton;
        this.f9671d = spinner;
        this.f9672f = seekBar;
        this.f9673g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9669a.m10396r3(this.f9670c, this.f9671d, this.f9672f, this.f9673g, view);
    }
}
