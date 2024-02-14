package com.arlosoft.macrodroid.action;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.action.eb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3027eb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f8242a;

    /* renamed from: b */
    public final /* synthetic */ Button f8243b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8244c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8245d;

    /* renamed from: e */
    public final /* synthetic */ RadioButton f8246e;

    public /* synthetic */ C3027eb(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
        this.f8242a = editText;
        this.f8243b = button;
        this.f8244c = radioButton;
        this.f8245d = radioButton2;
        this.f8246e = radioButton3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        NotificationInteractionAction.m11624y3(this.f8242a, this.f8243b, this.f8244c, this.f8245d, this.f8246e, compoundButton, z);
    }
}
