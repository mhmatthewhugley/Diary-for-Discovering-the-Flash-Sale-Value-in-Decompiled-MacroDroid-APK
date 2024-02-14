package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import javax.mail.UIDFolder;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class UnsignedInts {

    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                if (iArr[i] != iArr2[i]) {
                    return UnsignedInts.m73679a(iArr[i], iArr2[i]);
                }
            }
            return iArr.length - iArr2.length;
        }

        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    private UnsignedInts() {
    }

    /* renamed from: a */
    public static int m73679a(int i, int i2) {
        return Ints.m73615d(m73680b(i), m73680b(i2));
    }

    /* renamed from: b */
    static int m73680b(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public static long m73681c(int i) {
        return ((long) i) & UIDFolder.MAXUID;
    }

    /* renamed from: d */
    public static String m73682d(int i, int i2) {
        return Long.toString(((long) i) & UIDFolder.MAXUID, i2);
    }
}
