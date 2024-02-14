package com.google.protobuf;

final class MapFieldSchemas {

    /* renamed from: a */
    private static final MapFieldSchema f57004a = m80893c();

    /* renamed from: b */
    private static final MapFieldSchema f57005b = new MapFieldSchemaLite();

    MapFieldSchemas() {
    }

    /* renamed from: a */
    static MapFieldSchema m80891a() {
        return f57004a;
    }

    /* renamed from: b */
    static MapFieldSchema m80892b() {
        return f57005b;
    }

    /* renamed from: c */
    private static MapFieldSchema m80893c() {
        try {
            return (MapFieldSchema) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
