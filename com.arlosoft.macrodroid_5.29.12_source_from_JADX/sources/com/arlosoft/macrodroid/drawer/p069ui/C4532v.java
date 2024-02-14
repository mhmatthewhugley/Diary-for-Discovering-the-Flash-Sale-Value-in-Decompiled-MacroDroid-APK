package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.DialogInterface;
import android.widget.SeekBar;
import p149q1.C8152a;
import p149q1.C8153b;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4532v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerOptionsActivity f11519a;

    /* renamed from: c */
    public final /* synthetic */ C8153b f11520c;

    /* renamed from: d */
    public final /* synthetic */ SeekBar f11521d;

    /* renamed from: f */
    public final /* synthetic */ boolean f11522f;

    /* renamed from: g */
    public final /* synthetic */ C8152a f11523g;

    public /* synthetic */ C4532v(DrawerOptionsActivity drawerOptionsActivity, C8153b bVar, SeekBar seekBar, boolean z, C8152a aVar) {
        this.f11519a = drawerOptionsActivity;
        this.f11520c = bVar;
        this.f11521d = seekBar;
        this.f11522f = z;
        this.f11523g = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11519a.m17712p3(this.f11520c, this.f11521d, this.f11522f, this.f11523g, dialogInterface, i);
    }
}
