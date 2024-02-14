package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.xa */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3594xa implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ List f9546A;

    /* renamed from: B */
    public final /* synthetic */ Spinner f9547B;

    /* renamed from: C */
    public final /* synthetic */ CheckBox f9548C;

    /* renamed from: D */
    public final /* synthetic */ CheckBox f9549D;

    /* renamed from: E */
    public final /* synthetic */ CheckBox f9550E;

    /* renamed from: F */
    public final /* synthetic */ LinearLayout f9551F;

    /* renamed from: a */
    public final /* synthetic */ NotificationAction f9552a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f9553c;

    /* renamed from: d */
    public final /* synthetic */ EditText f9554d;

    /* renamed from: f */
    public final /* synthetic */ EditText f9555f;

    /* renamed from: g */
    public final /* synthetic */ CheckBox f9556g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f9557o;

    /* renamed from: p */
    public final /* synthetic */ Spinner f9558p;

    /* renamed from: s */
    public final /* synthetic */ String[] f9559s;

    /* renamed from: z */
    public final /* synthetic */ Spinner f9560z;

    public /* synthetic */ C3594xa(NotificationAction notificationAction, AppCompatDialog appCompatDialog, EditText editText, EditText editText2, CheckBox checkBox, CheckBox checkBox2, Spinner spinner, String[] strArr, Spinner spinner2, List list, Spinner spinner3, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, LinearLayout linearLayout) {
        this.f9552a = notificationAction;
        this.f9553c = appCompatDialog;
        this.f9554d = editText;
        this.f9555f = editText2;
        this.f9556g = checkBox;
        this.f9557o = checkBox2;
        this.f9558p = spinner;
        this.f9559s = strArr;
        this.f9560z = spinner2;
        this.f9546A = list;
        this.f9547B = spinner3;
        this.f9548C = checkBox3;
        this.f9549D = checkBox4;
        this.f9550E = checkBox5;
        this.f9551F = linearLayout;
    }

    public final void onClick(View view) {
        this.f9552a.m11543a4(this.f9553c, this.f9554d, this.f9555f, this.f9556g, this.f9557o, this.f9558p, this.f9559s, this.f9560z, this.f9546A, this.f9547B, this.f9548C, this.f9549D, this.f9550E, this.f9551F, view);
    }
}
