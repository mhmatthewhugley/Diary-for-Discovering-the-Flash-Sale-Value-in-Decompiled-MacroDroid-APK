package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.g9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5938g9 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WeatherTrigger f14066a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14067c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f14068d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14069f;

    public /* synthetic */ C5938g9(WeatherTrigger weatherTrigger, RadioButton radioButton, SeekBar seekBar, AppCompatDialog appCompatDialog) {
        this.f14066a = weatherTrigger;
        this.f14067c = radioButton;
        this.f14068d = seekBar;
        this.f14069f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14066a.m23592w3(this.f14067c, this.f14068d, this.f14069f, view);
    }
}
