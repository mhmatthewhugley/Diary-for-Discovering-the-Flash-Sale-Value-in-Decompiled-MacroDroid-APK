package com.arlosoft.macrodroid.action;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.ac */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2815ac implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ OpenWebPageAction f7743a;

    /* renamed from: b */
    public final /* synthetic */ CheckBox f7744b;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f7745c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f7746d;

    /* renamed from: e */
    public final /* synthetic */ CheckBox f7747e;

    /* renamed from: f */
    public final /* synthetic */ Spinner f7748f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f7749g;

    public /* synthetic */ C2815ac(OpenWebPageAction openWebPageAction, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, Spinner spinner, Spinner spinner2) {
        this.f7743a = openWebPageAction;
        this.f7744b = checkBox;
        this.f7745c = checkBox2;
        this.f7746d = checkBox3;
        this.f7747e = checkBox4;
        this.f7748f = spinner;
        this.f7749g = spinner2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f7743a.m11687A3(this.f7744b, this.f7745c, this.f7746d, this.f7747e, this.f7748f, this.f7749g, compoundButton, z);
    }
}
