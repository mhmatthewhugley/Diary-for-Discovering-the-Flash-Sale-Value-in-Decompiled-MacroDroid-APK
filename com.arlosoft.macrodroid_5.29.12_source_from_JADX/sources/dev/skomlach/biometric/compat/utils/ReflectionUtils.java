package dev.skomlach.biometric.compat.utils;

import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0012\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0012\u0010\t\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0012\u0010\n\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/ReflectionUtils;", "", "", "name", "Lja/u;", "printClass", "Ljava/lang/Class;", "cl", "printConstructors", "printMethods", "printFields", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ReflectionUtils.kt */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public final void printClass(String str) {
        try {
            Class<?> cls = Class.forName(str);
            C13706o.m87928e(cls, "cl");
            printClass(cls);
        } catch (ClassNotFoundException unused) {
        }
    }

    public final void printConstructors(Class<?> cls) {
        C13706o.m87929f(cls, "cl");
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        C13706o.m87928e(declaredConstructors, "constructors");
        for (Constructor constructor : declaredConstructors) {
            String name = constructor.getName();
            System.err.print("   ");
            String modifier = Modifier.toString(constructor.getModifiers());
            C13706o.m87928e(modifier, "modifiers");
            if (modifier.length() > 0) {
                System.err.print(modifier + " ");
            }
            System.err.print(name + "(");
            Class[] parameterTypes = constructor.getParameterTypes();
            int length = parameterTypes.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    System.err.print(", ");
                }
                System.err.print(parameterTypes[i].getName());
            }
            System.err.println(");");
        }
    }

    public final void printFields(Class<?> cls) throws IllegalAccessException {
        PrintStream printStream;
        String str;
        C13706o.m87929f(cls, "cl");
        Field[] declaredFields = cls.getDeclaredFields();
        C13706o.m87928e(declaredFields, "fields");
        for (Field field : declaredFields) {
            boolean isAccessible = field.isAccessible();
            if (!isAccessible) {
                field.setAccessible(true);
            }
            Class<?> type = field.getType();
            String name = field.getName();
            System.err.print("   ");
            String modifier = Modifier.toString(field.getModifiers());
            C13706o.m87928e(modifier, "modifiers");
            if (modifier.length() > 0) {
                System.err.print(modifier + " ");
            }
            if (Modifier.isStatic(field.getModifiers())) {
                if (C13706o.m87924a(type, String.class)) {
                    printStream = System.err;
                    str = type.getName() + " " + name + " = \"" + field.get((Object) null) + "\";";
                } else {
                    printStream = System.err;
                    str = type.getName() + " " + name + " = " + field.get((Object) null) + ";";
                }
                printStream.println(str);
            } else {
                System.err.println(type.getName() + " " + name + ";");
            }
            if (!isAccessible) {
                field.setAccessible(true);
            }
        }
    }

    public final void printMethods(Class<?> cls) {
        C13706o.m87929f(cls, "cl");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C13706o.m87928e(declaredMethods, "methods");
        for (Method method : declaredMethods) {
            Class<?> returnType = method.getReturnType();
            String name = method.getName();
            System.err.print("   ");
            String modifier = Modifier.toString(method.getModifiers());
            C13706o.m87928e(modifier, "modifiers");
            if (modifier.length() > 0) {
                System.err.print(modifier + " ");
            }
            System.err.print(returnType.getName() + " " + name + "(");
            Class[] parameterTypes = method.getParameterTypes();
            int length = parameterTypes.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    System.err.print(", ");
                }
                System.err.print(parameterTypes[i].getName());
            }
            System.err.println(");");
        }
    }

    public final void printClass(Class<?> cls) {
        C13706o.m87929f(cls, "cl");
        try {
            Class<? super Object> superclass = cls.getSuperclass();
            String modifier = Modifier.toString(cls.getModifiers());
            C13706o.m87928e(modifier, "modifiers");
            if (modifier.length() > 0) {
                PrintStream printStream = System.err;
                printStream.print(modifier + " ");
            }
            PrintStream printStream2 = System.err;
            String name = cls.getName();
            printStream2.print("class " + name);
            if (superclass != null && !C13706o.m87924a(superclass, Object.class)) {
                PrintStream printStream3 = System.err;
                String name2 = superclass.getName();
                printStream3.print(" extends " + name2);
            }
            System.err.print("\n{\n");
            printConstructors(cls);
            System.err.println();
            printMethods(cls);
            System.err.println();
            printFields(cls);
            System.err.println("}");
        } catch (Exception e) {
            BiometricLoggerImpl.INSTANCE.mo68218e((Throwable) e);
        }
    }
}
