package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.action.q1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3356q1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearDictionaryArrayEntryAction f8944a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f8945c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f8946d;

    public /* synthetic */ C3356q1(ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, MacroDroidVariable macroDroidVariable, ArrayList arrayList) {
        this.f8944a = clearDictionaryArrayEntryAction;
        this.f8945c = macroDroidVariable;
        this.f8946d = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClearDictionaryArrayEntryAction.m10020s3(this.f8944a, this.f8945c, this.f8946d, dialogInterface, i);
    }
}
