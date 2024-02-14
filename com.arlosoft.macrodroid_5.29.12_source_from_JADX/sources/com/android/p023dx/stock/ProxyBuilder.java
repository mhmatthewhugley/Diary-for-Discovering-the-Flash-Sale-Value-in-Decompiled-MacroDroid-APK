package com.android.p023dx.stock;

import com.android.p023dx.Code;
import com.android.p023dx.Comparison;
import com.android.p023dx.DexMaker;
import com.android.p023dx.FieldId;
import com.android.p023dx.Label;
import com.android.p023dx.Local;
import com.android.p023dx.MethodId;
import com.android.p023dx.TypeId;
import com.android.p023dx.rop.code.RegisterSpec;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: com.android.dx.stock.ProxyBuilder */
public final class ProxyBuilder<T> {
    private static final String FIELD_NAME_HANDLER = "$__handler";
    private static final String FIELD_NAME_METHODS = "$__methodArray";
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_BOXED;
    private static final Map<Class<?>, MethodId<?, ?>> PRIMITIVE_TO_UNBOX_METHOD;
    private static final Map<TypeId<?>, MethodId<?, ?>> PRIMITIVE_TYPE_TO_UNBOX_METHOD = new HashMap();
    public static final int VERSION = 1;
    private static final Map<Class<?>, Class<?>> generatedProxyClasses = Collections.synchronizedMap(new HashMap());
    private final Class<T> baseClass;
    private Class<?>[] constructorArgTypes = new Class[0];
    private Object[] constructorArgValues = new Object[0];
    private File dexCache;
    private InvocationHandler handler;
    private Set<Class<?>> interfaces = new HashSet();
    private Method[] methods;
    private ClassLoader parentClassLoader = ProxyBuilder.class.getClassLoader();
    private boolean sharedClassLoader;

    /* renamed from: com.android.dx.stock.ProxyBuilder$MethodSetEntry */
    public static class MethodSetEntry {
        public final String name;
        public final Method originalMethod;
        public final Class<?>[] paramTypes;
        public final Class<?> returnType;

        public MethodSetEntry(Method method) {
            this.originalMethod = method;
            this.name = method.getName();
            this.paramTypes = method.getParameterTypes();
            this.returnType = method.getReturnType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MethodSetEntry)) {
                return false;
            }
            MethodSetEntry methodSetEntry = (MethodSetEntry) obj;
            if (!this.name.equals(methodSetEntry.name) || !this.returnType.equals(methodSetEntry.returnType) || !Arrays.equals(this.paramTypes, methodSetEntry.paramTypes)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = 527 + this.name.hashCode() + 17;
            int hashCode2 = hashCode + (hashCode * 31) + this.returnType.hashCode();
            return hashCode2 + (hashCode2 * 31) + Arrays.hashCode(this.paramTypes);
        }
    }

    static {
        Class<Character> cls = Character.class;
        Class<Double> cls2 = Double.class;
        Class<Float> cls3 = Float.class;
        Class<Short> cls4 = Short.class;
        Class<Long> cls5 = Long.class;
        Class<Byte> cls6 = Byte.class;
        Class<Integer> cls7 = Integer.class;
        Class<Boolean> cls8 = Boolean.class;
        HashMap hashMap = new HashMap();
        PRIMITIVE_TO_BOXED = hashMap;
        hashMap.put(Boolean.TYPE, cls8);
        hashMap.put(Integer.TYPE, cls7);
        hashMap.put(Byte.TYPE, cls6);
        hashMap.put(Long.TYPE, cls5);
        hashMap.put(Short.TYPE, cls4);
        hashMap.put(Float.TYPE, cls3);
        hashMap.put(Double.TYPE, cls2);
        hashMap.put(Character.TYPE, cls);
        for (Map.Entry entry : hashMap.entrySet()) {
            TypeId typeId = TypeId.get((Class) entry.getKey());
            TypeId typeId2 = TypeId.get((Class) entry.getValue());
            PRIMITIVE_TYPE_TO_UNBOX_METHOD.put(typeId, typeId2.getMethod(typeId2, "valueOf", typeId));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Boolean.TYPE, TypeId.get(cls8).getMethod(TypeId.BOOLEAN, "booleanValue", new TypeId[0]));
        hashMap2.put(Integer.TYPE, TypeId.get(cls7).getMethod(TypeId.INT, "intValue", new TypeId[0]));
        hashMap2.put(Byte.TYPE, TypeId.get(cls6).getMethod(TypeId.BYTE, "byteValue", new TypeId[0]));
        hashMap2.put(Long.TYPE, TypeId.get(cls5).getMethod(TypeId.LONG, "longValue", new TypeId[0]));
        hashMap2.put(Short.TYPE, TypeId.get(cls4).getMethod(TypeId.SHORT, "shortValue", new TypeId[0]));
        hashMap2.put(Float.TYPE, TypeId.get(cls3).getMethod(TypeId.FLOAT, "floatValue", new TypeId[0]));
        hashMap2.put(Double.TYPE, TypeId.get(cls2).getMethod(TypeId.DOUBLE, "doubleValue", new TypeId[0]));
        hashMap2.put(Character.TYPE, TypeId.get(cls).getMethod(TypeId.CHAR, "charValue", new TypeId[0]));
        PRIMITIVE_TO_UNBOX_METHOD = hashMap2;
    }

    private ProxyBuilder(Class<T> cls) {
        this.baseClass = cls;
    }

    private static <T> Set<T> asSet(T... tArr) {
        return new CopyOnWriteArraySet(Arrays.asList(tArr));
    }

    private static Local<?> boxIfRequired(Code code, Local<?> local, Local<Object> local2) {
        MethodId methodId = PRIMITIVE_TYPE_TO_UNBOX_METHOD.get(local.getType());
        if (methodId == null) {
            return local;
        }
        code.invokeStatic(methodId, local2, local);
        return local2;
    }

    public static Object callSuper(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return obj.getClass().getMethod(superMethodName(method), method.getParameterTypes()).invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static void check(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    private static TypeId<?>[] classArrayToTypeArray(Class<?>[] clsArr) {
        TypeId<?>[] typeIdArr = new TypeId[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            typeIdArr[i] = TypeId.get(clsArr[i]);
        }
        return typeIdArr;
    }

    public static <T> ProxyBuilder<T> forClass(Class<T> cls) {
        return new ProxyBuilder<>(cls);
    }

    private static <T, G extends T> void generateCodeForAllMethods(DexMaker dexMaker, TypeId<G> typeId, Method[] methodArr, TypeId<T> typeId2) {
        MethodId<T, R> methodId;
        DexMaker dexMaker2 = dexMaker;
        TypeId<G> typeId3 = typeId;
        Method[] methodArr2 = methodArr;
        TypeId typeId4 = TypeId.get(InvocationHandler.class);
        TypeId typeId5 = TypeId.get(Method[].class);
        FieldId<G, V> field = typeId3.getField(typeId4, FIELD_NAME_HANDLER);
        FieldId<G, V> field2 = typeId3.getField(typeId5, FIELD_NAME_METHODS);
        TypeId<Method> typeId6 = TypeId.get(Method.class);
        TypeId<Object[]> typeId7 = TypeId.get(Object[].class);
        TypeId<Object> typeId8 = TypeId.OBJECT;
        MethodId<Object, R> method = typeId4.getMethod(typeId8, "invoke", typeId8, typeId6, typeId7);
        int i = 0;
        while (i < methodArr2.length) {
            Method method2 = methodArr2[i];
            String name = method2.getName();
            Class[] parameterTypes = method2.getParameterTypes();
            int length = parameterTypes.length;
            TypeId[] typeIdArr = new TypeId[length];
            for (int i2 = 0; i2 < length; i2++) {
                typeIdArr[i2] = TypeId.get(parameterTypes[i2]);
            }
            Class returnType = method2.getReturnType();
            Method method3 = method2;
            TypeId typeId9 = TypeId.get(returnType);
            FieldId<G, V> fieldId = field;
            MethodId<Object, R> methodId2 = method;
            MethodId<T, R> method4 = typeId2.getMethod(typeId9, name, typeIdArr);
            Code declare = dexMaker2.declare(typeId3.getMethod(typeId9, name, typeIdArr), 1);
            Local<G> local = declare.getThis(typeId3);
            Local newLocal = declare.newLocal(typeId4);
            TypeId<Object> typeId10 = TypeId.OBJECT;
            MethodId<T, R> methodId3 = method4;
            Local<Object> newLocal2 = declare.newLocal(typeId10);
            TypeId<Integer> typeId11 = TypeId.INT;
            TypeId[] typeIdArr2 = typeIdArr;
            Local<Integer> newLocal3 = declare.newLocal(typeId11);
            Local<Object[]> newLocal4 = declare.newLocal(typeId7);
            TypeId<Object[]> typeId12 = typeId7;
            Local<Integer> newLocal5 = declare.newLocal(typeId11);
            Local<Object> newLocal6 = declare.newLocal(typeId10);
            Local newLocal7 = declare.newLocal(typeId9);
            Local newLocal8 = declare.newLocal(typeId5);
            TypeId typeId13 = typeId5;
            Local<Method> newLocal9 = declare.newLocal(typeId6);
            Local<Integer> newLocal10 = declare.newLocal(typeId11);
            TypeId<Method> typeId14 = typeId6;
            Class cls = PRIMITIVE_TO_BOXED.get(returnType);
            Class cls2 = returnType;
            Local newLocal11 = cls != null ? declare.newLocal(TypeId.get(cls)) : null;
            int length2 = parameterTypes.length;
            Class[] clsArr = parameterTypes;
            Local[] localArr = new Local[length2];
            Local newLocal12 = declare.newLocal(typeId9);
            TypeId typeId15 = typeId9;
            Local newLocal13 = declare.newLocal(typeId4);
            TypeId typeId16 = typeId4;
            declare.loadConstant(newLocal10, Integer.valueOf(i));
            declare.sget(field2, newLocal8);
            declare.aget(newLocal9, newLocal8, newLocal10);
            declare.loadConstant(newLocal5, Integer.valueOf(length));
            declare.newArray(newLocal4, newLocal5);
            FieldId<G, V> fieldId2 = fieldId;
            declare.iget(fieldId2, newLocal, local);
            declare.loadConstant(newLocal13, null);
            Label label = new Label();
            declare.compare(Comparison.EQ, label, newLocal13, newLocal);
            int i3 = 0;
            while (i3 < length) {
                Local<Integer> local2 = newLocal3;
                declare.loadConstant(local2, Integer.valueOf(i3));
                declare.aput(newLocal4, local2, boxIfRequired(declare, declare.getParameter(i3, typeIdArr2[i3]), newLocal6));
                i3++;
                fieldId2 = fieldId2;
            }
            FieldId<G, V> fieldId3 = fieldId2;
            Local[] localArr2 = {local, newLocal9, newLocal4};
            MethodId<Object, R> methodId4 = methodId2;
            Local<Object> local3 = newLocal2;
            declare.invokeInterface(methodId4, local3, newLocal, localArr2);
            Class cls3 = cls2;
            generateCodeForReturnStatement(declare, cls3, local3, newLocal7, newLocal11);
            declare.mark(label);
            for (int i4 = 0; i4 < length2; i4++) {
                localArr[i4] = declare.getParameter(i4, typeIdArr2[i4]);
            }
            if (Void.TYPE.equals(cls3)) {
                methodId = methodId3;
                declare.invokeSuper(methodId, (Local) null, local, localArr);
                declare.returnVoid();
            } else {
                methodId = methodId3;
                invokeSuper(methodId, declare, local, localArr, newLocal12);
                declare.returnValue(newLocal12);
            }
            TypeId<G> typeId17 = typeId;
            TypeId[] typeIdArr3 = typeIdArr2;
            TypeId typeId18 = typeId15;
            DexMaker dexMaker3 = dexMaker;
            Code declare2 = dexMaker3.declare(typeId17.getMethod(typeId18, superMethodName(method3), typeIdArr3), 1);
            Local<G> local4 = declare2.getThis(typeId17);
            int length3 = clsArr.length;
            Local[] localArr3 = new Local[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                localArr3[i5] = declare2.getParameter(i5, typeIdArr3[i5]);
            }
            if (Void.TYPE.equals(cls3)) {
                declare2.invokeSuper(methodId, (Local) null, local4, localArr3);
                declare2.returnVoid();
            } else {
                Local newLocal14 = declare2.newLocal(typeId18);
                invokeSuper(methodId, declare2, local4, localArr3, newLocal14);
                declare2.returnValue(newLocal14);
            }
            i++;
            methodArr2 = methodArr;
            typeId3 = typeId17;
            method = methodId4;
            dexMaker2 = dexMaker3;
            field = fieldId3;
            typeId7 = typeId12;
            typeId5 = typeId13;
            typeId6 = typeId14;
            typeId4 = typeId16;
        }
    }

    private static void generateCodeForReturnStatement(Code code, Class cls, Local local, Local local2, Local local3) {
        if (PRIMITIVE_TO_UNBOX_METHOD.containsKey(cls)) {
            code.cast(local3, local);
            code.invokeVirtual(getUnboxMethodForPrimitive(cls), local2, local3, new Local[0]);
            code.returnValue(local2);
        } else if (Void.TYPE.equals(cls)) {
            code.returnVoid();
        } else {
            code.cast(local2, local);
            code.returnValue(local2);
        }
    }

    private static <T, G extends T> void generateConstructorsAndFields(DexMaker dexMaker, TypeId<G> typeId, TypeId<T> typeId2, Class<T> cls) {
        TypeId typeId3 = TypeId.get(InvocationHandler.class);
        TypeId typeId4 = TypeId.get(Method[].class);
        dexMaker.declare(typeId.getField(typeId3, FIELD_NAME_HANDLER), 2, (Object) null);
        dexMaker.declare(typeId.getField(typeId4, FIELD_NAME_METHODS), 10, (Object) null);
        for (Constructor constructor : getConstructorsToOverwrite(cls)) {
            if (constructor.getModifiers() != 16) {
                TypeId[] classArrayToTypeArray = classArrayToTypeArray(constructor.getParameterTypes());
                Code declare = dexMaker.declare(typeId.getConstructor(classArrayToTypeArray), 1);
                Local<G> local = declare.getThis(typeId);
                int length = classArrayToTypeArray.length;
                Local[] localArr = new Local[length];
                for (int i = 0; i < length; i++) {
                    localArr[i] = declare.getParameter(i, classArrayToTypeArray[i]);
                }
                declare.invokeDirect(typeId2.getConstructor(classArrayToTypeArray), (Local) null, local, localArr);
                declare.returnVoid();
            }
        }
    }

    private static <T> Constructor<T>[] getConstructorsToOverwrite(Class<T> cls) {
        return cls.getDeclaredConstructors();
    }

    private TypeId<?>[] getInterfacesAsTypeIds() {
        TypeId<?>[] typeIdArr = new TypeId[this.interfaces.size()];
        int i = 0;
        for (Class<?> cls : this.interfaces) {
            typeIdArr[i] = TypeId.get(cls);
            i++;
        }
        return typeIdArr;
    }

    public static InvocationHandler getInvocationHandler(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(FIELD_NAME_HANDLER);
            declaredField.setAccessible(true);
            return (InvocationHandler) declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Not a valid proxy instance", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    private static <T> String getMethodNameForProxyOf(Class<T> cls) {
        return cls.getName().replace(".", "/") + "_Proxy";
    }

    private void getMethodsToProxy(Set<MethodSetEntry> set, Set<MethodSetEntry> set2, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 16) != 0) {
                MethodSetEntry methodSetEntry = new MethodSetEntry(method);
                set2.add(methodSetEntry);
                set.remove(methodSetEntry);
            } else if ((method.getModifiers() & 8) == 0 && ((Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers()) || (this.sharedClassLoader && !Modifier.isPrivate(method.getModifiers()))) && (!method.getName().equals("finalize") || method.getParameterTypes().length != 0))) {
                MethodSetEntry methodSetEntry2 = new MethodSetEntry(method);
                if (!set2.contains(methodSetEntry2)) {
                    set.add(methodSetEntry2);
                }
            }
        }
        if (cls.isInterface()) {
            for (Class methodsToProxy : cls.getInterfaces()) {
                getMethodsToProxy(set, set2, methodsToProxy);
            }
        }
    }

    private Method[] getMethodsToProxyRecursive() {
        int i;
        HashSet<MethodSetEntry> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        for (Class cls = this.baseClass; cls != null; cls = cls.getSuperclass()) {
            getMethodsToProxy(hashSet, hashSet2, cls);
        }
        Class cls2 = this.baseClass;
        while (true) {
            i = 0;
            if (cls2 == null) {
                break;
            }
            Class[] interfaces2 = cls2.getInterfaces();
            int length = interfaces2.length;
            while (i < length) {
                getMethodsToProxy(hashSet, hashSet2, interfaces2[i]);
                i++;
            }
            cls2 = cls2.getSuperclass();
        }
        for (Class<?> methodsToProxy : this.interfaces) {
            getMethodsToProxy(hashSet, hashSet2, methodsToProxy);
        }
        Method[] methodArr = new Method[hashSet.size()];
        for (MethodSetEntry methodSetEntry : hashSet) {
            methodArr[i] = methodSetEntry.originalMethod;
            i++;
        }
        return methodArr;
    }

    private static MethodId<?, ?> getUnboxMethodForPrimitive(Class<?> cls) {
        return PRIMITIVE_TO_UNBOX_METHOD.get(cls);
    }

    private static void invokeSuper(MethodId methodId, Code code, Local local, Local[] localArr, Local local2) {
        code.invokeSuper(methodId, local2, local, localArr);
    }

    public static boolean isProxyClass(Class<?> cls) {
        try {
            cls.getDeclaredField(FIELD_NAME_HANDLER);
            return true;
        } catch (NoSuchFieldException unused) {
            return false;
        }
    }

    private static RuntimeException launderCause(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause instanceof Error) {
            throw ((Error) cause);
        } else if (cause instanceof RuntimeException) {
            throw ((RuntimeException) cause);
        } else {
            throw new UndeclaredThrowableException(cause);
        }
    }

    private Class<? extends T> loadClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return classLoader.loadClass(str);
    }

    public static void setInvocationHandler(Object obj, InvocationHandler invocationHandler) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(FIELD_NAME_HANDLER);
            declaredField.setAccessible(true);
            declaredField.set(obj, invocationHandler);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Not a valid proxy instance", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    private static void setMethodsStaticField(Class<?> cls, Method[] methodArr) {
        try {
            Field declaredField = cls.getDeclaredField(FIELD_NAME_METHODS);
            declaredField.setAccessible(true);
            declaredField.set((Object) null, methodArr);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    private static String superMethodName(Method method) {
        String name = method.getReturnType().getName();
        return "super$" + method.getName() + "$" + name.replace(FilenameUtils.EXTENSION_SEPARATOR, '_').replace('[', '_').replace(';', '_');
    }

    public T build() throws IOException {
        boolean z = true;
        check(this.handler != null, "handler == null");
        if (this.constructorArgTypes.length != this.constructorArgValues.length) {
            z = false;
        }
        check(z, "constructorArgValues.length != constructorArgTypes.length");
        try {
            try {
                T newInstance = buildProxyClass().getConstructor(this.constructorArgTypes).newInstance(this.constructorArgValues);
                setInvocationHandler(newInstance, this.handler);
                return newInstance;
            } catch (InstantiationException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw launderCause(e3);
            }
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("No constructor for " + this.baseClass.getName() + " with parameter types " + Arrays.toString(this.constructorArgTypes));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r1.getClassLoader().getParent() == r10.parentClassLoader) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1.getClassLoader() == r2) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class<? extends T> buildProxyClass() throws java.io.IOException {
        /*
            r10 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = generatedProxyClasses
            java.lang.Class<T> r1 = r10.baseClass
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x0045
            boolean r2 = r10.sharedClassLoader
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.ClassLoader r2 = r10.parentClassLoader
            if (r2 == 0) goto L_0x0017
            goto L_0x001d
        L_0x0017:
            java.lang.Class<T> r2 = r10.baseClass
            java.lang.ClassLoader r2 = r2.getClassLoader()
        L_0x001d:
            java.lang.ClassLoader r5 = r1.getClassLoader()
            if (r5 != r2) goto L_0x0024
            goto L_0x0032
        L_0x0024:
            r3 = 0
            goto L_0x0032
        L_0x0026:
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.ClassLoader r2 = r2.getParent()
            java.lang.ClassLoader r5 = r10.parentClassLoader
            if (r2 != r5) goto L_0x0024
        L_0x0032:
            if (r3 == 0) goto L_0x0045
            java.util.Set<java.lang.Class<?>> r2 = r10.interfaces
            java.lang.Class[] r3 = r1.getInterfaces()
            java.util.Set r3 = asSet(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0045
            return r1
        L_0x0045:
            com.android.dx.DexMaker r1 = new com.android.dx.DexMaker
            r1.<init>()
            java.lang.Class<T> r2 = r10.baseClass
            java.lang.String r2 = getMethodNameForProxyOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "L"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ";"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.android.dx.TypeId r4 = com.android.p023dx.TypeId.get((java.lang.String) r3)
            java.lang.Class<T> r3 = r10.baseClass
            com.android.dx.TypeId r7 = com.android.p023dx.TypeId.get(r3)
            java.lang.Class<T> r3 = r10.baseClass
            generateConstructorsAndFields(r1, r4, r7, r3)
            java.lang.reflect.Method[] r3 = r10.methods
            if (r3 != 0) goto L_0x007d
            java.lang.reflect.Method[] r3 = r10.getMethodsToProxyRecursive()
        L_0x007d:
            r9 = r3
            com.android.dx.stock.ProxyBuilder$1 r3 = new com.android.dx.stock.ProxyBuilder$1
            r3.<init>()
            java.util.Arrays.sort(r9, r3)
            generateCodeForAllMethods(r1, r4, r9, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r5 = ".generated"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r6 = 1
            com.android.dx.TypeId[] r8 = r10.getInterfacesAsTypeIds()
            r3 = r1
            r3.declare(r4, r5, r6, r7, r8)
            boolean r3 = r10.sharedClassLoader
            if (r3 == 0) goto L_0x00b0
            java.lang.Class<T> r3 = r10.baseClass
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r1.setSharedClassLoader(r3)
        L_0x00b0:
            java.lang.ClassLoader r3 = r10.parentClassLoader
            java.io.File r4 = r10.dexCache
            java.lang.ClassLoader r1 = r1.generateAndLoad(r3, r4)
            java.lang.Class r1 = r10.loadClass(r1, r2)     // Catch:{ IllegalAccessError -> 0x00cc, ClassNotFoundException -> 0x00c5 }
            setMethodsStaticField(r1, r9)
            java.lang.Class<T> r2 = r10.baseClass
            r0.put(r2, r1)
            return r1
        L_0x00c5:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x00cc:
            r0 = move-exception
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cannot proxy inaccessible class "
            r2.append(r3)
            java.lang.Class<T> r3 = r10.baseClass
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.stock.ProxyBuilder.buildProxyClass():java.lang.Class");
    }

    public ProxyBuilder<T> constructorArgTypes(Class<?>... clsArr) {
        this.constructorArgTypes = clsArr;
        return this;
    }

    public ProxyBuilder<T> constructorArgValues(Object... objArr) {
        this.constructorArgValues = objArr;
        return this;
    }

    public ProxyBuilder<T> dexCache(File file) {
        File file2 = new File(file, RegisterSpec.PREFIX + Integer.toString(1));
        this.dexCache = file2;
        file2.mkdir();
        return this;
    }

    public ProxyBuilder<T> handler(InvocationHandler invocationHandler) {
        this.handler = invocationHandler;
        return this;
    }

    public ProxyBuilder<T> implementing(Class<?>... clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = clsArr[i];
            if (cls.isInterface()) {
                this.interfaces.add(cls);
                i++;
            } else {
                throw new IllegalArgumentException("Not an interface: " + cls.getName());
            }
        }
        return this;
    }

    public ProxyBuilder<T> onlyMethods(Method[] methodArr) {
        this.methods = methodArr;
        return this;
    }

    public ProxyBuilder<T> parentClassLoader(ClassLoader classLoader) {
        this.parentClassLoader = classLoader;
        return this;
    }

    public ProxyBuilder<T> withSharedClassLoader() {
        this.sharedClassLoader = true;
        return this;
    }
}
