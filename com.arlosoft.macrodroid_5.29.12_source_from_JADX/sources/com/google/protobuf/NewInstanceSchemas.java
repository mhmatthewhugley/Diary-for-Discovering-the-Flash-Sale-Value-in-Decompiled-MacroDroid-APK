package com.google.protobuf;

final class NewInstanceSchemas {

    /* renamed from: a */
    private static final NewInstanceSchema f57032a = m81015c();

    /* renamed from: b */
    private static final NewInstanceSchema f57033b = new NewInstanceSchemaLite();

    NewInstanceSchemas() {
    }

    /* renamed from: a */
    static NewInstanceSchema m81013a() {
        return f57032a;
    }

    /* renamed from: b */
    static NewInstanceSchema m81014b() {
        return f57033b;
    }

    /* renamed from: c */
    private static NewInstanceSchema m81015c() {
        try {
            return (NewInstanceSchema) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
