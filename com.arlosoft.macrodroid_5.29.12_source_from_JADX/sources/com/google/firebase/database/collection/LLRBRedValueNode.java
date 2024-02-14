package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class LLRBRedValueNode<K, V> extends LLRBValueNode<K, V> {
    LLRBRedValueNode(K k, V v) {
        super(k, v, LLRBEmptyNode.m7669i(), LLRBEmptyNode.m7669i());
    }

    /* renamed from: b */
    public boolean mo23571b() {
        return true;
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
        return new LLRBRedValueNode(k, v, lLRBNode, lLRBNode2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public LLRBNode.Color mo23573m() {
        return LLRBNode.Color.RED;
    }

    public int size() {
        return mo23576a().size() + 1 + mo23579e().size();
    }

    LLRBRedValueNode(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k, v, lLRBNode, lLRBNode2);
    }
}
