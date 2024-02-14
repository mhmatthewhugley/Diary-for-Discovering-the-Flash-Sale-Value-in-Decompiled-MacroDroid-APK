package com.arlosoft.macrodroid.common;

import android.content.Context;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.s1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4058s1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10616a;

    /* renamed from: c */
    public final /* synthetic */ String f10617c;

    /* renamed from: d */
    public final /* synthetic */ int f10618d;

    public /* synthetic */ C4058s1(Context context, String str, int i) {
        this.f10616a = context;
        this.f10617c = str;
        this.f10618d = i;
    }

    public final void run() {
        C15626c.m94876a(this.f10616a.getApplicationContext(), this.f10617c, this.f10618d).show();
    }
}
