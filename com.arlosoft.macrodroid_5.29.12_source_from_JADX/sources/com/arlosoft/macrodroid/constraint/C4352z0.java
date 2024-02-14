package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.constraint.z0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4352z0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IpAddressConstraint f11083a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f11084c;

    /* renamed from: d */
    public final /* synthetic */ EditText f11085d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f11086f;

    public /* synthetic */ C4352z0(IpAddressConstraint ipAddressConstraint, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog) {
        this.f11083a = ipAddressConstraint;
        this.f11084c = radioButton;
        this.f11085d = editText;
        this.f11086f = appCompatDialog;
    }

    public final void onClick(View view) {
        IpAddressConstraint.m16570k3(this.f11083a, this.f11084c, this.f11085d, this.f11086f, view);
    }
}
