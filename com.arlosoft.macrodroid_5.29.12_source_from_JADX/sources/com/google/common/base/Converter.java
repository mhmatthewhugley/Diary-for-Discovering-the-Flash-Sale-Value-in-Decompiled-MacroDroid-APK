package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    /* renamed from: com.google.common.base.Converter$1 */
    class C17491 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ Iterable f4143a;

        /* renamed from: c */
        final /* synthetic */ Converter f4144c;

        public Iterator<Object> iterator() {
            return new Iterator<Object>() {

                /* renamed from: a */
                private final Iterator<Object> f4145a;

                {
                    this.f4145a = C17491.this.f4143a.iterator();
                }

                public boolean hasNext() {
                    return this.f4145a.hasNext();
                }

                public Object next() {
                    return C17491.this.f4144c.mo22122a(this.f4145a.next());
                }

                public void remove() {
                    this.f4145a.remove();
                }
            };
        }
    }

    private static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public A mo22124b(C c) {
            return this.first.mo22124b(this.second.mo22124b(c));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C mo22125c(A a) {
            return this.second.mo22125c(this.first.mo22125c(a));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo22095d(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C mo22096e(A a) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            if (!this.first.equals(converterComposition.first) || !this.second.equals(converterComposition.second)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.first);
            String valueOf2 = String.valueOf(this.second);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".andThen(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo22095d(B b) {
            return this.backwardFunction.apply(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public B mo22096e(A a) {
            return this.forwardFunction.apply(a);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            if (!this.forwardFunction.equals(functionBasedConverter.forwardFunction) || !this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.forwardFunction);
            String valueOf2 = String.valueOf(this.backwardFunction);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("Converter.from(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* renamed from: a */
        static final IdentityConverter<?> f4147a = new IdentityConverter<>();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return f4147a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public T mo22095d(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public T mo22096e(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public B mo22124b(A a) {
            return this.original.mo22125c(a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public A mo22125c(B b) {
            return this.original.mo22124b(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public B mo22095d(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public A mo22096e(B b) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.original);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append(valueOf);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    protected Converter() {
        this(true);
    }

    /* renamed from: f */
    private A m5254f(B b) {
        return mo22095d(NullnessCasts.m5348a(b));
    }

    /* renamed from: g */
    private B m5255g(A a) {
        return mo22096e(NullnessCasts.m5348a(a));
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public final B mo22122a(A a) {
        return mo22125c(a);
    }

    @InlineMe
    @CanIgnoreReturnValue
    @Deprecated
    public final B apply(A a) {
        return mo22122a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public A mo22124b(B b) {
        if (!this.handleNullAutomatically) {
            return m5254f(b);
        }
        if (b == null) {
            return null;
        }
        return Preconditions.m5392s(mo22095d(b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public B mo22125c(A a) {
        if (!this.handleNullAutomatically) {
            return m5255g(a);
        }
        if (a == null) {
            return null;
        }
        return Preconditions.m5392s(mo22096e(a));
    }

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: d */
    public abstract A mo22095d(B b);

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: e */
    public abstract B mo22096e(A a);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
