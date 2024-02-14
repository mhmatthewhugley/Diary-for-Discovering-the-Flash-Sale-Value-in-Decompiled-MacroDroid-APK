package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Functions {

    private static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        private final E value;

        @ParametricNullness
        public E apply(Object obj) {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.m5349a(this.value, ((ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e = this.value;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.value);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Functions.constant(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        final V defaultValue;
        final Map<K, ? extends V> map;

        @ParametricNullness
        public V apply(@ParametricNullness K k) {
            Object obj = this.map.get(k);
            if (obj != null || this.map.containsKey(k)) {
                return NullnessCasts.m5348a(obj);
            }
            return this.defaultValue;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
            if (!this.map.equals(forMapWithDefault.map) || !Objects.m5349a(this.defaultValue, forMapWithDefault.defaultValue)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.map, this.defaultValue);
        }

        public String toString() {
            String valueOf = String.valueOf(this.map);
            String valueOf2 = String.valueOf(this.defaultValue);
            StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(", defaultValue=");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private final Function<A, ? extends B> f4159f;

        /* renamed from: g */
        private final Function<B, C> f4160g;

        @ParametricNullness
        public C apply(@ParametricNullness A a) {
            return this.f4160g.apply(this.f4159f.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            FunctionComposition functionComposition = (FunctionComposition) obj;
            if (!this.f4159f.equals(functionComposition.f4159f) || !this.f4160g.equals(functionComposition.f4160g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f4159f.hashCode() ^ this.f4160g.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4160g);
            String valueOf2 = String.valueOf(this.f4159f);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        @ParametricNullness
        public V apply(@ParametricNullness K k) {
            V v = this.map.get(k);
            Preconditions.m5385l(v != null || this.map.containsKey(k), "Key '%s' not present in map", k);
            return NullnessCasts.m5348a(v);
        }

        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.map.equals(((FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.map);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "Functions.identity()";
        }
    }

    private static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        /* renamed from: a */
        public Boolean apply(@ParametricNullness T t) {
            return Boolean.valueOf(this.predicate.apply(t));
        }

        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.predicate.equals(((PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Functions.forPredicate(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class SupplierFunction<F, T> implements Function<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<T> supplier;

        @ParametricNullness
        public T apply(@ParametricNullness F f) {
            return this.supplier.get();
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.supplier.equals(((SupplierFunction) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.supplier);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Functions.forSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        /* renamed from: d */
        public String apply(Object obj) {
            Preconditions.m5392s(obj);
            return obj.toString();
        }

        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    private Functions() {
    }
}
