package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

final class TransportFactoryImpl implements TransportFactory {

    /* renamed from: a */
    private final Set<Encoding> f1360a;

    /* renamed from: b */
    private final TransportContext f1361b;

    /* renamed from: c */
    private final TransportInternal f1362c;

    TransportFactoryImpl(Set<Encoding> set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f1360a = set;
        this.f1361b = transportContext;
        this.f1362c = transportInternal;
    }

    /* renamed from: a */
    public <T> Transport<T> mo19274a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.f1360a.contains(encoding)) {
            return new TransportImpl(this.f1361b, str, encoding, transformer, this.f1362c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{encoding, this.f1360a}));
    }
}
