package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    @Beta
    protected class StandardElementSet extends Multisets.ElementSet<E> {

        /* renamed from: a */
        final /* synthetic */ ForwardingMultiset f16601a;

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Multiset<E> mo34656i() {
            return this.f16601a;
        }

        public Iterator<E> iterator() {
            return Multisets.m28376e(mo34656i().entrySet().iterator());
        }
    }

    protected ForwardingMultiset() {
    }

    /* renamed from: C */
    public Set<E> mo34642C() {
        return mo34397R().mo34642C();
    }

    /* renamed from: J1 */
    public int mo34601J1(Object obj) {
        return mo34397R().mo34601J1(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public abstract Multiset<E> mo34397R();

    @CanIgnoreReturnValue
    /* renamed from: e0 */
    public int mo34603e0(@ParametricNullness E e, int i) {
        return mo34397R().mo34603e0(e, i);
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return mo34397R().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || mo34397R().equals(obj);
    }

    @CanIgnoreReturnValue
    /* renamed from: h1 */
    public int mo34606h1(Object obj, int i) {
        return mo34397R().mo34606h1(obj, i);
    }

    public int hashCode() {
        return mo34397R().hashCode();
    }

    @CanIgnoreReturnValue
    /* renamed from: k1 */
    public int mo34611k1(@ParametricNullness E e, int i) {
        return mo34397R().mo34611k1(e, i);
    }

    @CanIgnoreReturnValue
    /* renamed from: z1 */
    public boolean mo34613z1(@ParametricNullness E e, int i, int i2) {
        return mo34397R().mo34613z1(e, i, i2);
    }
}
