package com.google.api.client.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public class FieldInfo {

    /* renamed from: d */
    private static final Map<Field, FieldInfo> f52798d = new WeakHashMap();

    /* renamed from: a */
    private final boolean f52799a;

    /* renamed from: b */
    private final Field f52800b;

    /* renamed from: c */
    private final String f52801c;

    FieldInfo(Field field, String str) {
        String str2;
        this.f52800b = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.f52801c = str2;
        this.f52799a = Data.m72653d(mo60746f());
    }

    /* renamed from: c */
    public static Object m72674c(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: j */
    public static FieldInfo m72675j(Enum<?> enumR) {
        try {
            FieldInfo k = m72676k(enumR.getClass().getField(enumR.name()));
            Preconditions.m72715c(k != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return k;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.util.FieldInfo m72676k(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, com.google.api.client.util.FieldInfo> r1 = f52798d
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0067 }
            com.google.api.client.util.FieldInfo r2 = (com.google.api.client.util.FieldInfo) r2     // Catch:{ all -> 0x0067 }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x001f
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x0067 }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0065
        L_0x001f:
            if (r3 == 0) goto L_0x003d
            java.lang.Class<com.google.api.client.util.Value> r2 = com.google.api.client.util.Value.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            com.google.api.client.util.Value r2 = (com.google.api.client.util.Value) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            goto L_0x0051
        L_0x0030:
            java.lang.Class<com.google.api.client.util.NullValue> r2 = com.google.api.client.util.NullValue.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            com.google.api.client.util.NullValue r2 = (com.google.api.client.util.NullValue) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x003d:
            java.lang.Class<com.google.api.client.util.Key> r2 = com.google.api.client.util.Key.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            com.google.api.client.util.Key r2 = (com.google.api.client.util.Key) r2     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0049:
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x0067 }
        L_0x0051:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x005d
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0067 }
        L_0x005d:
            com.google.api.client.util.FieldInfo r2 = new com.google.api.client.util.FieldInfo     // Catch:{ all -> 0x0067 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0067 }
            r1.put(r5, r2)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r2
        L_0x0067:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.util.FieldInfo.m72676k(java.lang.reflect.Field):com.google.api.client.util.FieldInfo");
    }

    /* renamed from: l */
    public static void m72677l(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object c = m72674c(field, obj);
            if (obj2 == null) {
                if (c == null) {
                    return;
                }
            } else if (obj2.equals(c)) {
                return;
            }
            String valueOf = String.valueOf(c);
            String valueOf2 = String.valueOf(obj2);
            String valueOf3 = String.valueOf(field.getName());
            String name = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + name.length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(valueOf3);
            sb.append(" field in ");
            sb.append(name);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public <T extends Enum<T>> T mo60742a() {
        return Enum.valueOf(this.f52800b.getDeclaringClass(), this.f52800b.getName());
    }

    /* renamed from: b */
    public Field mo60743b() {
        return this.f52800b;
    }

    /* renamed from: d */
    public Type mo60744d() {
        return this.f52800b.getGenericType();
    }

    /* renamed from: e */
    public String mo60745e() {
        return this.f52801c;
    }

    /* renamed from: f */
    public Class<?> mo60746f() {
        return this.f52800b.getType();
    }

    /* renamed from: g */
    public Object mo60747g(Object obj) {
        return m72674c(this.f52800b, obj);
    }

    /* renamed from: h */
    public boolean mo60748h() {
        return Modifier.isFinal(this.f52800b.getModifiers());
    }

    /* renamed from: i */
    public boolean mo60749i() {
        return this.f52799a;
    }

    /* renamed from: m */
    public void mo60750m(Object obj, Object obj2) {
        m72677l(this.f52800b, obj, obj2);
    }
}
