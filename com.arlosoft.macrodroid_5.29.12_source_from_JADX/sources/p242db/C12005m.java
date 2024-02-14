package p242db;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;

/* renamed from: db.m */
/* compiled from: ReflectKotlinClass.kt */
final class C12005m {

    /* renamed from: a */
    public static final C12005m f58207a = new C12005m();

    private C12005m() {
    }

    /* renamed from: a */
    public final String mo67449a(Constructor<?> constructor) {
        C13706o.m87929f(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class[] parameterTypes = constructor.getParameterTypes();
        C13706o.m87928e(parameterTypes, "constructor.parameterTypes");
        for (Class cls : parameterTypes) {
            C13706o.m87928e(cls, "parameterType");
            sb.append(C14088d.m89398b(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String mo67450b(Field field) {
        C13706o.m87929f(field, "field");
        Class<?> type = field.getType();
        C13706o.m87928e(type, "field.type");
        return C14088d.m89398b(type);
    }

    /* renamed from: c */
    public final String mo67451c(Method method) {
        C13706o.m87929f(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class[] parameterTypes = method.getParameterTypes();
        C13706o.m87928e(parameterTypes, "method.parameterTypes");
        for (Class cls : parameterTypes) {
            C13706o.m87928e(cls, "parameterType");
            sb.append(C14088d.m89398b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        C13706o.m87928e(returnType, "method.returnType");
        sb.append(C14088d.m89398b(returnType));
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "sb.toString()");
        return sb2;
    }
}
