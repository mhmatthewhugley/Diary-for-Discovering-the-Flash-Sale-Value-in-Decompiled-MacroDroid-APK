package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;

public interface BundleCache {
    /* renamed from: a */
    void mo62575a(NamedQuery namedQuery);

    /* renamed from: b */
    void mo62576b(BundleMetadata bundleMetadata);

    @Nullable
    /* renamed from: c */
    BundleMetadata mo62577c(String str);

    @Nullable
    /* renamed from: d */
    NamedQuery mo62578d(String str);
}
