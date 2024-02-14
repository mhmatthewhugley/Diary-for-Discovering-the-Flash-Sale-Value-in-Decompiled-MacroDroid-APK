package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3928h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerGroupActivity.C3902c f10222a;

    /* renamed from: c */
    public final /* synthetic */ String f10223c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10224d;

    public /* synthetic */ C3928h(CellTowerGroupActivity.C3902c cVar, String str, boolean z) {
        this.f10222a = cVar;
        this.f10223c = str;
        this.f10224d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10222a.m15222k(this.f10223c, this.f10224d, dialogInterface, i);
    }
}
