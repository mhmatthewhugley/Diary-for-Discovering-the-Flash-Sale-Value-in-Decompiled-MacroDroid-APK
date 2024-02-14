package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public final class FieldAttributes {

    /* renamed from: a */
    private final Field f55760a;

    public FieldAttributes(Field field) {
        C$Gson$Preconditions.m78400b(field);
        this.f55760a = field;
    }

    /* renamed from: a */
    public <T extends Annotation> T mo63971a(Class<T> cls) {
        return this.f55760a.getAnnotation(cls);
    }
}
