package com.google.android.gms.internal.mlkit_common;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzmw implements Provider {

    /* renamed from: a */
    public final /* synthetic */ TransportFactory f43057a;

    public /* synthetic */ zzmw(TransportFactory transportFactory) {
        this.f43057a = transportFactory;
    }

    public final Object get() {
        return this.f43057a.mo19274a("FIREBASE_ML_SDK", byte[].class, Encoding.m954b("proto"), zzmu.f43055a);
    }
}
