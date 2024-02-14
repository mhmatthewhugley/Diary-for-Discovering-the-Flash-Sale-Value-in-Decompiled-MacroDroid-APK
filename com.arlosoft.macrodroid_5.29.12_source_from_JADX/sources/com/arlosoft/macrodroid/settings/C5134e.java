package com.arlosoft.macrodroid.settings;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.settings.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5134e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditCategoriesActivity f12900a;

    /* renamed from: c */
    public final /* synthetic */ boolean f12901c;

    /* renamed from: d */
    public final /* synthetic */ String f12902d;

    /* renamed from: f */
    public final /* synthetic */ int f12903f;

    public /* synthetic */ C5134e(EditCategoriesActivity editCategoriesActivity, boolean z, String str, int i) {
        this.f12900a = editCategoriesActivity;
        this.f12901c = z;
        this.f12902d = str;
        this.f12903f = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12900a.m19720p2(this.f12901c, this.f12902d, this.f12903f, dialogInterface, i);
    }
}
