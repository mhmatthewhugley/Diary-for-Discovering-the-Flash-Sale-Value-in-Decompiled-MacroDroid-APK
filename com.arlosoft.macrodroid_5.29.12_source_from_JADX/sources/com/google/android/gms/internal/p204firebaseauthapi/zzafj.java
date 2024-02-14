package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class zzafj extends AbstractMap {

    /* renamed from: a */
    private final int f39831a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f39832c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f39833d = Collections.emptyMap();

    /* renamed from: f */
    private boolean f39834f;

    /* renamed from: g */
    private volatile zzafh f39835g;

    /* renamed from: o */
    private Map f39836o = Collections.emptyMap();

    /* synthetic */ zzafj(int i, zzafi zzafi) {
        this.f39831a = i;
    }

    /* renamed from: k */
    private final int m56733k(Comparable comparable) {
        int size = this.f39832c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzafd) this.f39832c.get(size)).mo49161b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((zzafd) this.f39832c.get(i2)).mo49161b());
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
    public final Object m56734l(int i) {
        m56736n();
        Object value = ((zzafd) this.f39832c.remove(i)).getValue();
        if (!this.f39833d.isEmpty()) {
            Iterator it = m56735m().entrySet().iterator();
            List list = this.f39832c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzafd(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m56735m() {
        m56736n();
        if (this.f39833d.isEmpty() && !(this.f39833d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f39833d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f39836o = treeMap.descendingMap();
        }
        return (SortedMap) this.f39833d;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m56736n() {
        if (this.f39834f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo49155a() {
        Map map;
        Map map2;
        if (!this.f39834f) {
            if (this.f39833d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f39833d);
            }
            this.f39833d = map;
            if (this.f39836o.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f39836o);
            }
            this.f39836o = map2;
            this.f39834f = true;
        }
    }

    /* renamed from: b */
    public final int mo49178b() {
        return this.f39832c.size();
    }

    /* renamed from: c */
    public final Iterable mo49179c() {
        if (this.f39833d.isEmpty()) {
            return zzafc.m56724a();
        }
        return this.f39833d.entrySet();
    }

    public final void clear() {
        m56736n();
        if (!this.f39832c.isEmpty()) {
            this.f39832c.clear();
        }
        if (!this.f39833d.isEmpty()) {
            this.f39833d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m56733k(comparable) >= 0 || this.f39833d.containsKey(comparable);
    }

    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m56736n();
        int k = m56733k(comparable);
        if (k >= 0) {
            return ((zzafd) this.f39832c.get(k)).setValue(obj);
        }
        m56736n();
        if (this.f39832c.isEmpty() && !(this.f39832c instanceof ArrayList)) {
            this.f39832c = new ArrayList(this.f39831a);
        }
        int i = -(k + 1);
        if (i >= this.f39831a) {
            return m56735m().put(comparable, obj);
        }
        int size = this.f39832c.size();
        int i2 = this.f39831a;
        if (size == i2) {
            zzafd zzafd = (zzafd) this.f39832c.remove(i2 - 1);
            m56735m().put(zzafd.mo49161b(), zzafd.getValue());
        }
        this.f39832c.add(i, new zzafd(this, comparable, obj));
        return null;
    }

    public final Set entrySet() {
        if (this.f39835g == null) {
            this.f39835g = new zzafh(this, (zzafg) null);
        }
        return this.f39835g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzafj)) {
            return super.equals(obj);
        }
        zzafj zzafj = (zzafj) obj;
        int size = size();
        if (size != zzafj.size()) {
            return false;
        }
        int b = mo49178b();
        if (b != zzafj.mo49178b()) {
            return entrySet().equals(zzafj.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo49185g(i).equals(zzafj.mo49185g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f39833d.equals(zzafj.f39833d);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry mo49185g(int i) {
        return (Map.Entry) this.f39832c.get(i);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m56733k(comparable);
        if (k >= 0) {
            return ((zzafd) this.f39832c.get(k)).getValue();
        }
        return this.f39833d.get(comparable);
    }

    public final int hashCode() {
        int b = mo49178b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((zzafd) this.f39832c.get(i2)).hashCode();
        }
        return this.f39833d.size() > 0 ? i + this.f39833d.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo49188j() {
        return this.f39834f;
    }

    public final Object remove(Object obj) {
        m56736n();
        Comparable comparable = (Comparable) obj;
        int k = m56733k(comparable);
        if (k >= 0) {
            return m56734l(k);
        }
        if (this.f39833d.isEmpty()) {
            return null;
        }
        return this.f39833d.remove(comparable);
    }

    public final int size() {
        return this.f39832c.size() + this.f39833d.size();
    }
}
