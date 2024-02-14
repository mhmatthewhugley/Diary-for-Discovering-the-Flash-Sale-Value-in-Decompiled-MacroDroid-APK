package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.triggers.c1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5882c1 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ NumberPicker f13959A;

    /* renamed from: B */
    public final /* synthetic */ CheckBox f13960B;

    /* renamed from: C */
    public final /* synthetic */ CheckBox f13961C;

    /* renamed from: D */
    public final /* synthetic */ CheckBox f13962D;

    /* renamed from: a */
    public final /* synthetic */ CalendarTrigger f13963a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f13964c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f13965d;

    /* renamed from: f */
    public final /* synthetic */ EditText f13966f;

    /* renamed from: g */
    public final /* synthetic */ EditText f13967g;

    /* renamed from: o */
    public final /* synthetic */ Spinner f13968o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f13969p;

    /* renamed from: s */
    public final /* synthetic */ NumberPicker f13970s;

    /* renamed from: z */
    public final /* synthetic */ NumberPicker f13971z;

    public /* synthetic */ C5882c1(CalendarTrigger calendarTrigger, AppCompatDialog appCompatDialog, CheckBox checkBox, EditText editText, EditText editText2, Spinner spinner, CheckBox checkBox2, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5) {
        this.f13963a = calendarTrigger;
        this.f13964c = appCompatDialog;
        this.f13965d = checkBox;
        this.f13966f = editText;
        this.f13967g = editText2;
        this.f13968o = spinner;
        this.f13969p = checkBox2;
        this.f13970s = numberPicker;
        this.f13971z = numberPicker2;
        this.f13959A = numberPicker3;
        this.f13960B = checkBox3;
        this.f13961C = checkBox4;
        this.f13962D = checkBox5;
    }

    public final void onClick(View view) {
        this.f13963a.m21759D3(this.f13964c, this.f13965d, this.f13966f, this.f13967g, this.f13968o, this.f13969p, this.f13970s, this.f13971z, this.f13959A, this.f13960B, this.f13961C, this.f13962D, view);
    }
}
