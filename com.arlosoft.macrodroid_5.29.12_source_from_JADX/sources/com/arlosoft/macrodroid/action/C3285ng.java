package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.action.ng */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3285ng implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f8782a;

    public /* synthetic */ C3285ng(TextView textView) {
        this.f8782a = textView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetBrightnessAction.m12360u3(this.f8782a, compoundButton, z);
    }
}
