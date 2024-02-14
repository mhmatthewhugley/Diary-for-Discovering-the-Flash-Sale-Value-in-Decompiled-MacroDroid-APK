package com.arlosoft.macrodroid.common;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.n1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4042n1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10593a;

    public /* synthetic */ C4042n1(Context context) {
        this.f10593a = context;
    }

    public final void run() {
        C15626c.m94876a(this.f10593a.getApplicationContext(), this.f10593a.getString(C17541R$string.could_not_get_contacts), 0).show();
    }
}
