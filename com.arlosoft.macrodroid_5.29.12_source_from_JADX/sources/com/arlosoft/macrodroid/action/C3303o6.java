package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.action.o6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3303o6 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForceMacroRunAction f8825a;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f8826c;

    public /* synthetic */ C3303o6(ForceMacroRunAction forceMacroRunAction, ArrayList arrayList) {
        this.f8825a = forceMacroRunAction;
        this.f8826c = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8825a.m10848F3(this.f8826c, dialogInterface, i);
    }
}
