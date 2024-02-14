package com.google.android.gms.internal.places;

import java.util.Map;

final class zzbn<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    private Map.Entry<K, zzbl> f45295a;

    private zzbn(Map.Entry<K, zzbl> entry) {
        this.f45295a = entry;
    }

    /* renamed from: a */
    public final zzbl mo53481a() {
        return this.f45295a.getValue();
    }

    public final K getKey() {
        return this.f45295a.getKey();
    }

    public final Object getValue() {
        if (this.f45295a.getValue() == null) {
            return null;
        }
        return zzbl.m63369e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzck) {
            return this.f45295a.getValue().mo53486c((zzck) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
