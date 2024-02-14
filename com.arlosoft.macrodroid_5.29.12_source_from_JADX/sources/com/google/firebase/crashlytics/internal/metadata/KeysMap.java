package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class KeysMap {

    /* renamed from: a */
    private final Map<String, String> f5041a = new HashMap();

    /* renamed from: b */
    private final int f5042b;

    /* renamed from: c */
    private final int f5043c;

    public KeysMap(int i, int i2) {
        this.f5042b = i;
        this.f5043c = i2;
    }

    /* renamed from: b */
    private String m6824b(String str) {
        if (str != null) {
            return m6825c(str, this.f5043c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m6825c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    @NonNull
    /* renamed from: a */
    public synchronized Map<String, String> mo23079a() {
        return Collections.unmodifiableMap(new HashMap(this.f5041a));
    }

    /* renamed from: d */
    public synchronized void mo23080d(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = m6824b((String) next.getKey());
            if (this.f5041a.size() >= this.f5042b) {
                if (!this.f5041a.containsKey(b)) {
                    i++;
                }
            }
            String str = (String) next.getValue();
            this.f5041a.put(b, str == null ? "" : m6825c(str, this.f5043c));
        }
        if (i > 0) {
            Logger f = Logger.m6525f();
            f.mo22962k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f5042b);
        }
    }
}
