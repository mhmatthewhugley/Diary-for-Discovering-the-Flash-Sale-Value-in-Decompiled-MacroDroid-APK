package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4528t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11507a;

    /* renamed from: c */
    public final /* synthetic */ List f11508c;

    /* renamed from: d */
    public final /* synthetic */ String[] f11509d;

    public /* synthetic */ C4528t(DrawerOptionsActivity drawerOptionsActivity, List list, String[] strArr) {
        this.f11507a = drawerOptionsActivity;
        this.f11508c = list;
        this.f11509d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11507a.m17726w3(this.f11508c, this.f11509d, dialogInterface, i);
    }
}
