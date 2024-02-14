package com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;

final class PreJava9ReflectionAccessor extends ReflectionAccessor {
    PreJava9ReflectionAccessor() {
    }

    /* renamed from: b */
    public void mo64304b(AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}
