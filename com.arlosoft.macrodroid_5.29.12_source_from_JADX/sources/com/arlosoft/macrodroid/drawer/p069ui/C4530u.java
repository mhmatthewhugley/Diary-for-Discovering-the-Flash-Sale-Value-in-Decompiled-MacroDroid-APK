package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import android.widget.CheckBox;
import p149q1.C8152a;
import p149q1.C8153b;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4530u implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11511a;

    /* renamed from: c */
    public final /* synthetic */ C8153b f11512c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f11513d;

    /* renamed from: f */
    public final /* synthetic */ boolean f11514f;

    /* renamed from: g */
    public final /* synthetic */ C8152a f11515g;

    public /* synthetic */ C4530u(DrawerOptionsActivity drawerOptionsActivity, C8153b bVar, CheckBox checkBox, boolean z, C8152a aVar) {
        this.f11511a = drawerOptionsActivity;
        this.f11512c = bVar;
        this.f11513d = checkBox;
        this.f11514f = z;
        this.f11515g = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11511a.m17676a4(this.f11512c, this.f11513d, this.f11514f, this.f11515g, dialogInterface, i);
    }
}
