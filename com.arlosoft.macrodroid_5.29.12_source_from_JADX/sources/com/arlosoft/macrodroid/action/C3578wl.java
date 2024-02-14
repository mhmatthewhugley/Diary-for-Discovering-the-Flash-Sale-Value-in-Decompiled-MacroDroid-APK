package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.wl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3578wl implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchAction f9508a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9509c;

    /* renamed from: d */
    public final /* synthetic */ List f9510d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9511f;

    public /* synthetic */ C3578wl(StopWatchAction stopWatchAction, EditText editText, List list, AppCompatDialog appCompatDialog) {
        this.f9508a = stopWatchAction;
        this.f9509c = editText;
        this.f9510d = list;
        this.f9511f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9508a.m13161s3(this.f9509c, this.f9510d, this.f9511f, view);
    }
}
