package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.Function;

/* renamed from: com.google.android.datatransport.cct.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1653a implements Function {

    /* renamed from: a */
    public final /* synthetic */ CctTransportBackend f1133a;

    public /* synthetic */ C1653a(CctTransportBackend cctTransportBackend) {
        this.f1133a = cctTransportBackend;
    }

    public final Object apply(Object obj) {
        return this.f1133a.m973e((CctTransportBackend.HttpRequest) obj);
    }
}
