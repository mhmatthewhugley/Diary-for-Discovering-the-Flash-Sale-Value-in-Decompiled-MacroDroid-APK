package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class LLRBEmptyNode<K, V> implements LLRBNode<K, V> {

    /* renamed from: a */
    private static final LLRBEmptyNode f5539a = new LLRBEmptyNode();

    private LLRBEmptyNode() {
    }

    /* renamed from: i */
    public static <K, V> LLRBEmptyNode<K, V> m7669i() {
        return f5539a;
    }

    /* renamed from: a */
    public LLRBNode<K, V> mo23576a() {
        return this;
    }

    /* renamed from: b */
    public boolean mo23571b() {
        return false;
    }

    /* renamed from: c */
    public LLRBNode<K, V> mo23577c(K k, V v, Comparator<K> comparator) {
        return new LLRBRedValueNode(k, v);
    }

    /* renamed from: d */
    public LLRBNode<K, V> mo23578d(K k, Comparator<K> comparator) {
        return this;
    }

    /* renamed from: e */
    public LLRBNode<K, V> mo23579e() {
        return this;
    }

    /* renamed from: f */
    public LLRBNode<K, V> mo23580f(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        return this;
    }

    /* renamed from: g */
    public LLRBNode<K, V> mo23581g() {
        return this;
    }

    public K getKey() {
        return null;
    }

    public V getValue() {
        return null;
    }

    /* renamed from: h */
    public LLRBNode<K, V> mo23584h() {
        return this;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }
}
