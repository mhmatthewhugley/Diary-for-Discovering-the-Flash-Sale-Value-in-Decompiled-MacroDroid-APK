package com.google.protobuf;

final class ExtensionSchemas {

    /* renamed from: a */
    private static final ExtensionSchema<?> f56784a = new ExtensionSchemaLite();

    /* renamed from: b */
    private static final ExtensionSchema<?> f56785b = m80545c();

    ExtensionSchemas() {
    }

    /* renamed from: a */
    static ExtensionSchema<?> m80543a() {
        ExtensionSchema<?> extensionSchema = f56785b;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static ExtensionSchema<?> m80544b() {
        return f56784a;
    }

    /* renamed from: c */
    private static ExtensionSchema<?> m80545c() {
        try {
            return (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
