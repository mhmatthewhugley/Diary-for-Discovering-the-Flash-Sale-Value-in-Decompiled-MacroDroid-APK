package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class LazyField extends LazyFieldLite {

    /* renamed from: f */
    private final MessageLite f56972f;

    static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, LazyField> f56973a;

        /* renamed from: a */
        public LazyField mo65257a() {
            return this.f56973a.getValue();
        }

        public K getKey() {
            return this.f56973a.getKey();
        }

        public Object getValue() {
            LazyField value = this.f56973a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo65254f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f56973a.getValue().mo65268d((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private LazyEntry(Map.Entry<K, LazyField> entry) {
            this.f56973a = entry;
        }
    }

    static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f56974a;

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
            this.f56974a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f56974a.next();
            return next.getValue() instanceof LazyField ? new LazyEntry(next) : next;
        }

        public boolean hasNext() {
            return this.f56974a.hasNext();
        }

        public void remove() {
            this.f56974a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo65254f().equals(obj);
    }

    /* renamed from: f */
    public MessageLite mo65254f() {
        return mo65267c(this.f56972f);
    }

    public int hashCode() {
        return mo65254f().hashCode();
    }

    public String toString() {
        return mo65254f().toString();
    }
}
