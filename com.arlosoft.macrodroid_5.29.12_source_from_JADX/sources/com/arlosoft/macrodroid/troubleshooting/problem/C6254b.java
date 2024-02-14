package com.arlosoft.macrodroid.troubleshooting.problem;

import android.content.Context;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.b */
/* compiled from: PermissionChecker_Factory */
public final class C6254b implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f14805a;

    public C6254b(C12478a<Context> aVar) {
        this.f14805a = aVar;
    }

    /* renamed from: a */
    public static C6254b m24351a(C12478a<Context> aVar) {
        return new C6254b(aVar);
    }

    /* renamed from: c */
    public static C6253a m24352c(C12478a<Context> aVar) {
        return new C6253a(aVar.get());
    }

    /* renamed from: b */
    public C6253a get() {
        return m24352c(this.f14805a);
    }
}
