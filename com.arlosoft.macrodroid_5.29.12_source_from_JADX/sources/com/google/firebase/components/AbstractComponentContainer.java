package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

abstract class AbstractComponentContainer implements ComponentContainer {
    AbstractComponentContainer() {
    }

    /* renamed from: a */
    public <T> T mo22868a(Class<T> cls) {
        Provider<T> d = mo22887d(cls);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    /* renamed from: c */
    public <T> Set<T> mo22869c(Class<T> cls) {
        return mo22886b(cls).get();
    }
}
