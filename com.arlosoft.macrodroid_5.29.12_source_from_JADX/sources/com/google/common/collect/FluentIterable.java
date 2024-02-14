package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {

    /* renamed from: a */
    private final Optional<Iterable<E>> f16595a;

    /* renamed from: com.google.common.collect.FluentIterable$2 */
    class C69592 extends FluentIterable<Object> {

        /* renamed from: c */
        final /* synthetic */ Iterable f16597c;

        public Iterator<Object> iterator() {
            return Iterators.m27710f(Iterators.m27703J(this.f16597c.iterator(), Iterables.m27690q()));
        }
    }

    private static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        /* renamed from: a */
        public FluentIterable<E> apply(Iterable<E> iterable) {
            return FluentIterable.m27039j(iterable);
        }
    }

    protected FluentIterable() {
        this.f16595a = Optional.m5351a();
    }

    @Beta
    /* renamed from: c */
    public static <T> FluentIterable<T> m27037c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m27038d(iterable, iterable2);
    }

    /* renamed from: d */
    private static <T> FluentIterable<T> m27038d(final Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> s : iterableArr) {
            Preconditions.m5392s(s);
        }
        return new FluentIterable<T>() {
            public Iterator<T> iterator() {
                return Iterators.m27710f(new AbstractIndexedListIterator<Iterator<? extends T>>(iterableArr.length) {
                    /* renamed from: b */
                    public Iterator<? extends T> mo34410a(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    /* renamed from: j */
    public static <E> FluentIterable<E> m27039j(final Iterable<E> iterable) {
        if (iterable instanceof FluentIterable) {
            return (FluentIterable) iterable;
        }
        return new FluentIterable<E>(iterable) {
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    /* renamed from: k */
    private Iterable<E> m27040k() {
        return this.f16595a.mo22081e(this);
    }

    /* renamed from: f */
    public final FluentIterable<E> mo35100f(Predicate<? super E> predicate) {
        return m27039j(Iterables.m27678e(m27040k(), predicate));
    }

    @GwtIncompatible
    /* renamed from: h */
    public final <T> FluentIterable<T> mo35101h(Class<T> cls) {
        return m27039j(Iterables.m27679f(m27040k(), cls));
    }

    /* renamed from: i */
    public final Optional<E> mo35102i() {
        Iterator it = m27040k().iterator();
        return it.hasNext() ? Optional.m5352d(it.next()) : Optional.m5351a();
    }

    @GwtIncompatible
    /* renamed from: l */
    public final E[] mo35103l(Class<E> cls) {
        return Iterables.m27688o(m27040k(), cls);
    }

    /* renamed from: m */
    public final ImmutableSet<E> mo35104m() {
        return ImmutableSet.m27515t(m27040k());
    }

    public String toString() {
        return Iterables.m27691r(m27040k());
    }

    FluentIterable(Iterable<E> iterable) {
        this.f16595a = Optional.m5352d(iterable);
    }
}
