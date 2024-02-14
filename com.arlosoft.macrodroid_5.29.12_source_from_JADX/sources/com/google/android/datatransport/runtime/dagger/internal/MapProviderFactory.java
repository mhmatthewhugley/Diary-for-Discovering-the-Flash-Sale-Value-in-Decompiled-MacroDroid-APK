package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Map;
import p287ia.C12478a;

public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, C12478a<V>> implements Lazy<Map<K, C12478a<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, C12478a<V>> {
    }

    /* renamed from: b */
    public Map<K, C12478a<V>> get() {
        return mo19494a();
    }
}
