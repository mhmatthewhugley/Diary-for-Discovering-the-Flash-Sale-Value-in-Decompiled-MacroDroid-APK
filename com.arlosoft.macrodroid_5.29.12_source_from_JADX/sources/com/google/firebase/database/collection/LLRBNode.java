package com.google.firebase.database.collection;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public interface LLRBNode<K, V> {

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    public enum Color {
        RED,
        BLACK
    }

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
    }

    /* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
    public interface ShortCircuitingNodeVisitor<K, V> {
    }

    /* renamed from: a */
    LLRBNode<K, V> mo23576a();

    /* renamed from: b */
    boolean mo23571b();

    /* renamed from: c */
    LLRBNode<K, V> mo23577c(K k, V v, Comparator<K> comparator);

    /* renamed from: d */
    LLRBNode<K, V> mo23578d(K k, Comparator<K> comparator);

    /* renamed from: e */
    LLRBNode<K, V> mo23579e();

    /* renamed from: f */
    LLRBNode<K, V> mo23580f(K k, V v, Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    /* renamed from: g */
    LLRBNode<K, V> mo23581g();

    K getKey();

    V getValue();

    /* renamed from: h */
    LLRBNode<K, V> mo23584h();

    boolean isEmpty();

    int size();
}
