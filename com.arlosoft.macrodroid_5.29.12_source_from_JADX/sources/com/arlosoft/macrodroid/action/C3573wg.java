package com.arlosoft.macrodroid.action;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.action.wg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3573wg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f9494a;

    public /* synthetic */ C3573wg(CheckBox checkBox) {
        this.f9494a = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetHotspotAction.m12423s3(this.f9494a, compoundButton, z);
    }
}
