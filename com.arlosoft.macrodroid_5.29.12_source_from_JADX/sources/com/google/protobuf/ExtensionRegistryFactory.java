package com.google.protobuf;

final class ExtensionRegistryFactory {

    /* renamed from: a */
    static final Class<?> f56775a = m80519c();

    ExtensionRegistryFactory() {
    }

    /* renamed from: a */
    public static ExtensionRegistryLite m80517a() {
        ExtensionRegistryLite b = m80518b("getEmptyRegistry");
        return b != null ? b : ExtensionRegistryLite.f56778d;
    }

    /* renamed from: b */
    private static final ExtensionRegistryLite m80518b(String str) {
        Class<?> cls = f56775a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Class<?> m80519c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
