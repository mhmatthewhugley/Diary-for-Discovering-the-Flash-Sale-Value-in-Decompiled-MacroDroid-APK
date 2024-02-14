package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class ClassInfo {

    /* renamed from: e */
    private static final Map<Class<?>, ClassInfo> f52748e = new WeakHashMap();

    /* renamed from: f */
    private static final Map<Class<?>, ClassInfo> f52749f = new WeakHashMap();

    /* renamed from: a */
    private final Class<?> f52750a;

    /* renamed from: b */
    private final boolean f52751b;

    /* renamed from: c */
    private final IdentityHashMap<String, FieldInfo> f52752c = new IdentityHashMap<>();

    /* renamed from: d */
    final List<String> f52753d;

    private ClassInfo(Class<?> cls, boolean z) {
        Field field;
        this.f52750a = cls;
        this.f52751b = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        Preconditions.m72714b(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            /* renamed from: a */
            public int compare(String str, String str2) {
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field2 : cls.getDeclaredFields()) {
            FieldInfo k = FieldInfo.m72676k(field2);
            if (k != null) {
                String e = k.mo60745e();
                e = z ? e.toLowerCase().intern() : e;
                FieldInfo fieldInfo = this.f52752c.get(e);
                boolean z3 = fieldInfo == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = e;
                objArr[2] = field2;
                if (fieldInfo == null) {
                    field = null;
                } else {
                    field = fieldInfo.mo60743b();
                }
                objArr[3] = field;
                Preconditions.m72715c(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f52752c.put(e, k);
                treeSet.add(e);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo g = m72641g(superclass, z);
            treeSet.addAll(g.f52753d);
            for (Map.Entry next : g.f52752c.entrySet()) {
                String str = (String) next.getKey();
                if (!this.f52752c.containsKey(str)) {
                    this.f52752c.put(str, next.getValue());
                }
            }
        }
        this.f52753d = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: f */
    public static ClassInfo m72640f(Class<?> cls) {
        return m72641g(cls, false);
    }

    /* renamed from: g */
    public static ClassInfo m72641g(Class<?> cls, boolean z) {
        ClassInfo classInfo;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, ClassInfo> map = z ? f52749f : f52748e;
        synchronized (map) {
            classInfo = map.get(cls);
            if (classInfo == null) {
                classInfo = new ClassInfo(cls, z);
                map.put(cls, classInfo);
            }
        }
        return classInfo;
    }

    /* renamed from: a */
    public Field mo60708a(String str) {
        FieldInfo b = mo60709b(str);
        if (b == null) {
            return null;
        }
        return b.mo60743b();
    }

    /* renamed from: b */
    public FieldInfo mo60709b(String str) {
        if (str != null) {
            if (this.f52751b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return this.f52752c.get(str);
    }

    /* renamed from: c */
    public Collection<FieldInfo> mo60710c() {
        return Collections.unmodifiableCollection(this.f52752c.values());
    }

    /* renamed from: d */
    public final boolean mo60711d() {
        return this.f52751b;
    }

    /* renamed from: e */
    public boolean mo60712e() {
        return this.f52750a.isEnum();
    }
}
