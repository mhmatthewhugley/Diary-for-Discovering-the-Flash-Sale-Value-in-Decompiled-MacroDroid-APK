package p349ob;

import kotlin.jvm.internal.C13706o;

/* renamed from: ob.j */
/* compiled from: utfEncoding.kt */
public final class C15842j {
    /* renamed from: a */
    public static final byte[] m95470a(String[] strArr) {
        C13706o.m87929f(strArr, "strings");
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
