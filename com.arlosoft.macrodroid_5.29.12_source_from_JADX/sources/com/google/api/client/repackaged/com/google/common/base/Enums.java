package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.Beta;
import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import com.google.api.client.repackaged.com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

@Beta
@GwtCompatible
public final class Enums {
    @GwtIncompatible

    /* renamed from: a */
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f52617a = new WeakHashMap();

    private static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                return this.enumClass.equals(((StringConverter) obj).enumClass);
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public String mo60580d(T t) {
            return t.name();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public T mo60581e(String str) {
            return Enum.valueOf(this.enumClass, str);
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public String toString() {
            return "Enums.stringConverter(" + this.enumClass.getName() + ".class)";
        }
    }

    private static final class ValueOfFunction<T extends Enum<T>> implements Function<String, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        /* renamed from: a */
        public T apply(String str) {
            try {
                return Enum.valueOf(this.enumClass, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ValueOfFunction) && this.enumClass.equals(((ValueOfFunction) obj).enumClass);
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public String toString() {
            return "Enums.valueOf(" + this.enumClass + ")";
        }
    }

    private Enums() {
    }
}
