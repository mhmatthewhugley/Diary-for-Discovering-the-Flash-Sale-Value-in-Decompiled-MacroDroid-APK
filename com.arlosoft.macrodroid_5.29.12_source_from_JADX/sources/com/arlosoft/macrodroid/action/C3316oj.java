package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.action.oj */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3316oj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f8868a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8869c;

    public /* synthetic */ C3316oj(ShareLocationAction shareLocationAction, EditText editText) {
        this.f8868a = shareLocationAction;
        this.f8869c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8868a.m12962u4(this.f8869c, dialogInterface, i);
    }
}
