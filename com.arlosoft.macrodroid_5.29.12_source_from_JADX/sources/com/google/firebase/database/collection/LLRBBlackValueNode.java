package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class LLRBBlackValueNode<K, V> extends LLRBValueNode<K, V> {

    /* renamed from: e */
    private int f5538e = -1;

    LLRBBlackValueNode(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k, v, lLRBNode, lLRBNode2);
    }

    /* renamed from: b */
    public boolean mo23571b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public LLRBValueNode<K, V> mo23572k(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (lLRBNode == null) {
            lLRBNode = mo23576a();
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = mo23579e();
        }
        return new LLRBBlackValueNode(k, v, lLRBNode, lLRBNode2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public LLRBNode.Color mo23573m() {
        return LLRBNode.Color.BLACK;
    }

    public int size() {
        if (this.f5538e == -1) {
            this.f5538e = mo23576a().size() + 1 + mo23579e().size();
        }
        return this.f5538e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo23575t(LLRBNode<K, V> lLRBNode) {
        if (this.f5538e == -1) {
            super.mo23575t(lLRBNode);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }
}
