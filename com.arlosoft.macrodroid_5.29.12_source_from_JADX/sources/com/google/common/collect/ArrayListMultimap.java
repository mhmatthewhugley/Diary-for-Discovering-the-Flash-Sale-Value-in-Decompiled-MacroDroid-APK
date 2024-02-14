package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @VisibleForTesting

    /* renamed from: s */
    transient int f16453s;

    private ArrayListMultimap() {
        this(12, 3);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f16453s = 3;
        int h = Serialization.m28710h(objectInputStream);
        mo34434F(CompactHashMap.m26588t());
        Serialization.m28707e(this, objectInputStream, h);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.m28712j(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public List<V> mo34431y() {
        return new ArrayList(this.f16453s);
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
    public /* bridge */ /* synthetic */ List mo34426d(Object obj) {
        return super.mo34426d(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ List get(@ParametricNullness Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ Collection mo34445i() {
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

    private ArrayListMultimap(int i, int i2) {
        super(Platform.m28534c(i));
        CollectPreconditions.m26535b(i2, "expectedValuesPerKey");
        this.f16453s = i2;
    }
}
