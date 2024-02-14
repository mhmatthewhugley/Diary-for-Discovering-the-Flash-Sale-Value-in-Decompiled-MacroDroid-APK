package com.arlosoft.macrodroid.action;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.action.xg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3600xg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f9581a;

    public /* synthetic */ C3600xg(CheckBox checkBox) {
        this.f9581a = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetHotspotAction.m12424t3(this.f9581a, compoundButton, z);
    }
}
