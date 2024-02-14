package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import android.widget.EditText;
import p149q1.C8152a;
import p149q1.C8158g;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4536x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11531a;

    /* renamed from: c */
    public final /* synthetic */ C8158g f11532c;

    /* renamed from: d */
    public final /* synthetic */ EditText f11533d;

    /* renamed from: f */
    public final /* synthetic */ boolean f11534f;

    /* renamed from: g */
    public final /* synthetic */ C8152a f11535g;

    public /* synthetic */ C4536x(DrawerOptionsActivity drawerOptionsActivity, C8158g gVar, EditText editText, boolean z, C8152a aVar) {
        this.f11531a = drawerOptionsActivity;
        this.f11532c = gVar;
        this.f11533d = editText;
        this.f11534f = z;
        this.f11535g = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11531a.m17635L3(this.f11532c, this.f11533d, this.f11534f, this.f11535g, dialogInterface, i);
    }
}
