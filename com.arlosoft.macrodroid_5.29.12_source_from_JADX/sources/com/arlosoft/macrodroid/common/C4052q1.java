package com.arlosoft.macrodroid.common;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.q1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4052q1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10609a;

    public /* synthetic */ C4052q1(Context context) {
        this.f10609a = context;
    }

    public final void run() {
        C15626c.m94876a(this.f10609a.getApplicationContext(), this.f10609a.getString(C17541R$string.too_many_apps_installed), 0).show();
    }
}
