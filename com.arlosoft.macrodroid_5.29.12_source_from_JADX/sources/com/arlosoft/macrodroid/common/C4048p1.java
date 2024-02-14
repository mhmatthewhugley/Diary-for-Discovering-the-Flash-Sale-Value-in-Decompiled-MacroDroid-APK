package com.arlosoft.macrodroid.common;

import android.content.Context;
import com.arlosoft.macrodroid.C17541R$string;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.common.p1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4048p1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10600a;

    public /* synthetic */ C4048p1(Context context) {
        this.f10600a = context;
    }

    public final void run() {
        C15626c.m94876a(this.f10600a.getApplicationContext(), this.f10600a.getString(C17541R$string.could_not_get_contacts), 0).show();
    }
}
