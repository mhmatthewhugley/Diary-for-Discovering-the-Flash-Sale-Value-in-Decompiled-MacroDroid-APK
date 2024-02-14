package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcz {
    @VisibleForTesting
    /* renamed from: a */
    static long m43147a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m43147a((j * j) % 1073807359, i >> 1) : j * (m43147a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    /* renamed from: b */
    static String m43148b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzcgp.m45226d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m43149c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            m43150d(i, m43151e(strArr2, 0, length), m43148b(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long e = m43151e(strArr2, 0, 6);
        m43150d(i, e, m43148b(strArr2, 0, 6), 6, priorityQueue);
        long a = m43147a(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                e = ((((((e + 1073807359) - ((((((long) zzbcv.m43143a(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzbcv.m43143a(strArr2[i3 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                m43150d(i, e, m43148b(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static void m43150d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbcy zzbcy = new zzbcy(j, str, i2);
        if ((priorityQueue.size() != i || (((zzbcy) priorityQueue.peek()).f26638c <= zzbcy.f26638c && ((zzbcy) priorityQueue.peek()).f26636a <= zzbcy.f26636a)) && !priorityQueue.contains(zzbcy)) {
            priorityQueue.add(zzbcy);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    private static long m43151e(String[] strArr, int i, int i2) {
        long a = (((long) zzbcv.m43143a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) zzbcv.m43143a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
