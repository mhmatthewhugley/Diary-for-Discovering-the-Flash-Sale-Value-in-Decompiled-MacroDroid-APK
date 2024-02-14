package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class ArrayValueMap {

    /* renamed from: a */
    private final Map<String, ArrayValue> f52735a = ArrayMap.m72611b();

    /* renamed from: b */
    private final Map<Field, ArrayValue> f52736b = ArrayMap.m72611b();

    /* renamed from: c */
    private final Object f52737c;

    static class ArrayValue {

        /* renamed from: a */
        final Class<?> f52738a;

        /* renamed from: b */
        final ArrayList<Object> f52739b = new ArrayList<>();

        ArrayValue(Class<?> cls) {
            this.f52738a = cls;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo60698a(Class<?> cls, Object obj) {
            Preconditions.m72713a(cls == this.f52738a);
            this.f52739b.add(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object mo60699b() {
            return Types.m72744o(this.f52739b, this.f52738a);
        }
    }

    public ArrayValueMap(Object obj) {
        this.f52737c = obj;
    }

    /* renamed from: a */
    public void mo60696a(Field field, Class<?> cls, Object obj) {
        ArrayValue arrayValue = this.f52736b.get(field);
        if (arrayValue == null) {
            arrayValue = new ArrayValue(cls);
            this.f52736b.put(field, arrayValue);
        }
        arrayValue.mo60698a(cls, obj);
    }

    /* renamed from: b */
    public void mo60697b() {
        for (Map.Entry next : this.f52735a.entrySet()) {
            ((Map) this.f52737c).put(next.getKey(), ((ArrayValue) next.getValue()).mo60699b());
        }
        for (Map.Entry next2 : this.f52736b.entrySet()) {
            FieldInfo.m72677l((Field) next2.getKey(), this.f52737c, ((ArrayValue) next2.getValue()).mo60699b());
        }
    }
}
