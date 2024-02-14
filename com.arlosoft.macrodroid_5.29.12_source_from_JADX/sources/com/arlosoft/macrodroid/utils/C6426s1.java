package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.utils.C6440u1;

/* renamed from: com.arlosoft.macrodroid.utils.s1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6426s1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f15047a;

    /* renamed from: c */
    public final /* synthetic */ SelectableItem f15048c;

    /* renamed from: d */
    public final /* synthetic */ Activity f15049d;

    /* renamed from: f */
    public final /* synthetic */ int f15050f;

    /* renamed from: g */
    public final /* synthetic */ RadioButton f15051g;

    /* renamed from: o */
    public final /* synthetic */ C6440u1.C6442b f15052o;

    /* renamed from: p */
    public final /* synthetic */ boolean f15053p;

    /* renamed from: s */
    public final /* synthetic */ Spinner f15054s;

    /* renamed from: z */
    public final /* synthetic */ AppCompatDialog f15055z;

    public /* synthetic */ C6426s1(EditText editText, SelectableItem selectableItem, Activity activity, int i, RadioButton radioButton, C6440u1.C6442b bVar, boolean z, Spinner spinner, AppCompatDialog appCompatDialog) {
        this.f15047a = editText;
        this.f15048c = selectableItem;
        this.f15049d = activity;
        this.f15050f = i;
        this.f15051g = radioButton;
        this.f15052o = bVar;
        this.f15053p = z;
        this.f15054s = spinner;
        this.f15055z = appCompatDialog;
    }

    public final void onClick(View view) {
        C6440u1.m24750g(this.f15047a, this.f15048c, this.f15049d, this.f15050f, this.f15051g, this.f15052o, this.f15053p, this.f15054s, this.f15055z, view);
    }
}
