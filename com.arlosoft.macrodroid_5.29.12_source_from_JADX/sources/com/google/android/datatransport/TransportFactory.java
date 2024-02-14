package com.google.android.datatransport;

public interface TransportFactory {
    /* renamed from: a */
    <T> Transport<T> mo19274a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer);
}
