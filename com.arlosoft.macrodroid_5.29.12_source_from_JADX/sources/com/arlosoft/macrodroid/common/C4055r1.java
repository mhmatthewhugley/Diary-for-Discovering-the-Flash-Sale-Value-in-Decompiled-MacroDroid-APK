package com.arlosoft.macrodroid.common;

import android.content.Context;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.r1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4055r1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10612a;

    /* renamed from: c */
    public final /* synthetic */ String f10613c;

    public /* synthetic */ C4055r1(Context context, String str) {
        this.f10612a = context;
        this.f10613c = str;
    }

    public final void run() {
        C15626c.m94876a(this.f10612a.getApplicationContext(), this.f10613c, 0).show();
    }
}
