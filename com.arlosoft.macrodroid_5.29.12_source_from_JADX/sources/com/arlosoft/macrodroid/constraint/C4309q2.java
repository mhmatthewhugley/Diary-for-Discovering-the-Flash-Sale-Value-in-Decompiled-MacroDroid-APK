package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.constraint.q2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4309q2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationPresentConstraint f10964a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f10965c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f10966d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f10967f;

    public /* synthetic */ C4309q2(NotificationPresentConstraint notificationPresentConstraint, C10351d dVar, RadioButton radioButton, AppCompatDialog appCompatDialog) {
        this.f10964a = notificationPresentConstraint;
        this.f10965c = dVar;
        this.f10966d = radioButton;
        this.f10967f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10964a.m16855B3(this.f10965c, this.f10966d, this.f10967f, view);
    }
}
