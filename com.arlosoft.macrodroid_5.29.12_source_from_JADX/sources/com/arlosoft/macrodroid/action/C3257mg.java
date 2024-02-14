package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.action.mg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3257mg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f8704a;

    /* renamed from: b */
    public final /* synthetic */ SeekBar f8705b;

    public /* synthetic */ C3257mg(Spinner spinner, SeekBar seekBar) {
        this.f8704a = spinner;
        this.f8705b = seekBar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetBrightnessAction.m12361v3(this.f8704a, this.f8705b, compoundButton, z);
    }
}
