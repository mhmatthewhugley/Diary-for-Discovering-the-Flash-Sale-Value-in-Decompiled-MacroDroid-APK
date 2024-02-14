package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;

public abstract class ReflectionAccessor {

    /* renamed from: a */
    private static final ReflectionAccessor f56047a = (JavaVersion.m78459c() < 9 ? new PreJava9ReflectionAccessor() : new UnsafeReflectionAccessor());

    /* renamed from: a */
    public static ReflectionAccessor m78724a() {
        return f56047a;
    }

    /* renamed from: b */
    public abstract void mo64304b(AccessibleObject accessibleObject);
}
