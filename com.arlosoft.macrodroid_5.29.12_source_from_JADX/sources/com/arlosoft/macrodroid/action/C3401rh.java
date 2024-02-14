package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.rh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3401rh implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9048a;

    public /* synthetic */ C3401rh(EditText editText) {
        this.f9048a = editText;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetQuickSettingsStateAction.m12577B3(this.f9048a, compoundButton, z);
    }
}
