package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: o */
    private transient Class<K> f16562o;

    /* renamed from: p */
    private transient Class<V> f16563p;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f16562o = (Class) objectInputStream.readObject();
        this.f16563p = (Class) objectInputStream.readObject();
        mo34384m0(new EnumMap(this.f16562o), new EnumMap(this.f16563p));
        Serialization.m28704b(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16562o);
        objectOutputStream.writeObject(this.f16563p);
        Serialization.m28711i(this, objectOutputStream);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public K mo34376a0(K k) {
        return (Enum) Preconditions.m5392s(k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public V mo34377b0(V v) {
        return (Enum) Preconditions.m5392s(v);
    }

    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    /* renamed from: x0 */
    public /* bridge */ /* synthetic */ BiMap mo34390x0() {
        return super.mo34390x0();
    }
}
