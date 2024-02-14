package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.ka */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3195ka implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f8587a;

    public /* synthetic */ C3195ka(Spinner spinner) {
        this.f8587a = spinner;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8587a.setEnabled(z);
    }
}
