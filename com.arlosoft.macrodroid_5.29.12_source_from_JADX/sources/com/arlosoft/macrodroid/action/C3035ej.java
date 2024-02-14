package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.ej */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3035ej implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetWallpaperAction f8263a;

    /* renamed from: c */
    public final /* synthetic */ String[] f8264c;

    /* renamed from: d */
    public final /* synthetic */ String[] f8265d;

    /* renamed from: f */
    public final /* synthetic */ String[] f8266f;

    public /* synthetic */ C3035ej(SetWallpaperAction setWallpaperAction, String[] strArr, String[] strArr2, String[] strArr3) {
        this.f8263a = setWallpaperAction;
        this.f8264c = strArr;
        this.f8265d = strArr2;
        this.f8266f = strArr3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8263a.m12824w3(this.f8264c, this.f8265d, this.f8266f, dialogInterface, i);
    }
}
