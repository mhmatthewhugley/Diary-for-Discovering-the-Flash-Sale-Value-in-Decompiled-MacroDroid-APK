package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.action.dh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3005dh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetLanguageAction f8198a;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f8199c;

    /* renamed from: d */
    public final /* synthetic */ Locale[] f8200d;

    public /* synthetic */ C3005dh(SetLanguageAction setLanguageAction, ArrayList arrayList, Locale[] localeArr) {
        this.f8198a = setLanguageAction;
        this.f8199c = arrayList;
        this.f8200d = localeArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8198a.m12474y3(this.f8199c, this.f8200d, dialogInterface, i);
    }
}
