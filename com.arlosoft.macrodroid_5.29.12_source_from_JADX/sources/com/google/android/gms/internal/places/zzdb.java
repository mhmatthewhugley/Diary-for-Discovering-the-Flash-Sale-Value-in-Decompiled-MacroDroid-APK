package com.google.android.gms.internal.places;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzdb<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f45357a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<zzdk> f45358c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f45359d;

    /* renamed from: f */
    private boolean f45360f;

    /* renamed from: g */
    private volatile zzdm f45361g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<K, V> f45362o;

    /* renamed from: p */
    private volatile zzdg f45363p;

    private zzdb(int i) {
        this.f45357a = i;
        this.f45358c = Collections.emptyList();
        this.f45359d = Collections.emptyMap();
        this.f45362o = Collections.emptyMap();
    }

    /* renamed from: c */
    static <FieldDescriptorType extends zzax<FieldDescriptorType>> zzdb<FieldDescriptorType, Object> m63536c(int i) {
        return new zzde(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final V m63537e(int i) {
        m63542n();
        V value = this.f45358c.remove(i).getValue();
        if (!this.f45359d.isEmpty()) {
            Iterator it = m63543o().entrySet().iterator();
            this.f45358c.add(new zzdk(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: f */
    private final int m63538f(K k) {
        int size = this.f45358c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f45358c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f45358c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m63542n() {
        if (this.f45360f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    private final SortedMap<K, V> m63543o() {
        m63542n();
        if (this.f45359d.isEmpty() && !(this.f45359d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45359d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f45362o = treeMap.descendingMap();
        }
        return (SortedMap) this.f45359d;
    }

    /* renamed from: a */
    public final boolean mo53553a() {
        return this.f45360f;
    }

    /* renamed from: b */
    public void mo53554b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f45360f) {
            if (this.f45359d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f45359d);
            }
            this.f45359d = map;
            if (this.f45362o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f45362o);
            }
            this.f45362o = map2;
            this.f45360f = true;
        }
    }

    public void clear() {
        m63542n();
        if (!this.f45358c.isEmpty()) {
            this.f45358c.clear();
        }
        if (!this.f45359d.isEmpty()) {
            this.f45359d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m63538f(comparable) >= 0 || this.f45359d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo53557d(int i) {
        return this.f45358c.get(i);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f45361g == null) {
            this.f45361g = new zzdm(this, (zzde) null);
        }
        return this.f45361g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return super.equals(obj);
        }
        zzdb zzdb = (zzdb) obj;
        int size = size();
        if (size != zzdb.size()) {
            return false;
        }
        int k = mo53563k();
        if (k != zzdb.mo53563k()) {
            return entrySet().equals(zzdb.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo53557d(i).equals(zzdb.mo53557d(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f45359d.equals(zzdb.f45359d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m63538f(comparable);
        if (f >= 0) {
            return this.f45358c.get(f).getValue();
        }
        return this.f45359d.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k, V v) {
        m63542n();
        int f = m63538f(k);
        if (f >= 0) {
            return this.f45358c.get(f).setValue(v);
        }
        m63542n();
        if (this.f45358c.isEmpty() && !(this.f45358c instanceof ArrayList)) {
            this.f45358c = new ArrayList(this.f45357a);
        }
        int i = -(f + 1);
        if (i >= this.f45357a) {
            return m63543o().put(k, v);
        }
        int size = this.f45358c.size();
        int i2 = this.f45357a;
        if (size == i2) {
            zzdk remove = this.f45358c.remove(i2 - 1);
            m63543o().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f45358c.add(i, new zzdk(this, k, v));
        return null;
    }

    public int hashCode() {
        int k = mo53563k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f45358c.get(i2).hashCode();
        }
        return this.f45359d.size() > 0 ? i + this.f45359d.hashCode() : i;
    }

    /* renamed from: k */
    public final int mo53563k() {
        return this.f45358c.size();
    }

    /* renamed from: l */
    public final Iterable<Map.Entry<K, V>> mo53564l() {
        if (this.f45359d.isEmpty()) {
            return zzdf.m63611a();
        }
        return this.f45359d.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Set<Map.Entry<K, V>> mo53565m() {
        if (this.f45363p == null) {
            this.f45363p = new zzdg(this, (zzde) null);
        }
        return this.f45363p;
    }

    public V remove(Object obj) {
        m63542n();
        Comparable comparable = (Comparable) obj;
        int f = m63538f(comparable);
        if (f >= 0) {
            return m63537e(f);
        }
        if (this.f45359d.isEmpty()) {
            return null;
        }
        return this.f45359d.remove(comparable);
    }

    public int size() {
        return this.f45358c.size() + this.f45359d.size();
    }

    /* synthetic */ zzdb(int i, zzde zzde) {
        this(i);
    }
}
