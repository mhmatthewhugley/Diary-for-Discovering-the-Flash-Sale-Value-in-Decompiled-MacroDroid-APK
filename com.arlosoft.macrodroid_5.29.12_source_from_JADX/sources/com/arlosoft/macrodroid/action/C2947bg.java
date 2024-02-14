package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.action.bg */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2947bg implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ Spinner f8047A;

    /* renamed from: B */
    public final /* synthetic */ AppCompatDialog f8048B;

    /* renamed from: a */
    public final /* synthetic */ SetAlarmClockAction f8049a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f8050c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox[] f8051d;

    /* renamed from: f */
    public final /* synthetic */ TimePicker f8052f;

    /* renamed from: g */
    public final /* synthetic */ TimePicker f8053g;

    /* renamed from: o */
    public final /* synthetic */ EditText f8054o;

    /* renamed from: p */
    public final /* synthetic */ RadioButton f8055p;

    /* renamed from: s */
    public final /* synthetic */ NumberPicker f8056s;

    /* renamed from: z */
    public final /* synthetic */ NumberPicker f8057z;

    public /* synthetic */ C2947bg(SetAlarmClockAction setAlarmClockAction, RadioButton radioButton, CheckBox[] checkBoxArr, TimePicker timePicker, TimePicker timePicker2, EditText editText, RadioButton radioButton2, NumberPicker numberPicker, NumberPicker numberPicker2, Spinner spinner, AppCompatDialog appCompatDialog) {
        this.f8049a = setAlarmClockAction;
        this.f8050c = radioButton;
        this.f8051d = checkBoxArr;
        this.f8052f = timePicker;
        this.f8053g = timePicker2;
        this.f8054o = editText;
        this.f8055p = radioButton2;
        this.f8056s = numberPicker;
        this.f8057z = numberPicker2;
        this.f8047A = spinner;
        this.f8048B = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8049a.m12255L3(this.f8050c, this.f8051d, this.f8052f, this.f8053g, this.f8054o, this.f8055p, this.f8056s, this.f8057z, this.f8047A, this.f8048B, view);
    }
}
