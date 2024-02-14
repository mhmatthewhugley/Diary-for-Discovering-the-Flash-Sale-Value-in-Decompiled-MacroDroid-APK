package p090f5;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: f5.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C7305b<K, V> extends ArrayMap<K, V> {

    /* renamed from: a */
    private int f17878a;

    public void clear() {
        this.f17878a = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f17878a == 0) {
            this.f17878a = super.hashCode();
        }
        return this.f17878a;
    }

    public V put(K k, V v) {
        this.f17878a = 0;
        return super.put(k, v);
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f17878a = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i) {
        this.f17878a = 0;
        return super.removeAt(i);
    }

    public V setValueAt(int i, V v) {
        this.f17878a = 0;
        return super.setValueAt(i, v);
    }
}
