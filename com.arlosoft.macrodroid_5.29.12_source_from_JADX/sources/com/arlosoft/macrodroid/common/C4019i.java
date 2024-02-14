package com.arlosoft.macrodroid.common;

import android.widget.CompoundButton;
import android.widget.RadioButton;

/* renamed from: com.arlosoft.macrodroid.common.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4019i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C4022j f10414a;

    /* renamed from: b */
    public final /* synthetic */ int f10415b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10416c;

    public /* synthetic */ C4019i(C4022j jVar, int i, RadioButton radioButton) {
        this.f10414a = jVar;
        this.f10415b = i;
        this.f10416c = radioButton;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f10414a.m15692d(this.f10415b, this.f10416c, compoundButton, z);
    }
}
