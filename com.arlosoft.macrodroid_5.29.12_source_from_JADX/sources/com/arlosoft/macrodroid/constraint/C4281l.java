package com.arlosoft.macrodroid.constraint;

import android.view.ViewGroup;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.constraint.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4281l implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f10898a;

    public /* synthetic */ C4281l(ViewGroup viewGroup) {
        this.f10898a = viewGroup;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        BrightnessConstraint.m16248l3(this.f10898a, compoundButton, z);
    }
}
