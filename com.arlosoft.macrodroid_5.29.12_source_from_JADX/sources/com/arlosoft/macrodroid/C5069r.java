package com.arlosoft.macrodroid;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5069r implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ExportImportActivity f12694a;

    /* renamed from: c */
    public final /* synthetic */ String f12695c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12696d;

    /* renamed from: f */
    public final /* synthetic */ boolean f12697f;

    public /* synthetic */ C5069r(ExportImportActivity exportImportActivity, String str, boolean z, boolean z2) {
        this.f12694a = exportImportActivity;
        this.f12695c = str;
        this.f12696d = z;
        this.f12697f = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12694a.m9472y2(this.f12695c, this.f12696d, this.f12697f, dialogInterface, i);
    }
}
