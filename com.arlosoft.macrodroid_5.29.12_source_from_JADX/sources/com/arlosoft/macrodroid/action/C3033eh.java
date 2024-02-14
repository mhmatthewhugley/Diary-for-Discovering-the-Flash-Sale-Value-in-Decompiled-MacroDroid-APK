package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.eh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3033eh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetLanguageAction f8260a;

    /* renamed from: c */
    public final /* synthetic */ List f8261c;

    public /* synthetic */ C3033eh(SetLanguageAction setLanguageAction, List list) {
        this.f8260a = setLanguageAction;
        this.f8261c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8260a.m12470u3(this.f8261c, dialogInterface, i);
    }
}
