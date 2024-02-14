package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.celltowers.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3945w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IgnoredCellTowersActivity f10260a;

    /* renamed from: c */
    public final /* synthetic */ EditText f10261c;

    public /* synthetic */ C3945w(IgnoredCellTowersActivity ignoredCellTowersActivity, EditText editText) {
        this.f10260a = ignoredCellTowersActivity;
        this.f10261c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10260a.m15264W1(this.f10261c, dialogInterface, i);
    }
}
