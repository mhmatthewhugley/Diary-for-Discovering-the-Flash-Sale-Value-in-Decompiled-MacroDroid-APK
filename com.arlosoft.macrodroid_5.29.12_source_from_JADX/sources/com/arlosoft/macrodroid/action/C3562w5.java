package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.w5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3562w5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9467a;

    /* renamed from: b */
    public final /* synthetic */ EditText f9468b;

    public /* synthetic */ C3562w5(EditText editText, EditText editText2) {
        this.f9467a = editText;
        this.f9468b = editText2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FloatingButtonConfigureAction.m10753w3(this.f9467a, this.f9468b, compoundButton, z);
    }
}
