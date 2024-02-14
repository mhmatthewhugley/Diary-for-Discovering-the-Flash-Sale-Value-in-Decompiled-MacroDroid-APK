package com.google.android.gms.internal.wearable;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
class zzea extends AbstractMap {

    /* renamed from: a */
    private final int f45717a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f45718c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f45719d = Collections.emptyMap();

    /* renamed from: f */
    private boolean f45720f;

    /* renamed from: g */
    private volatile zzdy f45721g;

    /* renamed from: o */
    private Map f45722o = Collections.emptyMap();

    /* synthetic */ zzea(int i, zzdz zzdz) {
        this.f45717a = i;
    }

    /* renamed from: k */
    private final int m64415k(Comparable comparable) {
        int size = this.f45718c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzdu) this.f45718c.get(size)).mo54013b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((zzdu) this.f45718c.get(i2)).mo54013b());
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
    public final Object m64416l(int i) {
        m64418n();
        Object value = ((zzdu) this.f45718c.remove(i)).getValue();
        if (!this.f45719d.isEmpty()) {
            Iterator it = m64417m().entrySet().iterator();
            List list = this.f45718c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzdu(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m64417m() {
        m64418n();
        if (this.f45719d.isEmpty() && !(this.f45719d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45719d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f45722o = treeMap.descendingMap();
        }
        return (SortedMap) this.f45719d;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m64418n() {
        if (this.f45720f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo54008a() {
        Map map;
        Map map2;
        if (!this.f45720f) {
            if (this.f45719d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f45719d);
            }
            this.f45719d = map;
            if (this.f45722o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f45722o);
            }
            this.f45722o = map2;
            this.f45720f = true;
        }
    }

    /* renamed from: b */
    public final int mo54030b() {
        return this.f45718c.size();
    }

    /* renamed from: c */
    public final Iterable mo54031c() {
        if (this.f45719d.isEmpty()) {
            return zzdt.m64406a();
        }
        return this.f45719d.entrySet();
    }

    public final void clear() {
        m64418n();
        if (!this.f45718c.isEmpty()) {
            this.f45718c.clear();
        }
        if (!this.f45719d.isEmpty()) {
            this.f45719d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m64415k(comparable) >= 0 || this.f45719d.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m64418n();
        int k = m64415k(comparable);
        if (k >= 0) {
            return ((zzdu) this.f45718c.get(k)).setValue(obj);
        }
        m64418n();
        if (this.f45718c.isEmpty() && !(this.f45718c instanceof ArrayList)) {
            this.f45718c = new ArrayList(this.f45717a);
        }
        int i = -(k + 1);
        if (i >= this.f45717a) {
            return m64417m().put(comparable, obj);
        }
        int size = this.f45718c.size();
        int i2 = this.f45717a;
        if (size == i2) {
            zzdu zzdu = (zzdu) this.f45718c.remove(i2 - 1);
            m64417m().put(zzdu.mo54013b(), zzdu.getValue());
        }
        this.f45718c.add(i, new zzdu(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f45721g == null) {
            this.f45721g = new zzdy(this, (zzdx) null);
        }
        return this.f45721g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzea)) {
            return super.equals(obj);
        }
        zzea zzea = (zzea) obj;
        int size = size();
        if (size != zzea.size()) {
            return false;
        }
        int b = mo54030b();
        if (b != zzea.mo54030b()) {
            return entrySet().equals(zzea.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo54037g(i).equals(zzea.mo54037g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f45719d.equals(zzea.f45719d);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo54037g(int i) {
        return (Map.Entry) this.f45718c.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m64415k(comparable);
        if (k >= 0) {
            return ((zzdu) this.f45718c.get(k)).getValue();
        }
        return this.f45719d.get(comparable);
    }

    public final int hashCode() {
        int b = mo54030b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((zzdu) this.f45718c.get(i2)).hashCode();
        }
        return this.f45719d.size() > 0 ? i + this.f45719d.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo54040j() {
        return this.f45720f;
    }

    public final Object remove(Object obj) {
        m64418n();
        Comparable comparable = (Comparable) obj;
        int k = m64415k(comparable);
        if (k >= 0) {
            return m64416l(k);
        }
        if (this.f45719d.isEmpty()) {
            return null;
        }
        return this.f45719d.remove(comparable);
    }

    public final int size() {
        return this.f45718c.size() + this.f45719d.size();
    }
}
