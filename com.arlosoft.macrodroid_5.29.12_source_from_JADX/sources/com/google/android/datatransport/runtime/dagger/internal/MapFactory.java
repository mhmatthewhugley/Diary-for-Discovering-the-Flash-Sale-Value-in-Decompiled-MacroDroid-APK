package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p287ia.C12478a;

public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {

    /* renamed from: b */
    private static final C12478a<Map<Object, Object>> f1414b = InstanceFactory.m1332a(Collections.emptyMap());

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
    }

    /* renamed from: b */
    public Map<K, V> get() {
        LinkedHashMap c = DaggerCollections.m1328c(mo19494a().size());
        for (Map.Entry entry : mo19494a().entrySet()) {
            c.put(entry.getKey(), ((C12478a) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(c);
    }
}
