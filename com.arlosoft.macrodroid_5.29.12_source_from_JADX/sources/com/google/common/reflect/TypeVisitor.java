package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class TypeVisitor {

    /* renamed from: a */
    private final Set<Type> f53318a = Sets.m28725h();

    TypeVisitor() {
    }

    /* renamed from: a */
    public final void mo61513a(Type... typeArr) {
        for (TypeVariable typeVariable : typeArr) {
            if (typeVariable != null && this.f53318a.add(typeVariable)) {
                try {
                    if (typeVariable instanceof TypeVariable) {
                        mo61476e(typeVariable);
                    } else if (typeVariable instanceof WildcardType) {
                        mo61477f((WildcardType) typeVariable);
                    } else if (typeVariable instanceof ParameterizedType) {
                        mo61475d(typeVariable);
                    } else if (typeVariable instanceof Class) {
                        mo61473b(typeVariable);
                    } else if (typeVariable instanceof GenericArrayType) {
                        mo61474c(typeVariable);
                    } else {
                        String valueOf = String.valueOf(typeVariable);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
                        sb.append("Unknown type: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.f53318a.remove(typeVariable);
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo61473b(Class<?> cls) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo61474c(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo61475d(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo61476e(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo61477f(WildcardType wildcardType) {
    }
}
