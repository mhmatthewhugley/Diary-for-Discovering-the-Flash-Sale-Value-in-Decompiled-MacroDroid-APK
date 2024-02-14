package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldDescriptor {

    /* renamed from: a */
    private final String f5563a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f5564b;

    public static final class Builder {

        /* renamed from: a */
        private final String f5565a;

        /* renamed from: b */
        private Map<Class<?>, Object> f5566b = null;

        Builder(String str) {
            this.f5565a = str;
        }

        @NonNull
        /* renamed from: a */
        public FieldDescriptor mo23603a() {
            Map map;
            String str = this.f5565a;
            if (this.f5566b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f5566b));
            }
            return new FieldDescriptor(str, map);
        }

        @NonNull
        /* renamed from: b */
        public <T extends Annotation> Builder mo23604b(@NonNull T t) {
            if (this.f5566b == null) {
                this.f5566b = new HashMap();
            }
            this.f5566b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    /* renamed from: a */
    public static Builder m7731a(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    /* renamed from: d */
    public static FieldDescriptor m7732d(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    @NonNull
    /* renamed from: b */
    public String mo23598b() {
        return this.f5563a;
    }

    @Nullable
    /* renamed from: c */
    public <T extends Annotation> T mo23599c(@NonNull Class<T> cls) {
        return (Annotation) this.f5564b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        if (!this.f5563a.equals(fieldDescriptor.f5563a) || !this.f5564b.equals(fieldDescriptor.f5564b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5563a.hashCode() * 31) + this.f5564b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f5563a + ", properties=" + this.f5564b.values() + "}";
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.f5563a = str;
        this.f5564b = map;
    }
}
