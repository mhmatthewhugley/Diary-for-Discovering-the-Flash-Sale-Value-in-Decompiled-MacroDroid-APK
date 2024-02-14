package com.arlosoft.macrodroid.utils;

import android.content.Context;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.utils.l1 */
/* compiled from: ToastHelper_Factory */
public final class C6402l1 implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f15011a;

    public C6402l1(C12478a<Context> aVar) {
        this.f15011a = aVar;
    }

    /* renamed from: a */
    public static C6402l1 m24657a(C12478a<Context> aVar) {
        return new C6402l1(aVar);
    }

    /* renamed from: c */
    public static C6399k1 m24658c(C12478a<Context> aVar) {
        return new C6399k1(aVar.get());
    }

    /* renamed from: b */
    public C6399k1 get() {
        return m24658c(this.f15011a);
    }
}
