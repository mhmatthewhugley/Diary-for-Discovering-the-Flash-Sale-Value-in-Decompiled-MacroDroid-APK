package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
class zzmk extends AbstractMap {

    /* renamed from: a */
    private final int f41719a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f41720c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f41721d = Collections.emptyMap();

    /* renamed from: f */
    private boolean f41722f;

    /* renamed from: g */
    private volatile zzmi f41723g;

    /* renamed from: o */
    private Map f41724o = Collections.emptyMap();

    /* synthetic */ zzmk(int i, zzmj zzmj) {
        this.f41719a = i;
    }

    /* renamed from: k */
    private final int m60763k(Comparable comparable) {
        int size = this.f41720c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzme) this.f41720c.get(size)).mo51528b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((zzme) this.f41720c.get(i2)).mo51528b());
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
    /* renamed from: l */
    public final Object m60764l(int i) {
        m60766n();
        Object value = ((zzme) this.f41720c.remove(i)).getValue();
        if (!this.f41721d.isEmpty()) {
            Iterator it = m60765m().entrySet().iterator();
            List list = this.f41720c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzme(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m60765m() {
        m60766n();
        if (this.f41721d.isEmpty() && !(this.f41721d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f41721d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f41724o = treeMap.descendingMap();
        }
        return (SortedMap) this.f41721d;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m60766n() {
        if (this.f41722f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo51523a() {
        Map map;
        Map map2;
        if (!this.f41722f) {
            if (this.f41721d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f41721d);
            }
            this.f41721d = map;
            if (this.f41724o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f41724o);
            }
            this.f41724o = map2;
            this.f41722f = true;
        }
    }

    /* renamed from: b */
    public final int mo51545b() {
        return this.f41720c.size();
    }

    /* renamed from: c */
    public final Iterable mo51546c() {
        if (this.f41721d.isEmpty()) {
            return zzmd.m60754a();
        }
        return this.f41721d.entrySet();
    }

    public final void clear() {
        m60766n();
        if (!this.f41720c.isEmpty()) {
            this.f41720c.clear();
        }
        if (!this.f41721d.isEmpty()) {
            this.f41721d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m60763k(comparable) >= 0 || this.f41721d.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m60766n();
        int k = m60763k(comparable);
        if (k >= 0) {
            return ((zzme) this.f41720c.get(k)).setValue(obj);
        }
        m60766n();
        if (this.f41720c.isEmpty() && !(this.f41720c instanceof ArrayList)) {
            this.f41720c = new ArrayList(this.f41719a);
        }
        int i = -(k + 1);
        if (i >= this.f41719a) {
            return m60765m().put(comparable, obj);
        }
        int size = this.f41720c.size();
        int i2 = this.f41719a;
        if (size == i2) {
            zzme zzme = (zzme) this.f41720c.remove(i2 - 1);
            m60765m().put(zzme.mo51528b(), zzme.getValue());
        }
        this.f41720c.add(i, new zzme(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f41723g == null) {
            this.f41723g = new zzmi(this, (zzmh) null);
        }
        return this.f41723g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmk)) {
            return super.equals(obj);
        }
        zzmk zzmk = (zzmk) obj;
        int size = size();
        if (size != zzmk.size()) {
            return false;
        }
        int b = mo51545b();
        if (b != zzmk.mo51545b()) {
            return entrySet().equals(zzmk.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo51552g(i).equals(zzmk.mo51552g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f41721d.equals(zzmk.f41721d);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo51552g(int i) {
        return (Map.Entry) this.f41720c.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m60763k(comparable);
        if (k >= 0) {
            return ((zzme) this.f41720c.get(k)).getValue();
        }
        return this.f41721d.get(comparable);
    }

    public final int hashCode() {
        int b = mo51545b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((zzme) this.f41720c.get(i2)).hashCode();
        }
        return this.f41721d.size() > 0 ? i + this.f41721d.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo51555j() {
        return this.f41722f;
    }

    public final Object remove(Object obj) {
        m60766n();
        Comparable comparable = (Comparable) obj;
        int k = m60763k(comparable);
        if (k >= 0) {
            return m60764l(k);
        }
        if (this.f41721d.isEmpty()) {
            return null;
        }
        return this.f41721d.remove(comparable);
    }

    public final int size() {
        return this.f41720c.size() + this.f41721d.size();
    }
}
