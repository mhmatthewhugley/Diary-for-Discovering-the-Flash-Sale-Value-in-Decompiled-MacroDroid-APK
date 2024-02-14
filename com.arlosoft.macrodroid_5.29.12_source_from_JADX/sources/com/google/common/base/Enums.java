package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Enums {
    @GwtIncompatible

    /* renamed from: a */
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f4150a = new WeakHashMap();

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
        /* renamed from: h */
        public String mo22095d(T t) {
            return t.name();
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public T mo22096e(String str) {
            return Enum.valueOf(this.enumClass, str);
        }

        public String toString() {
            String name = this.enumClass.getName();
            StringBuilder sb = new StringBuilder(name.length() + 29);
            sb.append("Enums.stringConverter(");
            sb.append(name);
            sb.append(".class)");
            return sb.toString();
        }
    }

    private Enums() {
    }
}
