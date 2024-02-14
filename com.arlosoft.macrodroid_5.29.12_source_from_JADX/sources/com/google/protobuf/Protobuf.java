package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Protobuf {

    /* renamed from: c */
    private static final Protobuf f57046c = new Protobuf();

    /* renamed from: a */
    private final SchemaFactory f57047a = new ManifestSchemaFactory();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, Schema<?>> f57048b = new ConcurrentHashMap();

    private Protobuf() {
    }

    /* renamed from: a */
    public static Protobuf m81041a() {
        return f57046c;
    }

    /* renamed from: b */
    public <T> void mo65364b(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mo65367e(t).mo65351h(t, reader, extensionRegistryLite);
    }

    /* renamed from: c */
    public Schema<?> mo65365c(Class<?> cls, Schema<?> schema) {
        Internal.m80733b(cls, "messageType");
        Internal.m80733b(schema, "schema");
        return this.f57048b.putIfAbsent(cls, schema);
    }

    /* renamed from: d */
    public <T> Schema<T> mo65366d(Class<T> cls) {
        Internal.m80733b(cls, "messageType");
        Schema<T> schema = (Schema) this.f57048b.get(cls);
        if (schema != null) {
            return schema;
        }
        Schema<T> a = this.f57047a.mo65318a(cls);
        Schema<?> c = mo65365c(cls, a);
        return c != null ? c : a;
    }

    /* renamed from: e */
    public <T> Schema<T> mo65367e(T t) {
        return mo65366d(t.getClass());
    }

    /* renamed from: f */
    public <T> void mo65368f(T t, Writer writer) throws IOException {
        mo65367e(t).mo65347d(t, writer);
    }
}
