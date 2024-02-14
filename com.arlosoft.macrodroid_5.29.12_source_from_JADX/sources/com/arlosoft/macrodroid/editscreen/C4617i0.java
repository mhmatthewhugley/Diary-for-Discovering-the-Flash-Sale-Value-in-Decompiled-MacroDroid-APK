package com.arlosoft.macrodroid.editscreen;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.arlosoft.macrodroid.editscreen.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4617i0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11666a;

    /* renamed from: c */
    public final /* synthetic */ Intent f11667c;

    public /* synthetic */ C4617i0(EditMacroActivity editMacroActivity, Intent intent) {
        this.f11666a = editMacroActivity;
        this.f11667c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditMacroActivity.m17798C4(this.f11666a, this.f11667c, dialogInterface, i);
    }
}
