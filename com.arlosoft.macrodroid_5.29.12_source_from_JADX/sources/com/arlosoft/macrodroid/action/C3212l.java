package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.action.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3212l implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ TimePicker f8618A;

    /* renamed from: B */
    public final /* synthetic */ RadioButton f8619B;

    /* renamed from: C */
    public final /* synthetic */ CheckBox f8620C;

    /* renamed from: D */
    public final /* synthetic */ Spinner f8621D;

    /* renamed from: E */
    public final /* synthetic */ RadioButton f8622E;

    /* renamed from: F */
    public final /* synthetic */ Spinner f8623F;

    /* renamed from: G */
    public final /* synthetic */ Spinner f8624G;

    /* renamed from: H */
    public final /* synthetic */ AppCompatDialog f8625H;

    /* renamed from: a */
    public final /* synthetic */ AddCalendarEntryAction f8626a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8627c;

    /* renamed from: d */
    public final /* synthetic */ EditText f8628d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8629f;

    /* renamed from: g */
    public final /* synthetic */ NumberPicker f8630g;

    /* renamed from: o */
    public final /* synthetic */ NumberPicker f8631o;

    /* renamed from: p */
    public final /* synthetic */ NumberPicker f8632p;

    /* renamed from: s */
    public final /* synthetic */ NumberPicker f8633s;

    /* renamed from: z */
    public final /* synthetic */ NumberPicker f8634z;

    public /* synthetic */ C3212l(AddCalendarEntryAction addCalendarEntryAction, EditText editText, EditText editText2, EditText editText3, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, NumberPicker numberPicker5, TimePicker timePicker, RadioButton radioButton, CheckBox checkBox, Spinner spinner, RadioButton radioButton2, Spinner spinner2, Spinner spinner3, AppCompatDialog appCompatDialog) {
        this.f8626a = addCalendarEntryAction;
        this.f8627c = editText;
        this.f8628d = editText2;
        this.f8629f = editText3;
        this.f8630g = numberPicker;
        this.f8631o = numberPicker2;
        this.f8632p = numberPicker3;
        this.f8633s = numberPicker4;
        this.f8634z = numberPicker5;
        this.f8618A = timePicker;
        this.f8619B = radioButton;
        this.f8620C = checkBox;
        this.f8621D = spinner;
        this.f8622E = radioButton2;
        this.f8623F = spinner2;
        this.f8624G = spinner3;
        this.f8625H = appCompatDialog;
    }

    public final void onClick(View view) {
        View view2 = view;
        AddCalendarEntryAction addCalendarEntryAction = this.f8626a;
        AddCalendarEntryAction addCalendarEntryAction2 = addCalendarEntryAction;
        addCalendarEntryAction2.m9691z3(this.f8627c, this.f8628d, this.f8629f, this.f8630g, this.f8631o, this.f8632p, this.f8633s, this.f8634z, this.f8618A, this.f8619B, this.f8620C, this.f8621D, this.f8622E, this.f8623F, this.f8624G, this.f8625H, view2);
    }
}
