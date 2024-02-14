package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

public final class PriorityMapping {

    /* renamed from: a */
    private static SparseArray<Priority> f1654a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<Priority, Integer> f1655b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f1655b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f1655b.put(Priority.VERY_LOW, 1);
        f1655b.put(Priority.HIGHEST, 2);
        for (Priority next : f1655b.keySet()) {
            f1654a.append(f1655b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m1670a(@NonNull Priority priority) {
        Integer num = f1655b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    /* renamed from: b */
    public static Priority m1671b(int i) {
        Priority priority = f1654a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
