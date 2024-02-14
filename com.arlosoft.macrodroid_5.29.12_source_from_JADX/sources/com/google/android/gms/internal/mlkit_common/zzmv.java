package com.google.android.gms.internal.mlkit_common;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzmv implements Provider {

    /* renamed from: a */
    public final /* synthetic */ TransportFactory f43056a;

    public /* synthetic */ zzmv(TransportFactory transportFactory) {
        this.f43056a = transportFactory;
    }

    public final Object get() {
        return this.f43056a.mo19274a("FIREBASE_ML_SDK", byte[].class, Encoding.m954b("json"), zzmx.f43058a);
    }
}
