package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Predicates {

    private static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public boolean apply(@ParametricNullness T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((Predicate) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m5410k("and", this.components);
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }
    }

    private static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        final Function<A, ? extends B> f4188f;

        /* renamed from: p */
        final Predicate<B> f4189p;

        public boolean apply(@ParametricNullness A a) {
            return this.f4189p.apply(this.f4188f.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            if (!this.f4188f.equals(compositionPredicate.f4188f) || !this.f4189p.equals(compositionPredicate.f4189p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f4188f.hashCode() ^ this.f4189p.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4189p);
            String valueOf2 = String.valueOf(this.f4188f);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f4189p = (Predicate) Preconditions.m5392s(predicate);
            this.f4188f = (Function) Preconditions.m5392s(function);
        }
    }

    @GwtIncompatible
    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        public String toString() {
            String c = this.pattern.mo22121c();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 28);
            sb.append("Predicates.containsPattern(");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }

    @GwtIncompatible
    private static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final CommonPattern pattern;

        /* renamed from: a */
        public boolean apply(CharSequence charSequence) {
            return this.pattern.mo22120b(charSequence).mo22115b();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            if (!Objects.m5349a(this.pattern.mo22121c(), containsPatternPredicate.pattern.mo22121c()) || this.pattern.mo22119a() != containsPatternPredicate.pattern.mo22119a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.pattern.mo22121c(), Integer.valueOf(this.pattern.mo22119a()));
        }

        public String toString() {
            String toStringHelper = MoreObjects.m5334c(this.pattern).mo22194d("pattern", this.pattern.mo22121c()).mo22192b("pattern.flags", this.pattern.mo22119a()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(toStringHelper).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(toStringHelper);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        public boolean apply(@ParametricNullness T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) Preconditions.m5392s(collection);
        }
    }

    @GwtIncompatible
    private static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public boolean apply(@ParametricNullness T t) {
            return this.clazz.isInstance(t);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InstanceOfPredicate) || this.clazz != ((InstanceOfPredicate) obj).clazz) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(name.length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) Preconditions.m5392s(cls);
        }
    }

    private static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> Predicate<T> mo22217a() {
            return this;
        }

        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        private IsEqualToPredicate(Object obj) {
            this.target = obj;
        }
    }

    private static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Predicate<T> predicate;

        NotPredicate(Predicate<T> predicate2) {
            this.predicate = (Predicate) Preconditions.m5392s(predicate2);
        }

        public boolean apply(@ParametricNullness T t) {
            return !this.predicate.apply(t);
        }

        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T> Predicate<T> mo22222d() {
            return this;
        }
    }

    private static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public boolean apply(@ParametricNullness T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (((Predicate) this.components.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.m5410k("or", this.components);
        }
    }

    @GwtIncompatible
    private static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        /* renamed from: a */
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SubtypeOfPredicate) || this.clazz != ((SubtypeOfPredicate) obj).clazz) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(name.length() + 22);
            sb.append("Predicates.subtypeOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    private Predicates() {
    }

    @GwtCompatible
    /* renamed from: b */
    public static <T> Predicate<T> m5401b() {
        return ObjectPredicate.ALWAYS_TRUE.mo22222d();
    }

    /* renamed from: c */
    public static <T> Predicate<T> m5402c(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new AndPredicate(m5403d((Predicate) Preconditions.m5392s(predicate), (Predicate) Preconditions.m5392s(predicate2)));
    }

    /* renamed from: d */
    private static <T> List<Predicate<? super T>> m5403d(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    /* renamed from: e */
    public static <A, B> Predicate<A> m5404e(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    /* renamed from: f */
    public static <T> Predicate<T> m5405f(@ParametricNullness T t) {
        if (t == null) {
            return m5408i();
        }
        return new IsEqualToPredicate(t).mo22217a();
    }

    /* renamed from: g */
    public static <T> Predicate<T> m5406g(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    @GwtIncompatible
    /* renamed from: h */
    public static <T> Predicate<T> m5407h(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    @GwtCompatible
    /* renamed from: i */
    public static <T> Predicate<T> m5408i() {
        return ObjectPredicate.IS_NULL.mo22222d();
    }

    /* renamed from: j */
    public static <T> Predicate<T> m5409j(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static String m5410k(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
