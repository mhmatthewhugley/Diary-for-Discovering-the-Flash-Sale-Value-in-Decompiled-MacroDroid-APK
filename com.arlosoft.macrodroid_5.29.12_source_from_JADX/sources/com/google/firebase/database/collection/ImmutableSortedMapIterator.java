package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-database-collection@@17.0.1 */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private final ArrayDeque<LLRBValueNode<K, V>> f5534a = new ArrayDeque<>();

    /* renamed from: c */
    private final boolean f5535c;

    ImmutableSortedMapIterator(LLRBNode<K, V> lLRBNode, K k, Comparator<K> comparator, boolean z) {
        int i;
        this.f5535c = z;
        while (!lLRBNode.isEmpty()) {
            if (k != null) {
                i = z ? comparator.compare(k, lLRBNode.getKey()) : comparator.compare(lLRBNode.getKey(), k);
            } else {
                i = 1;
            }
            if (i < 0) {
                if (z) {
                    lLRBNode = lLRBNode.mo23576a();
                } else {
                    lLRBNode = lLRBNode.mo23579e();
                }
            } else if (i == 0) {
                this.f5534a.push((LLRBValueNode) lLRBNode);
                return;
            } else {
                this.f5534a.push((LLRBValueNode) lLRBNode);
                if (z) {
                    lLRBNode = lLRBNode.mo23579e();
                } else {
                    lLRBNode = lLRBNode.mo23576a();
                }
            }
        }
    }

    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            LLRBValueNode pop = this.f5534a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f5535c) {
                for (LLRBNode a = pop.mo23576a(); !a.isEmpty(); a = a.mo23579e()) {
                    this.f5534a.push((LLRBValueNode) a);
                }
            } else {
                for (LLRBNode e = pop.mo23579e(); !e.isEmpty(); e = e.mo23576a()) {
                    this.f5534a.push((LLRBValueNode) e);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.f5534a.size() > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
