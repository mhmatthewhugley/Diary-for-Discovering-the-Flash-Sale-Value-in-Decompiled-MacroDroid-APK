package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.Beta;
import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@Beta
@GwtCompatible
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Converter$1 */
    class C108541 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ Iterable f52612a;

        /* renamed from: c */
        final /* synthetic */ Converter f52613c;

        public Iterator<Object> iterator() {
            return new Iterator<Object>() {

                /* renamed from: a */
                private final Iterator<Object> f52614a;

                {
                    this.f52614a = C108541.this.f52612a.iterator();
                }

                public boolean hasNext() {
                    return this.f52614a.hasNext();
                }

                public Object next() {
                    return C108541.this.f52613c.mo60576a(this.f52614a.next());
                }

                public void remove() {
                    this.f52614a.remove();
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
        public A mo60578b(C c) {
            return this.first.mo60578b(this.second.mo60578b(c));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C mo60579c(A a) {
            return this.second.mo60579c(this.first.mo60579c(a));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo60580d(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C mo60581e(A a) {
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
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public A mo60580d(B b) {
            return this.backwardFunction.apply(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public B mo60581e(A a) {
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
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }
    }

    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* renamed from: a */
        static final IdentityConverter f52616a = new IdentityConverter();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return f52616a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public T mo60580d(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public T mo60581e(T t) {
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
        public B mo60578b(A a) {
            return this.original.mo60579c(a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public A mo60579c(B b) {
            return this.original.mo60578b(b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public B mo60580d(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public A mo60581e(B b) {
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
            return this.original + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    /* renamed from: a */
    public final B mo60576a(A a) {
        return mo60579c(a);
    }

    @Deprecated
    public final B apply(A a) {
        return mo60576a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public A mo60578b(B b) {
        if (!this.handleNullAutomatically) {
            return mo60580d(b);
        }
        if (b == null) {
            return null;
        }
        return Preconditions.m72472e(mo60580d(b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public B mo60579c(A a) {
        if (!this.handleNullAutomatically) {
            return mo60581e(a);
        }
        if (a == null) {
            return null;
        }
        return Preconditions.m72472e(mo60581e(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract A mo60580d(B b);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract B mo60581e(A a);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
