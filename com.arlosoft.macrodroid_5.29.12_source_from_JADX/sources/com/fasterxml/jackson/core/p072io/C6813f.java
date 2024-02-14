package com.fasterxml.jackson.core.p072io;

import com.fasterxml.jackson.core.util.C6825b;
import java.lang.ref.SoftReference;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.fasterxml.jackson.core.io.f */
/* compiled from: JsonStringEncoder */
public final class C6813f {

    /* renamed from: c */
    private static final char[] f15831c = C6809b.m25589d();

    /* renamed from: d */
    private static final byte[] f15832d = C6809b.m25588c();

    /* renamed from: e */
    protected static final ThreadLocal<SoftReference<C6813f>> f15833e = new ThreadLocal<>();

    /* renamed from: a */
    protected C6825b f15834a;

    /* renamed from: b */
    protected final char[] f15835b;

    public C6813f() {
        char[] cArr = new char[6];
        this.f15835b = cArr;
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[2] = '0';
        cArr[3] = '0';
    }

    /* renamed from: a */
    private int m25610a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    /* renamed from: b */
    private void m25611b(int i) {
        if (i > 1114111) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627");
        } else if (i < 55296) {
            throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        } else if (i <= 56319) {
            throw new IllegalArgumentException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        } else {
            throw new IllegalArgumentException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
    }

    /* renamed from: d */
    public static C6813f m25612d() {
        C6813f fVar;
        ThreadLocal<SoftReference<C6813f>> threadLocal = f15833e;
        SoftReference softReference = threadLocal.get();
        if (softReference == null) {
            fVar = null;
        } else {
            fVar = (C6813f) softReference.get();
        }
        if (fVar != null) {
            return fVar;
        }
        C6813f fVar2 = new C6813f();
        threadLocal.set(new SoftReference(fVar2));
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dc A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo33914c(java.lang.String r11) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.util.b r0 = r10.f15834a
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.b r0 = new com.fasterxml.jackson.core.util.b
            r1 = 0
            r0.<init>(r1)
            r10.f15834a = r0
        L_0x000c:
            int r1 = r11.length()
            byte[] r2 = r0.mo33950h()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0018:
            if (r5 >= r1) goto L_0x00e8
            int r7 = r5 + 1
            char r5 = r11.charAt(r5)
        L_0x0020:
            r8 = 127(0x7f, float:1.78E-43)
            if (r5 > r8) goto L_0x0040
            if (r6 < r3) goto L_0x002c
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r6 = 0
        L_0x002c:
            int r8 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r7 < r1) goto L_0x0036
            r6 = r8
            goto L_0x00e8
        L_0x0036:
            int r5 = r7 + 1
            char r6 = r11.charAt(r7)
            r7 = r5
            r5 = r6
            r6 = r8
            goto L_0x0020
        L_0x0040:
            if (r6 < r3) goto L_0x0048
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r6 = 0
        L_0x0048:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 >= r8) goto L_0x0059
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
        L_0x0055:
            r6 = r5
            r5 = r7
            goto L_0x00d4
        L_0x0059:
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r8) goto L_0x00b6
            r8 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r8) goto L_0x0064
            goto L_0x00b6
        L_0x0064:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r5 <= r8) goto L_0x006c
            r10.m25611b(r5)
        L_0x006c:
            if (r7 < r1) goto L_0x0071
            r10.m25611b(r5)
        L_0x0071:
            int r8 = r7 + 1
            char r7 = r11.charAt(r7)
            int r5 = r10.m25610a(r5, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 <= r7) goto L_0x0083
            r10.m25611b(r5)
        L_0x0083:
            int r7 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r7 < r3) goto L_0x0094
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r7 = 0
        L_0x0094:
            int r6 = r7 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            if (r6 < r3) goto L_0x00a7
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r6 = 0
        L_0x00a7:
            int r7 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r6 = r5
            r5 = r8
            r8 = r7
            goto L_0x00d4
        L_0x00b6:
            int r8 = r6 + 1
            int r9 = r5 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r8 < r3) goto L_0x00c7
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r8 = 0
        L_0x00c7:
            int r6 = r8 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r8] = r9
            r8 = r6
            goto L_0x0055
        L_0x00d4:
            if (r8 < r3) goto L_0x00dc
            byte[] r2 = r0.mo33947f()
            int r3 = r2.length
            r8 = 0
        L_0x00dc:
            int r7 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r7
            goto L_0x0018
        L_0x00e8:
            com.fasterxml.jackson.core.util.b r11 = r10.f15834a
            byte[] r11 = r11.mo33946e(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p072io.C6813f.mo33914c(java.lang.String):byte[]");
    }
}
