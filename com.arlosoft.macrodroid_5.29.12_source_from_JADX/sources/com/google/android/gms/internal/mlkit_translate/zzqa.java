package com.google.android.gms.internal.mlkit_translate;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final /* synthetic */ class zzqa implements Provider {

    /* renamed from: a */
    public final /* synthetic */ TransportFactory f44449a;

    public /* synthetic */ zzqa(TransportFactory transportFactory) {
        this.f44449a = transportFactory;
    }

    public final Object get() {
        return this.f44449a.mo19274a("FIREBASE_ML_SDK", byte[].class, Encoding.m954b("proto"), zzpy.f44447a);
    }
}
