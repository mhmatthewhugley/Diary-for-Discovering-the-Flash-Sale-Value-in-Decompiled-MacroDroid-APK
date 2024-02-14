package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: com.arlosoft.macrodroid.action.kg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3201kg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetBrightnessAction f8599a;

    /* renamed from: c */
    public final /* synthetic */ SwitchCompat f8600c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f8601d;

    /* renamed from: f */
    public final /* synthetic */ Activity f8602f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f8603g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f8604o;

    /* renamed from: p */
    public final /* synthetic */ TextView f8605p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f8606s;

    public /* synthetic */ C3201kg(SetBrightnessAction setBrightnessAction, SwitchCompat switchCompat, SeekBar seekBar, Activity activity, CheckBox checkBox, CheckBox checkBox2, TextView textView, AppCompatDialog appCompatDialog) {
        this.f8599a = setBrightnessAction;
        this.f8600c = switchCompat;
        this.f8601d = seekBar;
        this.f8602f = activity;
        this.f8603g = checkBox;
        this.f8604o = checkBox2;
        this.f8605p = textView;
        this.f8606s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8599a.m12363x3(this.f8600c, this.f8601d, this.f8602f, this.f8603g, this.f8604o, this.f8605p, this.f8606s, view);
    }
}
