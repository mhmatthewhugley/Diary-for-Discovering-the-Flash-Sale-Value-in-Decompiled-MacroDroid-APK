package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import android.widget.ViewFlipper;

/* renamed from: com.arlosoft.macrodroid.action.cg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2975cg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewFlipper f8128a;

    public /* synthetic */ C2975cg(ViewFlipper viewFlipper) {
        this.f8128a = viewFlipper;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8128a.setDisplayedChild(r2 ^ true ? 1 : 0);
    }
}
