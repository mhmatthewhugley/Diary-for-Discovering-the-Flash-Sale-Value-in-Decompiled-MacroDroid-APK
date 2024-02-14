package com.google.android.gms.internal.icing;

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

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
class zzez<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f40961a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<zzew> f40962c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f40963d = Collections.emptyMap();

    /* renamed from: f */
    private boolean f40964f;

    /* renamed from: g */
    private volatile zzey f40965g;

    /* renamed from: o */
    private Map<K, V> f40966o = Collections.emptyMap();

    /* synthetic */ zzez(int i, zzes zzes) {
        this.f40961a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final V m58998k(int i) {
        m59000m();
        V value = this.f40962c.remove(i).getValue();
        if (!this.f40963d.isEmpty()) {
            Iterator it = m59001n().entrySet().iterator();
            List<zzew> list = this.f40962c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzew(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: l */
    private final int m58999l(K k) {
        int size = this.f40962c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f40962c.get(size).mo50372b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f40962c.get(i2).mo50372b());
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
    /* renamed from: m */
    public final void m59000m() {
        if (this.f40964f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    private final SortedMap<K, V> m59001n() {
        m59000m();
        if (this.f40963d.isEmpty() && !(this.f40963d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f40963d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f40966o = treeMap.descendingMap();
        }
        return (SortedMap) this.f40963d;
    }

    /* renamed from: a */
    public void mo50367a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f40964f) {
            if (this.f40963d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f40963d);
            }
            this.f40963d = map;
            if (this.f40966o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f40966o);
            }
            this.f40966o = map2;
            this.f40964f = true;
        }
    }

    /* renamed from: b */
    public final boolean mo50389b() {
        return this.f40964f;
    }

    /* renamed from: c */
    public final int mo50390c() {
        return this.f40962c.size();
    }

    public final void clear() {
        m59000m();
        if (!this.f40962c.isEmpty()) {
            this.f40962c.clear();
        }
        if (!this.f40963d.isEmpty()) {
            this.f40963d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m58999l(comparable) >= 0 || this.f40963d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo50393d(int i) {
        return this.f40962c.get(i);
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo50394e() {
        if (this.f40963d.isEmpty()) {
            return zzev.m58989a();
        }
        return this.f40963d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f40965g == null) {
            this.f40965g = new zzey(this, (zzes) null);
        }
        return this.f40965g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzez)) {
            return super.equals(obj);
        }
        zzez zzez = (zzez) obj;
        int size = size();
        if (size != zzez.size()) {
            return false;
        }
        int c = mo50390c();
        if (c != zzez.mo50390c()) {
            return entrySet().equals(zzez.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo50393d(i).equals(zzez.mo50393d(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f40963d.equals(zzez.f40963d);
        }
        return true;
    }

    /* renamed from: f */
    public final V put(K k, V v) {
        m59000m();
        int l = m58999l(k);
        if (l >= 0) {
            return this.f40962c.get(l).setValue(v);
        }
        m59000m();
        if (this.f40962c.isEmpty() && !(this.f40962c instanceof ArrayList)) {
            this.f40962c = new ArrayList(this.f40961a);
        }
        int i = -(l + 1);
        if (i >= this.f40961a) {
            return m59001n().put(k, v);
        }
        int size = this.f40962c.size();
        int i2 = this.f40961a;
        if (size == i2) {
            zzew remove = this.f40962c.remove(i2 - 1);
            m59001n().put(remove.mo50372b(), remove.getValue());
        }
        this.f40962c.add(i, new zzew(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m58999l(comparable);
        if (l >= 0) {
            return this.f40962c.get(l).getValue();
        }
        return this.f40963d.get(comparable);
    }

    public final int hashCode() {
        int c = mo50390c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f40962c.get(i2).hashCode();
        }
        return this.f40963d.size() > 0 ? i + this.f40963d.hashCode() : i;
    }

    public final V remove(Object obj) {
        m59000m();
        Comparable comparable = (Comparable) obj;
        int l = m58999l(comparable);
        if (l >= 0) {
            return m58998k(l);
        }
        if (this.f40963d.isEmpty()) {
            return null;
        }
        return this.f40963d.remove(comparable);
    }

    public final int size() {
        return this.f40962c.size() + this.f40963d.size();
    }
}
