package com.arlosoft.macrodroid.action;

import android.app.Activity;
import androidx.appcompat.app.AlertDialog;

/* renamed from: com.arlosoft.macrodroid.action.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3157j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f8514a;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog.Builder f8515c;

    public /* synthetic */ C3157j0(Activity activity, AlertDialog.Builder builder) {
        this.f8514a = activity;
        this.f8515c = builder;
    }

    public final void run() {
        AndroidWearAction.m9808u4(this.f8514a, this.f8515c);
    }
}
