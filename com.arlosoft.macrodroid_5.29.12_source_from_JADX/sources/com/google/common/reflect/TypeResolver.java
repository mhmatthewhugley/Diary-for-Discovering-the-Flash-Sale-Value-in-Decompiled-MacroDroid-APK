package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
public final class TypeResolver {

    /* renamed from: a */
    private final TypeTable f53289a;

    private static final class TypeMappingIntrospector extends TypeVisitor {

        /* renamed from: b */
        private final Map<TypeVariableKey, Type> f53292b = Maps.m28058A();

        private TypeMappingIntrospector() {
        }

        /* renamed from: g */
        static ImmutableMap<TypeVariableKey, Type> m73735g(Type type) {
            Preconditions.m5392s(type);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.mo61513a(type);
            return ImmutableMap.m27351d(typeMappingIntrospector.f53292b);
        }

        /* renamed from: h */
        private void m73736h(TypeVariableKey typeVariableKey, Type type) {
            if (!this.f53292b.containsKey(typeVariableKey)) {
                Type type2 = type;
                while (type2 != null) {
                    if (typeVariableKey.mo61481a(type2)) {
                        while (type != null) {
                            type = this.f53292b.remove(TypeVariableKey.m73746c(type));
                        }
                        return;
                    }
                    type2 = this.f53292b.get(TypeVariableKey.m73746c(type2));
                }
                this.f53292b.put(typeVariableKey, type);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61473b(Class<?> cls) {
            mo61513a(cls.getGenericSuperclass());
            mo61513a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo61475d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.m5398y(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                m73736h(new TypeVariableKey(typeParameters[i]), actualTypeArguments[i]);
            }
            mo61513a(cls);
            mo61513a(parameterizedType.getOwnerType());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo61476e(TypeVariable<?> typeVariable) {
            mo61513a(typeVariable.getBounds());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo61477f(WildcardType wildcardType) {
            mo61513a(wildcardType.getUpperBounds());
        }
    }

    static final class TypeVariableKey {

        /* renamed from: a */
        private final TypeVariable<?> f53296a;

        TypeVariableKey(TypeVariable<?> typeVariable) {
            this.f53296a = (TypeVariable) Preconditions.m5392s(typeVariable);
        }

        /* renamed from: b */
        private boolean m73745b(TypeVariable<?> typeVariable) {
            return this.f53296a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f53296a.getName().equals(typeVariable.getName());
        }

        /* renamed from: c */
        static TypeVariableKey m73746c(Type type) {
            if (type instanceof TypeVariable) {
                return new TypeVariableKey((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo61481a(Type type) {
            if (type instanceof TypeVariable) {
                return m73745b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof TypeVariableKey) {
                return m73745b(((TypeVariableKey) obj).f53296a);
            }
            return false;
        }

        public int hashCode() {
            return Objects.m5350b(this.f53296a.getGenericDeclaration(), this.f53296a.getName());
        }

        public String toString() {
            return this.f53296a.toString();
        }
    }

    private static class WildcardCapturer {

        /* renamed from: b */
        static final WildcardCapturer f53297b = new WildcardCapturer();

        /* renamed from: a */
        private final AtomicInteger f53298a;

        /* renamed from: c */
        private Type m73748c(Type type) {
            if (type == null) {
                return null;
            }
            return mo61485a(type);
        }

        /* renamed from: d */
        private WildcardCapturer m73749d(final TypeVariable<?> typeVariable) {
            return new WildcardCapturer(this, this.f53298a) {
                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public TypeVariable<?> mo61486b(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.mo61486b((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        /* renamed from: e */
        private WildcardCapturer m73750e() {
            return new WildcardCapturer(this.f53298a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Type mo61485a(Type type) {
            Preconditions.m5392s(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m73843j(m73750e().mo61485a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = m73749d(typeParameters[i]).mo61485a(actualTypeArguments[i]);
                }
                return Types.m73846m(m73750e().m73748c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? mo61486b(wildcardType.getUpperBounds()) : type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public TypeVariable<?> mo61486b(Type[] typeArr) {
            int incrementAndGet = this.f53298a.incrementAndGet();
            String g = Joiner.m5313h('&').mo22182g(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 33);
            sb.append("capture#");
            sb.append(incrementAndGet);
            sb.append("-of ? extends ");
            sb.append(g);
            return Types.m73844k(WildcardCapturer.class, sb.toString(), typeArr);
        }

        private WildcardCapturer() {
            this(new AtomicInteger());
        }

        private WildcardCapturer(AtomicInteger atomicInteger) {
            this.f53298a = atomicInteger;
        }
    }

    /* renamed from: d */
    static TypeResolver m73719d(Type type) {
        return new TypeResolver().mo61472n(TypeMappingIntrospector.m73735g(type));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static <T> T m73720e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + simpleName.length());
            sb.append(valueOf);
            sb.append(" is not a ");
            sb.append(simpleName);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    static TypeResolver m73721f(Type type) {
        return new TypeResolver().mo61472n(TypeMappingIntrospector.m73735g(WildcardCapturer.f53297b.mo61485a(type)));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m73722g(final Map<TypeVariableKey, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new TypeVisitor() {
                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public void mo61473b(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        String valueOf = String.valueOf(cls);
                        String valueOf2 = String.valueOf(type2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 25 + valueOf2.length());
                        sb.append("No type mapping from ");
                        sb.append(valueOf);
                        sb.append(" to ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: c */
                public void mo61474c(GenericArrayType genericArrayType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        Type i = Types.m73842i(type);
                        Preconditions.m5385l(i != null, "%s is not an array type.", type2);
                        TypeResolver.m73722g(map, genericArrayType.getGenericComponentType(), i);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: d */
                public void mo61475d(ParameterizedType parameterizedType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) TypeResolver.m73720e(ParameterizedType.class, type);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            TypeResolver.m73722g(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        Preconditions.m5387n(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        Preconditions.m5387n(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            TypeResolver.m73722g(map, actualTypeArguments[i], actualTypeArguments2[i]);
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: e */
                public void mo61476e(TypeVariable<?> typeVariable) {
                    map.put(new TypeVariableKey(typeVariable), type2);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: f */
                public void mo61477f(WildcardType wildcardType) {
                    Type type = type2;
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        Preconditions.m5387n(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                        for (int i = 0; i < upperBounds.length; i++) {
                            TypeResolver.m73722g(map, upperBounds[i], upperBounds2[i]);
                        }
                        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                            TypeResolver.m73722g(map, lowerBounds[i2], lowerBounds2[i2]);
                        }
                    }
                }
            }.mo61513a(type);
        }
    }

    /* renamed from: h */
    private Type m73723h(GenericArrayType genericArrayType) {
        return Types.m73843j(mo61470j(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: i */
    private ParameterizedType m73724i(ParameterizedType parameterizedType) {
        Type type;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            type = null;
        } else {
            type = mo61470j(ownerType);
        }
        return Types.m73846m(type, (Class) mo61470j(parameterizedType.getRawType()), m73725k(parameterizedType.getActualTypeArguments()));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public Type[] m73725k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo61470j(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: m */
    private WildcardType m73726m(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(m73725k(wildcardType.getLowerBounds()), m73725k(wildcardType.getUpperBounds()));
    }

    /* renamed from: j */
    public Type mo61470j(Type type) {
        Preconditions.m5392s(type);
        if (type instanceof TypeVariable) {
            return this.f53289a.mo61478a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m73724i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m73723h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m73726m((WildcardType) type) : type;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Type[] mo61471l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = mo61470j(typeArr[i]);
        }
        return typeArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public TypeResolver mo61472n(Map<TypeVariableKey, ? extends Type> map) {
        return new TypeResolver(this.f53289a.mo61480c(map));
    }

    private static class TypeTable {

        /* renamed from: a */
        private final ImmutableMap<TypeVariableKey, Type> f53293a;

        TypeTable() {
            this.f53293a = ImmutableMap.m27352m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Type mo61478a(final TypeVariable<?> typeVariable) {
            return mo61479b(typeVariable, new TypeTable(this) {
                /* renamed from: b */
                public Type mo61479b(TypeVariable<?> typeVariable, TypeTable typeTable) {
                    if (typeVariable.getGenericDeclaration().equals(typeVariable.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.mo61479b(typeVariable, typeTable);
                }
            });
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.reflect.Type, java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>] */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.reflect.Type mo61479b(java.lang.reflect.TypeVariable<?> r4, com.google.common.reflect.TypeResolver.TypeTable r5) {
            /*
                r3 = this;
                com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type> r0 = r3.f53293a
                com.google.common.reflect.TypeResolver$TypeVariableKey r1 = new com.google.common.reflect.TypeResolver$TypeVariableKey
                r1.<init>(r4)
                java.lang.Object r0 = r0.get(r1)
                java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
                r1 = 0
                if (r0 != 0) goto L_0x0039
                java.lang.reflect.Type[] r0 = r4.getBounds()
                int r2 = r0.length
                if (r2 != 0) goto L_0x0018
                return r4
            L_0x0018:
                com.google.common.reflect.TypeResolver r2 = new com.google.common.reflect.TypeResolver
                r2.<init>(r5)
                java.lang.reflect.Type[] r5 = r2.m73725k(r0)
                boolean r1 = com.google.common.reflect.Types.NativeTypeVariableEquals.f53331a
                if (r1 == 0) goto L_0x002c
                boolean r0 = java.util.Arrays.equals(r0, r5)
                if (r0 == 0) goto L_0x002c
                return r4
            L_0x002c:
                java.lang.reflect.GenericDeclaration r0 = r4.getGenericDeclaration()
                java.lang.String r4 = r4.getName()
                java.lang.reflect.TypeVariable r4 = com.google.common.reflect.Types.m73844k(r0, r4, r5)
                return r4
            L_0x0039:
                com.google.common.reflect.TypeResolver r4 = new com.google.common.reflect.TypeResolver
                r4.<init>(r5)
                java.lang.reflect.Type r4 = r4.mo61470j(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.TypeResolver.TypeTable.mo61479b(java.lang.reflect.TypeVariable, com.google.common.reflect.TypeResolver$TypeTable):java.lang.reflect.Type");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final TypeTable mo61480c(Map<TypeVariableKey, ? extends Type> map) {
            ImmutableMap.Builder a = ImmutableMap.m27348a();
            a.mo35341j(this.f53293a);
            for (Map.Entry next : map.entrySet()) {
                TypeVariableKey typeVariableKey = (TypeVariableKey) next.getKey();
                Type type = (Type) next.getValue();
                Preconditions.m5385l(!typeVariableKey.mo61481a(type), "Type variable %s bound to itself", typeVariableKey);
                a.mo35338g(typeVariableKey, type);
            }
            return new TypeTable(a.mo35337d());
        }

        private TypeTable(ImmutableMap<TypeVariableKey, Type> immutableMap) {
            this.f53293a = immutableMap;
        }
    }

    public TypeResolver() {
        this.f53289a = new TypeTable();
    }

    private TypeResolver(TypeTable typeTable) {
        this.f53289a = typeTable;
    }
}
