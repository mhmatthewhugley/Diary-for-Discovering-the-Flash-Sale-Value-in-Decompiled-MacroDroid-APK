package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.cache.LocalCache;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
interface ReferenceEntry<K, V> {
    /* renamed from: b */
    LocalCache.ValueReference<K, V> mo22390b();

    /* renamed from: d */
    int mo22391d();

    /* renamed from: e */
    ReferenceEntry<K, V> mo22392e();

    /* renamed from: f */
    ReferenceEntry<K, V> mo22393f();

    /* renamed from: g */
    ReferenceEntry<K, V> mo22394g();

    K getKey();

    /* renamed from: i */
    ReferenceEntry<K, V> mo22396i();

    /* renamed from: j */
    void mo22397j(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: k */
    ReferenceEntry<K, V> mo22398k();

    /* renamed from: l */
    void mo22399l(LocalCache.ValueReference<K, V> valueReference);

    /* renamed from: m */
    long mo22400m();

    /* renamed from: n */
    void mo22401n(long j);

    /* renamed from: q */
    long mo22402q();

    /* renamed from: r */
    void mo22403r(long j);

    /* renamed from: t */
    void mo22404t(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: v */
    void mo22405v(ReferenceEntry<K, V> referenceEntry);

    /* renamed from: w */
    void mo22406w(ReferenceEntry<K, V> referenceEntry);
}
