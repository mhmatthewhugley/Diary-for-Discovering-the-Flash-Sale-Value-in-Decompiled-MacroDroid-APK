package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzgtu extends AbstractMap {

    /* renamed from: a */
    private final int f37277a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f37278c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f37279d = Collections.emptyMap();

    /* renamed from: f */
    private boolean f37280f;

    /* renamed from: g */
    private volatile zzgts f37281g;

    /* renamed from: o */
    private Map f37282o = Collections.emptyMap();

    /* synthetic */ zzgtu(int i, zzgtt zzgtt) {
        this.f37277a = i;
    }

    /* renamed from: k */
    private final int m53324k(Comparable comparable) {
        int size = this.f37278c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzgto) this.f37278c.get(size)).mo47439b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((zzgto) this.f37278c.get(i2)).mo47439b());
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
    public final Object m53325l(int i) {
        m53327n();
        Object value = ((zzgto) this.f37278c.remove(i)).getValue();
        if (!this.f37279d.isEmpty()) {
            Iterator it = m53326m().entrySet().iterator();
            List list = this.f37278c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgto(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m53326m() {
        m53327n();
        if (this.f37279d.isEmpty() && !(this.f37279d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37279d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f37282o = treeMap.descendingMap();
        }
        return (SortedMap) this.f37279d;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m53327n() {
        if (this.f37280f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo47434a() {
        Map map;
        Map map2;
        if (!this.f37280f) {
            if (this.f37279d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f37279d);
            }
            this.f37279d = map;
            if (this.f37282o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f37282o);
            }
            this.f37282o = map2;
            this.f37280f = true;
        }
    }

    /* renamed from: b */
    public final int mo47456b() {
        return this.f37278c.size();
    }

    /* renamed from: c */
    public final Iterable mo47457c() {
        if (this.f37279d.isEmpty()) {
            return zzgtn.m53315a();
        }
        return this.f37279d.entrySet();
    }

    public final void clear() {
        m53327n();
        if (!this.f37278c.isEmpty()) {
            this.f37278c.clear();
        }
        if (!this.f37279d.isEmpty()) {
            this.f37279d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m53324k(comparable) >= 0 || this.f37279d.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m53327n();
        int k = m53324k(comparable);
        if (k >= 0) {
            return ((zzgto) this.f37278c.get(k)).setValue(obj);
        }
        m53327n();
        if (this.f37278c.isEmpty() && !(this.f37278c instanceof ArrayList)) {
            this.f37278c = new ArrayList(this.f37277a);
        }
        int i = -(k + 1);
        if (i >= this.f37277a) {
            return m53326m().put(comparable, obj);
        }
        int size = this.f37278c.size();
        int i2 = this.f37277a;
        if (size == i2) {
            zzgto zzgto = (zzgto) this.f37278c.remove(i2 - 1);
            m53326m().put(zzgto.mo47439b(), zzgto.getValue());
        }
        this.f37278c.add(i, new zzgto(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f37281g == null) {
            this.f37281g = new zzgts(this, (zzgtr) null);
        }
        return this.f37281g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgtu)) {
            return super.equals(obj);
        }
        zzgtu zzgtu = (zzgtu) obj;
        int size = size();
        if (size != zzgtu.size()) {
            return false;
        }
        int b = mo47456b();
        if (b != zzgtu.mo47456b()) {
            return entrySet().equals(zzgtu.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo47463g(i).equals(zzgtu.mo47463g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f37279d.equals(zzgtu.f37279d);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo47463g(int i) {
        return (Map.Entry) this.f37278c.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m53324k(comparable);
        if (k >= 0) {
            return ((zzgto) this.f37278c.get(k)).getValue();
        }
        return this.f37279d.get(comparable);
    }

    public final int hashCode() {
        int b = mo47456b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((zzgto) this.f37278c.get(i2)).hashCode();
        }
        return this.f37279d.size() > 0 ? i + this.f37279d.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo47466j() {
        return this.f37280f;
    }

    public final Object remove(Object obj) {
        m53327n();
        Comparable comparable = (Comparable) obj;
        int k = m53324k(comparable);
        if (k >= 0) {
            return m53325l(k);
        }
        if (this.f37279d.isEmpty()) {
            return null;
        }
        return this.f37279d.remove(comparable);
    }

    public final int size() {
        return this.f37278c.size() + this.f37279d.size();
    }
}
