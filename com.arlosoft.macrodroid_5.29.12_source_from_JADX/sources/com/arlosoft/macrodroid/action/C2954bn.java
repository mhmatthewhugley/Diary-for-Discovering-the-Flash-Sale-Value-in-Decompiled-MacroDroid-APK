package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import android.widget.EditText;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.bn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2954bn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextManipulationAction f8067a;

    /* renamed from: c */
    public final /* synthetic */ int f8068c;

    /* renamed from: d */
    public final /* synthetic */ List f8069d;

    /* renamed from: f */
    public final /* synthetic */ TextManipulation f8070f;

    /* renamed from: g */
    public final /* synthetic */ EditText f8071g;

    public /* synthetic */ C2954bn(TextManipulationAction textManipulationAction, int i, List list, TextManipulation textManipulation, EditText editText) {
        this.f8067a = textManipulationAction;
        this.f8068c = i;
        this.f8069d = list;
        this.f8070f = textManipulation;
        this.f8071g = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8067a.m13338G3(this.f8068c, this.f8069d, this.f8070f, this.f8071g, dialogInterface, i);
    }
}
