package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import java.util.HashMap;
import java.util.Map;

class MemoryBundleCache implements BundleCache {

    /* renamed from: a */
    private final Map<String, BundleMetadata> f54260a = new HashMap();

    /* renamed from: b */
    private final Map<String, NamedQuery> f54261b = new HashMap();

    MemoryBundleCache() {
    }

    /* renamed from: a */
    public void mo62575a(NamedQuery namedQuery) {
        this.f54261b.put(namedQuery.mo23796b(), namedQuery);
    }

    /* renamed from: b */
    public void mo62576b(BundleMetadata bundleMetadata) {
        this.f54260a.put(bundleMetadata.mo23770a(), bundleMetadata);
    }

    @Nullable
    /* renamed from: c */
    public BundleMetadata mo62577c(String str) {
        return this.f54260a.get(str);
    }

    @Nullable
    /* renamed from: d */
    public NamedQuery mo62578d(String str) {
        return this.f54261b.get(str);
    }
}
