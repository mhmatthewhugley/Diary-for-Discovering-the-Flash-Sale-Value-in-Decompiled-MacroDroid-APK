package com.arlosoft.macrodroid.utils;

import android.content.Context;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.utils.k1 */
/* compiled from: ToastHelper.kt */
public final class C6399k1 {

    /* renamed from: a */
    private final Context f15005a;

    public C6399k1(Context context) {
        C13706o.m87929f(context, "context");
        this.f15005a = context;
    }

    /* renamed from: a */
    public final void mo32440a(String str, boolean z) {
        C13706o.m87929f(str, "message");
        C15626c.m94876a(this.f15005a, str, z ? 1 : 0).show();
    }
}
