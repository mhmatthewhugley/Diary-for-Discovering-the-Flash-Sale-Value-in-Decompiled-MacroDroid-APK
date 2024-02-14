package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p007os.BuildCompat;
import dalvik.system.PathClassLoader;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ9\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0011\"\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0007J\u001a\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/ReflectionTools;", "", "()V", "appContext", "Landroid/content/Context;", "cache", "Ljava/util/WeakHashMap;", "", "Ldalvik/system/PathClassLoader;", "callGetOrCreateInstance", "target", "Ljava/lang/Class;", "checkBooleanMethodForSignature", "", "clazz", "managerObject", "keywords", "", "(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Z", "checkIntMethodForSignature", "", "startWith", "getClassFromPkg", "pkg", "cls", "getPathClassLoaderForPkg", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: ReflectionTools.kt */
public final class ReflectionTools {
    public static final ReflectionTools INSTANCE = new ReflectionTools();
    private static final Context appContext = C12104a.f58372a.mo68283g();
    private static final WeakHashMap<String, PathClassLoader> cache = new WeakHashMap<>();

    private ReflectionTools() {
    }

    public final Object callGetOrCreateInstance(Class<?> cls) {
        C13706o.m87929f(cls, TypedValues.Attributes.S_TARGET);
        try {
            Method[] methods = cls.getMethods();
            C13706o.m87928e(methods, "array");
            for (Method method : methods) {
                try {
                    if (Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
                        Class<?> returnType = method.getReturnType();
                        if (C13706o.m87924a(returnType, Void.TYPE)) {
                            continue;
                        } else if (!C13706o.m87924a(returnType, Object.class)) {
                            if (!C13706o.m87924a(returnType, cls) && !C13706o.m87924a(returnType, cls.getSuperclass())) {
                                Class[] interfaces = cls.getInterfaces();
                                C13706o.m87928e(interfaces, "target.interfaces");
                                if (!C13614t.m87751m(Arrays.copyOf(interfaces, interfaces.length)).contains(returnType)) {
                                    continue;
                                }
                            }
                            BiometricLoggerImpl.INSTANCE.mo68217d("Method: " + method.getName());
                            if (method.getParameterTypes().length != 1 || !C13706o.m87924a(method.getParameterTypes()[0].getName(), Context.class.getName())) {
                                Class[] parameterTypes = method.getParameterTypes();
                                C13706o.m87928e(parameterTypes, "m.parameterTypes");
                                if (parameterTypes.length == 0) {
                                    return method.invoke((Object) null, new Object[0]);
                                }
                            } else {
                                return method.invoke((Object) null, new Object[]{appContext});
                            }
                        }
                    }
                } catch (Throwable th) {
                    BiometricLoggerImpl.INSTANCE.mo68218e(th);
                }
            }
        } catch (Throwable th2) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th2);
        }
        try {
            Constructor[] constructors = cls.getConstructors();
            C13706o.m87928e(constructors, "array");
            for (Constructor constructor : constructors) {
                try {
                    if (Modifier.isPublic(constructor.getModifiers())) {
                        BiometricLoggerImpl.INSTANCE.mo68217d("Constructor: " + constructor.getName());
                        if (constructor.getParameterTypes().length != 1 || !C13706o.m87924a(constructor.getParameterTypes()[0].getName(), Context.class.getName())) {
                            Class[] parameterTypes2 = constructor.getParameterTypes();
                            C13706o.m87928e(parameterTypes2, "c.parameterTypes");
                            if (parameterTypes2.length == 0) {
                                return constructor.newInstance(new Object[0]);
                            }
                        } else {
                            return constructor.newInstance(new Object[]{appContext});
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th3) {
                    BiometricLoggerImpl.INSTANCE.mo68218e(th3);
                }
            }
        } catch (Throwable th4) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th4);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ all -> 0x00e8, all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ all -> 0x00e8, all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0 A[SYNTHETIC, Splitter:B:40:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0073 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkBooleanMethodForSignature(java.lang.Class<?> r13, java.lang.Object r14, java.lang.String... r15) {
        /*
            r12 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "keywords"
            kotlin.jvm.internal.C13706o.m87929f(r15, r0)
            r0 = 0
            java.lang.reflect.Method[] r13 = r13.getMethods()     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "allMethods"
            kotlin.jvm.internal.C13706o.m87928e(r13, r1)     // Catch:{ all -> 0x00f9 }
            int r1 = r13.length     // Catch:{ all -> 0x00f9 }
            r2 = 0
        L_0x0016:
            if (r2 >= r1) goto L_0x00ff
            r3 = r13[r2]     // Catch:{ all -> 0x00f9 }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00ef }
            r5 = 0
            if (r4 == 0) goto L_0x0024
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00ef }
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            java.lang.Class r7 = r3.getReturnType()     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00ef }
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r7)     // Catch:{ all -> 0x00ef }
            r7 = 1
            if (r6 != 0) goto L_0x0049
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00ef }
            java.lang.Class r6 = r3.getReturnType()     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00ef }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r6)     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = 0
            goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            java.lang.String r6 = r3.getName()     // Catch:{ all -> 0x00ef }
            int r8 = r15.length     // Catch:{ all -> 0x00ef }
            r9 = 0
        L_0x0050:
            if (r9 >= r8) goto L_0x0073
            r10 = r15[r9]     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x005f
            int r11 = r10.length()     // Catch:{ all -> 0x00ef }
            if (r11 != 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r11 = 0
            goto L_0x0060
        L_0x005f:
            r11 = 1
        L_0x0060:
            if (r11 != 0) goto L_0x0070
            java.lang.String r11 = "name"
            kotlin.jvm.internal.C13706o.m87928e(r6, r11)     // Catch:{ all -> 0x00ef }
            r11 = 2
            boolean r10 = kotlin.text.C15177w.m93663N(r6, r10, r0, r11, r5)     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x0070
            r6 = 1
            goto L_0x0074
        L_0x0070:
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0073:
            r6 = 0
        L_0x0074:
            int r8 = r3.getModifiers()     // Catch:{ all -> 0x00ef }
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)     // Catch:{ all -> 0x00ef }
            if (r8 == 0) goto L_0x00f5
            if (r4 == 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x00ef }
            java.lang.String r8 = r3.getName()     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r9.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r10 = "Method: "
            r9.append(r10)     // Catch:{ all -> 0x00ef }
            r9.append(r8)     // Catch:{ all -> 0x00ef }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ef }
            r6[r0] = r8     // Catch:{ all -> 0x00ef }
            r4.mo68217d(r6)     // Catch:{ all -> 0x00ef }
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = "m.parameterTypes"
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)     // Catch:{ all -> 0x00ef }
            int r4 = r4.length     // Catch:{ all -> 0x00ef }
            if (r4 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r7 = 0
        L_0x00ae:
            if (r7 == 0) goto L_0x00f5
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00b8
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x00e8 }
        L_0x00b8:
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00e8 }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r5, r4)     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            if (r4 == 0) goto L_0x00d8
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x00e8 }
            java.lang.Object r3 = r3.invoke(r14, r4)     // Catch:{ all -> 0x00e8 }
            kotlin.jvm.internal.C13706o.m87927d(r3, r5)     // Catch:{ all -> 0x00e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00e8 }
            boolean r13 = r3.booleanValue()     // Catch:{ all -> 0x00e8 }
            goto L_0x00e7
        L_0x00d8:
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x00e8 }
            java.lang.Object r3 = r3.invoke(r14, r4)     // Catch:{ all -> 0x00e8 }
            kotlin.jvm.internal.C13706o.m87927d(r3, r5)     // Catch:{ all -> 0x00e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x00e8 }
            boolean r13 = r3.booleanValue()     // Catch:{ all -> 0x00e8 }
        L_0x00e7:
            return r13
        L_0x00e8:
            r3 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00ef }
            r4.mo68218e((java.lang.Throwable) r3)     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00ef:
            r3 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00f9 }
            r4.mo68218e((java.lang.Throwable) r3)     // Catch:{ all -> 0x00f9 }
        L_0x00f5:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x00f9:
            r13 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r14 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r14.mo68218e((java.lang.Throwable) r13)
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.ReflectionTools.checkBooleanMethodForSignature(java.lang.Class, java.lang.Object, java.lang.String[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[Catch:{ all -> 0x009b, all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int checkIntMethodForSignature(java.lang.Class<?> r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "startWith"
            kotlin.jvm.internal.C13706o.m87929f(r15, r0)
            java.lang.reflect.Method[] r13 = r13.getMethods()     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "allMethods"
            kotlin.jvm.internal.C13706o.m87928e(r13, r0)     // Catch:{ all -> 0x00dd }
            int r0 = r13.length     // Catch:{ all -> 0x00dd }
            r1 = 0
            r2 = 0
        L_0x0016:
            if (r2 >= r0) goto L_0x00e3
            r3 = r13[r2]     // Catch:{ all -> 0x00dd }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d3 }
            r5 = 0
            if (r4 == 0) goto L_0x0024
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00d3 }
            goto L_0x0025
        L_0x0024:
            r6 = r5
        L_0x0025:
            java.lang.Class r7 = r3.getReturnType()     // Catch:{ all -> 0x00d3 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00d3 }
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r7)     // Catch:{ all -> 0x00d3 }
            r7 = 1
            if (r6 != 0) goto L_0x0049
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x00d3 }
            java.lang.Class r8 = r3.getReturnType()     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x00d3 }
            boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r8)     // Catch:{ all -> 0x00d3 }
            if (r6 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r6 = 0
            goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            int r8 = r3.getModifiers()     // Catch:{ all -> 0x00d3 }
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x00d9
            if (r6 == 0) goto L_0x00d9
            java.lang.String r6 = r3.getName()     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = "m.name"
            kotlin.jvm.internal.C13706o.m87928e(r6, r8)     // Catch:{ all -> 0x00d3 }
            r8 = 2
            boolean r6 = kotlin.text.C15176v.m93634I(r6, r15, r1, r8, r5)     // Catch:{ all -> 0x00d3 }
            if (r6 == 0) goto L_0x00d9
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r6 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00d3 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d3 }
            java.lang.String r9 = r3.getName()     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r10.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r11 = "Method: "
            r10.append(r11)     // Catch:{ all -> 0x00d3 }
            r10.append(r9)     // Catch:{ all -> 0x00d3 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00d3 }
            r8[r1] = r9     // Catch:{ all -> 0x00d3 }
            r6.mo68217d(r8)     // Catch:{ all -> 0x00d3 }
            java.lang.Class[] r6 = r3.getParameterTypes()     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = "m.parameterTypes"
            kotlin.jvm.internal.C13706o.m87928e(r6, r8)     // Catch:{ all -> 0x00d3 }
            int r6 = r6.length     // Catch:{ all -> 0x00d3 }
            if (r6 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r7 = 0
        L_0x0092:
            if (r7 == 0) goto L_0x00d9
            if (r4 == 0) goto L_0x009d
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x009b }
            goto L_0x009d
        L_0x009b:
            r3 = move-exception
            goto L_0x00cd
        L_0x009d:
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x009b }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r5, r4)     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Int"
            if (r4 == 0) goto L_0x00bd
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r3.invoke(r14, r4)     // Catch:{ all -> 0x009b }
            kotlin.jvm.internal.C13706o.m87927d(r3, r5)     // Catch:{ all -> 0x009b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x009b }
            int r13 = r3.intValue()     // Catch:{ all -> 0x009b }
            goto L_0x00cc
        L_0x00bd:
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r3.invoke(r14, r4)     // Catch:{ all -> 0x009b }
            kotlin.jvm.internal.C13706o.m87927d(r3, r5)     // Catch:{ all -> 0x009b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x009b }
            int r13 = r3.intValue()     // Catch:{ all -> 0x009b }
        L_0x00cc:
            return r13
        L_0x00cd:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00d3 }
            r4.mo68218e((java.lang.Throwable) r3)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d9
        L_0x00d3:
            r3 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r4 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x00dd }
            r4.mo68218e((java.lang.Throwable) r3)     // Catch:{ all -> 0x00dd }
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x00dd:
            r13 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r14 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r14.mo68218e((java.lang.Throwable) r13)
        L_0x00e3:
            r13 = -1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.ReflectionTools.checkIntMethodForSignature(java.lang.Class, java.lang.Object, java.lang.String):int");
    }

    public final Class<?> getClassFromPkg(String str, String str2) throws ClassNotFoundException {
        C13706o.m87929f(str, "pkg");
        C13706o.m87929f(str2, "cls");
        try {
            Class<?> cls = Class.forName(str2, true, getPathClassLoaderForPkg(str));
            C13706o.m87928e(cls, "{\n            Class.forN…derForPkg(pkg))\n        }");
            return cls;
        } catch (Throwable th) {
            throw new ClassNotFoundException("Class '" + str + "/" + str2 + "' not found", th);
        }
    }

    public final PathClassLoader getPathClassLoaderForPkg(String str) throws Exception {
        C13706o.m87929f(str, "pkg");
        PathClassLoader pathClassLoader = cache.get(str);
        if (pathClassLoader != null) {
            return pathClassLoader;
        }
        String str2 = null;
        try {
            str2 = appContext.getPackageManager().getApplicationInfo(str, 0).sourceDir;
        } catch (Throwable unused) {
            if (BuildCompat.isAtLeastN()) {
                str2 = appContext.getPackageManager().getApplicationInfo(str, 1048576).sourceDir;
            }
        }
        PathClassLoader pathClassLoader2 = new PathClassLoader(str2, ClassLoader.getSystemClassLoader());
        cache.put(str, pathClassLoader2);
        return pathClassLoader2;
    }
}
