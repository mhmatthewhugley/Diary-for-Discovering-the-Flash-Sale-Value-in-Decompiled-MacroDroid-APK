package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    /* renamed from: d */
    private final transient EnumSet<E> f16647d;
    @LazyInit

    /* renamed from: f */
    private transient int f16648f;

    private static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumSet<E> delegate;

        EnumSerializedForm(EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo35028D() {
        return true;
    }

    public boolean contains(Object obj) {
        return this.f16647d.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).f16647d;
        }
        return this.f16647d.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).f16647d;
        }
        return this.f16647d.equals(obj);
    }

    public int hashCode() {
        int i = this.f16648f;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f16647d.hashCode();
        this.f16648f = hashCode;
        return hashCode;
    }

    public boolean isEmpty() {
        return this.f16647d.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return false;
    }

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return Iterators.m27704K(this.f16647d.iterator());
    }

    public int size() {
        return this.f16647d.size();
    }

    public String toString() {
        return this.f16647d.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new EnumSerializedForm(this.f16647d);
    }

    private ImmutableEnumSet(EnumSet<E> enumSet) {
        this.f16647d = enumSet;
    }
}
