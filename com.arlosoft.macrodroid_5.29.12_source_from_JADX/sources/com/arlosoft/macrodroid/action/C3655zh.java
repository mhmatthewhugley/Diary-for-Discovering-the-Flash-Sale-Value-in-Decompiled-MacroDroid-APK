package com.arlosoft.macrodroid.action;

import android.widget.CheckBox;
import android.widget.CompoundButton;

/* renamed from: com.arlosoft.macrodroid.action.zh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3655zh implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f9699a;

    public /* synthetic */ C3655zh(CheckBox checkBox) {
        this.f9699a = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9699a.setEnabled(z);
    }
}
