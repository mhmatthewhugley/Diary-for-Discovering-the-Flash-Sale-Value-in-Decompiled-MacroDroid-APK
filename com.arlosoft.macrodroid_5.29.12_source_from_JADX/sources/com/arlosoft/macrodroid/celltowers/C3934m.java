package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: com.arlosoft.macrodroid.celltowers.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3934m implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerListActivity f10237a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatEditText f10238c;

    public /* synthetic */ C3934m(CellTowerListActivity cellTowerListActivity, AppCompatEditText appCompatEditText) {
        this.f10237a = cellTowerListActivity;
        this.f10238c = appCompatEditText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10237a.m15242h2(this.f10238c, dialogInterface, i);
    }
}
