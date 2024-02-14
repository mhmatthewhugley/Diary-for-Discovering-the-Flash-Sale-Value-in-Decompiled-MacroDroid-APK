package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    @VisibleForTesting
    static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        volatile transient T f4251a;

        /* renamed from: c */
        volatile transient long f4252c;
        final Supplier<T> delegate;
        final long durationNanos;

        @ParametricNullness
        public T get() {
            long j = this.f4252c;
            long f = Platform.m5368f();
            if (j == 0 || f - j >= 0) {
                synchronized (this) {
                    if (j == this.f4252c) {
                        T t = this.delegate.get();
                        this.f4251a = t;
                        long j2 = f + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.f4252c = j2;
                        return t;
                    }
                }
            }
            return NullnessCasts.m5348a(this.f4251a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            long j = this.durationNanos;
            StringBuilder sb = new StringBuilder(valueOf.length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(j);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    @VisibleForTesting
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        volatile transient boolean f4253a;

        /* renamed from: c */
        transient T f4254c;
        final Supplier<T> delegate;

        @ParametricNullness
        public T get() {
            if (!this.f4253a) {
                synchronized (this) {
                    if (!this.f4253a) {
                        T t = this.delegate.get();
                        this.f4254c = t;
                        this.f4253a = true;
                        return t;
                    }
                }
            }
            return NullnessCasts.m5348a(this.f4254c);
        }

        public String toString() {
            Object obj;
            if (this.f4253a) {
                String valueOf = String.valueOf(this.f4254c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.delegate;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @VisibleForTesting
    static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* renamed from: a */
        volatile Supplier<T> f4255a;

        /* renamed from: c */
        volatile boolean f4256c;

        /* renamed from: d */
        T f4257d;

        @ParametricNullness
        public T get() {
            if (!this.f4256c) {
                synchronized (this) {
                    if (!this.f4256c) {
                        Supplier<T> supplier = this.f4255a;
                        Objects.requireNonNull(supplier);
                        T t = supplier.get();
                        this.f4257d = t;
                        this.f4256c = true;
                        this.f4255a = null;
                        return t;
                    }
                }
            }
            return NullnessCasts.m5348a(this.f4257d);
        }

        public String toString() {
            Object obj = this.f4255a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f4257d);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            SupplierComposition supplierComposition = (SupplierComposition) obj;
            if (!this.function.equals(supplierComposition.function) || !this.supplier.equals(supplierComposition.supplier)) {
                return false;
            }
            return true;
        }

        @ParametricNullness
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Objects.m5350b(this.function, this.supplier);
        }

        public String toString() {
            String valueOf = String.valueOf(this.function);
            String valueOf2 = String.valueOf(this.supplier);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb.append("Suppliers.compose(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    private enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        /* renamed from: d */
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }

        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    private static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        final T instance;

        SupplierOfInstance(@ParametricNullness T t) {
            this.instance = t;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.m5349a(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @ParametricNullness
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.m5350b(this.instance);
        }

        public String toString() {
            String valueOf = String.valueOf(this.instance);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        @ParametricNullness
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private Suppliers() {
    }

    /* renamed from: a */
    public static <T> Supplier<T> m5475a(@ParametricNullness T t) {
        return new SupplierOfInstance(t);
    }
}
