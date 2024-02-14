package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.p353io.FilenameUtils;

@ElementTypesAreNonnullByDefault
final class Types {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Joiner f53319a = Joiner.m5314i(", ").mo22184k("null");

    private enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Class<?> mo61514e(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Class<?> mo61514e(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: d */
        static final ClassOwnership f53323d = null;

        static {
            f53323d = m73858d();
        }

        /* renamed from: d */
        private static ClassOwnership m73858d() {
            new AnonymousClass1LocalClass<String>() {
            };
            ParameterizedType parameterizedType = (ParameterizedType) C109403.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.mo61514e(AnonymousClass1LocalClass.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Class<?> mo61514e(Class<?> cls);
    }

    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.f53329g.mo61523i(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.m5349a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.m73852s(this.componentType)).concat("[]");
        }
    }

    enum JavaVersion {
        JAVA6 {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Type mo61523i(Type type) {
                Preconditions.m5392s(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public GenericArrayType mo61520e(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Type mo61520e(Type type) {
                if (type instanceof Class) {
                    return Types.m73841h((Class) type);
                }
                return new GenericArrayTypeImpl(type);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Type mo61523i(Type type) {
                return (Type) Preconditions.m5392s(type);
            }
        },
        JAVA8 {
            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Type mo61520e(Type type) {
                return JavaVersion.JAVA7.mo61520e(type);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public String mo61521f(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Type mo61523i(Type type) {
                return JavaVersion.JAVA7.mo61523i(type);
            }
        },
        JAVA9 {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public boolean mo61519d() {
                return false;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Type mo61520e(Type type) {
                return JavaVersion.JAVA8.mo61520e(type);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public String mo61521f(Type type) {
                return JavaVersion.JAVA8.mo61521f(type);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Type mo61523i(Type type) {
                return JavaVersion.JAVA8.mo61523i(type);
            }
        };
        

        /* renamed from: g */
        static final JavaVersion f53329g = null;

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo61519d() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Type mo61520e(Type type);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo61521f(Type type) {
            return Types.m73852s(type);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final ImmutableList<Type> mo61522g(Type[] typeArr) {
            ImmutableList.Builder n = ImmutableList.m27306n();
            for (Type i : typeArr) {
                n.mo35365e(mo61523i(i));
            }
            return n.mo35398k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract Type mo61523i(Type type);
    }

    static final class NativeTypeVariableEquals<X> {

        /* renamed from: a */
        static final boolean f53331a;

        static {
            Class<NativeTypeVariableEquals> cls = NativeTypeVariableEquals.class;
            f53331a = !cls.getTypeParameters()[0].equals(Types.m73844k(cls, "X", new Type[0]));
        }

        NativeTypeVariableEquals() {
        }
    }

    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        ParameterizedTypeImpl(Type type, Class<?> cls, Type[] typeArr) {
            Preconditions.m5392s(cls);
            Preconditions.m5377d(typeArr.length == cls.getTypeParameters().length);
            Types.m73839f(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.f53329g.mo61522g(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!getRawType().equals(parameterizedType.getRawType()) || !com.google.common.base.Objects.m5349a(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return Types.m73851r(this.argumentsList);
        }

        public Type getOwnerType() {
            return this.ownerType;
        }

        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.f53329g;
                if (javaVersion.mo61519d()) {
                    sb.append(javaVersion.mo61521f(this.ownerType));
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            Joiner d = Types.f53319a;
            ImmutableList<Type> immutableList = this.argumentsList;
            JavaVersion javaVersion2 = JavaVersion.f53329g;
            Objects.requireNonNull(javaVersion2);
            sb.append(d.mo22180e(Iterables.m27692s(immutableList, new C10949c(javaVersion2))));
            sb.append('>');
            return sb.toString();
        }
    }

    private static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* renamed from: a */
        private final D f53332a;

        /* renamed from: b */
        private final String f53333b;

        /* renamed from: c */
        private final ImmutableList<Type> f53334c;

        TypeVariableImpl(D d, String str, Type[] typeArr) {
            Types.m73839f(typeArr, "bound for type variable");
            this.f53332a = (GenericDeclaration) Preconditions.m5392s(d);
            this.f53333b = (String) Preconditions.m5392s(str);
            this.f53334c = ImmutableList.m27311w(typeArr);
        }

        /* renamed from: a */
        public D mo61531a() {
            return this.f53332a;
        }

        /* renamed from: b */
        public String mo61532b() {
            return this.f53333b;
        }

        public boolean equals(Object obj) {
            if (NativeTypeVariableEquals.f53331a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                    return false;
                }
                TypeVariableImpl a = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f53336a;
                if (!this.f53333b.equals(a.mo61532b()) || !this.f53332a.equals(a.mo61531a()) || !this.f53334c.equals(a.f53334c)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f53333b.equals(typeVariable.getName()) || !this.f53332a.equals(typeVariable.getGenericDeclaration())) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            return this.f53332a.hashCode() ^ this.f53333b.hashCode();
        }

        public String toString() {
            return this.f53333b;
        }
    }

    private static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* renamed from: b */
        private static final ImmutableMap<String, Method> f53335b;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final TypeVariableImpl<?> f53336a;

        static {
            Class<TypeVariableImpl> cls = TypeVariableImpl.class;
            ImmutableMap.Builder a = ImmutableMap.m27348a();
            for (Method method : cls.getMethods()) {
                if (method.getDeclaringClass().equals(cls)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    a.mo35338g(method.getName(), method);
                }
            }
            f53335b = a.mo35336c();
        }

        TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
            this.f53336a = typeVariableImpl;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f53335b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f53336a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.m73839f(typeArr, "lower bound for wildcard");
            Types.m73839f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.f53329g;
            this.lowerBounds = javaVersion.mo61522g(typeArr);
            this.upperBounds = javaVersion.mo61522g(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            return Types.m73851r(this.lowerBounds);
        }

        public Type[] getUpperBounds() {
            return Types.m73851r(this.upperBounds);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator<Type> k = this.lowerBounds.iterator();
            while (k.hasNext()) {
                sb.append(" super ");
                sb.append(JavaVersion.f53329g.mo61521f(k.next()));
            }
            for (Type f : Types.m73840g(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.f53329g.mo61521f(f));
            }
            return sb.toString();
        }
    }

    private Types() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m73839f(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                Preconditions.m5387n(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Iterable<Type> m73840g(Iterable<Type> iterable) {
        return Iterables.m27678e(iterable, Predicates.m5409j(Predicates.m5405f(Object.class)));
    }

    /* renamed from: h */
    static Class<?> m73841h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: i */
    static Type m73842i(Type type) {
        Preconditions.m5392s(type);
        final AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo61473b(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo61474c(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public void mo61476e(TypeVariable<?> typeVariable) {
                atomicReference.set(Types.m73849p(typeVariable.getBounds()));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public void mo61477f(WildcardType wildcardType) {
                atomicReference.set(Types.m73849p(wildcardType.getUpperBounds()));
            }
        }.mo61513a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: j */
    static Type m73843j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.f53329g.mo61520e(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        Preconditions.m5378e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m73850q(m73843j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        Preconditions.m5378e(z, "Wildcard should have only one upper bound.");
        return m73848o(m73843j(upperBounds[0]));
    }

    /* renamed from: k */
    static <D extends GenericDeclaration> TypeVariable<D> m73844k(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m73847n(d, str, typeArr);
    }

    /* renamed from: l */
    static ParameterizedType m73845l(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.f53323d.mo61514e(cls), cls, typeArr);
    }

    /* renamed from: m */
    static ParameterizedType m73846m(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m73845l(cls, typeArr);
        }
        Preconditions.m5392s(typeArr);
        Preconditions.m5385l(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    /* renamed from: n */
    private static <D extends GenericDeclaration> TypeVariable<D> m73847n(D d, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.m73714a(TypeVariable.class, new TypeVariableInvocationHandler(new TypeVariableImpl(d, str, typeArr)));
    }

    @VisibleForTesting
    /* renamed from: o */
    static WildcardType m73848o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static Type m73849p(Type[] typeArr) {
        for (Type i : typeArr) {
            Type i2 = m73842i(i);
            if (i2 != null) {
                if (i2 instanceof Class) {
                    Class cls = (Class) i2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m73848o(i2);
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: q */
    static WildcardType m73850q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static Type[] m73851r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    /* renamed from: s */
    static String m73852s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
