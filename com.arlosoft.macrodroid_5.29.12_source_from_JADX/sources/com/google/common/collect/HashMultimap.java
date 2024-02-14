package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @VisibleForTesting

    /* renamed from: s */
    transient int f16639s;

    private HashMultimap() {
        this(12, 2);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f16639s = 2;
        int h = Serialization.m28710h(objectInputStream);
        mo34434F(Platform.m28534c(12));
        Serialization.m28707e(this, objectInputStream, h);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m28712j(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public Set<V> mo34431y() {
        return Platform.m28535d(this.f16639s);
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ boolean mo34625P(Object obj, Object obj2) {
        return super.mo34625P(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo34426d(Object obj) {
        return super.mo34426d(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Set get(@ParametricNullness Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Set mo34445i() {
        return super.mo34445i();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ Multiset mo34630k() {
        return super.mo34630k();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ Map mo34430w() {
        return super.mo34430w();
    }

    private HashMultimap(int i, int i2) {
        super(Platform.m28534c(i));
        this.f16639s = 2;
        Preconditions.m5377d(i2 >= 0);
        this.f16639s = i2;
    }
}
