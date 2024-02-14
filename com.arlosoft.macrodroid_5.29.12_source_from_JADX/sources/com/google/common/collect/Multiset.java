package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        @ParametricNullness
        /* renamed from: b */
        E mo35049b();

        int getCount();

        String toString();
    }

    /* renamed from: C */
    Set<E> mo34642C();

    /* renamed from: J1 */
    int mo34601J1(@CompatibleWith Object obj);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    @CanIgnoreReturnValue
    /* renamed from: e0 */
    int mo34603e0(@ParametricNullness E e, int i);

    Set<Entry<E>> entrySet();

    boolean equals(Object obj);

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    int mo34606h1(@CompatibleWith Object obj, int i);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    /* renamed from: k1 */
    int mo34611k1(@ParametricNullness E e, int i);

    @CanIgnoreReturnValue
    boolean remove(Object obj);

    int size();

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    boolean mo34613z1(@ParametricNullness E e, int i, int i2);
}
