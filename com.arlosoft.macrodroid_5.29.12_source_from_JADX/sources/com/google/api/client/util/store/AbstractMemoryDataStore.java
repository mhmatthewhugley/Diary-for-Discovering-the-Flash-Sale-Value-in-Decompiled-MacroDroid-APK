package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

class AbstractMemoryDataStore<V extends Serializable> extends AbstractDataStore<V> {

    /* renamed from: a */
    private final Lock f52853a;

    /* renamed from: b */
    HashMap<String, byte[]> f52854b;

    /* renamed from: a */
    public final DataStore<V> mo60795a(String str, V v) throws IOException {
        Preconditions.m72716d(str);
        Preconditions.m72716d(v);
        this.f52853a.lock();
        try {
            this.f52854b.put(str, IOUtils.m72698g(v));
            mo60796b();
            return this;
        } finally {
            this.f52853a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo60796b() throws IOException {
    }

    public final V get(String str) throws IOException {
        if (str == null) {
            return null;
        }
        this.f52853a.lock();
        try {
            return IOUtils.m72696e(this.f52854b.get(str));
        } finally {
            this.f52853a.unlock();
        }
    }

    public final Set<String> keySet() throws IOException {
        this.f52853a.lock();
        try {
            return Collections.unmodifiableSet(this.f52854b.keySet());
        } finally {
            this.f52853a.unlock();
        }
    }

    public String toString() {
        return DataStoreUtils.m72766a(this);
    }
}
