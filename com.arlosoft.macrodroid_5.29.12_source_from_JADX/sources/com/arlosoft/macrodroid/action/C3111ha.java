package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.ha */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3111ha implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MakeCallAction f8419a;

    /* renamed from: c */
    public final /* synthetic */ EditText f8420c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f8421d;

    public /* synthetic */ C3111ha(MakeCallAction makeCallAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8419a = makeCallAction;
        this.f8420c = editText;
        this.f8421d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f8419a.m11481r3(this.f8420c, this.f8421d, view);
    }
}
