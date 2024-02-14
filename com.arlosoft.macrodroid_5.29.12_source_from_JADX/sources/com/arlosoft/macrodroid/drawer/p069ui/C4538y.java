package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import p149q1.C8152a;
import p149q1.C8161j;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4538y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11537a;

    /* renamed from: c */
    public final /* synthetic */ C8161j f11538c;

    /* renamed from: d */
    public final /* synthetic */ EditText f11539d;

    /* renamed from: f */
    public final /* synthetic */ long[] f11540f;

    /* renamed from: g */
    public final /* synthetic */ Spinner f11541g;

    /* renamed from: o */
    public final /* synthetic */ CheckBox f11542o;

    /* renamed from: p */
    public final /* synthetic */ C8152a f11543p;

    public /* synthetic */ C4538y(DrawerOptionsActivity drawerOptionsActivity, C8161j jVar, EditText editText, long[] jArr, Spinner spinner, CheckBox checkBox, C8152a aVar) {
        this.f11537a = drawerOptionsActivity;
        this.f11538c = jVar;
        this.f11539d = editText;
        this.f11540f = jArr;
        this.f11541g = spinner;
        this.f11542o = checkBox;
        this.f11543p = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11537a.m17615B3(this.f11538c, this.f11539d, this.f11540f, this.f11541g, this.f11542o, this.f11543p, dialogInterface, i);
    }
}
