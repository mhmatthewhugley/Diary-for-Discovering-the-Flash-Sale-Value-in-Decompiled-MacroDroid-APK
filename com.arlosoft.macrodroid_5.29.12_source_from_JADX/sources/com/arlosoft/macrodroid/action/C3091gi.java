package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.gi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3091gi implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVariableAction f8380a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f8381c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f8382d;

    /* renamed from: f */
    public final /* synthetic */ List f8383f;

    public /* synthetic */ C3091gi(SetVariableAction setVariableAction, MacroDroidVariable macroDroidVariable, ArrayList arrayList, List list) {
        this.f8380a = setVariableAction;
        this.f8381c = macroDroidVariable;
        this.f8382d = arrayList;
        this.f8383f = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8380a.m12652E4(this.f8381c, this.f8382d, this.f8383f, dialogInterface, i);
    }
}
