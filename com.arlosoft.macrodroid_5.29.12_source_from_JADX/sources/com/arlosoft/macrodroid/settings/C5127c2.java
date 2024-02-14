package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: com.arlosoft.macrodroid.settings.c2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5127c2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f12868a;

    /* renamed from: c */
    public final /* synthetic */ SwitchCompat f12869c;

    /* renamed from: d */
    public final /* synthetic */ EditText f12870d;

    /* renamed from: f */
    public final /* synthetic */ Button f12871f;

    /* renamed from: g */
    public final /* synthetic */ SwitchCompat f12872g;

    /* renamed from: o */
    public final /* synthetic */ int[] f12873o;

    /* renamed from: p */
    public final /* synthetic */ Spinner f12874p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f12875s;

    public /* synthetic */ C5127c2(C5141f2 f2Var, SwitchCompat switchCompat, EditText editText, Button button, SwitchCompat switchCompat2, int[] iArr, Spinner spinner, AppCompatDialog appCompatDialog) {
        this.f12868a = f2Var;
        this.f12869c = switchCompat;
        this.f12870d = editText;
        this.f12871f = button;
        this.f12872g = switchCompat2;
        this.f12873o = iArr;
        this.f12874p = spinner;
        this.f12875s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f12868a.m19913x2(this.f12869c, this.f12870d, this.f12871f, this.f12872g, this.f12873o, this.f12874p, this.f12875s, view);
    }
}
