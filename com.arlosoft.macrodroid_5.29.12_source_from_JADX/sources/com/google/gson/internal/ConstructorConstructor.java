package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ConstructorConstructor {

    /* renamed from: a */
    private final Map<Type, InstanceCreator<?>> f55822a;

    /* renamed from: b */
    private final ReflectionAccessor f55823b = ReflectionAccessor.m78724a();

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map) {
        this.f55822a = map;
    }

    /* renamed from: b */
    private <T> ObjectConstructor<T> m78422b(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f55823b.mo64304b(declaredConstructor);
            }
            return new ObjectConstructor<T>() {
                /* renamed from: a */
                public T mo64081a() {
                    try {
                        return declaredConstructor.newInstance((Object[]) null);
                    } catch (InstantiationException e) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> ObjectConstructor<T> m78423c(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        Type type = type;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return EnumSet.noneOf((Class) type2);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new ObjectConstructor<T>() {
                /* renamed from: a */
                public T mo64081a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new TreeMap();
                    }
                };
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.m78731b(((ParameterizedType) type).getActualTypeArguments()[0]).mo64306c())) {
                return new ObjectConstructor<T>() {
                    /* renamed from: a */
                    public T mo64081a() {
                        return new LinkedTreeMap();
                    }
                };
            }
            return new ObjectConstructor<T>() {
                /* renamed from: a */
                public T mo64081a() {
                    return new LinkedHashMap();
                }
            };
        }
    }

    /* renamed from: d */
    private <T> ObjectConstructor<T> m78424d(final Type type, final Class<? super T> cls) {
        return new ObjectConstructor<T>() {

            /* renamed from: a */
            private final UnsafeAllocator f55831a = UnsafeAllocator.m78511b();

            /* renamed from: a */
            public T mo64081a() {
                try {
                    return this.f55831a.mo64186c(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    /* renamed from: a */
    public <T> ObjectConstructor<T> mo64079a(TypeToken<T> typeToken) {
        final Type e = typeToken.mo64307e();
        Class<? super T> c = typeToken.mo64306c();
        final InstanceCreator instanceCreator = this.f55822a.get(e);
        if (instanceCreator != null) {
            return new ObjectConstructor<T>() {
                /* renamed from: a */
                public T mo64081a() {
                    return instanceCreator.mo64012a(e);
                }
            };
        }
        final InstanceCreator instanceCreator2 = this.f55822a.get(c);
        if (instanceCreator2 != null) {
            return new ObjectConstructor<T>() {
                /* renamed from: a */
                public T mo64081a() {
                    return instanceCreator2.mo64012a(e);
                }
            };
        }
        ObjectConstructor<T> b = m78422b(c);
        if (b != null) {
            return b;
        }
        ObjectConstructor<T> c2 = m78423c(e, c);
        if (c2 != null) {
            return c2;
        }
        return m78424d(e, c);
    }

    public String toString() {
        return this.f55822a.toString();
    }
}
