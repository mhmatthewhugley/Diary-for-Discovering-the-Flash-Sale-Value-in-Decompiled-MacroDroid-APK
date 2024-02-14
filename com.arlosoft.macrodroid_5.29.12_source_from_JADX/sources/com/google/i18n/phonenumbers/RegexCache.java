package com.google.i18n.phonenumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegexCache {

    /* renamed from: a */
    private LRUCache<String, Pattern> f56186a;

    private static class LRUCache<K, V> {

        /* renamed from: a */
        private LinkedHashMap<K, V> f56187a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f56188b;

        public LRUCache(int i) {
            this.f56188b = i;
            this.f56187a = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                /* access modifiers changed from: protected */
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > LRUCache.this.f56188b;
                }
            };
        }

        /* renamed from: b */
        public synchronized V mo64488b(K k) {
            return this.f56187a.get(k);
        }

        /* renamed from: c */
        public synchronized void mo64489c(K k, V v) {
            this.f56187a.put(k, v);
        }
    }

    public RegexCache(int i) {
        this.f56186a = new LRUCache<>(i);
    }

    /* renamed from: a */
    public Pattern mo64487a(String str) {
        Pattern b = this.f56186a.mo64488b(str);
        if (b != null) {
            return b;
        }
        Pattern compile = Pattern.compile(str);
        this.f56186a.mo64489c(str, compile);
        return compile;
    }
}
