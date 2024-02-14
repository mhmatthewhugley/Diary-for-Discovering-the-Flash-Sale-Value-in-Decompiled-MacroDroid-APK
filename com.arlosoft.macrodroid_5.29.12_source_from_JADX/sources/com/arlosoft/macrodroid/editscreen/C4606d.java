package com.arlosoft.macrodroid.editscreen;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.SelectableItem;

/* renamed from: com.arlosoft.macrodroid.editscreen.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4606d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditMacroActivity f11648a;

    /* renamed from: c */
    public final /* synthetic */ String[] f11649c;

    /* renamed from: d */
    public final /* synthetic */ SelectableItem f11650d;

    public /* synthetic */ C4606d(EditMacroActivity editMacroActivity, String[] strArr, SelectableItem selectableItem) {
        this.f11648a = editMacroActivity;
        this.f11649c = strArr;
        this.f11650d = selectableItem;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditMacroActivity.m17864Y4(this.f11648a, this.f11649c, this.f11650d, dialogInterface, i);
    }
}
