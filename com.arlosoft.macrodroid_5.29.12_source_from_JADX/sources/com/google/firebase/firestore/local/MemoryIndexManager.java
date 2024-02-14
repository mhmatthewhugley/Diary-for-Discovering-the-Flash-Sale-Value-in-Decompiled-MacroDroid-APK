package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class MemoryIndexManager implements IndexManager {

    /* renamed from: a */
    private final MemoryCollectionParentIndex f54265a = new MemoryCollectionParentIndex();

    static class MemoryCollectionParentIndex {

        /* renamed from: a */
        private final HashMap<String, HashSet<ResourcePath>> f54266a = new HashMap<>();

        MemoryCollectionParentIndex() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo62666a(ResourcePath resourcePath) {
            boolean z = true;
            if (resourcePath.mo62807n() % 2 != 1) {
                z = false;
            }
            Assert.m76443d(z, "Expected a collection path.", new Object[0]);
            String i = resourcePath.mo62802i();
            ResourcePath resourcePath2 = (ResourcePath) resourcePath.mo62809q();
            HashSet hashSet = this.f54266a.get(i);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f54266a.put(i, hashSet);
            }
            return hashSet.add(resourcePath2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<ResourcePath> mo62667b(String str) {
            HashSet hashSet = this.f54266a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    MemoryIndexManager() {
    }

    /* renamed from: a */
    public void mo62590a(ResourcePath resourcePath) {
        this.f54265a.mo62666a(resourcePath);
    }

    /* renamed from: b */
    public List<ResourcePath> mo62591b(String str) {
        return this.f54265a.mo62667b(str);
    }
}
