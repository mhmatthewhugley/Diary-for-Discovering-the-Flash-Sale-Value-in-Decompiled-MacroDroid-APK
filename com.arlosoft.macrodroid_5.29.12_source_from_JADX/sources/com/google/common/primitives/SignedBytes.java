package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class SignedBytes {

    private enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < min; i++) {
                int a = SignedBytes.m73663a(bArr[i], bArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return bArr.length - bArr2.length;
        }

        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    private SignedBytes() {
    }

    /* renamed from: a */
    public static int m73663a(byte b, byte b2) {
        return b - b2;
    }
}
