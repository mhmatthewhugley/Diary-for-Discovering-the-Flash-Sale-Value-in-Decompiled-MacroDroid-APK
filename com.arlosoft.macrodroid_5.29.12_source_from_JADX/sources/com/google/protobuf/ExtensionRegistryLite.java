package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {

    /* renamed from: b */
    private static boolean f56776b = true;

    /* renamed from: c */
    private static volatile ExtensionRegistryLite f56777c;

    /* renamed from: d */
    static final ExtensionRegistryLite f56778d = new ExtensionRegistryLite(true);

    /* renamed from: a */
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> f56779a;

    private static class ExtensionClassHolder {

        /* renamed from: a */
        static final Class<?> f56780a = m80522a();

        private ExtensionClassHolder() {
        }

        /* renamed from: a */
        static Class<?> m80522a() {
            try {
                return Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    private static final class ObjectIntPair {

        /* renamed from: a */
        private final Object f56781a;

        /* renamed from: b */
        private final int f56782b;

        ObjectIntPair(Object obj, int i) {
            this.f56781a = obj;
            this.f56782b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            if (this.f56781a == objectIntPair.f56781a && this.f56782b == objectIntPair.f56782b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f56781a) * 65535) + this.f56782b;
        }
    }

    ExtensionRegistryLite() {
        this.f56779a = new HashMap();
    }

    /* renamed from: b */
    public static ExtensionRegistryLite m80520b() {
        ExtensionRegistryLite extensionRegistryLite = f56777c;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                extensionRegistryLite = f56777c;
                if (extensionRegistryLite == null) {
                    extensionRegistryLite = f56776b ? ExtensionRegistryFactory.m80517a() : f56778d;
                    f56777c = extensionRegistryLite;
                }
            }
        }
        return extensionRegistryLite;
    }

    /* renamed from: a */
    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> mo65097a(ContainingType containingtype, int i) {
        return this.f56779a.get(new ObjectIntPair(containingtype, i));
    }

    ExtensionRegistryLite(boolean z) {
        this.f56779a = Collections.emptyMap();
    }
}
