package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4301p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CalendarConstraint f10934a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f10935c;

    /* renamed from: d */
    public final /* synthetic */ EditText f10936d;

    /* renamed from: f */
    public final /* synthetic */ EditText f10937f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f10938g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f10939o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f10940p;

    public /* synthetic */ C4301p(CalendarConstraint calendarConstraint, AppCompatDialog appCompatDialog, EditText editText, EditText editText2, Spinner spinner, CheckBox checkBox, CheckBox checkBox2) {
        this.f10934a = calendarConstraint;
        this.f10935c = appCompatDialog;
        this.f10936d = editText;
        this.f10937f = editText2;
        this.f10938g = spinner;
        this.f10939o = checkBox;
        this.f10940p = checkBox2;
    }

    public final void onClick(View view) {
        this.f10934a.m16268r3(this.f10935c, this.f10936d, this.f10937f, this.f10938g, this.f10939o, this.f10940p, view);
    }
}
