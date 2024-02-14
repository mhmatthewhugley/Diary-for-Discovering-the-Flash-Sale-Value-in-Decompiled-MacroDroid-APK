package com.arlosoft.macrodroid.actionblock.edit;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.action.ParentAction;

/* renamed from: com.arlosoft.macrodroid.actionblock.edit.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3735v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockEditActivity f9791a;

    /* renamed from: c */
    public final /* synthetic */ ParentAction f9792c;

    public /* synthetic */ C3735v(ActionBlockEditActivity actionBlockEditActivity, ParentAction parentAction) {
        this.f9791a = actionBlockEditActivity;
        this.f9792c = parentAction;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActionBlockEditActivity.m14560R2(this.f9791a, this.f9792c, dialogInterface, i);
    }
}
