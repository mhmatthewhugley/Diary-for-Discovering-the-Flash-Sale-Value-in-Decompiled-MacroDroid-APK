package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: s */
    private final transient ImmutableSet<V> f16714s;
    @RetainedWith
    @LazyInit

    /* renamed from: z */
    private transient ImmutableSet<Map.Entry<K, V>> f16715z;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<V> mo35465b() {
            return Platform.m28538g();
        }
    }

    private static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        @Weak

        /* renamed from: d */
        private final transient ImmutableSetMultimap<K, V> f16716d;

        EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f16716d = immutableSetMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f16716d.mo34625P(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return false;
        }

        /* renamed from: k */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f16716d.mo34443g();
        }

        public int size() {
            return this.f16716d.size();
        }
    }

    @GwtIncompatible
    private static final class SetFieldSettersHolder {

        /* renamed from: a */
        static final Serialization.FieldSetter<ImmutableSetMultimap> f16717a = Serialization.m28703a(ImmutableSetMultimap.class, "emptySet");

        private SetFieldSettersHolder() {
        }
    }

    ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.f16714s = m27530C(comparator);
    }

    /* renamed from: C */
    private static <V> ImmutableSet<V> m27530C(Comparator<? super V> comparator) {
        if (comparator == null) {
            return ImmutableSet.m27506F();
        }
        return ImmutableSortedSet.m27619T(comparator);
    }

    /* renamed from: H */
    private static <V> ImmutableSet.Builder<V> m27531H(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new ImmutableSet.Builder<>();
        }
        return new ImmutableSortedSet.Builder(comparator);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder a = ImmutableMap.m27348a();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ImmutableSet.Builder H = m27531H(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        H.mo35365e(objectInputStream.readObject());
                    }
                    ImmutableSet m = H.mo35520m();
                    if (m.size() == readInt2) {
                        a.mo35338g(readObject, m);
                        i2 += readInt2;
                        i++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.f16685a.mo36337b(this, a.mo35337d());
                ImmutableMultimap.FieldSettersHolder.f16686b.mo36336a(this, i2);
                SetFieldSettersHolder.f16717a.mo36337b(this, m27530C(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo35525G());
        Serialization.m28712j(this, objectOutputStream);
    }

    /* renamed from: D */
    public ImmutableSet<Map.Entry<K, V>> mo35454r() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f16715z;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f16715z = entrySet;
        return entrySet;
    }

    /* renamed from: E */
    public ImmutableSet<V> mo35407v(K k) {
        return (ImmutableSet) MoreObjects.m5332a((ImmutableSet) this.f16673o.get(k), this.f16714s);
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: F */
    public final ImmutableSet<V> m27538d(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public Comparator<? super V> mo35525G() {
        ImmutableSet<V> immutableSet = this.f16714s;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }
}
