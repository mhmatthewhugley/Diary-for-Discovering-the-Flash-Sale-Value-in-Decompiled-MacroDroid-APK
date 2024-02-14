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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: o */
    private transient Class<K> f16564o;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f16564o = (Class) objectInputStream.readObject();
        mo34384m0(new EnumMap(this.f16564o), new HashMap((((Enum[]) this.f16564o.getEnumConstants()).length * 3) / 2));
        Serialization.m28704b(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16564o);
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

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public K mo34376a0(K k) {
        return (Enum) Preconditions.m5392s(k);
    }

    @CanIgnoreReturnValue
    /* renamed from: r0 */
    public V put(K k, @ParametricNullness V v) {
        return super.put(k, v);
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
