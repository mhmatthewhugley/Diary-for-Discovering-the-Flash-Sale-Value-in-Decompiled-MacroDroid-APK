package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        /* renamed from: d */
        public ImmutableListMultimap<K, V> mo35408d() {
            return (ImmutableListMultimap) super.mo35464a();
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder<K, V> mo35409e(K k, V v) {
            super.mo35466c(k, v);
            return this;
        }
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* renamed from: C */
    public static <K, V> Builder<K, V> m27336C() {
        return new Builder<>();
    }

    /* renamed from: D */
    static <K, V> ImmutableListMultimap<K, V> m27337D(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList<E> immutableList;
        if (collection.isEmpty()) {
            return m27338F();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                immutableList = ImmutableList.m27309t(collection2);
            } else {
                immutableList = ImmutableList.m27303J(comparator, collection2);
            }
            if (!immutableList.isEmpty()) {
                builder.mo35338g(key, immutableList);
                i += immutableList.size();
            }
        }
        return new ImmutableListMultimap<>(builder.mo35337d(), i);
    }

    /* renamed from: F */
    public static <K, V> ImmutableListMultimap<K, V> m27338F() {
        return EmptyImmutableListMultimap.f16560s;
    }

    /* renamed from: G */
    public static <K, V> ImmutableListMultimap<K, V> m27339G(K k, V v) {
        Builder C = m27336C();
        C.mo35409e(k, v);
        return C.mo35408d();
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder a = ImmutableMap.m27348a();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.Builder n = ImmutableList.m27306n();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        n.mo35365e(objectInputStream.readObject());
                    }
                    a.mo35338g(readObject, n.mo35398k());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.f16685a.mo36337b(this, a.mo35337d());
                ImmutableMultimap.FieldSettersHolder.f16686b.mo36336a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m28712j(this, objectOutputStream);
    }

    /* renamed from: E */
    public ImmutableList<V> mo35407v(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.f16673o.get(k);
        return immutableList == null ? ImmutableList.m27301D() : immutableList;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: H */
    public final ImmutableList<V> m27344d(Object obj) {
        throw new UnsupportedOperationException();
    }
}
