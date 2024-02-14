package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.celltowers.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3920c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerGroupActivity f10202a;

    /* renamed from: c */
    public final /* synthetic */ EditText f10203c;

    public /* synthetic */ C3920c(CellTowerGroupActivity cellTowerGroupActivity, EditText editText) {
        this.f10202a = cellTowerGroupActivity;
        this.f10203c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10202a.m15202f2(this.f10203c, dialogInterface, i);
    }
}
