package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.cb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2970cb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RadioButton f8105a;

    /* renamed from: c */
    public final /* synthetic */ NotificationInteractionAction f8106c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f8107d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f8108f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f8109g;

    /* renamed from: o */
    public final /* synthetic */ Spinner f8110o;

    /* renamed from: p */
    public final /* synthetic */ EditText f8111p;

    /* renamed from: s */
    public final /* synthetic */ CheckBox f8112s;

    /* renamed from: z */
    public final /* synthetic */ AppCompatDialog f8113z;

    public /* synthetic */ C2970cb(RadioButton radioButton, NotificationInteractionAction notificationInteractionAction, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, Spinner spinner, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f8105a = radioButton;
        this.f8106c = notificationInteractionAction;
        this.f8107d = radioButton2;
        this.f8108f = radioButton3;
        this.f8109g = radioButton4;
        this.f8110o = spinner;
        this.f8111p = editText;
        this.f8112s = checkBox;
        this.f8113z = appCompatDialog;
    }

    public final void onClick(View view) {
        NotificationInteractionAction.m11604C3(this.f8105a, this.f8106c, this.f8107d, this.f8108f, this.f8109g, this.f8110o, this.f8111p, this.f8112s, this.f8113z, view);
    }
}
