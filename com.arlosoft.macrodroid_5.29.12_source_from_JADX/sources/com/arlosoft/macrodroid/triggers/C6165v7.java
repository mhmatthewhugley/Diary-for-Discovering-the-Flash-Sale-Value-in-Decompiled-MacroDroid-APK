package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.triggers.v7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6165v7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SunriseSunsetTrigger f14655a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f14656c;

    /* renamed from: d */
    public final /* synthetic */ Spinner f14657d;

    /* renamed from: f */
    public final /* synthetic */ NumberPicker f14658f;

    /* renamed from: g */
    public final /* synthetic */ NumberPicker f14659g;

    public /* synthetic */ C6165v7(SunriseSunsetTrigger sunriseSunsetTrigger, AppCompatDialog appCompatDialog, Spinner spinner, NumberPicker numberPicker, NumberPicker numberPicker2) {
        this.f14655a = sunriseSunsetTrigger;
        this.f14656c = appCompatDialog;
        this.f14657d = spinner;
        this.f14658f = numberPicker;
        this.f14659g = numberPicker2;
    }

    public final void onClick(View view) {
        this.f14655a.m23274n3(this.f14656c, this.f14657d, this.f14658f, this.f14659g, view);
    }
}
