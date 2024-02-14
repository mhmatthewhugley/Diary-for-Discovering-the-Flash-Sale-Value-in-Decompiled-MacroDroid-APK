package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.triggers.w5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6175w5 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ CheckBox f14674A;

    /* renamed from: B */
    public final /* synthetic */ AppCompatSpinner f14675B;

    /* renamed from: C */
    public final /* synthetic */ CheckBox f14676C;

    /* renamed from: D */
    public final /* synthetic */ AppCompatDialog f14677D;

    /* renamed from: a */
    public final /* synthetic */ NotificationTrigger f14678a;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f14679c;

    /* renamed from: d */
    public final /* synthetic */ EditText f14680d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14681f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f14682g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f14683o;

    /* renamed from: p */
    public final /* synthetic */ boolean f14684p;

    /* renamed from: s */
    public final /* synthetic */ ArrayList f14685s;

    /* renamed from: z */
    public final /* synthetic */ ArrayList f14686z;

    public /* synthetic */ C6175w5(NotificationTrigger notificationTrigger, RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, boolean z, ArrayList arrayList, ArrayList arrayList2, CheckBox checkBox2, AppCompatSpinner appCompatSpinner, CheckBox checkBox3, AppCompatDialog appCompatDialog) {
        this.f14678a = notificationTrigger;
        this.f14679c = radioButton;
        this.f14680d = editText;
        this.f14681f = radioButton2;
        this.f14682g = radioButton3;
        this.f14683o = checkBox;
        this.f14684p = z;
        this.f14685s = arrayList;
        this.f14686z = arrayList2;
        this.f14674A = checkBox2;
        this.f14675B = appCompatSpinner;
        this.f14676C = checkBox3;
        this.f14677D = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14678a.m22825S3(this.f14679c, this.f14680d, this.f14681f, this.f14682g, this.f14683o, this.f14684p, this.f14685s, this.f14686z, this.f14674A, this.f14675B, this.f14676C, this.f14677D, view);
    }
}
