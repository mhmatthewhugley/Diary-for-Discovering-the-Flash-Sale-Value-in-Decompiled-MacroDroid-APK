package com.arlosoft.macrodroid.triggers;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.triggers.u6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6152u6 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f14619a;

    /* renamed from: b */
    public final /* synthetic */ Button f14620b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14621c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f14622d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f14623e;

    public /* synthetic */ C6152u6(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f14619a = editText;
        this.f14620b = button;
        this.f14621c = radioButton;
        this.f14622d = radioButton2;
        this.f14623e = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SMSSentTrigger.m23058v3(this.f14619a, this.f14620b, this.f14621c, this.f14622d, this.f14623e, compoundButton, z);
    }
}
