package com.arlosoft.macrodroid.action;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;

/* renamed from: com.arlosoft.macrodroid.action.qh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3372qh implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f8976a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f8977b;

    public /* synthetic */ C3372qh(ViewGroup viewGroup, ImageView imageView) {
        this.f8976a = viewGroup;
        this.f8977b = imageView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SetQuickSettingsStateAction.m12578C3(this.f8976a, this.f8977b, compoundButton, z);
    }
}
