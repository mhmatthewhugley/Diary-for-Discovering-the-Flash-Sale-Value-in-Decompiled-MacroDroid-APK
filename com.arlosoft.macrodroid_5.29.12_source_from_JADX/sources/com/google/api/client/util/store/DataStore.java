package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

public interface DataStore<V extends Serializable> {
    /* renamed from: a */
    DataStore<V> mo60795a(String str, V v) throws IOException;

    V get(String str) throws IOException;

    Set<String> keySet() throws IOException;
}
