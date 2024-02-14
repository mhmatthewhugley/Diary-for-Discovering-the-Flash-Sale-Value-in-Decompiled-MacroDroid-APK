package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.um */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3524um implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TakeScreenshotAction f9379a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9380c;

    public /* synthetic */ C3524um(TakeScreenshotAction takeScreenshotAction, EditText editText) {
        this.f9379a = takeScreenshotAction;
        this.f9380c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9379a.m13291B3(this.f9380c, dialogInterface, i);
    }
}
