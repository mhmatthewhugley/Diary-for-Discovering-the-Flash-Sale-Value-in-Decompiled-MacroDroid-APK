package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    static final class Equals extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final Equals f4151a = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        private Object readResolve() {
            return f4151a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo22141a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo22142b(Object obj) {
            return obj.hashCode();
        }
    }

    private static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public boolean apply(T t) {
            return this.equivalence.mo22143d(t, this.target);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            if (!this.equivalence.equals(equivalentToPredicate.equivalence) || !Objects.m5349a(this.target, equivalentToPredicate.target)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.equivalence, this.target);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".equivalentTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final Identity f4152a = new Identity();
        private static final long serialVersionUID = 1;

        Identity() {
        }

        private Object readResolve() {
            return f4152a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo22141a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo22142b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @ParametricNullness
        private final T reference;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.mo22143d(this.reference, wrapper.reference);
            }
            return false;
        }

        public int hashCode() {
            return this.equivalence.mo22144e(this.reference);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".wrap(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    protected Equivalence() {
    }

    /* renamed from: c */
    public static Equivalence<Object> m5277c() {
        return Equals.f4151a;
    }

    /* renamed from: f */
    public static Equivalence<Object> m5278f() {
        return Identity.f4152a;
    }

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: a */
    public abstract boolean mo22141a(T t, T t2);

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: b */
    public abstract int mo22142b(T t);

    /* renamed from: d */
    public final boolean mo22143d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo22141a(t, t2);
    }

    /* renamed from: e */
    public final int mo22144e(T t) {
        if (t == null) {
            return 0;
        }
        return mo22142b(t);
    }
}
