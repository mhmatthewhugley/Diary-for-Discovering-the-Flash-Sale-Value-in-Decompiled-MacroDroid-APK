package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p287ia.C12478a;

public final class SetFactory<T> implements Factory<Set<T>> {

    /* renamed from: c */
    private static final Factory<Set<Object>> f1418c = InstanceFactory.m1332a(Collections.emptySet());

    /* renamed from: a */
    private final List<C12478a<T>> f1419a;

    /* renamed from: b */
    private final List<C12478a<Collection<T>>> f1420b;

    public static final class Builder<T> {
    }

    /* renamed from: a */
    public Set<T> get() {
        int size = this.f1419a.size();
        ArrayList arrayList = new ArrayList(this.f1420b.size());
        int size2 = this.f1420b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f1420b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b = DaggerCollections.m1327b(size);
        int size3 = this.f1419a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            b.add(Preconditions.m1336b(this.f1419a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object b2 : (Collection) arrayList.get(i3)) {
                b.add(Preconditions.m1336b(b2));
            }
        }
        return Collections.unmodifiableSet(b);
    }
}
