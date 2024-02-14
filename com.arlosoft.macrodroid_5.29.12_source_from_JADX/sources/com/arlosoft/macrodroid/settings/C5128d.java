package com.arlosoft.macrodroid.settings;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.settings.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5128d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditCategoriesActivity f12876a;

    /* renamed from: c */
    public final /* synthetic */ String f12877c;

    /* renamed from: d */
    public final /* synthetic */ int f12878d;

    /* renamed from: f */
    public final /* synthetic */ List f12879f;

    public /* synthetic */ C5128d(EditCategoriesActivity editCategoriesActivity, String str, int i, List list) {
        this.f12876a = editCategoriesActivity;
        this.f12877c = str;
        this.f12878d = i;
        this.f12879f = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12876a.m19718n2(this.f12877c, this.f12878d, this.f12879f, dialogInterface, i);
    }
}
