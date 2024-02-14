package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Data {

    /* renamed from: a */
    public static final Boolean f52756a;

    /* renamed from: b */
    public static final String f52757b;

    /* renamed from: c */
    public static final Character f52758c;

    /* renamed from: d */
    public static final Byte f52759d;

    /* renamed from: e */
    public static final Short f52760e;

    /* renamed from: f */
    public static final Integer f52761f;

    /* renamed from: g */
    public static final Float f52762g;

    /* renamed from: h */
    public static final Long f52763h;

    /* renamed from: i */
    public static final Double f52764i;

    /* renamed from: j */
    public static final BigInteger f52765j;

    /* renamed from: k */
    public static final BigDecimal f52766k;

    /* renamed from: l */
    public static final DateTime f52767l;

    /* renamed from: m */
    private static final ConcurrentHashMap<Class<?>, Object> f52768m;

    static {
        Boolean bool = new Boolean(true);
        f52756a = bool;
        String str = new String();
        f52757b = str;
        Character ch = new Character(0);
        f52758c = ch;
        Byte b = new Byte((byte) 0);
        f52759d = b;
        Short sh = new Short(0);
        f52760e = sh;
        Integer num = new Integer(0);
        f52761f = num;
        Float f = new Float(0.0f);
        f52762g = f;
        Long l = new Long(0);
        f52763h = l;
        Double d = new Double(0.0d);
        f52764i = d;
        BigInteger bigInteger = new BigInteger("0");
        f52765j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f52766k = bigDecimal;
        DateTime dateTime = new DateTime(0);
        f52767l = dateTime;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f52768m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(DateTime.class, dateTime);
    }

    /* renamed from: a */
    public static <T> T m72650a(T t) {
        T t2;
        if (t == null || m72653d(t.getClass())) {
            return t;
        }
        if (t instanceof GenericData) {
            return ((GenericData) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof ArrayMap) {
            t2 = ((ArrayMap) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            m72651b(array, array);
            return Arrays.asList(array);
        } else {
            t2 = Types.m72742m(cls);
        }
        m72651b(t, t2);
        return t2;
    }

    /* renamed from: b */
    public static void m72651b(Object obj, Object obj2) {
        Object g;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i = 0;
        Preconditions.m72713a(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            Preconditions.m72713a(z);
            for (Object a : Types.m72741l(obj)) {
                Array.set(obj2, i, m72650a(a));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a2 : collection) {
                collection2.add(m72650a(a2));
            }
        } else {
            boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                ClassInfo f = isAssignableFrom ? ((GenericData) obj).f52803c : ClassInfo.m72640f(cls);
                for (String b : f.f52753d) {
                    FieldInfo b2 = f.mo60709b(b);
                    if (!b2.mo60748h() && ((!isAssignableFrom || !b2.mo60749i()) && (g = b2.mo60747g(obj)) != null)) {
                        b2.mo60750m(obj2, m72650a(g));
                    }
                }
            } else if (ArrayMap.class.isAssignableFrom(cls)) {
                ArrayMap arrayMap = (ArrayMap) obj2;
                ArrayMap arrayMap2 = (ArrayMap) obj;
                int size = arrayMap2.size();
                while (i < size) {
                    arrayMap.mo60680l(i, m72650a(arrayMap2.mo60677g(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m72650a(entry.getValue()));
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m72652c(Object obj) {
        return obj != null && obj == f52768m.get(obj.getClass());
    }

    /* renamed from: d */
    public static boolean m72653d(Type type) {
        if (type instanceof WildcardType) {
            type = Types.m72732c((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == DateTime.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m72654e(Object obj) {
        return obj == null || m72653d(obj.getClass());
    }

    /* renamed from: f */
    public static Map<String, Object> m72655f(Object obj) {
        if (obj == null || m72652c(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new DataMap(obj, false);
    }

    /* renamed from: g */
    public static Collection<Object> m72656g(Type type) {
        if (type instanceof WildcardType) {
            type = Types.m72732c((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(valueOf.length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) Types.m72742m(cls);
        }
    }

    /* renamed from: h */
    public static Map<String, Object> m72657h(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(ArrayMap.class)) {
            return ArrayMap.m72611b();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) Types.m72742m(cls);
    }

    /* renamed from: i */
    public static <T> T m72658i(Class<?> cls) {
        ConcurrentHashMap concurrentHashMap = f52768m;
        T t = concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (concurrentHashMap) {
                t = concurrentHashMap.get(cls);
                if (t == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        FieldInfo b = ClassInfo.m72640f(cls).mo60709b((String) null);
                        Preconditions.m72718f(b, "enum missing constant with @NullValue annotation: %s", cls);
                        t = b.mo60742a();
                    } else {
                        t = Types.m72742m(cls);
                    }
                    f52768m.put(cls, t);
                }
            }
        }
        return t;
    }

    /* renamed from: j */
    public static Object m72659j(Type type, String str) {
        Class<BigDecimal> cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == DateTime.class) {
                    return DateTime.m72667b(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return ClassInfo.m72640f(cls).mo60709b(str).mo60742a();
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: k */
    public static Type m72660k(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = Types.m72732c((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type n = Types.m72743n(list, (TypeVariable) type);
            if (n != null) {
                type = n;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
