package com.google.api.client.util.store;

import java.io.Serializable;

public class MemoryDataStoreFactory extends AbstractDataStoreFactory {

    static class InstanceHolder {

        /* renamed from: a */
        static final MemoryDataStoreFactory f52857a = new MemoryDataStoreFactory();

        InstanceHolder() {
        }
    }

    static class MemoryDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
    }
}
