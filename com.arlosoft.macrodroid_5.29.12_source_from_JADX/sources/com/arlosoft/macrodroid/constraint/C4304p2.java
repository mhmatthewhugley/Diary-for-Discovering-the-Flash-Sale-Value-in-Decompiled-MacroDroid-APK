package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.p2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4304p2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationPresentConstraint f10947a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f10948c;

    /* renamed from: d */
    public final /* synthetic */ EditText f10949d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f10950f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f10951g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f10952o;

    /* renamed from: p */
    public final /* synthetic */ CheckBox f10953p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f10954s;

    public /* synthetic */ C4304p2(NotificationPresentConstraint notificationPresentConstraint, RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog) {
        this.f10947a = notificationPresentConstraint;
        this.f10948c = radioButton;
        this.f10949d = editText;
        this.f10950f = radioButton2;
        this.f10951g = radioButton3;
        this.f10952o = checkBox;
        this.f10953p = checkBox2;
        this.f10954s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10947a.m16863J3(this.f10948c, this.f10949d, this.f10950f, this.f10951g, this.f10952o, this.f10953p, this.f10954s, view);
    }
}
