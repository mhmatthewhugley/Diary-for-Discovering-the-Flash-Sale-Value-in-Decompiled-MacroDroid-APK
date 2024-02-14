package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.action.r1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3384r1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearDictionaryArrayEntryAction f9010a;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f9011c;

    public /* synthetic */ C3384r1(ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, ArrayList arrayList) {
        this.f9010a = clearDictionaryArrayEntryAction;
        this.f9011c = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClearDictionaryArrayEntryAction.m10018q3(this.f9010a, this.f9011c, dialogInterface, i);
    }
}
