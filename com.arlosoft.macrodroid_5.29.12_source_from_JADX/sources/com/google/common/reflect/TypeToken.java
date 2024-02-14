package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.reflect.Invokable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* renamed from: a */
    private transient TypeResolver f53300a;

    /* renamed from: c */
    private transient TypeResolver f53301c;
    /* access modifiers changed from: private */
    public final Type runtimeType;

    /* renamed from: com.google.common.reflect.TypeToken$1 */
    class C109271 extends Invokable.MethodInvokable<Object> {

        /* renamed from: d */
        final /* synthetic */ TypeToken f53302d;

        /* renamed from: a */
        public TypeToken<Object> mo61442a() {
            return this.f53302d;
        }

        public String toString() {
            String valueOf = String.valueOf(mo61442a());
            String invokable = super.toString();
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(invokable).length());
            sb.append(valueOf);
            sb.append(".");
            sb.append(invokable);
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$2 */
    class C109282 extends Invokable.ConstructorInvokable<Object> {

        /* renamed from: f */
        final /* synthetic */ TypeToken f53303f;

        /* renamed from: a */
        public TypeToken<Object> mo61442a() {
            return this.f53303f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Type[] mo61454b() {
            return this.f53303f.m73760j().mo61471l(super.mo61454b());
        }

        public String toString() {
            String valueOf = String.valueOf(mo61442a());
            String g = Joiner.m5314i(", ").mo22182g(mo61454b());
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + String.valueOf(g).length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(g);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$3 */
    class C109293 extends TypeVisitor {

        /* renamed from: b */
        final /* synthetic */ TypeToken f53304b;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo61474c(GenericArrayType genericArrayType) {
            mo61513a(genericArrayType.getGenericComponentType());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo61475d(ParameterizedType parameterizedType) {
            mo61513a(parameterizedType.getActualTypeArguments());
            mo61513a(parameterizedType.getOwnerType());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo61476e(TypeVariable<?> typeVariable) {
            String valueOf = String.valueOf(this.f53304b.runtimeType);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append(valueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo61477f(WildcardType wildcardType) {
            mo61513a(wildcardType.getLowerBounds());
            mo61513a(wildcardType.getUpperBounds());
        }
    }

    private static class Bounds {
    }

    private final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private transient ImmutableSet<TypeToken<? super T>> f53306c;

        private ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.mo61493n().mo61496g0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<TypeToken<? super T>> mo34397R() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f53306c;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<?>> m = FluentIterable.m27039j(TypeCollector.f53309a.mo61499a().mo61501d(TypeToken.this)).mo35100f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo35104m();
            this.f53306c = m;
            return m;
        }

        /* renamed from: g0 */
        public TypeToken<T>.TypeSet mo61496g0() {
            return this;
        }

        /* renamed from: h0 */
        public TypeToken<T>.TypeSet mo61497h0() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        /* renamed from: i0 */
        public Set<Class<? super T>> mo61498i0() {
            return ImmutableSet.m27516u(TypeCollector.f53310b.mo61499a().mo61500c(TypeToken.this.m73761l()));
        }

        /* synthetic */ ClassSet(TypeToken typeToken, C109271 r2) {
            this();
        }
    }

    private final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private final transient TypeToken<T>.TypeSet f53307c;

        /* renamed from: d */
        private transient ImmutableSet<TypeToken<? super T>> f53308d;

        InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f53307c = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.mo61493n().mo61497h0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<TypeToken<? super T>> mo34397R() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f53308d;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> m = FluentIterable.m27039j(this.f53307c).mo35100f(TypeFilter.INTERFACE_ONLY).mo35104m();
            this.f53308d = m;
            return m;
        }

        /* renamed from: g0 */
        public TypeToken<T>.TypeSet mo61496g0() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        /* renamed from: h0 */
        public TypeToken<T>.TypeSet mo61497h0() {
            return this;
        }

        /* renamed from: i0 */
        public Set<Class<? super T>> mo61498i0() {
            return FluentIterable.m27039j(TypeCollector.f53310b.mo61500c(TypeToken.this.m73761l())).mo35100f(C10948b.f53338a).mo35104m();
        }
    }

    private static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(Type type) {
            super(type, (C109271) null);
        }
    }

    private static abstract class TypeCollector<K> {

        /* renamed from: a */
        static final TypeCollector<TypeToken<?>> f53309a = new TypeCollector<TypeToken<?>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Iterable<? extends TypeToken<?>> mo61502e(TypeToken<?> typeToken) {
                return typeToken.mo61488h();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public Class<?> mo61503f(TypeToken<?> typeToken) {
                return typeToken.mo61491k();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: k */
            public TypeToken<?> mo61504g(TypeToken<?> typeToken) {
                return typeToken.mo61490i();
            }
        };

        /* renamed from: b */
        static final TypeCollector<Class<?>> f53310b = new TypeCollector<Class<?>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public Iterable<? extends Class<?>> mo61502e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public Class<?> mo61503f(Class<?> cls) {
                return cls;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: k */
            public Class<?> mo61504g(Class<?> cls) {
                return cls.getSuperclass();
            }
        };

        private static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* renamed from: c */
            private final TypeCollector<K> f53313c;

            ForwardingTypeCollector(TypeCollector<K> typeCollector) {
                super((C109271) null);
                this.f53313c = typeCollector;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: e */
            public Iterable<? extends K> mo61502e(K k) {
                return this.f53313c.mo61502e(k);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: f */
            public Class<?> mo61503f(K k) {
                return this.f53313c.mo61503f(k);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public K mo61504g(K k) {
                return this.f53313c.mo61504g(k);
            }
        }

        private TypeCollector() {
        }

        /* synthetic */ TypeCollector(C109271 r1) {
            this();
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        private int m73794b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo61503f(k).isInterface();
            for (Object b : mo61502e(k)) {
                isInterface = Math.max(isInterface, m73794b(b, map));
            }
            Object g = mo61504g(k);
            if (g != null) {
                isInterface = Math.max(isInterface, m73794b(g, map));
            }
            int i = isInterface + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        /* renamed from: h */
        private static <K, V> ImmutableList<K> m73795h(final Map<K, V> map, final Comparator<? super V> comparator) {
            return new Ordering<K>() {
                public int compare(K k, K k2) {
                    Comparator comparator = comparator;
                    Object obj = map.get(k);
                    Objects.requireNonNull(obj);
                    Object obj2 = map.get(k2);
                    Objects.requireNonNull(obj2);
                    return comparator.compare(obj, obj2);
                }
            }.mo34737b(map.keySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final TypeCollector<K> mo61499a() {
            return new ForwardingTypeCollector<K>(this, this) {
                /* access modifiers changed from: package-private */
                /* renamed from: c */
                public ImmutableList<K> mo61500c(Iterable<? extends K> iterable) {
                    ImmutableList.Builder n = ImmutableList.m27306n();
                    for (Object next : iterable) {
                        if (!mo61503f(next).isInterface()) {
                            n.mo35365e(next);
                        }
                    }
                    return super.mo61500c(n.mo35398k());
                }

                /* access modifiers changed from: package-private */
                /* renamed from: e */
                public Iterable<? extends K> mo61502e(K k) {
                    return ImmutableSet.m27506F();
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public ImmutableList<K> mo61500c(Iterable<? extends K> iterable) {
            HashMap A = Maps.m28058A();
            for (Object b : iterable) {
                m73794b(b, A);
            }
            return m73795h(A, Ordering.m28521e().mo34739j());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final ImmutableList<K> mo61501d(K k) {
            return mo61500c(ImmutableList.m27302F(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Iterable<? extends K> mo61502e(K k);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Class<?> mo61503f(K k);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract K mo61504g(K k);
    }

    private enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* renamed from: d */
            public boolean apply(TypeToken<?> typeToken) {
                return !(typeToken.runtimeType instanceof TypeVariable) && !(typeToken.runtimeType instanceof WildcardType);
            }
        },
        INTERFACE_ONLY {
            /* renamed from: d */
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.mo61491k().isInterface();
            }
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private transient ImmutableSet<TypeToken<? super T>> f53317a;

        TypeSet() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b0 */
        public Set<TypeToken<? super T>> mo34397R() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f53317a;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<?>> m = FluentIterable.m27039j(TypeCollector.f53309a.mo61501d(TypeToken.this)).mo35100f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo35104m();
            this.f53317a = m;
            return m;
        }

        /* renamed from: g0 */
        public TypeToken<T>.TypeSet mo61496g0() {
            return new ClassSet(TypeToken.this, (C109271) null);
        }

        /* renamed from: h0 */
        public TypeToken<T>.TypeSet mo61497h0() {
            return new InterfaceSet(this);
        }

        /* renamed from: i0 */
        public Set<Class<? super T>> mo61498i0() {
            return ImmutableSet.m27516u(TypeCollector.f53310b.mo61500c(TypeToken.this.m73761l()));
        }
    }

    /* synthetic */ TypeToken(Type type, C109271 r2) {
        this(type);
    }

    /* renamed from: e */
    private TypeToken<? super T> m73757e(Type type) {
        TypeToken<?> q = m73763q(type);
        if (q.mo61491k().isInterface()) {
            return null;
        }
        return q;
    }

    /* renamed from: f */
    private ImmutableList<TypeToken<? super T>> m73758f(Type[] typeArr) {
        ImmutableList.Builder n = ImmutableList.m27306n();
        for (Type q : typeArr) {
            TypeToken<?> q2 = m73763q(q);
            if (q2.mo61491k().isInterface()) {
                n.mo35365e(q2);
            }
        }
        return n.mo35398k();
    }

    /* renamed from: g */
    private TypeResolver m73759g() {
        TypeResolver typeResolver = this.f53301c;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver d = TypeResolver.m73719d(this.runtimeType);
        this.f53301c = d;
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public TypeResolver m73760j() {
        TypeResolver typeResolver = this.f53300a;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver f = TypeResolver.m73721f(this.runtimeType);
        this.f53300a = f;
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public ImmutableSet<Class<? super T>> m73761l() {
        final ImmutableSet.Builder n = ImmutableSet.m27512n();
        new TypeVisitor(this) {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo61473b(Class<?> cls) {
                n.mo35365e(cls);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo61474c(GenericArrayType genericArrayType) {
                n.mo35365e(Types.m73841h(TypeToken.m73763q(genericArrayType.getGenericComponentType()).mo61491k()));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo61475d(ParameterizedType parameterizedType) {
                n.mo35365e((Class) parameterizedType.getRawType());
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
        }.mo61513a(this.runtimeType);
        return n.mo35520m();
    }

    /* renamed from: p */
    public static <T> TypeToken<T> m73762p(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    /* renamed from: q */
    public static TypeToken<?> m73763q(Type type) {
        return new SimpleTypeToken(type);
    }

    /* renamed from: r */
    private TypeToken<?> m73764r(Type type) {
        TypeToken<?> q = m73763q(m73759g().mo61470j(type));
        q.f53301c = this.f53301c;
        q.f53300a = this.f53300a;
        return q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final ImmutableList<TypeToken<? super T>> mo61488h() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return m73758f(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m73758f(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder n = ImmutableList.m27306n();
        for (Type r : mo61491k().getGenericInterfaces()) {
            n.mo35365e(m73764r(r));
        }
        return n.mo35398k();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final TypeToken<? super T> mo61490i() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return m73757e(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return m73757e(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = mo61491k().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return m73764r(genericSuperclass);
    }

    /* renamed from: k */
    public final Class<? super T> mo61491k() {
        return (Class) m73761l().iterator().next();
    }

    /* renamed from: m */
    public final Type mo61492m() {
        return this.runtimeType;
    }

    /* renamed from: n */
    public final TypeToken<T>.TypeSet mo61493n() {
        return new TypeSet();
    }

    public String toString() {
        return Types.m73852s(this.runtimeType);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m73763q(new TypeResolver().mo61470j(this.runtimeType));
    }

    protected TypeToken() {
        Type a = mo61466a();
        this.runtimeType = a;
        Preconditions.m5372C(!(a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a);
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) Preconditions.m5392s(type);
    }
}
