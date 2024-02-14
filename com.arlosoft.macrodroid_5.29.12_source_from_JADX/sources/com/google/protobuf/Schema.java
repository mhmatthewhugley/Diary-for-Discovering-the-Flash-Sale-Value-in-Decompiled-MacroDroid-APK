package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

interface Schema<T> {
    /* renamed from: a */
    void mo65343a(T t, T t2);

    /* renamed from: b */
    int mo65344b(T t);

    /* renamed from: c */
    boolean mo65345c(T t, T t2);

    /* renamed from: d */
    void mo65347d(T t, Writer writer) throws IOException;

    /* renamed from: e */
    void mo65348e(T t);

    /* renamed from: f */
    boolean mo65349f(T t);

    /* renamed from: g */
    int mo65350g(T t);

    /* renamed from: h */
    void mo65351h(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: i */
    void mo65352i(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();
}
