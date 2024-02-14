package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.NumberPicker;

/* renamed from: com.arlosoft.macrodroid.action.x1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3585x1 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ NumberPicker f9520A;

    /* renamed from: B */
    public final /* synthetic */ CheckBox f9521B;

    /* renamed from: C */
    public final /* synthetic */ AppCompatDialog f9522C;

    /* renamed from: a */
    public final /* synthetic */ ClearNotificationsAction f9523a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f9524c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f9525d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f9526f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f9527g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f9528o;

    /* renamed from: p */
    public final /* synthetic */ EditText f9529p;

    /* renamed from: s */
    public final /* synthetic */ NumberPicker f9530s;

    /* renamed from: z */
    public final /* synthetic */ NumberPicker f9531z;

    public /* synthetic */ C3585x1(ClearNotificationsAction clearNotificationsAction, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, CheckBox checkBox, EditText editText, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, CheckBox checkBox2, AppCompatDialog appCompatDialog) {
        this.f9523a = clearNotificationsAction;
        this.f9524c = radioButton;
        this.f9525d = radioButton2;
        this.f9526f = radioButton3;
        this.f9527g = radioButton4;
        this.f9528o = checkBox;
        this.f9529p = editText;
        this.f9530s = numberPicker;
        this.f9531z = numberPicker2;
        this.f9520A = numberPicker3;
        this.f9521B = checkBox2;
        this.f9522C = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9523a.m10059G3(this.f9524c, this.f9525d, this.f9526f, this.f9527g, this.f9528o, this.f9529p, this.f9530s, this.f9531z, this.f9520A, this.f9521B, this.f9522C, view);
    }
}
