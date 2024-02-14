package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.triggers.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5868b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ActivityRecognitionTrigger f13925a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f13926c;

    /* renamed from: d */
    public final /* synthetic */ RadioButton f13927d;

    public /* synthetic */ C5868b(ActivityRecognitionTrigger activityRecognitionTrigger, AppCompatDialog appCompatDialog, RadioButton radioButton) {
        this.f13925a = activityRecognitionTrigger;
        this.f13926c = appCompatDialog;
        this.f13927d = radioButton;
    }

    public final void onClick(View view) {
        this.f13925a.m21414t3(this.f13926c, this.f13927d, view);
    }
}
