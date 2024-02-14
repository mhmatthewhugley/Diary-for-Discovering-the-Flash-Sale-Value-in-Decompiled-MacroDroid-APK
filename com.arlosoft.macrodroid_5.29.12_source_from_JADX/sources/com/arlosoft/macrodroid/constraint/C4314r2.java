package com.arlosoft.macrodroid.constraint;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.constraint.r2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4314r2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f10975a;

    /* renamed from: b */
    public final /* synthetic */ Button f10976b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10977c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f10978d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f10979e;

    public /* synthetic */ C4314r2(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f10975a = editText;
        this.f10976b = button;
        this.f10977c = radioButton;
        this.f10978d = radioButton2;
        this.f10979e = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationPresentConstraint.m16859F3(this.f10975a, this.f10976b, this.f10977c, this.f10978d, this.f10979e, compoundButton, z);
    }
}
