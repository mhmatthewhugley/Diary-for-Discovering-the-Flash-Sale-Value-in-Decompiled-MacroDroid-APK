package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ArrayBasedEscaperMap {

    /* renamed from: b */
    private static final char[][] f17336b = ((char[][]) Array.newInstance(char.class, new int[]{0, 0}));

    /* renamed from: a */
    private final char[][] f17337a;

    private ArrayBasedEscaperMap(char[][] cArr) {
        this.f17337a = cArr;
    }

    /* renamed from: a */
    public static ArrayBasedEscaperMap m29208a(Map<Character, String> map) {
        return new ArrayBasedEscaperMap(m29209b(map));
    }

    @VisibleForTesting
    /* renamed from: b */
    static char[][] m29209b(Map<Character, String> map) {
        Preconditions.m5392s(map);
        if (map.isEmpty()) {
            return f17336b;
        }
        char[][] cArr = new char[(((Character) Collections.max(map.keySet())).charValue() + 1)][];
        for (Character next : map.keySet()) {
            cArr[next.charValue()] = map.get(next).toCharArray();
        }
        return cArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public char[][] mo36789c() {
        return this.f17337a;
    }
}
