package com.arlosoft.macrodroid.variables;

import android.app.Dialog;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.variables.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6594s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Macro f15301a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f15302c;

    /* renamed from: d */
    public final /* synthetic */ C6487a f15303d;

    /* renamed from: f */
    public final /* synthetic */ Dialog f15304f;

    public /* synthetic */ C6594s(Macro macro, MacroDroidVariable macroDroidVariable, C6487a aVar, Dialog dialog) {
        this.f15301a = macro;
        this.f15302c = macroDroidVariable;
        this.f15303d = aVar;
        this.f15304f = dialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6520o0.m24889N(this.f15301a, this.f15302c, this.f15303d, this.f15304f, dialogInterface, i);
    }
}
