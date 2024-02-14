package com.arlosoft.macrodroid.action;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.f3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3048f3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f8313a;

    /* renamed from: c */
    public final /* synthetic */ String f8314c;

    /* renamed from: d */
    public final /* synthetic */ ConnectivityCheckAction f8315d;

    public /* synthetic */ C3048f3(AppCompatDialog appCompatDialog, String str, ConnectivityCheckAction connectivityCheckAction) {
        this.f8313a = appCompatDialog;
        this.f8314c = str;
        this.f8315d = connectivityCheckAction;
    }

    public final void onClick(View view) {
        ConnectivityCheckAction.m10261z3(this.f8313a, this.f8314c, this.f8315d, view);
    }
}
