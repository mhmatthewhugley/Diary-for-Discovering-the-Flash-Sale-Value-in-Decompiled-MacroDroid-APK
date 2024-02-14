package com.arlosoft.macrodroid.actionblock.edit;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.actionblock.edit.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3736w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockEditActivity f9793a;

    /* renamed from: c */
    public final /* synthetic */ String[] f9794c;

    /* renamed from: d */
    public final /* synthetic */ SelectableItem f9795d;

    /* renamed from: f */
    public final /* synthetic */ Macro f9796f;

    public /* synthetic */ C3736w(ActionBlockEditActivity actionBlockEditActivity, String[] strArr, SelectableItem selectableItem, Macro macro) {
        this.f9793a = actionBlockEditActivity;
        this.f9794c = strArr;
        this.f9795d = selectableItem;
        this.f9796f = macro;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActionBlockEditActivity.m14548L3(this.f9793a, this.f9794c, this.f9795d, this.f9796f, dialogInterface, i);
    }
}
