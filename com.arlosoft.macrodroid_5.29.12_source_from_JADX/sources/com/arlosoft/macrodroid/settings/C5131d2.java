package com.arlosoft.macrodroid.settings;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.settings.d2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5131d2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f12882a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f12883b;

    /* renamed from: c */
    public final /* synthetic */ TextView f12884c;

    /* renamed from: d */
    public final /* synthetic */ TextView f12885d;

    /* renamed from: e */
    public final /* synthetic */ Spinner f12886e;

    public /* synthetic */ C5131d2(ViewGroup viewGroup, ViewGroup viewGroup2, TextView textView, TextView textView2, Spinner spinner) {
        this.f12882a = viewGroup;
        this.f12883b = viewGroup2;
        this.f12884c = textView;
        this.f12885d = textView2;
        this.f12886e = spinner;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C5141f2.m19911w2(this.f12882a, this.f12883b, this.f12884c, this.f12885d, this.f12886e, compoundButton, z);
    }
}
