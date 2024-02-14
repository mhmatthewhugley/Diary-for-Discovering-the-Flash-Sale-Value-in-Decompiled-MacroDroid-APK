package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4526s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11503a;

    /* renamed from: c */
    public final /* synthetic */ List f11504c;

    /* renamed from: d */
    public final /* synthetic */ String[] f11505d;

    public /* synthetic */ C4526s(DrawerOptionsActivity drawerOptionsActivity, List list, String[] strArr) {
        this.f11503a = drawerOptionsActivity;
        this.f11504c = list;
        this.f11505d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11503a.m17643P3(this.f11504c, this.f11505d, dialogInterface, i);
    }
}
