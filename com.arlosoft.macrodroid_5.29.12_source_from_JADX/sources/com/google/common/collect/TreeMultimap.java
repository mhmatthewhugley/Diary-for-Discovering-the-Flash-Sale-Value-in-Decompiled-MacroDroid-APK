package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: s */
    private transient Comparator<? super K> f17240s;

    /* renamed from: z */
    private transient Comparator<? super V> f17241z;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f17240s = (Comparator) Preconditions.m5392s((Comparator) objectInputStream.readObject());
        this.f17241z = (Comparator) Preconditions.m5392s((Comparator) objectInputStream.readObject());
        mo34434F(new TreeMap(this.f17240s));
        Serialization.m28706d(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo36674V());
        objectOutputStream.writeObject(mo36676X());
        Serialization.m28712j(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public SortedSet<V> mo34431y() {
        return new TreeSet(this.f17241z);
    }

    /* renamed from: P */
    public /* bridge */ /* synthetic */ boolean mo34625P(Object obj, Object obj2) {
        return super.mo34625P(obj, obj2);
    }

    /* renamed from: T */
    public NavigableMap<K, Collection<V>> mo34430w() {
        return (NavigableMap) super.mo34430w();
    }

    @GwtIncompatible
    /* renamed from: U */
    public NavigableSet<V> get(@ParametricNullness K k) {
        return (NavigableSet) super.get((Object) k);
    }

    @Deprecated
    /* renamed from: V */
    public Comparator<? super K> mo36674V() {
        return this.f17240s;
    }

    /* renamed from: W */
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    /* renamed from: X */
    public Comparator<? super V> mo36676X() {
        return this.f17241z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<K, Collection<V>> mo34436a() {
        return mo34432A();
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
    public /* bridge */ /* synthetic */ SortedSet mo34426d(Object obj) {
        return super.m26457d(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
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

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Collection<V> mo34448z(@ParametricNullness K k) {
        if (k == null) {
            mo36674V().compare(k, k);
        }
        return super.mo34448z(k);
    }
}
