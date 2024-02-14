package com.arlosoft.macrodroid.action;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.te */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3480te implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f9285a;

    /* renamed from: b */
    public final /* synthetic */ Button f9286b;

    /* renamed from: c */
    public final /* synthetic */ EditText f9287c;

    public /* synthetic */ C3480te(ViewGroup viewGroup, Button button, EditText editText) {
        this.f9285a = viewGroup;
        this.f9286b = button;
        this.f9287c = editText;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        RecordMicrophoneAction.m12008D3(this.f9285a, this.f9286b, this.f9287c, compoundButton, z);
    }
}
