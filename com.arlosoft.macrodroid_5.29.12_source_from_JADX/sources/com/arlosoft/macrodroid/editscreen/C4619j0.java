package com.arlosoft.macrodroid.editscreen;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.action.ParentAction;

/* renamed from: com.arlosoft.macrodroid.editscreen.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4619j0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11669a;

    /* renamed from: c */
    public final /* synthetic */ ParentAction f11670c;

    public /* synthetic */ C4619j0(EditMacroActivity editMacroActivity, ParentAction parentAction) {
        this.f11669a = editMacroActivity;
        this.f11670c = parentAction;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditMacroActivity.m17918o3(this.f11669a, this.f11670c, dialogInterface, i);
    }
}
