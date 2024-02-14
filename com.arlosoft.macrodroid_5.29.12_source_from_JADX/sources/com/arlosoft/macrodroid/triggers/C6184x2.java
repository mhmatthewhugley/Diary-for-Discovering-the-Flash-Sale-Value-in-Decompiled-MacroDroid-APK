package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.triggers.x2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6184x2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f14701a;

    /* renamed from: b */
    public final /* synthetic */ EditText f14702b;

    public /* synthetic */ C6184x2(EditText editText, EditText editText2) {
        this.f14701a = editText;
        this.f14702b = editText2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FloatingButtonTrigger.m22195E3(this.f14701a, this.f14702b, compoundButton, z);
    }
}
