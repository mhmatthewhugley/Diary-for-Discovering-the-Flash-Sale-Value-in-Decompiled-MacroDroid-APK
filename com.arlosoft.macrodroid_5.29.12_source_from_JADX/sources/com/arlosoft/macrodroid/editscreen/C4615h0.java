package com.arlosoft.macrodroid.editscreen;

import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.editscreen.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4615h0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11661a;

    /* renamed from: c */
    public final /* synthetic */ int f11662c;

    /* renamed from: d */
    public final /* synthetic */ int f11663d;

    /* renamed from: f */
    public final /* synthetic */ boolean f11664f;

    public /* synthetic */ C4615h0(EditMacroActivity editMacroActivity, int i, int i2, boolean z) {
        this.f11661a = editMacroActivity;
        this.f11662c = i;
        this.f11663d = i2;
        this.f11664f = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditMacroActivity.m17863Y3(this.f11661a, this.f11662c, this.f11663d, this.f11664f, dialogInterface, i);
    }
}
