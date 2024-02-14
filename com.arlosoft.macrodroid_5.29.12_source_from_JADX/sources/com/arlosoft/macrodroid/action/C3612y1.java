package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.y1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3612y1 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ClearNotificationsAction f9602a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f9603c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f9604d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9605f;

    public /* synthetic */ C3612y1(ClearNotificationsAction clearNotificationsAction, C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f9602a = clearNotificationsAction;
        this.f9603c = dVar;
        this.f9604d = radioButton;
        this.f9605f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9602a.m10053A3(this.f9603c, this.f9604d, this.f9605f, view);
    }
}
