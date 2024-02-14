package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.we */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3571we implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RestoreNotificationsAction f9489a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f9490c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f9491d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9492f;

    public /* synthetic */ C3571we(RestoreNotificationsAction restoreNotificationsAction, C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f9489a = restoreNotificationsAction;
        this.f9490c = dVar;
        this.f9491d = radioButton;
        this.f9492f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9489a.m12070q3(this.f9490c, this.f9491d, this.f9492f, view);
    }
}
