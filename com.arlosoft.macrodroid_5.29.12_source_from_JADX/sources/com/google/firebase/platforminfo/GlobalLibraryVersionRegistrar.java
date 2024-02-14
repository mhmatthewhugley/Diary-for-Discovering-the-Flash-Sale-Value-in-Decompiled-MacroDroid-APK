package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GlobalLibraryVersionRegistrar {

    /* renamed from: b */
    private static volatile GlobalLibraryVersionRegistrar f55183b;

    /* renamed from: a */
    private final Set<LibraryVersion> f55184a = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    /* renamed from: a */
    public static GlobalLibraryVersionRegistrar m77163a() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = f55183b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                globalLibraryVersionRegistrar = f55183b;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    f55183b = globalLibraryVersionRegistrar;
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<LibraryVersion> mo63500b() {
        Set<LibraryVersion> unmodifiableSet;
        synchronized (this.f55184a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f55184a);
        }
        return unmodifiableSet;
    }
}
