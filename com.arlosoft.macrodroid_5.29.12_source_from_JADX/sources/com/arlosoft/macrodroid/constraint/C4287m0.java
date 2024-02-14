package com.arlosoft.macrodroid.constraint;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.constraint.m0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4287m0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox[] f10908a;

    /* renamed from: b */
    public final /* synthetic */ Button f10909b;

    public /* synthetic */ C4287m0(CheckBox[] checkBoxArr, Button button) {
        this.f10908a = checkBoxArr;
        this.f10909b = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FaceUpDownConstraint.m16471v3(this.f10908a, this.f10909b, compoundButton, z);
    }
}
