package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @GwtIncompatible
    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableCollection<?> collection;

        SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.collection.mo35029c();
        }
    }

    ImmutableAsList() {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract ImmutableCollection<E> mo35325P();

    public boolean contains(Object obj) {
        return mo35325P().contains(obj);
    }

    public boolean isEmpty() {
        return mo35325P().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo34781j() {
        return mo35325P().mo34781j();
    }

    public int size() {
        return mo35325P().size();
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(mo35325P());
    }
}
