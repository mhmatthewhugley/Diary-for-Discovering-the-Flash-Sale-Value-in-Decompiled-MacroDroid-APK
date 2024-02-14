package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m4861a() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m4862b(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m4863c(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m4861a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m4862b(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static <K, V> Map<K, V> m4864d(@NonNull K k, @NonNull V v, @NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3) {
        Map h = m4868h(3, false);
        h.put(k, v);
        h.put(k2, v2);
        h.put(k3, v3);
        return Collections.unmodifiableMap(h);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public static <K, V> Map<K, V> m4865e(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map h = m4868h(length, false);
            for (int i = 0; i < kArr.length; i++) {
                h.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(h);
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: f */
    public static <T> Set<T> m4866f(@NonNull T t, @NonNull T t2, @NonNull T t3) {
        Set i = m4869i(3, false);
        i.add(t);
        i.add(t2);
        i.add(t3);
        return Collections.unmodifiableSet(i);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: g */
    public static <T> Set<T> m4867g(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set i = m4869i(2, false);
            i.add(t);
            i.add(t2);
            return Collections.unmodifiableSet(i);
        } else if (length == 3) {
            return m4866f(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set i2 = m4869i(length, false);
                Collections.addAll(i2, tArr);
                return Collections.unmodifiableSet(i2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set i3 = m4869i(4, false);
            i3.add(t3);
            i3.add(t4);
            i3.add(t5);
            i3.add(t6);
            return Collections.unmodifiableSet(i3);
        }
    }

    /* renamed from: h */
    private static Map m4868h(int i, boolean z) {
        if (i <= 256) {
            return new ArrayMap(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: i */
    private static Set m4869i(int i, boolean z) {
        float f = true != z ? 1.0f : 0.75f;
        if (i <= (true != z ? 256 : 128)) {
            return new ArraySet(i);
        }
        return new HashSet(i, f);
    }
}
