package com.fasterxml.jackson.core.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.fasterxml.jackson.core.util.d */
/* compiled from: InternCache */
public final class C6830d extends LinkedHashMap<String, String> {

    /* renamed from: a */
    public static final C6830d f15891a = new C6830d();

    private C6830d() {
        super(100, 0.8f, true);
    }

    /* renamed from: a */
    public synchronized String mo33957a(String str) {
        String str2;
        str2 = (String) get(str);
        if (str2 == null) {
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 100;
    }
}
