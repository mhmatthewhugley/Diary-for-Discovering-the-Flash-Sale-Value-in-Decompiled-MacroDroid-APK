package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.xc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3596xc implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9572a;

    /* renamed from: b */
    public final /* synthetic */ Spinner f9573b;

    /* renamed from: c */
    public final /* synthetic */ Spinner f9574c;

    /* renamed from: d */
    public final /* synthetic */ Button f9575d;

    public /* synthetic */ C3596xc(EditText editText, Spinner spinner, Spinner spinner2, Button button) {
        this.f9572a = editText;
        this.f9573b = spinner;
        this.f9574c = spinner2;
        this.f9575d = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        PebbleAction.m11809M3(this.f9572a, this.f9573b, this.f9574c, this.f9575d, compoundButton, z);
    }
}
