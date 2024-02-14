package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface MapDifference<K, V> {

    @DoNotMock
    public interface ValueDifference<V> {
        @ParametricNullness
        /* renamed from: a */
        V mo35776a();

        @ParametricNullness
        /* renamed from: b */
        V mo35777b();
    }

    /* renamed from: a */
    Map<K, V> mo35772a();

    /* renamed from: b */
    Map<K, V> mo35773b();

    /* renamed from: c */
    Map<K, ValueDifference<V>> mo35774c();

    /* renamed from: d */
    Map<K, V> mo35775d();
}
