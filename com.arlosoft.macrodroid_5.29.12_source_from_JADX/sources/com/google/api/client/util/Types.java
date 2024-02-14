package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Types {
    private Types() {
    }

    /* renamed from: a */
    private static Type m72730a(Type type, Class<?> cls, int i) {
        ParameterizedType h = m72737h(type, cls);
        if (h == null) {
            return null;
        }
        Type type2 = h.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type n = m72743n(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (n != null) {
                return n;
            }
        }
        return type2;
    }

    /* renamed from: b */
    public static Type m72731b(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: c */
    public static Type m72732c(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* renamed from: d */
    public static Type m72733d(Type type) {
        return m72730a(type, Iterable.class, 0);
    }

    /* renamed from: e */
    public static Type m72734e(Type type) {
        return m72730a(type, Map.class, 1);
    }

    /* renamed from: f */
    public static Class<?> m72735f(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = m72743n(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m72735f(list, m72731b(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m72736g((ParameterizedType) type);
        }
        Preconditions.m72715c(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: g */
    public static Class<?> m72736g(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: h */
    public static ParameterizedType m72737h(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> g = m72736g(parameterizedType);
                if (g == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : g.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : m72736g((ParameterizedType) type2))) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = g;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    /* renamed from: i */
    private static IllegalArgumentException m72738i(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    /* renamed from: j */
    public static boolean m72739j(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    /* renamed from: k */
    public static boolean m72740k(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* renamed from: l */
    public static <T> Iterable<T> m72741l(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Preconditions.m72715c(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {

                    /* renamed from: a */
                    final int f52837a;

                    /* renamed from: c */
                    int f52838c = 0;

                    {
                        this.f52837a = Array.getLength(obj);
                    }

                    public boolean hasNext() {
                        return this.f52838c < this.f52837a;
                    }

                    public T next() {
                        if (hasNext()) {
                            Object obj = obj;
                            int i = this.f52838c;
                            this.f52838c = i + 1;
                            return Array.get(obj, i);
                        }
                        throw new NoSuchElementException();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    /* renamed from: m */
    public static <T> T m72742m(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m72738i(e, cls);
        } catch (InstantiationException e2) {
            throw m72738i(e2, cls);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = m72743n(r5, (java.lang.reflect.TypeVariable) r6);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m72743n(java.util.List<java.lang.reflect.Type> r5, java.lang.reflect.TypeVariable<?> r6) {
        /*
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x004d
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r3 = r5.size()
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0022
            java.lang.Object r4 = r5.get(r3)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.ParameterizedType r4 = m72737h(r4, r1)
            goto L_0x0011
        L_0x0022:
            if (r4 == 0) goto L_0x004d
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0038
            r2 = r0[r1]
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0038:
            java.lang.reflect.Type[] r6 = r4.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x004c
            r0 = r6
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type r5 = m72743n(r5, r0)
            if (r5 == 0) goto L_0x004c
            return r5
        L_0x004c:
            return r6
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.util.Types.m72743n(java.util.List, java.lang.reflect.TypeVariable):java.lang.reflect.Type");
    }

    /* renamed from: o */
    public static Object m72744o(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            Array.set(newInstance, i, obj);
            i++;
        }
        return newInstance;
    }
}
