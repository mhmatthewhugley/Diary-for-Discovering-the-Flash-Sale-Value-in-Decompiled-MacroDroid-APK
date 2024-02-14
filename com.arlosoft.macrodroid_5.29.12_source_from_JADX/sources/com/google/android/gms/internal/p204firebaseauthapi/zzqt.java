package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqt {
    /* renamed from: a */
    public static byte[] m57982a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = zzpr.f40304b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    byte[][] bArr5 = zzpr.f40303a;
                    if (!zzpp.m57920b(bArr5[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzqj.m57968a(bArr5[i2])));
                    }
                }
                long[] k = zzqi.m57967k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(k, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    byte b2 = copyOf[(32 - i3) - 1] & 255;
                    int i5 = 0;
                    while (i5 < 8) {
                        int i6 = (b2 >> (7 - i5)) & 1;
                        zzpr.m57926a(jArr4, jArr2, i6);
                        zzpr.m57926a(jArr5, jArr3, i6);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i7 = i3;
                        long[] jArr12 = new long[19];
                        int i8 = i5;
                        long[] jArr13 = new long[19];
                        int i9 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzqi.m57965i(jArr4, jArr4, jArr5);
                        zzqi.m57964h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzqi.m57965i(jArr2, jArr2, jArr3);
                        zzqi.m57964h(jArr3, copyOf4, jArr3);
                        zzqi.m57958b(jArr13, jArr2, jArr5);
                        zzqi.m57958b(jArr14, jArr4, jArr3);
                        zzqi.m57961e(jArr13);
                        zzqi.m57960d(jArr13);
                        zzqi.m57961e(jArr14);
                        zzqi.m57960d(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzqi.m57965i(jArr13, jArr13, jArr14);
                        zzqi.m57964h(jArr14, copyOf4, jArr14);
                        zzqi.m57963g(jArr17, jArr13);
                        zzqi.m57963g(jArr16, jArr14);
                        zzqi.m57958b(jArr14, jArr16, k);
                        zzqi.m57961e(jArr14);
                        zzqi.m57960d(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzqi.m57963g(jArr11, jArr4);
                        zzqi.m57963g(jArr12, jArr5);
                        zzqi.m57958b(jArr8, jArr11, jArr12);
                        zzqi.m57961e(jArr8);
                        zzqi.m57960d(jArr8);
                        zzqi.m57964h(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzqi.m57962f(jArr19, jArr12, 121665);
                        zzqi.m57960d(jArr19);
                        zzqi.m57965i(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzqi.m57958b(jArr20, jArr12, jArr19);
                        zzqi.m57961e(jArr20);
                        zzqi.m57960d(jArr20);
                        int i10 = i9;
                        zzpr.m57926a(jArr8, jArr6, i10);
                        zzpr.m57926a(jArr20, jArr7, i10);
                        i5 = i8 + 1;
                        byte[] bArr7 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i3 = i7;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr6;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i3++;
                    byte[] bArr9 = bArr2;
                    copyOf = bArr8;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                zzqi.m57963g(jArr28, jArr5);
                zzqi.m57963g(jArr38, jArr28);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57957a(jArr29, jArr36, jArr5);
                zzqi.m57957a(jArr30, jArr29, jArr28);
                zzqi.m57963g(jArr36, jArr30);
                zzqi.m57957a(jArr31, jArr36, jArr29);
                zzqi.m57963g(jArr36, jArr31);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57957a(jArr32, jArr36, jArr31);
                zzqi.m57963g(jArr36, jArr32);
                zzqi.m57963g(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    zzqi.m57963g(jArr36, jArr38);
                    zzqi.m57963g(jArr38, jArr36);
                }
                zzqi.m57957a(jArr33, jArr38, jArr32);
                zzqi.m57963g(jArr36, jArr33);
                zzqi.m57963g(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    zzqi.m57963g(jArr36, jArr38);
                    zzqi.m57963g(jArr38, jArr36);
                }
                zzqi.m57957a(jArr36, jArr38, jArr33);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57963g(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzqi.m57963g(jArr38, jArr36);
                    zzqi.m57963g(jArr36, jArr38);
                }
                zzqi.m57957a(jArr34, jArr36, jArr32);
                zzqi.m57963g(jArr36, jArr34);
                zzqi.m57963g(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    zzqi.m57963g(jArr36, jArr38);
                    zzqi.m57963g(jArr38, jArr36);
                }
                zzqi.m57957a(jArr35, jArr38, jArr34);
                zzqi.m57963g(jArr38, jArr35);
                zzqi.m57963g(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    zzqi.m57963g(jArr38, jArr36);
                    zzqi.m57963g(jArr36, jArr38);
                }
                zzqi.m57957a(jArr38, jArr36, jArr35);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57963g(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzqi.m57963g(jArr36, jArr38);
                    zzqi.m57963g(jArr38, jArr36);
                }
                zzqi.m57957a(jArr36, jArr38, jArr34);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57963g(jArr36, jArr38);
                zzqi.m57963g(jArr38, jArr36);
                zzqi.m57957a(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzqi.m57957a(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzqi.m57957a(jArr40, k, jArr39);
                zzqi.m57965i(jArr41, k, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzqi.m57965i(jArr43, jArr41, jArr45);
                zzqi.m57957a(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzqi.m57965i(jArr43, jArr43, jArr46);
                zzqi.m57957a(jArr43, jArr43, jArr40);
                zzqi.m57957a(jArr43, jArr43, jArr46);
                zzqi.m57962f(jArr42, jArr43, 4);
                zzqi.m57960d(jArr42);
                zzqi.m57957a(jArr43, jArr40, jArr3);
                zzqi.m57964h(jArr43, jArr43, jArr3);
                zzqi.m57957a(jArr44, jArr41, jArr46);
                zzqi.m57965i(jArr43, jArr43, jArr44);
                zzqi.m57963g(jArr43, jArr43);
                if (zzpp.m57920b(zzqi.m57966j(jArr42), zzqi.m57966j(jArr43))) {
                    return zzqi.m57966j(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzqj.m57968a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m57983b(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m57982a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
