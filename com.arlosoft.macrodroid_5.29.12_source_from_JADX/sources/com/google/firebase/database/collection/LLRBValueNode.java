package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a */
    private final K f5543a;

    /* renamed from: b */
    private final V f5544b;

    /* renamed from: c */
    private LLRBNode<K, V> f5545c;

    /* renamed from: d */
    private final LLRBNode<K, V> f5546d;

    LLRBValueNode(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.f5543a = k;
        this.f5544b = v;
        this.f5545c = lLRBNode == null ? LLRBEmptyNode.m7669i() : lLRBNode;
        this.f5546d = lLRBNode2 == null ? LLRBEmptyNode.m7669i() : lLRBNode2;
    }

    /* renamed from: i */
    private LLRBValueNode<K, V> m7689i() {
        LLRBNode<K, V> lLRBNode = this.f5545c;
        LLRBNode<K, V> f = lLRBNode.mo23580f(null, null, m7693p(lLRBNode), (LLRBNode<K, V>) null, (LLRBNode<K, V>) null);
        LLRBNode<K, V> lLRBNode2 = this.f5546d;
        return mo23580f((Object) null, (Object) null, m7693p(this), f, lLRBNode2.mo23580f(null, null, m7693p(lLRBNode2), (LLRBNode<K, V>) null, (LLRBNode<K, V>) null));
    }

    /* renamed from: l */
    private LLRBValueNode<K, V> m7690l() {
        LLRBValueNode r = (!this.f5546d.mo23571b() || this.f5545c.mo23571b()) ? this : m7695r();
        if (r.f5545c.mo23571b() && ((LLRBValueNode) r.f5545c).f5545c.mo23571b()) {
            r = r.m7696s();
        }
        return (!r.f5545c.mo23571b() || !r.f5546d.mo23571b()) ? r : r.m7689i();
    }

    /* renamed from: n */
    private LLRBValueNode<K, V> m7691n() {
        LLRBValueNode<K, V> i = m7689i();
        return i.mo23579e().mo23576a().mo23571b() ? i.mo23572k((K) null, (V) null, (LLRBNode<K, V>) null, ((LLRBValueNode) i.mo23579e()).m7696s()).m7695r().m7689i() : i;
    }

    /* renamed from: o */
    private LLRBValueNode<K, V> m7692o() {
        LLRBValueNode<K, V> i = m7689i();
        return i.mo23576a().mo23576a().mo23571b() ? i.m7696s().m7689i() : i;
    }

    /* renamed from: p */
    private static LLRBNode.Color m7693p(LLRBNode lLRBNode) {
        return lLRBNode.mo23571b() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED;
    }

    /* renamed from: q */
    private LLRBNode<K, V> m7694q() {
        if (this.f5545c.isEmpty()) {
            return LLRBEmptyNode.m7669i();
        }
        LLRBValueNode n = (mo23576a().mo23571b() || mo23576a().mo23576a().mo23571b()) ? this : m7691n();
        return n.mo23572k((Object) null, (Object) null, ((LLRBValueNode) n.f5545c).m7694q(), (LLRBNode) null).m7690l();
    }

    /* renamed from: r */
    private LLRBValueNode<K, V> m7695r() {
        return (LLRBValueNode) this.f5546d.mo23580f(null, null, mo23573m(), mo23580f((Object) null, (Object) null, LLRBNode.Color.RED, (LLRBNode) null, ((LLRBValueNode) this.f5546d).f5545c), (LLRBValueNode<K, V>) null);
    }

    /* renamed from: s */
    private LLRBValueNode<K, V> m7696s() {
        return (LLRBValueNode) this.f5545c.mo23580f(null, null, mo23573m(), (LLRBNode) null, mo23580f((Object) null, (Object) null, LLRBNode.Color.RED, ((LLRBValueNode) this.f5545c).f5546d, (LLRBNode<K, V>) null));
    }

    /* renamed from: a */
    public LLRBNode<K, V> mo23576a() {
        return this.f5545c;
    }

    /* renamed from: c */
    public LLRBNode<K, V> mo23577c(K k, V v, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNode;
        int compare = comparator.compare(k, this.f5543a);
        if (compare < 0) {
            lLRBValueNode = mo23572k((Object) null, (Object) null, this.f5545c.mo23577c(k, v, comparator), (LLRBNode<K, V>) null);
        } else if (compare == 0) {
            lLRBValueNode = mo23572k(k, v, (LLRBNode) null, (LLRBNode) null);
        } else {
            lLRBValueNode = mo23572k((Object) null, (Object) null, (LLRBNode) null, this.f5546d.mo23577c(k, v, comparator));
        }
        return lLRBValueNode.m7690l();
    }

    /* renamed from: d */
    public LLRBNode<K, V> mo23578d(K k, Comparator<K> comparator) {
        LLRBValueNode<K, V> lLRBValueNode;
        if (comparator.compare(k, this.f5543a) < 0) {
            LLRBValueNode n = (this.f5545c.isEmpty() || this.f5545c.mo23571b() || ((LLRBValueNode) this.f5545c).f5545c.mo23571b()) ? this : m7691n();
            lLRBValueNode = n.mo23572k((Object) null, (Object) null, n.f5545c.mo23578d(k, comparator), (LLRBNode<K, V>) null);
        } else {
            LLRBValueNode s = this.f5545c.mo23571b() ? m7696s() : this;
            if (!s.f5546d.isEmpty() && !s.f5546d.mo23571b() && !((LLRBValueNode) s.f5546d).f5545c.mo23571b()) {
                s = s.m7692o();
            }
            if (comparator.compare(k, s.f5543a) == 0) {
                if (s.f5546d.isEmpty()) {
                    return LLRBEmptyNode.m7669i();
                }
                LLRBNode<K, V> g = s.f5546d.mo23581g();
                s = s.mo23572k(g.getKey(), g.getValue(), (LLRBNode) null, ((LLRBValueNode) s.f5546d).m7694q());
            }
            lLRBValueNode = s.mo23572k((Object) null, (Object) null, (LLRBNode) null, s.f5546d.mo23578d(k, comparator));
        }
        return lLRBValueNode.m7690l();
    }

    /* renamed from: e */
    public LLRBNode<K, V> mo23579e() {
        return this.f5546d;
    }

    /* renamed from: g */
    public LLRBNode<K, V> mo23581g() {
        if (this.f5545c.isEmpty()) {
            return this;
        }
        return this.f5545c.mo23581g();
    }

    public K getKey() {
        return this.f5543a;
    }

    public V getValue() {
        return this.f5544b;
    }

    /* renamed from: h */
    public LLRBNode<K, V> mo23584h() {
        if (this.f5546d.isEmpty()) {
            return this;
        }
        return this.f5546d.mo23584h();
    }

    public boolean isEmpty() {
        return false;
    }

    /* renamed from: j */
    public LLRBValueNode<K, V> mo23580f(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = this.f5543a;
        }
        if (v == null) {
            v = this.f5544b;
        }
        if (lLRBNode == null) {
            lLRBNode = this.f5545c;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.f5546d;
        }
        if (color == LLRBNode.Color.RED) {
            return new LLRBRedValueNode(k, v, lLRBNode, lLRBNode2);
        }
        return new LLRBBlackValueNode(k, v, lLRBNode, lLRBNode2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract LLRBValueNode<K, V> mo23572k(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract LLRBNode.Color mo23573m();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo23575t(LLRBNode<K, V> lLRBNode) {
        this.f5545c = lLRBNode;
    }
}
