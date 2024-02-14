package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import android.widget.EditText;
import p149q1.C8152a;
import p149q1.C8155d;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4534w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11526a;

    /* renamed from: c */
    public final /* synthetic */ C8155d f11527c;

    /* renamed from: d */
    public final /* synthetic */ EditText f11528d;

    /* renamed from: f */
    public final /* synthetic */ C8152a f11529f;

    public /* synthetic */ C4534w(DrawerOptionsActivity drawerOptionsActivity, C8155d dVar, EditText editText, C8152a aVar) {
        this.f11526a = drawerOptionsActivity;
        this.f11527c = dVar;
        this.f11528d = editText;
        this.f11529f = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11526a.m17625G3(this.f11527c, this.f11528d, this.f11529f, dialogInterface, i);
    }
}
