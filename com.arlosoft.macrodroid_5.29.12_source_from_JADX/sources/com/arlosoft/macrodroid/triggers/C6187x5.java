package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.x5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6187x5 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationTrigger f14708a;

    /* renamed from: c */
    public final /* synthetic */ C10351d f14709c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f14710d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f14711f;

    public /* synthetic */ C6187x5(NotificationTrigger notificationTrigger, C10351d dVar, AppCompatDialog appCompatDialog, RadioButton radioButton) {
        this.f14708a = notificationTrigger;
        this.f14709c = dVar;
        this.f14710d = appCompatDialog;
        this.f14711f = radioButton;
    }

    public final void onClick(View view) {
        this.f14708a.m22817K3(this.f14709c, this.f14710d, this.f14711f, view);
    }
}
